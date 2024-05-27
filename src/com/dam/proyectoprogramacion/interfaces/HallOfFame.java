package com.dam.proyectoprogramacion.interfaces;
import com.dam.proyectoprogramacion.background.*;
import com.dam.proyectoprogramacion.buttons.*;
import com.dam.proyectoprogramacion.Songs.HallOfFameSong;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class HallOfFame extends JFrame {

    private static JPanel pokemon1;
    private static JPanel pokemon2;
    private static JPanel pokemon3;
    private static JPanel player;

    ButtonInterfaceSkipHall buttonsHall = new ButtonInterfaceSkipHall();


    public HallOfFame() {

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        setVisible(true);
        setLayout(new BorderLayout());
        setBounds(600,600,600,600);

        /**
         * Llamar a la musica que va a sonar en el hall of fame
         */

        HallOfFameSong.hallOfFameMusic();


        /**
         * Variable con la imagen de fondo
         */

        Image image = new ImageIcon("imagenes/Hall.png").getImage();
        BackgroundHallOfFame backgroundHall = new BackgroundHallOfFame(image);
        backgroundHall.setLayout(new BorderLayout());

        /**
         * Jpanel igual a un metodo el cual va a devolver un jpanel
         */
        JPanel background = makePanel();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(800, 700, 700, 700);

        /**
         * añadir el panel recien creado
         */
        backgroundHall.add(background, BorderLayout.CENTER);

        add(backgroundHall);
        setVisible(true);

        gbc.gridy = 1;
        gbc.gridx = 1;


        JButton back = buttonsHall.makeBackButton();
        back.setPreferredSize(new Dimension(300, 100));
        background.add(buttonBackPanel(back), gbc);

        gbc.gridx = (int) 0.8;
        gbc.gridy = (int) 0.8;

        JButton playAgain = buttonsHall.makePlayAgainButton();
        playAgain.setPreferredSize(new Dimension(300, 100));
        background.add(playAgainPannel(playAgain), gbc);


        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                back.setBackground(Color.BLUE.brighter());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                back.setBackground(Color.WHITE);
            }
        });

        playAgain.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                playAgain.setBackground(Color.RED.brighter());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                playAgain.setBackground(Color.blue);
            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HallOfFame.this.dispose();
                MainMenu menu = new MainMenu();
                menu.setVisible(true);
            }
        });

        playAgain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HallOfFame.this.dispose();
                SelectionPokemon play = new SelectionPokemon();
                play.setVisible(true);
            }
        });

        pokemon1 = new JPanel();
        pokemon1 = pokemon1Panel();

        pokemon2 = new JPanel();
        pokemon2 = pokemon2Panel();

        pokemon3 = new JPanel();
        pokemon3 = pokemon3Panel();

        player = new JPanel();
        player = playerPanel();

        background.add(pokemon1);
        background.add(pokemon2);
        background.add(pokemon3);
        background.add(player);
    }


    private JPanel makePanel() {
        JPanel contentPanel = new JPanel();
        /**
         * tenemos que poner que el panel sea falso en opaco para que no se sobreponga
         */
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new GridBagLayout());
        return contentPanel;
    }

    private JPanel buttonBackPanel(JButton back) {
        JPanel skip = new JPanel();
        skip.setLayout(new GridBagLayout());
        skip.add(back);
        return skip;
    }

    private JPanel playAgainPannel(JButton play) {
        JPanel playAgainPannel = new JPanel();
        playAgainPannel.setLayout(new GridBagLayout());
        playAgainPannel.add(play);
        return playAgainPannel;
    }



    /**
     * metodos para realizar los paneles de los pokemon y devolverlos
     * @return pokemon1
     */
    public static JPanel pokemon1Panel(){
        JPanel pokemon1 = new JPanel();
        pokemon1.setLayout(new BoxLayout(pokemon1,BoxLayout.X_AXIS));
        return pokemon1;
    }

    /**
     * metodo para realizar los paneles de los pokemon y devolverlos
     * @return pokemon2
     */

    public static JPanel pokemon2Panel(){
        JPanel pokemon2 = new JPanel();
        pokemon2.setLayout(new BoxLayout(pokemon2,BoxLayout.X_AXIS));
        return pokemon2;
    }

    /**
     * metodo para realizar los paneles de los pokemon y devolverlos
     * @return pokemon3
     */

    public static JPanel pokemon3Panel(){
        JPanel pokemon3 = new JPanel();
        pokemon3.setLayout(new BoxLayout(pokemon3,BoxLayout.X_AXIS));
        return pokemon3;
    }

    /**
     * metodo para realizar los paneles del jugador y devolverlos
     * @return player
     */

    public static JPanel playerPanel(){
        JPanel player = new JPanel();
        player.setLayout(new BoxLayout(player,BoxLayout.X_AXIS));
        return player;
    }
}

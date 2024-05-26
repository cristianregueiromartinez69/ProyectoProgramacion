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

    ButtonInterfaceSkipHall buttonsHall = new ButtonInterfaceSkipHall();
    private static JPanel backgroundImage;
    private static JPanel Player;
    private static JPanel Pokemon1;
    private static JPanel Pokemon2;
    private static JPanel Pokemon3;

    public void HallofFame() {

        /**
         * Llamar a la musica que va a sonar en el hall of fame
         */

        HallOfFameSong.hallOfFameMusic();

        setTitle("Hall of Fame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        /**
         * Variable con la imagen de fondo
         */

        Image image = new ImageIcon("imagenes/Registro_en_el_Hall_de_la_Fama_Pt.png").getImage();
        backgroundImage.setLayout(new BorderLayout());

        /**
         * Jpanel igual a un metodo el cual va a devolver un jpanel
         */
        JPanel background = makePanel();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(800, 700, 700, 700);

        /**
         * añadir el panel recien creado
         */
        backgroundImage.add(background, BorderLayout.CENTER);

        add(backgroundImage);
        setVisible(true);

        gbc.gridy = 0;
        gbc.gridx = 0;


        JButton back = buttonsHall.makeBackButton();
        back.setPreferredSize(new Dimension(200, 50));
        backgroundImage.add(buttonBackPanel(back),gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;

        JButton playAgain = buttonsHall.makePlayAgainButton();
        playAgain.setPreferredSize(new Dimension(200,50));
        backgroundImage.add(playAgainPannel(playAgain),gbc);



        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                back.setBackground(Color.BLUE.brighter());
            }

            @Override
            public void mouseExited(MouseEvent e){back.setBackground(Color.WHITE);}
        });

        playAgain.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                playAgain.setBackground(Color.RED.brighter());
            }

            @Override
            public void mouseExited(MouseEvent e){
                playAgain.setBackground(Color.blue);
            }
        });
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
}

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


    public void HallofFame() {

        /**
         * Llamar a la musica que va a sonar en el hall of fame
         */

        HallOfFameSong.hallOfFameMusic();


        /**
         * Variable con la imagen de fondo
         */

        Image image = new ImageIcon("imagenes/Registro_en_el_Hall_de_la_Fama_Pt.png").getImage();
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

        gbc.gridy = 0;
        gbc.gridx = 0;


        JButton back = buttonsHall.makeBackButton();
        back.setPreferredSize(new Dimension(200, 50));
        backgroundHall.add(buttonBackPanel(back),gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;

        JButton playAgain = buttonsHall.makePlayAgainButton();
        playAgain.setPreferredSize(new Dimension(200,50));
        backgroundHall.add(playAgainPannel(playAgain),gbc);



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

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HallOfFame.this.dispose();
                MainMenu menu = new MainMenu();
                menu.setVisible(true);
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

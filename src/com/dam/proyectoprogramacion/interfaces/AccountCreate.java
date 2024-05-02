package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;
import com.dam.proyectoprogramacion.panels.accountcreate.*;

import javax.swing.*;
import java.awt.*;

/**
 * clase con la interfaz de crear cuenta en la que nos loguearemos para poder jugar
 *
 * @author cristian
 * @version v1.0
 */
public class AccountCreate extends JFrame {

    /**
     * atributos privados de tipo JPanel para dividir la informacion del jugador 1 y el jugador 2
     */
    private JPanel globalPlayerPanel1;
    private JPanel globalPlayerPanel2;

    /**
     * atributos privados de tipo JPanel para poner la información del jugador 1 y del jugador 2
     */
    private JPanel informationPlayerPanel1;
    private JPanel informationPLayerPanel2;

    /**
     * atributos privados de tipo JPanel para poner los botones de listo del jugador 1 y del jugador 2
     */
    private JPanel confirmAreaPlayer1;
    private JPanel ConfirmAreaPlayer2;

    /**
     * atributo privado de tipo JPanel para poner el boton de start de ambos jugadores cuando terminaron de crear la cuenta
     */
    private JPanel startAreaPanel;

    public AccountCreate() {
        /**
         * le damos visibilidad y ponemos un titulo al frame
         */
        setTitle("Crear una cuenta");
        setSize(600, 400);
        setVisible(true);

        /**
         * varibale de tipo imagen que tiene el path de la imagen de fondo
         */
        Image backgroundImage = new ImageIcon("imagenes/fondosPreparacion.png").getImage();

        BackgroundMainMenuPanel backgroundPanel = new BackgroundMainMenuPanel(backgroundImage);
        backgroundPanel.setLayout(new BorderLayout());

        /**
         * creamos un jpanel que es igual a un metodo que nos vuelve un jpanel
         */
        JPanel contentPanel = makeContentPanel();
        GridBagConstraints gbc = new GridBagConstraints();

        backgroundPanel.add(contentPanel, BorderLayout.CENTER);


        add(backgroundPanel);

        /**
         * iniciamos el panel global de jugador 1
         */
        globalPlayerPanel1 = new JPanel();
        globalPlayerPanel1.setLayout(new GridBagLayout());

        /**
         * iniciamos el panel global de jugador 2
         */
        globalPlayerPanel2 = new JPanel();
        globalPlayerPanel2.setLayout(new GridBagLayout());

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 20, 20, 20);

        /**
         * lo añadimos al panel que tiene la imagen
         * definimos un nuevo panel que es igual a una clase que extiende de jpanel
         */
        contentPanel.add(globalPlayerPanel1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        contentPanel.add(globalPlayerPanel2, gbc);

        /**
         * creamos un panel para el jugador 1 que será igual al creado en otra clase
         */
        JPanel informationPanelPlayer1 = new InformationPlayerPanel1AccountCreate();
        globalPlayerPanel1.add(informationPanelPlayer1);
        JPanel auxGlobalPlayerPanel1 = new GlobalPanelPlayer1AccountCreate();
        globalPlayerPanel1.add(auxGlobalPlayerPanel1);

                /**
                 * creamos un panel para el jugador 2 que será igual al creado en otra clase
                 */
        JPanel informationPanelPlayer2 = new InformationPlayerPanel2AccountCreate();
        globalPlayerPanel2.add(informationPanelPlayer2);




    }

    /**
     * metodo para construir un panel
     * @return el panel construido
     */

    private JPanel makeContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new GridBagLayout());
        return contentPanel;
    }

}

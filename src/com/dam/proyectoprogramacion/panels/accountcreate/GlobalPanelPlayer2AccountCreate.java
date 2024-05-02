package com.dam.proyectoprogramacion.panels.accountcreate;

<<<<<<< HEAD
public class GlobalPanelPlayer2AccountCreate {
=======

import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceAccountCreate;

import javax.swing.*;

public class GlobalPanelPlayer2AccountCreate extends JPanel {

    /**
     * atributos privados de tipo JPanel con las filas que almacenarán las imágenes del jugador 2
     */
    private JPanel panelRow1Of5ImagesPlayer2;
    private JPanel panelRow2Of5ImagesPlayer2;
    private JPanel panelReadyPlayer2;


    public GlobalPanelPlayer2AccountCreate() {

        /**
         * hacemos que el panel sea visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setOpaque(false);

        /**
         * iniciamos el panel de la primera fila con imagenes
         * le damos un layout que será de tipo boxLayout para poner la primera fila en horizontal
         * lo añadimos al panel
         */
        panelRow1Of5ImagesPlayer2 = new JPanel();
        panelRow1Of5ImagesPlayer2.setLayout(new BoxLayout(panelRow1Of5ImagesPlayer2, BoxLayout.X_AXIS));
        this.add(panelRow1Of5ImagesPlayer2);

        /**
         * iniciamos el panel de la segunda fila con imagenes
         * le damos un layout que será de tipo boxLayout para poner la segunda fila en horizontal
         * lo añadimos al panel
         */
        panelRow2Of5ImagesPlayer2 = new JPanel();
        panelRow2Of5ImagesPlayer2.setLayout(new BoxLayout(panelRow2Of5ImagesPlayer2, BoxLayout.X_AXIS));
        this.add(panelRow2Of5ImagesPlayer2);

        /**
         * iniciamos el panel de ready del jugador 2
         */
        panelReadyPlayer2 = new JPanel();
        panelReadyPlayer2.setLayout(new BoxLayout(panelReadyPlayer2, BoxLayout.Y_AXIS));
        this.add(panelReadyPlayer2);


        /**
         * vamos añadiendo los paneles que son metodos creados que una clase
         * Esa clase solo crea paneles y los vamos llamando
         * estos 5 serían los de la primera fila
         */
        panelRow1Of5ImagesPlayer2.add(MethodsInterfaceAccountCreate.makePanelImage1Row1Player2());
        panelRow1Of5ImagesPlayer2.add(MethodsInterfaceAccountCreate.makePanelImage2Row1Player2());
        panelRow1Of5ImagesPlayer2.add(MethodsInterfaceAccountCreate.makePanelImage3Row1Player2());
        panelRow1Of5ImagesPlayer2.add(MethodsInterfaceAccountCreate.makePanelImage4Row1Player2());
        panelRow1Of5ImagesPlayer2.add(MethodsInterfaceAccountCreate.makePanelImage5Row1Player2());


        /**
         * vamos añadiendo los paneles que son metodos creados que una clase
         * Esa clase solo crea paneles y los vamos llamando
         * estos 5 serían los de la segunda  fila
         */
        panelRow2Of5ImagesPlayer2.add(MethodsInterfaceAccountCreate.makePanelImage1Row2Player2());
        panelRow2Of5ImagesPlayer2.add(MethodsInterfaceAccountCreate.makePanelImage2Row2Player2());
        panelRow2Of5ImagesPlayer2.add(MethodsInterfaceAccountCreate.makePanelImage3Row2Player2());
        panelRow2Of5ImagesPlayer2.add(MethodsInterfaceAccountCreate.makePanelImage4Row2Player2());
        panelRow2Of5ImagesPlayer2.add(MethodsInterfaceAccountCreate.makePanelImage5Row2Player2());

        /**
         * añadimos a este pane, un metodo que crea este panel en otra clase
         */
        panelReadyPlayer2.add(MethodsInterfaceAccountCreate.makeReadyPlayer1Panel());




    }



>>>>>>> interfaces
}

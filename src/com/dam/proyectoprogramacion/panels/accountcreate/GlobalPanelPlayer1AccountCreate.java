package com.dam.proyectoprogramacion.panels.accountcreate;
import javax.swing.*;

import com.dam.proyectoprogramacion.methodsandmain.*;





/**
 * clase con todos los paneles de la parte del jugador 1 en la interfaz de crear cuenta
 * @author cristian
 * @version v1.0
 */
public class GlobalPanelPlayer1AccountCreate extends JPanel {


    /**
     * atributos privados de tipo JPanel con las filas que almacenarán las imágenes del jugador 1
     */
    private JPanel panelRow1Of5ImagesPlayer1;
    private JPanel panelRow2Of5ImagesPlayer1;
    private JPanel panelReadyPlayer1;


    public GlobalPanelPlayer1AccountCreate() {

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
        panelRow1Of5ImagesPlayer1 = new JPanel();
        panelRow1Of5ImagesPlayer1.setLayout(new BoxLayout(panelRow1Of5ImagesPlayer1, BoxLayout.X_AXIS));
        this.add(panelRow1Of5ImagesPlayer1);

        /**
         * iniciamos el panel de la segunda fila con imagenes
         * le damos un layout que será de tipo boxLayout para poner la segunda fila en horizontal
         * lo añadimos al panel
         */
        panelRow2Of5ImagesPlayer1 = new JPanel();
        panelRow2Of5ImagesPlayer1.setLayout(new BoxLayout(panelRow2Of5ImagesPlayer1, BoxLayout.X_AXIS));
        this.add(panelRow2Of5ImagesPlayer1);

        /**
         * iniciamos el panel de ready del jugador 1
         */
        panelReadyPlayer1 = new JPanel();
        panelReadyPlayer1.setLayout(new BoxLayout(panelReadyPlayer1, BoxLayout.Y_AXIS));
        this.add(panelReadyPlayer1);


        /**
         * vamos añadiendo los paneles que son metodos creados que una clase
         * Esa clase solo crea paneles y los vamos llamando
         * estos 5 serían los de la primera fila
         */
        panelRow1Of5ImagesPlayer1.add(MethodsInterfaceAccountCreate.makePanelImage1Row1Player1());
        panelRow1Of5ImagesPlayer1.add(MethodsInterfaceAccountCreate.makePanelImage2Row1Player1());
        panelRow1Of5ImagesPlayer1.add(MethodsInterfaceAccountCreate.makePanelImage3Row1Player1());
        panelRow1Of5ImagesPlayer1.add(MethodsInterfaceAccountCreate.makePanelImage4Row1Player1());
        panelRow1Of5ImagesPlayer1.add(MethodsInterfaceAccountCreate.makePanelImage5Row1Player1());


        /**
         * vamos añadiendo los paneles que son metodos creados que una clase
         * Esa clase solo crea paneles y los vamos llamando
         * estos 5 serían los de la segunda  fila
         */
        panelRow2Of5ImagesPlayer1.add(MethodsInterfaceAccountCreate.makePanelImage1Row2Player1());
        panelRow2Of5ImagesPlayer1.add(MethodsInterfaceAccountCreate.makePanelImage2Row2Player1());
        panelRow2Of5ImagesPlayer1.add(MethodsInterfaceAccountCreate.makePanelImage3Row2Player1());
        panelRow2Of5ImagesPlayer1.add(MethodsInterfaceAccountCreate.makePanelImage4Row2Player1());
        panelRow2Of5ImagesPlayer1.add(MethodsInterfaceAccountCreate.makePanelImage5Row2Player1());

        /**
         * añadimos a este pane, un metodo que crea este panel en otra clase
         */
        panelReadyPlayer1.add(MethodsInterfaceAccountCreate.makeReadyPlayer1Panel());




    }



}

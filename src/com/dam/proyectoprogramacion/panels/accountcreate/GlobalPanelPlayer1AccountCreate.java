package com.dam.proyectoprogramacion.panels.accountcreate;
import javax.swing.*;
import com.dam.proyectoprogramacion.methodsandmain.*;




public class GlobalPanelPlayer1AccountCreate extends JPanel {

    private JPanel panelRow1Of5ImagesPlayer1;
    private JPanel panelRow2Of5ImagesPlayer1;

    private JPanel panelImage1Row1Player1;
    private JPanel panelImage2Row1Player1;
    private JPanel panelImage3Row1Player1;
    private JPanel panelImage4Row1Player1;
    private JPanel panelImage5Row1Player1;

    private JPanel panelImage1Row2Player1;
    private JPanel panelImage2Row2Player1;
    private JPanel panelImage3Row2Player1;
    private JPanel panelImage4Row2Player1;
    private JPanel panelImage5Row2Player1;

    public GlobalPanelPlayer1AccountCreate(){

        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        panelRow1Of5ImagesPlayer1 = new JPanel();
        panelRow1Of5ImagesPlayer1.setLayout(new BoxLayout(panelRow1Of5ImagesPlayer1, BoxLayout.X_AXIS));
        this.add(panelRow1Of5ImagesPlayer1);

        panelRow2Of5ImagesPlayer1 = new JPanel();
        panelRow2Of5ImagesPlayer1.setLayout(new BoxLayout(panelRow2Of5ImagesPlayer1, BoxLayout.X_AXIS));
        this.add(panelRow2Of5ImagesPlayer1);

        panelRow1Of5ImagesPlayer1.add(MethodsInterfaceAccountCreate.makePanelImage1Row1Player1());



    }





}

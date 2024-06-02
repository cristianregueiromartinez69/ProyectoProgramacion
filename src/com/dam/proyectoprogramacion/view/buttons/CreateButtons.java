package com.dam.proyectoprogramacion.view.buttons;

import javax.swing.*;

/**
 * Clase para crear botones que seguirán este patrón de diseño
 * @author cristian
 * @version v1.0
 */
public class CreateButtons extends JButton {

    /**
     * Constructor de la clase que sirve de patron de diseño para otros botones
     * @param texto el texto que aparecerá en el boton
     * @param iconoBoton la imagen que aparecerá al lado del texto del botón
     */
    public CreateButtons(String texto, Icon iconoBoton){

    super(texto);
    setIcon(iconoBoton);

}
}

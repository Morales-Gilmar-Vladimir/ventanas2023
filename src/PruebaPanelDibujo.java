import javax.swing.*;

public class PruebaPanelDibujo {
    public static void main(String[] args) {
       //Crea una instancia de la clase PanelDibujo
        PanelDibujo panel=new PanelDibujo();

        //hace como ventana para los parametros de la otra clase (Crea un marco en la ventana)
        JFrame aplicacion=new JFrame();
        //Pongo un boton para cerrar la ventana
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacion.add(panel); //Agrega un panel a la ventana
        aplicacion.setSize(250,250);// Seteo el tamaño de la
        aplicacion.setVisible(true);//permito que se vea la ventana
    }
    }


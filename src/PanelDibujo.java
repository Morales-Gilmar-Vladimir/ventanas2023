import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PanelDibujo extends JPanel {
    Scanner sc= new Scanner(System.in);
    private double peso,altura,imc;
    private String nombre;
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        int anchura = getWidth();
        int altura = getHeight();


        // Introducir nombre desde la consola para luego imprimir en la ventana creada

        System.out.println("Ingrese su nombre: ");
        String nombre= sc.nextLine();
        g.drawString("Nombre: "+nombre,10,10);

        System.out.println("Ingrese su peso en KG: ");
        peso=sc.nextDouble();
        g.drawString("Peso: "+peso,10,25);

       // g.drawString("G",200,100);
       // g.drawString(nombre,100,100);

        /* Dibujar la letra G
        g.drawLine(20, 20, 20, altura - 20);
        g.drawLine(20, 20, anchura / 2 - 20, 20);
        g.drawLine(anchura / 2 - 20, altura / 2 - 20, anchura / 2 + 20, altura / 2 - 20);
        g.drawLine(anchura / 2 + 20, altura / 2 - 20, anchura / 2 + 20, altura - 20);
        g.drawLine(anchura / 2 + 20, altura - 20, 20, altura - 20);*/

    }
}

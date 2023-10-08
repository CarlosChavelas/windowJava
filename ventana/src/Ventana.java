import javax.swing.*;

public class Ventana extends JFrame{
    public Ventana(){
        setTitle("Bienvenido");
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setBounds(0,0,500,700);/*Medidas de la ventana */
        ventana.setVisible(true);/*Hacerla visible */
        ventana.setLocationRelativeTo(null); /*Centrar ventana */        
    }
}
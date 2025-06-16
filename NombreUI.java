import javax.swing.JOptionPane;

public class NombreUI {
    public static void main(String[] args) {
        //Aqui vamos a pedir el nombre al usuario
        String nombre = JOptionPane.showInputDialog("¿Como te llamas?");

        //Creamos un mensaje y lo que vamos hacr es tomar la variable nombre
        String mensaje = String.format("Mucho gusto %s", nombre);

        //Paso final - ver el resultado en un cuadro de dialogo
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

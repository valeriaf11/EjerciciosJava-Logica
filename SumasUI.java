import javax.swing.JOptionPane;

public class SumasUI {
    public static void main(String[] args) {
            // Captura del primer número (entero)
            String num1Str = JOptionPane.showInputDialog("Ingresa un número entero:");
            int num1 = Integer.parseInt(num1Str);

            // Captura del segundo número (decimal)
            String num2Str = JOptionPane.showInputDialog("Ingresa un número decimal:");
            double num2 = Double.parseDouble(num2Str);

            // Operación: suma
            double resultado = num1 + num2;

            // Mostrar el resultado en un cuadro de mensaje
            JOptionPane.showMessageDialog(null, "La suma de los números es: " + resultado);
        }
    }


package senasalud;

import javax.swing.JOptionPane;


public class SenaSalud {

    
    public static void main(String[] args) {
        String apellido=JOptionPane.showInputDialog(null,"Digite su apellido");
        String nombre=(JOptionPane.showInputDialog(null,"Digite su nombre"));
        String color=JOptionPane.showInputDialog(null,"Digite el color");
        
        System.out.println("su apellido es: "+apellido);
        System.out.println("su edad es: "+nombre);
        System.out.println("su color es: "+color);
    }
    
}

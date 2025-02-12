/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import javax.swing.JOptionPane;
/**
 *
 * @author LEB KOM4
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String angkaPertamaStr = JOptionPane.showInputDialog("Angka Pertama");
      int angkaPertama = Integer.parseInt(angkaPertamaStr);
      
      String angkaKeduaStr = JOptionPane.showInputDialog("Angka Kedua");
      int angkaKedua = Integer.parseInt(angkaKeduaStr);
      
      int hasil = angkaPertama + angkaKedua;
      
      JOptionPane.showMessageDialog(null, angkaPertama + " ditambah " + angkaKedua + " = " + hasil);
    }
    
}

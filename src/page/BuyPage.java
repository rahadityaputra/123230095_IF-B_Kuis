/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package page;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 *
 * @author Lab Informatika
 */
public class BuyPage extends JFrame implements ActionListener {
      JPanel panel = new JPanel(new GridBagLayout());
    JButton kembaliButton = new JButton("kembali");
    JLabel pajakLabel = new JLabel();
      JLabel totalHargaLabel = new JLabel();
    JLabel subtotalLabel = new JLabel();
    JLabel apelLabel = new JLabel();
    JLabel jerukLabel = new JLabel();
    JLabel manggaLabel = new JLabel();
   
    
    Buah apel = new Buah("Apel", 15000);
    Buah jeruk = new Buah("Jeruk", 12000);
    Buah mangga = new Buah("Mangga", 20000);
    String username;

      GridBagConstraints gbc = new GridBagConstraints();
    public BuyPage(int jumlahApel, int jumlahJeruk, int jumlahMangga, String username) {
        renderStruk(jumlahApel, jumlahJeruk, jumlahMangga);
        this.username = username;
        
        
    }
    
    
    void renderStruk(int jumlahApel, int jumlahJeruk, int jumlahMangga) {
       apelLabel.setText("Apel " + jumlahApel + " kg x Rp. " + apel.harga + " = " + "Rp " + apel.beli(jumlahApel));
       jerukLabel.setText("Jeruk " + jumlahJeruk + " kg x Rp. " + jeruk.harga + " = " + "Rp " + jeruk.beli(jumlahApel));
       manggaLabel.setText("mangga " + jumlahMangga + " kg x Rp. " + mangga.harga + " = " + "Rp " + mangga.beli(jumlahApel));
       
       int subTotalHarga = hitungTotalPembelian(jumlahApel, jumlahJeruk, jumlahMangga);
       int totalHarga = kenaPajak(subTotalHarga);
  
       subtotalLabel.setText("Subtotal Harga : " + "Rp." + subTotalHarga);
       pajakLabel.setText("Pajak 10 % : Rp. " + subTotalHarga / 10);
       totalHargaLabel.setText("Total Harga : Rp. " + totalHarga );
        add(panel);
      setVisible(true);
      setSize(500, 500);
      
      setLocationRelativeTo(null);
      setAlwaysOnTop(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      gbc.insets = new Insets(10, 10, 10, 10);
      
      
      gbc.gridx = 0;
      gbc.gridy = 0;
     
      panel.add(apelLabel, gbc);
      
     
        gbc.gridx = 0;
      gbc.gridy = 1;
      panel.add(jerukLabel, gbc);
          
        gbc.gridx = 0;
      gbc.gridy = 2;
      panel.add(manggaLabel, gbc);
      

        gbc.gridx = 0;
      gbc.gridy = 4;
      panel.add(subtotalLabel, gbc);
          
        gbc.gridx = 0;
      gbc.gridy = 5;
      panel.add(pajakLabel, gbc);
       
          gbc.gridx = 0;
      gbc.gridy = 6;
      panel.add(totalHargaLabel, gbc);
          
      
        gbc.gridx = 0;
      gbc.gridy = 7;
      panel.add(kembaliButton, gbc);
          
      kembaliButton.addActionListener(this);
    }
    
    
    int hitungTotalPembelian(int jumlahApel, int jumlahJeruk, int jumlahMangga) {
      int totalHargaApel = apel.beli(jumlahApel);
      int totalHargaJeruk = jeruk.beli(jumlahJeruk);
      int totalHargaMangga = mangga.beli(jumlahMangga);
      int total = totalHargaApel + totalHargaJeruk + totalHargaMangga;
      
      return (total);
    }
    
    int kenaPajak(int total) {
        return total + (total / 10);   
    }
    
    
       @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource() == kembaliButton) {
                new HomePage(username);
                dispose();
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error);
        }
    
    }
}

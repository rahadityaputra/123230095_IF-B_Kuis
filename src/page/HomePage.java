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
public class HomePage extends JFrame implements ActionListener {
    JPanel panel = new JPanel(new GridBagLayout());
    JButton beliButton = new JButton("Beli");
    JButton logoutButton = new JButton("Logout");
    JLabel selamatDatangLabel = new JLabel();
    JLabel daftarBuahLabel = new JLabel("Daftar Buah dan Harganya");
    JLabel apelLabel = new JLabel("Apel Rp. 15.000 / kg");
    JLabel jerukLabel = new JLabel("Jeruk Rp. 12.000 / kg");
    JLabel manggaLabel = new JLabel("Mangga Rp. 15.000 / kg");
   
    JTextField apelField = new JTextField();
    JTextField jerukField = new JTextField();
    JTextField manggField = new JTextField();
    
    
    GridBagConstraints gbc = new GridBagConstraints();
     String username;
    public HomePage  (String username) {
         panel.setBackground(Color.WHITE);
          this.username = username;
      selamatDatangLabel.setText("Selamat Datang " + username);
      
      
      add(panel);
      setVisible(true);
      setSize(500, 500);
      
      setLocationRelativeTo(null);
      setAlwaysOnTop(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      gbc.insets = new Insets(10, 10, 10, 10);
      
      
      gbc.gridx = 0;
      gbc.gridy = 0;
       gbc.gridwidth = 2;
      gbc.anchor = GridBagConstraints.CENTER;
      panel.add(selamatDatangLabel, gbc);
      
      gbc.gridwidth =1;
        gbc.gridx = 0;
      gbc.gridy = 1;
      panel.add(apelLabel, gbc);
          
        gbc.gridx = 1;
      gbc.gridy = 1;
      panel.add(apelField, gbc);
        apelField.setPreferredSize(new Dimension(200, 30));

        gbc.gridx = 0;
      gbc.gridy = 2;
      panel.add(jerukLabel, gbc);
          
        gbc.gridx = 1;
      gbc.gridy = 2;
      panel.add(jerukField, gbc);
        jerukField.setPreferredSize(new Dimension(200, 30));
        
          gbc.gridx = 0;
      gbc.gridy = 3;
      panel.add(manggaLabel, gbc);
          
        gbc.gridx = 1;
      gbc.gridy = 3;
      panel.add(manggField, gbc);
        manggField.setPreferredSize(new Dimension(200, 30));
      
        gbc.gridx = 0;
      gbc.gridy = 4;
 
      gbc.fill = GridBagConstraints.HORIZONTAL;
      panel.add(beliButton, gbc);
      
        gbc.gridx = 1;
      gbc.gridy = 4;
    
      gbc.fill = GridBagConstraints.HORIZONTAL;
      panel.add(logoutButton, gbc);
        
      beliButton.addActionListener(this);
      logoutButton.addActionListener(this);

    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        try {
             if(e.getSource() == beliButton) {
                 //            int jumlahApel = Integer.getInteger(apelField.getText());
//            int jumlahJeruk = Integer.getInteger(jerukField.getText());
//            int jumlahMangga = Integer.getInteger(manggField.getText());

              // soory mas saya lupa conver dari string ke integer jadi saya hard koding saja
                new BuyPage(2, 2, 2, username);
                  dispose();
            } else  if(e.getSource() == logoutButton) {
                new LoginPage();
                dispose();
            }

            
            
           
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error);
        }
    
    }
}

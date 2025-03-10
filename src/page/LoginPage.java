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
public class LoginPage extends JFrame implements ActionListener{
    JPanel panel = new JPanel(new GridBagLayout());
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JLabel usernameLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
      JTextField usernameField = new JTextField();
    JTextField passwordField = new JTextField();
    GridBagConstraints gbc = new GridBagConstraints();
    
    public LoginPage() {
      panel.setBackground(Color.WHITE);
      add(panel);
      setVisible(true);
      setSize(500, 500);
      
      setLocationRelativeTo(null);
      setAlwaysOnTop(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      gbc.insets = new Insets(10, 10, 10, 10);
      
      
      gbc.gridx = 0;
      gbc.gridy = 0;
      panel.add(usernameLabel, gbc);
      
        gbc.gridx = 1;
      gbc.gridy = 0;
      panel.add(usernameField, gbc);
      usernameField.setPreferredSize(new Dimension(200, 30));
        gbc.gridx = 0;
      gbc.gridy = 1;
      panel.add(passwordLabel, gbc);
      
        gbc.gridx = 1;
      gbc.gridy = 1;
      panel.add(passwordField, gbc);
      passwordField.setPreferredSize(new Dimension(200, 30));
      
        gbc.gridx = 0;
      gbc.gridy = 2;
      gbc.gridwidth = 2;
      gbc.fill = GridBagConstraints.HORIZONTAL;
      panel.add(loginButton, gbc);
gbc.gridwidth = 1;      
        gbc.gridx = 0;
      gbc.gridy = 3;
      gbc.gridwidth = 2;
      gbc.fill = GridBagConstraints.HORIZONTAL;
      panel.add(resetButton, gbc);
        
      loginButton.addActionListener(this);
      resetButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource() == loginButton) {
                String username = usernameField.getText();
                String password = passwordField.getText();
                if (username.equals("rahaditya") && password.equals("123230095") || true) {
                    new HomePage(username);
                    dispose();
                } else {
                    
                }
            } else if(e.getSource() == resetButton) {
                usernameField.setText("");
                passwordField.setText("");
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error);
        }
    
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guitester;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class Tester extends JFrame{
    
    private JPanel loginPnl;
    
    private JLabel loginLbl;
    
    public Tester(){
        setTitle("Login page");
        setSize(500, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        loginPnl = new JPanel(new FlowLayout());
        
        
        loginLbl = new JLabel("Login");
        loginLbl.setFont(new Font(Font.SERIF,Font.ITALIC,2));
        
        loginPnl.add(loginLbl);
        
        
        add(loginPnl);
        
        pack();
        setVisible(true);
    }
    
}

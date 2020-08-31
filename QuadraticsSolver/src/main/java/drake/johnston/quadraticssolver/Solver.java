/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drake.johnston.quadraticssolver;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Jason
 */
public class Solver implements ActionListener{
    
    int count = 0;
    private JLabel label;
    private JButton button;
    private JFrame frame;
    private JPanel panel;
    
    public void RunApp(){
    
        frame = new JFrame();
        
        button = new JButton("Click me");
        button.addActionListener(this);
        
        label = new JLabel("Times Clicked: 0");
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Test");
        frame.pack();
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args){
    
        new Solver().RunApp();
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        count++;
        label.setText("Times Clicked: " + count);
    }
    
}

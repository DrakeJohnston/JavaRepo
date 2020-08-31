/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printaplication;
import java.util.Scanner.*;
import java.awt.color.*;
import javax.swing.*;  
import java.awt.*;
import java.awt.BorderLayout.*;
import java.awt.event.*;

/**
 *
 * @author Jason
 */
public abstract class MainAplication implements ActionListener{
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Your constructor here
                runApp();
            }
        });
        
    }
    
    public static void runApp(){
    
        var bBlackLine = BorderFactory.createLineBorder(Color.black, 2);
        
        JFrame j = new JFrame("MainMenu");
        j.setVisible(true);
        j.setSize(600, 600);
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        j.setLayout(null);
        
        JButton rectB = new JButton("Rectangle Calculator");
        rectB.setBounds(45, 0, 250, 100);
        j.add(rectB);
        
        JButton triB = new JButton("Triangle Calculator");
        triB.setBounds(300, 0, 250, 100);
        j.add(triB);
        
        JButton circB = new JButton("Circle Calculator");
        circB.setBounds(45, 100, 250, 100);
        j.add(circB);
        
        rectB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) { 
                    new RectangleFindClass().rectangleWindow();
                }
        });
        
        triB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new TriangleFindClass().triangleWindow();
            }
        });
        
        circB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new CircleFindClass().circleWindow();
            }
        });
    
    }
    
    
}

        
        
        



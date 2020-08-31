/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printaplication;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jason
 */
public class DrawTriangleClass extends JPanel {
    
   private static int SIDE_A = 20;
   private static int SIDE_B = 20;
   private static int BASE = 100;
   private static int HEIGHT = 50;
    
    public void init() {
        
        JFrame j = new JFrame();
        DrawTriangleClass mainPane = new DrawTriangleClass();
        j.getContentPane().add(mainPane);
        j.setVisible(true);
        j.setSize(1080, 720);
        
    }
    
    @Override
   protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
   }
    
}



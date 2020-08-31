/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printaplication;
import javax.swing.*;  
import java.awt.*;
import java.awt.Graphics2D.*;
import java.awt.Graphics.*;
import java.awt.BorderLayout.*;
import java.awt.event.*;
/**
 *
 * @author 334193422
 */
public class DrawRectangleClass extends JPanel {
    
   private static int RECT_X = 20;
   private static int RECT_Y = 20;
   private static int RECT_WIDTH = 100;
   private static int RECT_HEIGHT = 50;
    
    public void activateWindow(int rectx, int recty){
        
        RECT_WIDTH = rectx * 20;
        RECT_HEIGHT = recty * 20;
    
        DrawRectangleClass mainPanel = new DrawRectangleClass();
        JFrame j = new JFrame("DrawRect");
        //j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.getContentPane().add(mainPanel);
        j.setVisible(true);
        j.setSize(1080, 720);
        
    }
    
@Override
   protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      // draw the rectangle here
      g.drawRect(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
   }
    
}

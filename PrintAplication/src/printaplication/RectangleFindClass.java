/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printaplication;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author Jason
 */
public class RectangleFindClass {
    
    static int length;
    static int width;
    
    public void rectangleWindow() {
    
        var bBlackLine = BorderFactory.createLineBorder(Color.black, 20);
        
        JFrame j = new JFrame();
        
        JButton peremeterButton = new JButton("click for peremeter");
        JButton areaButton = new JButton("Click for area");
        
        JLabel lengthLbl = new JLabel("Input Length: ", SwingConstants.CENTER);
        
        JLabel widthLbl = new JLabel("Input Width: ", SwingConstants.CENTER);
        
        JLabel resultlbl = new JLabel("Result: ", SwingConstants.CENTER);
        
        
        JTextField lengthField = new JTextField();
        JTextField widthField = new JTextField();
        JTextField resultField = new JTextField();
        
        
        peremeterButton.setBounds(65, 425, 200, 50);
        areaButton.setBounds(265, 425, 200, 50);
        lengthLbl.setBounds(150, 30, 300, 100);
        widthLbl.setBounds(150, 130, 300, 100);
        resultlbl.setBounds(150, 250, 300, 100);
        
        lengthField.setBounds(125, 100, 300, 50);
        widthField.setBounds(125, 200, 300, 50);
        resultField.setBounds(125, 340, 300, 50);
        resultField.setEditable(false);
        
        //length input field
        j.add(lengthField);
        //width input field
        j.add(widthField);
        //result field
        j.add(resultField);
        //length input field labl
        j.add(lengthLbl);
        //width input text field
        j.add(widthLbl);
        //result field
        j.add(resultlbl);
        //buttons
        j.add(peremeterButton);
        j.add(areaButton);
        
        
        j.setSize(600, 600);
        j.setTitle("Rectangle Calculator");
        j.setLayout(null);
        j.setVisible(true);
       
        
        lengthField.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) { 
                String typedText = "";
                typedText = lengthField.getText();
                System.out.println(typedText);
                lengthLbl.setText("Input length: " + typedText);
                int leng = Integer.parseInt(typedText);
                System.out.println("Param is too big or small try again");
                setLength(leng);
                    }
        });
        
        widthField.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) { 
                String typedText = "";
                typedText = widthField.getText();
                System.out.println(typedText);
                widthLbl.setText("Input Width: " + typedText);
                int wid = Integer.parseInt(typedText);
                setWidth(wid);
                    }
        });
        
        areaButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            int side1 = length;
            int side2 = width;
            int result = side1 * side2;
            System.out.println("The area of the rectange is " + result);
            String finalResult = "Area of rectangle: " +  Integer.toString(result);
            resultField.setText(finalResult);
            new DrawRectangleClass().activateWindow(length, width);
        }
        });
        
        peremeterButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            int side1 = length;
            int side2 = width;
            int result = side1 * 2 + side2 * 2;
            System.out.println("The peremeter of the rectange is " + result);
            String finalResult = "Peremeter of rectangle: " + Integer.toString(result);
            resultField.setText(finalResult);
            new DrawRectangleClass().activateWindow(length, width);
        }
        });

    }
    
    public static void setLength(int leng){
    length = leng;
    System.out.println(length);
    }
    
    public static void setWidth(int wid){
    width = wid;
    System.out.println(width);
    }
}
    

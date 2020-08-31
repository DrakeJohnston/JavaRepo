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
import javax.swing.JCheckBox;
import java.awt.GridLayout;

/**
 *
 * @author Jason
 */
public class CircleFindClass {
    
    float radius;
    float diameter;
    float resultCirc;
    float resultArea;
    JFrame j = new JFrame();
    
    public void circleWindow() {
        
        var bBlackLine = BorderFactory.createLineBorder(Color.black, 10);
    
        
        j.setSize(450, 450);
        j.setLayout(null);
        j.setTitle("Circle finder");
        j.setVisible(true);
        
        GridBagLayout layout = new GridBagLayout();
        
        JPanel diaPanel = new JPanel();
        diaPanel.setBounds(0, 0, 450, 450);
        diaPanel.setVisible(true);        
        diaPanel.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        j.add(diaPanel);
        
        JCheckBox radiCheckBox = new JCheckBox("Check for Radus");
        radiCheckBox.setBounds(200, 30, 500, 40);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        diaPanel.add(radiCheckBox, gbc);
        
        
        //to do: add two buttons
        //Diameter Control
        
        JLabel diaLbl = new JLabel("Input Diameter for Circle solution");
        //diaLbl.setBounds(200, 100, 500, 40);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        diaPanel.add(diaLbl, gbc);
        
        JTextField diaTextField = new JTextField();
        //diaTextField.setBounds(230, 70, 200, 40);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.ipady = 40;
        diaPanel.add(diaTextField, gbc);
        
        JButton diaButton = new JButton("Press to imput Diameter");
        //diaButton.setBounds(200, 150, 200, 40);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.ipady = 40;
        diaPanel.add(diaButton, gbc);
        
        //radius setters
        
        JLabel radiLbl = new JLabel("Input Radius for Circle solution");
        //diaLbl.setBounds(200, 100, 500, 40);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        diaPanel.add(radiLbl, gbc);
        
        JTextField radiTextField = new JTextField();
        //diaTextField.setBounds(230, 70, 200, 40);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.ipady = 40;
        diaPanel.add(radiTextField, gbc);
        
        JButton radiButton = new JButton("Press to imput Radius");
        //diaButton.setBounds(200, 150, 200, 40);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.ipady = 40;
        diaPanel.add(radiButton, gbc);
        
        radiCheckBox.setSelected(false);
        radiLbl.setVisible(false);
        radiTextField.setVisible(false);
        radiButton.setVisible(false);
    
        
        radiCheckBox.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) { 
                    
                    if(radiCheckBox.isSelected()){
                        //disable dia fields
                        diaTextField.setText("");
                        diaLbl.setVisible(false);
                        diaTextField.setVisible(false);
                        diaButton.setVisible(false);
                        
                        //enable radi fields
                        radiLbl.setVisible(true);
                        radiTextField.setVisible(true);
                        radiButton.setVisible(true);
                        
                    }else{
                        //enable dia fields
                        diaLbl.setVisible(true);
                        diaTextField.setVisible(true);
                        diaButton.setVisible(true);
                        
                        //disable radifeilds                       
                        radiLbl.setVisible(false);
                        radiTextField.setVisible(false);
                        radiButton.setVisible(false);
                    }
                }
        });
        
        
        diaButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                diameter = Integer.parseInt(diaTextField.getText());
                System.out.println(diameter);
                calculateResult(false);
            }
        });
        
        radiButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                radius = Integer.parseInt(radiTextField.getText());
                System.out.println(radius);
                calculateResult(true);
            }
        });
        
        
        
    }
    
    public void calculateResult(boolean isRadi){
        
        if(isRadi){
            float circ;
            circ = (2 * 3.14f )* radius;
            System.out.println(circ);
            resultCirc = circ;
            
            float area;
            area = (float) (3.14f * Math.pow(radius, 2));
            System.out.println(area);
            resultArea = area;
        }else{
            float circ;
            circ = 3.14f * diameter;
            System.out.println(circ);
            resultCirc = circ;
            
            float area;
            area = (float) ((3.14f * 4) * Math.pow(diameter, 2));
            System.out.println(area);
            resultArea = area;
        }
        
        JFrame cJ = new JFrame("ResultPage");
        cJ.setSize(300, 300);
        cJ.setLayout(null);
        cJ.setVisible(true);
        
        String finalResultCirc = Float.toString(resultCirc);
        JLabel resultCircLbl = new JLabel("Your Final Result Circumfrence: " + finalResultCirc);
        resultCircLbl.setBounds(50, 0, 250, 100);
        cJ.add(resultCircLbl);
        
        String finalResultArea = Float.toString(resultArea);
        JLabel resultAreaLbl = new JLabel("Your Final Result Area: " + finalResultArea);
        resultAreaLbl.setBounds(50, 50, 250, 100);
        cJ.add(resultAreaLbl);
        
        JButton resetButton = new JButton("Click here to reset");
        resetButton.setBounds(50, 130, 200, 50);
        cJ.add(resetButton);
        
        resetButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new CircleFindClass().circleWindow();
                cJ.dispose();
                j.dispose();
            }
        });
    }
    
}

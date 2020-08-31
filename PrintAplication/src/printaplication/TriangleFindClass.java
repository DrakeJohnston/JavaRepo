/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printaplication;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.util.Random;

/**
 *
 * @author Jason
 */
public class TriangleFindClass {
    
    static int sideA;
    static int sideB;
    static int base;
    static int height;
    
    public void triangleWindow(){
        

        JFrame j = new JFrame("Triangle Calculator");
        //width, height
        j.setSize(1200, 650);
        j.setVisible(true);
        j.setResizable(false);
        j.setLayout(null);
        
        //<editor-fold defaultstate="collapsed" desc="Setter code">
        //side A setter stuff
        JPanel sideAPanel = new JPanel();      
        sideAPanel.setBounds(0, 0, 580, 200);
        sideAPanel.setBackground(Color.gray);
        sideAPanel.setLayout(null);
        sideAPanel.setBorder(new TitledBorder( new LineBorder(Color.black, 5), "Length A"));
        j.add(sideAPanel);
        
        JLabel sideALbl = new JLabel("Input side a length");
        sideALbl.setBounds(150, 10, 200, 100);
        sideALbl.setBackground(Color.blue);
        sideAPanel.add(sideALbl);
        
        JTextField sideATF = new JTextField();
        sideATF.setBounds(150, 70, 200, 50);
        sideAPanel.add(sideATF);
        
        JButton sideAButton = new JButton("Set Length");
        sideAButton.setBounds(150, 130, 200, 50);
        sideAPanel.add(sideAButton);
        
        //side b setter stuff
        JPanel sideBPanel = new JPanel();      
        sideBPanel.setBounds(0, 200, 580, 200);
        sideBPanel.setBackground(Color.gray);
        sideBPanel.setLayout(null);
        sideBPanel.setBorder(new TitledBorder( new LineBorder(Color.black, 5), "Length B"));
        j.add(sideBPanel);
        
        JLabel sideBLbl = new JLabel("Input side b length");
        sideBLbl.setBounds(150, 10, 200, 100);
        sideBLbl.setBackground(Color.blue);
        sideBPanel.add(sideBLbl);
        
        JTextField sideBTF = new JTextField();
        sideBTF.setBounds(150, 70, 200, 50);
        sideBPanel.add(sideBTF);
        
        JButton sideBButton = new JButton("Set length");
        sideBButton.setBounds(150, 130, 200, 50);
        sideBPanel.add(sideBButton);
        
        //Base setter stuff
        JPanel basePanel = new JPanel();      
        basePanel.setBounds(0, 400, 580, 200);
        basePanel.setBackground(Color.gray);
        basePanel.setLayout(null);
        basePanel.setBorder(new TitledBorder( new LineBorder(Color.black, 5), "Base"));
        j.add(basePanel);
        
        JLabel baseLbl = new JLabel("Input Base Length");
        baseLbl.setBounds(150, 10, 200, 100);
        baseLbl.setBackground(Color.blue);
        basePanel.add(baseLbl);
        
        JTextField baseTF = new JTextField();
        baseTF.setBounds(150, 70, 200, 50);
        basePanel.add(baseTF);
        
        JButton baseButton = new JButton("Set Base");
        baseButton.setBounds(150, 130, 200, 50);
        basePanel.add(baseButton);
        
        //Height setter stuff
        JPanel heightPanel = new JPanel();      
        heightPanel.setBounds(600, 0, 580, 200);
        heightPanel.setBackground(Color.gray);
        heightPanel.setLayout(null);
        heightPanel.setBorder(new TitledBorder( new LineBorder(Color.black, 5), "Height"));
        j.add(heightPanel);
        
        JLabel heightLbl = new JLabel("Input a Height");
        heightLbl.setBounds(150, 10, 200, 100);
        heightLbl.setBackground(Color.blue);
        heightPanel.add(heightLbl);
        
        JTextField heightTF = new JTextField();
        heightTF.setBounds(150, 70, 200, 50);
        heightPanel.add(heightTF);
        
        JButton heightButton = new JButton("Set Height");
        heightButton.setBounds(100, 130, 200, 50);
        heightPanel.add(heightButton);
        
        JButton heightRandButton = new JButton("Set Random Height");
        heightRandButton.setBounds(300, 130, 200, 50);
        heightPanel.add(heightRandButton);
        
        //Result setter stuff
        JPanel resultPanel = new JPanel();      
        resultPanel.setBounds(600, 200, 580, 200);
        resultPanel.setBackground(Color.gray);
        resultPanel.setLayout(null);
        resultPanel.setBorder(new TitledBorder( new LineBorder(Color.black, 5), "Result"));
        j.add(resultPanel);
        
        JLabel resultLbl = new JLabel("Your result will show here");
        resultLbl.setBounds(150, 10, 200, 100);
        resultLbl.setForeground(Color.blue);
        resultPanel.add(resultLbl);
        
        JTextField resultTF = new JTextField();
        resultTF.setBounds(150, 70, 200, 50);
        resultTF.setEditable(false);
        resultPanel.add(resultTF);
        
        JButton peremeterButton = new JButton("Get the peremeter");
        peremeterButton.setBounds(100, 130, 200, 50);
        resultPanel.add(peremeterButton);
        
        JButton areaButton = new JButton("Get the area");
        areaButton.setBounds(300, 130, 200, 50);
        resultPanel.add(areaButton);
        
        //Inputed stuff here
        JPanel finalImputPanel = new JPanel();      
        finalImputPanel.setBounds(600, 400, 580, 200);
        finalImputPanel.setBackground(Color.gray);
        finalImputPanel.setLayout(null);
        finalImputPanel.setBorder(new TitledBorder( new LineBorder(Color.black, 5), "Your Imputs"));
        j.add(finalImputPanel);
        
        JLabel iSideALbl = new JLabel("Side A: ");
        iSideALbl.setBounds(50, 40, 200, 100);
        iSideALbl.setForeground(Color.blue);
        finalImputPanel.add(iSideALbl);
        
        JLabel iSideBLbl = new JLabel("Side B: ");
        iSideBLbl.setBounds(230, 40, 200, 100);
        iSideBLbl.setForeground(Color.blue);
        finalImputPanel.add(iSideBLbl);
        
        JLabel iBaseLbl = new JLabel("Base: ");
        iBaseLbl.setBounds(420, 40, 200, 100);
        iBaseLbl.setForeground(Color.blue);
        finalImputPanel.add(iBaseLbl);
        
        JLabel iHeightLbl = new JLabel("Height: ");
        iHeightLbl.setBounds(50, 80, 200, 100);
        iHeightLbl.setForeground(Color.blue);
        finalImputPanel.add(iHeightLbl);
        
        /*JLabel finResultLbl = new JLabel("Final Result: ");
        finResultLbl.setBounds(230, 80, 200, 100);
        finResultLbl.setForeground(Color.blue);
        finalImputPanel.add(finResultLbl);*/
        
        //</editor-fold>
        
        sideAButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String inputedText = sideATF.getText();
               int tmpSideA = Integer.parseInt(inputedText);
               iSideALbl.setText("Side A: " + tmpSideA );
               sideA = tmpSideA;
            }
        });
        
        sideBButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String inputedText = sideBTF.getText();
               int tmpSideB = Integer.parseInt(inputedText);
               iSideBLbl.setText("Side B: " + tmpSideB );
               sideB = tmpSideB;
            }
        });
        
        heightButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String inputedText = heightTF.getText();
               int tmpHeight = Integer.parseInt(inputedText);
               iHeightLbl.setText("Height: " + tmpHeight );
               height = tmpHeight; 
            }
        });
        
        heightRandButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               int randHeight;
               Random random = new Random();
               randHeight = random.ints(0, 50).findFirst().getAsInt();
               iHeightLbl.setText("Height: " + randHeight );
               height = randHeight; 
            }
        });
        
        baseButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String inputedText = baseTF.getText();
               int tmpBase = Integer.parseInt(inputedText);
               iBaseLbl.setText("Base: " + tmpBase );
               base = tmpBase; 
            }
        });
        
        peremeterButton.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
                int peremeter = base + sideA + sideB;
                resultTF.setText("The peremeter is: " + peremeter);
                new DrawTriangleClass().init();
            }
        });
        
        areaButton.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
                double area = 0.5*(base * height);
                resultTF.setText("The Area is: " + area);
                new DrawTriangleClass().init();
            }
        });
        
        
}
    
}

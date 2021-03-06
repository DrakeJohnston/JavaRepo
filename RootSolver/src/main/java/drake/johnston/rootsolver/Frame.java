/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drake.johnston.rootsolver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Jason
 */
public class Frame extends javax.swing.JFrame {

    
    int valueA = 0;
    int valueB = 0;
    int valueC = 0;
    int disc;
    
    boolean alreadyExecuted = false;
    
    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
        
        InputButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    if(Integer.parseInt(ATextField.getText()) != 0){
                    
                        valueA = Integer.parseInt(ATextField.getText());
                        valueB = Integer.parseInt(BTextField.getText());
                        valueC = Integer.parseInt(CTextField.getText());
                        ErrorLbl.setText("");
                        
                    }else{
                        
                        ErrorLbl.setText("Error Occured, A value is 0");
                        
                    }


                }
                
            }
        );
              
        if(!alreadyExecuted){
            
            discUpZero.setVisible(false);
            discEqualZero.setVisible(false);
            discDownZero.setVisible(false);
            BlankPanel.setVisible(true);
            alreadyExecuted = true;
        
        }      
                                        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        InputALabel = new javax.swing.JLabel();
        InputBLabel = new javax.swing.JLabel();
        InputCLabel = new javax.swing.JLabel();
        CTextField = new javax.swing.JTextField();
        BTextField = new javax.swing.JTextField();
        ATextField = new javax.swing.JTextField();
        InputButton = new javax.swing.JButton();
        solveButton = new javax.swing.JButton();
        ErrorLbl = new javax.swing.JLabel();
        clearInBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        discUpZero = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        textLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        discLbl = new javax.swing.JLabel();
        valBLbl = new javax.swing.JLabel();
        valCLbl = new javax.swing.JLabel();
        valALbl = new javax.swing.JLabel();
        rootLbl1 = new javax.swing.JLabel();
        rootLbl2 = new javax.swing.JLabel();
        discEqualZero = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        textLbl2 = new javax.swing.JLabel();
        titleLbl2 = new javax.swing.JLabel();
        discLbl2 = new javax.swing.JLabel();
        valBLbl2 = new javax.swing.JLabel();
        valCLbl2 = new javax.swing.JLabel();
        valALbl2 = new javax.swing.JLabel();
        rootEqulLbl = new javax.swing.JLabel();
        discDownZero = new javax.swing.JPanel();
        titleLbl3 = new javax.swing.JLabel();
        discLbl3 = new javax.swing.JLabel();
        valBLbl3 = new javax.swing.JLabel();
        valCLbl3 = new javax.swing.JLabel();
        valALbl3 = new javax.swing.JLabel();
        BlankPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        InputALabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InputALabel.setText("Please Input Value A");

        InputBLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InputBLabel.setText("Please Input Value B");

        InputCLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InputCLabel.setText("Please Input Value C");

        CTextField.setText("Enter Value Here");

        BTextField.setText("Enter Value Here");

        ATextField.setText("Enter Value Here");

        InputButton.setText("Press To Input Awnsers");

        solveButton.setText("Solve");
        solveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveButtonActionPerformed(evt);
            }
        });

        clearInBtn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        clearInBtn.setText("Clear Inputs");
        clearInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearInBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(ATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InputButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InputALabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InputBLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InputCLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ErrorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(clearInBtn)
                        .addGap(5, 5, 5)
                        .addComponent(solveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(InputALabel)
                .addGap(16, 16, 16)
                .addComponent(ATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(InputBLabel)
                .addGap(18, 18, 18)
                .addComponent(BTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(InputCLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(InputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ErrorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clearInBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(solveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 450));

        jPanel2.setLayout(new java.awt.CardLayout());

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setText("\t\nRoot1 = 2*a/(-b + SqureRoot(b*b - 4*a*c))\n\n\nRoot2 = 2*a/(-b - SqureRoot(b*b - 4*a*c))");
        jScrollPane1.setViewportView(textArea);

        textLbl.setText("Two Real Roots Equation");

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setText("You have Two Real roots");

        discLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        discLbl.setText("Your discriminant:");

        valBLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valBLbl.setText("Your B Value:");

        valCLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valCLbl.setText("Your C Value:");

        valALbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valALbl.setText("Your A Value:");

        rootLbl1.setText("Root 1:");

        rootLbl2.setText("Root 2:");

        javax.swing.GroupLayout discUpZeroLayout = new javax.swing.GroupLayout(discUpZero);
        discUpZero.setLayout(discUpZeroLayout);
        discUpZeroLayout.setHorizontalGroup(
            discUpZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(discUpZeroLayout.createSequentialGroup()
                .addGroup(discUpZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(discUpZeroLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(titleLbl))
                    .addGroup(discUpZeroLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(discUpZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(discUpZeroLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(discUpZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rootLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rootLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(discUpZeroLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(discLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valBLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, discUpZeroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(valALbl, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valCLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        discUpZeroLayout.setVerticalGroup(
            discUpZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(discUpZeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(discUpZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(discUpZeroLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(discUpZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(discLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valBLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(discUpZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valCLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valALbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(discUpZeroLayout.createSequentialGroup()
                        .addComponent(rootLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(rootLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel2.add(discUpZero, "card2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\nRoot1 = Root2 = -b/2*a");
        jScrollPane2.setViewportView(jTextArea1);

        textLbl2.setText("Two Equall Roots Equation");

        titleLbl2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl2.setText("You have Two Equal Roots");

        discLbl2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        discLbl2.setText("Your discriminant:");

        valBLbl2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valBLbl2.setText("Your B Value:");

        valCLbl2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valCLbl2.setText("Your C Value:");

        valALbl2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valALbl2.setText("Your A Value:");

        rootEqulLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rootEqulLbl.setText("Root 1 and 2: ");

        javax.swing.GroupLayout discEqualZeroLayout = new javax.swing.GroupLayout(discEqualZero);
        discEqualZero.setLayout(discEqualZeroLayout);
        discEqualZeroLayout.setHorizontalGroup(
            discEqualZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(discEqualZeroLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(discEqualZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(discEqualZeroLayout.createSequentialGroup()
                        .addComponent(valALbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valCLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(discEqualZeroLayout.createSequentialGroup()
                        .addGroup(discEqualZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleLbl2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(rootEqulLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(discEqualZeroLayout.createSequentialGroup()
                        .addComponent(discLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valBLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        discEqualZeroLayout.setVerticalGroup(
            discEqualZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(discEqualZeroLayout.createSequentialGroup()
                .addComponent(titleLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(discEqualZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(discEqualZeroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(discEqualZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(discLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valBLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(discEqualZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valALbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valCLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(discEqualZeroLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(rootEqulLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jPanel2.add(discEqualZero, "card3");

        titleLbl3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl3.setText("There Are no real roots");

        discLbl3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        discLbl3.setText("Your discriminant:");

        valBLbl3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valBLbl3.setText("Your B Value:");

        valCLbl3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valCLbl3.setText("Your C Value:");

        valALbl3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valALbl3.setText("Your A Value:");

        javax.swing.GroupLayout discDownZeroLayout = new javax.swing.GroupLayout(discDownZero);
        discDownZero.setLayout(discDownZeroLayout);
        discDownZeroLayout.setHorizontalGroup(
            discDownZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(discDownZeroLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(discDownZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(discDownZeroLayout.createSequentialGroup()
                        .addComponent(valALbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valCLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(discDownZeroLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(titleLbl3))
                    .addGroup(discDownZeroLayout.createSequentialGroup()
                        .addComponent(discLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valBLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        discDownZeroLayout.setVerticalGroup(
            discDownZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(discDownZeroLayout.createSequentialGroup()
                .addComponent(titleLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(discDownZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valBLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(discDownZeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valALbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valCLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jPanel2.add(discDownZero, "card4");

        javax.swing.GroupLayout BlankPanelLayout = new javax.swing.GroupLayout(BlankPanel);
        BlankPanel.setLayout(BlankPanelLayout);
        BlankPanelLayout.setHorizontalGroup(
            BlankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        BlankPanelLayout.setVerticalGroup(
            BlankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel2.add(BlankPanel, "card5");

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 650, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveButtonActionPerformed
        // TODO add your handling code here:
        if(valueA != 0.0){
            disc = (valueB * valueB) - (4 * valueA * valueC);
            System.out.println(disc);
        }
        
        if(disc > 0){
        
            discUpZero.setVisible(true);
            discEqualZero.setVisible(false);
            discDownZero.setVisible(false);
            
//            Root1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2 * a);
            double root1 = (-valueB + Math.sqrt(valueB * valueB - 4 * valueA * valueC)) / (2 * valueA);
            double root2 = (-valueB - Math.sqrt(valueB * valueB - 4 * valueA * valueC)) / (2 * valueA);
            
            rootLbl1.setText("Root 1: " + root1);
            rootLbl2.setText("Root 2: " + root2);
            
            discLbl.setText("Your discriminant: " + disc);
            valALbl.setText("Your A Value: " + valueA);
            valBLbl.setText("Your B Value: " + valueB);
            valCLbl.setText("Your C Value: " + valueC);
        
        }else if(disc == 0){
        
            discUpZero.setVisible(false);
            discEqualZero.setVisible(true);
            discDownZero.setVisible(false);
            
            double root = -valueB/2 * valueA;
            
            rootEqulLbl.setText("Root 1 and 2: " + root);
            
            discLbl2.setText("Your discriminant: " + disc);
            valALbl2.setText("Your A Value: " + valueA);
            valBLbl2.setText("Your B Value: " + valueB);
            valCLbl2.setText("Your C Value: " + valueC);
        
        }else if(disc < 0){
        
            discUpZero.setVisible(false);
            discEqualZero.setVisible(false);
            discDownZero.setVisible(true);
            discLbl3.setText("Your discriminant: " + disc);
            valALbl3.setText("Your A Value: " + valueA);
            valBLbl3.setText("Your B Value: " + valueB);
            valCLbl3.setText("Your C Value: " + valueC);
        
        }else{
            
            discUpZero.setVisible(false);
            discEqualZero.setVisible(false);
            discDownZero.setVisible(false);
            BlankPanel.setVisible(true);
            
        }
                 
    }//GEN-LAST:event_solveButtonActionPerformed

    private void clearInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearInBtnActionPerformed
        // TODO add your handling code here:
        CTextField.setText("");
        BTextField.setText("");
        ATextField.setText("");
    }//GEN-LAST:event_clearInBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ATextField;
    private javax.swing.JTextField BTextField;
    private javax.swing.JPanel BlankPanel;
    private javax.swing.JTextField CTextField;
    private javax.swing.JLabel ErrorLbl;
    private javax.swing.JLabel InputALabel;
    private javax.swing.JLabel InputBLabel;
    private javax.swing.JButton InputButton;
    private javax.swing.JLabel InputCLabel;
    private javax.swing.JButton clearInBtn;
    private javax.swing.JPanel discDownZero;
    private javax.swing.JPanel discEqualZero;
    private javax.swing.JLabel discLbl;
    private javax.swing.JLabel discLbl2;
    private javax.swing.JLabel discLbl3;
    private javax.swing.JPanel discUpZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel rootEqulLbl;
    private javax.swing.JLabel rootLbl1;
    private javax.swing.JLabel rootLbl2;
    private javax.swing.JButton solveButton;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel textLbl;
    private javax.swing.JLabel textLbl2;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel titleLbl2;
    private javax.swing.JLabel titleLbl3;
    private javax.swing.JLabel valALbl;
    private javax.swing.JLabel valALbl2;
    private javax.swing.JLabel valALbl3;
    private javax.swing.JLabel valBLbl;
    private javax.swing.JLabel valBLbl2;
    private javax.swing.JLabel valBLbl3;
    private javax.swing.JLabel valCLbl;
    private javax.swing.JLabel valCLbl2;
    private javax.swing.JLabel valCLbl3;
    // End of variables declaration//GEN-END:variables
}

package z.test;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
    
    ArrayList<Double> sampleOne = new ArrayList();
    ArrayList<Double> sampleTwo = new ArrayList();
    DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    Point center; 
    
    public MainFrame() {
        initComponents();
        center = new Point(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setLocation(center);
        dcbm.addElement("");
        dcbm.addElement("!=");
        dcbm.addElement(">");
        dcbm.addElement("<");
        operatorCB.setModel(dcbm);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        set2Elements = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        set1Elements = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sample2CB = new javax.swing.JCheckBox();
        sample1CB = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        sampleOneStdTF = new javax.swing.JTextField();
        sampleTwoStdTF = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sampleTwoMeanTf = new javax.swing.JTextField();
        sampleOneMeanTF = new javax.swing.JTextField();
        alfaTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        differenceTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        operatorCB = new javax.swing.JComboBox<>();
        hypoValueTF = new javax.swing.JTextField();
        drawBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sampleOneMean2 = new javax.swing.JTextField();
        sampleOneStd2 = new javax.swing.JTextField();
        sampleTwoMean2 = new javax.swing.JTextField();
        sampleTwoStd2 = new javax.swing.JTextField();
        sampleTwoSecondChoiceCB = new javax.swing.JCheckBox();
        sample1secondChoiceCB = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 255, 204));
        setLocation(new java.awt.Point(350, 250));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("   SAMPLE ONE");

        jLabel9.setText("Enter Significance Level (alfa)");

        set2Elements.setColumns(20);
        set2Elements.setRows(5);
        set2Elements.setText("Ex:2.5,3.16,5...");
        set2Elements.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MousePressed2(evt);
            }
        });
        jScrollPane7.setViewportView(set2Elements);

        set1Elements.setColumns(20);
        set1Elements.setRows(5);
        set1Elements.setText("Ex:2.5,3.16,5...");
        set1Elements.setAutoscrolls(false);
        set1Elements.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MousePressed(evt);
            }
        });
        jScrollPane8.setViewportView(set1Elements);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("  SAMPLE TWO");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Input As Sample");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Input As Sample");

        sample2CB.setText("Elements Have Chosen");
        sample2CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sample2CBActionPerformed(evt);
            }
        });

        sample1CB.setText("Elements Have Chosen");
        sample1CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sample1CBActionPerformed(evt);
            }
        });

        jLabel14.setText("Standart Deviation");

        jLabel15.setText("Standart Deviation");

        sampleOneStdTF.setEditable(false);
        sampleOneStdTF.setText("0");

        sampleTwoStdTF.setEditable(false);
        sampleTwoStdTF.setText("0");

        jLabel16.setText("Mean");

        jLabel17.setText("Mean");

        sampleTwoMeanTf.setEditable(false);
        sampleTwoMeanTf.setText("0");

        sampleOneMeanTF.setEditable(false);
        sampleOneMeanTF.setText("0");

        alfaTF.setText("95");
        alfaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfaTFActionPerformed(evt);
            }
        });

        jLabel2.setText("H0:");

        jLabel3.setText("|u1 - u2|");

        differenceTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isClickedOnYou(evt);
            }
        });
        differenceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                differenceTFActionPerformed(evt);
            }
        });

        jLabel4.setText("HA:");

        jLabel5.setText("|u1 - u2|");

        operatorCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatorCBActionPerformed(evt);
            }
        });

        hypoValueTF.setEditable(false);
        hypoValueTF.setText("0");
        hypoValueTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isClickedOnYou(evt);
            }
        });

        drawBTN.setText("DRAW GRAPH");
        drawBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawBTNActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("(Calculate Values Before Draw The Graph)");

        jLabel1.setText("%");

        jLabel8.setText("=");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Input Directly Mean And Std");

        sampleTwoMean2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MousePressed1(evt);
            }
        });

        sampleTwoStd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MousePressed1(evt);
            }
        });

        sampleTwoSecondChoiceCB.setText("Mean,Std Have Chosen");
        sampleTwoSecondChoiceCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sampleTwoSecondChoiceCBActionPerformed(evt);
            }
        });

        sample1secondChoiceCB.setText("Mean,Std Have Chosen");
        sample1secondChoiceCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sample1secondChoiceCBActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Input Directly Mean And Std");

        jLabel19.setText("Mean");

        jLabel20.setText("St.Deviation");

        jLabel21.setText("Mean");

        jLabel22.setText("St.Deviation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(operatorCB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hypoValueTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(differenceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(drawBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel22))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(sampleOneStd2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                            .addComponent(sampleOneMean2))
                                        .addGap(18, 18, 18)
                                        .addComponent(sample1secondChoiceCB))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(alfaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sampleOneMeanTF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sampleOneStdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sample1CB)
                                .addGap(275, 275, 275)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sample2CB)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(sampleTwoMean2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                            .addComponent(sampleTwoStd2, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(sampleTwoMeanTf, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(sampleTwoSecondChoiceCB)
                                                .addGap(8, 8, 8))
                                            .addComponent(sampleTwoStdTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(142, 142, 142))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jLabel18)
                    .addContainerGap(519, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sample1CB)
                    .addComponent(sample2CB))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sampleOneStdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sampleOneMeanTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(sampleTwoStdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sampleTwoMeanTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sampleTwoMean2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sampleOneMean2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sampleOneStd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sampleTwoStd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sampleTwoSecondChoiceCB)
                            .addComponent(sample1secondChoiceCB))
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drawBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(differenceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(operatorCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hypoValueTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(alfaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(341, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addGap(172, 172, 172)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    double sampleOneStd;
    double sampleOneMean;
    double sampleOneVariance;
    private void sample1CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sample1CBActionPerformed
        
        if(sample1CB.isSelected()){
            sample1secondChoiceCB.setSelected(false);
        }
       if(!sample1CB.isSelected() && sampleOne.size() != 0){
           sampleOneMeanTF.setText("0");
           sampleOneStdTF.setText("0");
           sampleOne.removeAll(sampleOne);
           return;
       }  
       String[] elementsOne = set1Elements.getText().split(",");
       Double[] numberOneElements = new Double[elementsOne.length];
       boolean isCorrect = true;
       try {
           for(int i = 0; i < elementsOne.length; i++) {
               numberOneElements[i] = Double.parseDouble(elementsOne[i]);
           }
        } 
       catch (NumberFormatException e) {
           isCorrect = false;
           JOptionPane.showMessageDialog(rootPane, "Please input only numbers as sample elements");
           sample1CB.setSelected(false);
        }
       if(isCorrect){
           for(int i = 0; i < numberOneElements.length; i++) {
               sampleOne.add(numberOneElements[i]);
           }
            sampleOneStd = 0;
            sampleOneMean = 0;
            for (Double double1 : sampleOne) {
                 sampleOneMean+= double1;    
             }
             sampleOneMean = sampleOneMean/sampleOne.size();
              for (Double double1 : sampleOne) {
                 sampleOneStd+= Math.pow((double1 - sampleOneMean), 2);
             }
             sampleOneVariance = sampleOneStd/sampleOne.size();
             sampleOneStd = Math.pow((sampleOneStd/sampleOne.size()),0.5);
             sampleOneMeanTF.setText(String.format("%.2f",sampleOneMean));
             sampleOneStdTF.setText(String.format("%.2f",sampleOneStd));
       }
    }//GEN-LAST:event_sample1CBActionPerformed
    private void MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MousePressed
        
        if(set1Elements.getText().equals("Ex:2.5,3.16,5...")){
            set1Elements.setText("");
        }
        if(sample1CB.isSelected()){
          sample1CB.setSelected(false);
      }
        
    }//GEN-LAST:event_MousePressed
    private void MousePressed2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MousePressed2
        for (Double double1 : sampleTwo) {
            sampleTwo.remove(double1);
        }
        
        if(set2Elements.getText().equals("Ex:2.5,3.16,5...")){
            set2Elements.setText("");
        }
      if(sample2CB.isSelected()){
          sample2CB.setSelected(false);
      }
    }//GEN-LAST:event_MousePressed2
    double sampleTwoStd;
    double sampleTwoMean;
    double sampleTwoVariance;
    private void sample2CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sample2CBActionPerformed
        
        if(sample2CB.isSelected()){
            sampleTwoSecondChoiceCB.setSelected(false);
        }
       if(!sample2CB.isSelected() && !sampleTwo.isEmpty()){
           sampleTwoMeanTf.setText("0");
           sampleTwoStdTF.setText("0");
           sampleTwo.removeAll(sampleTwo);
           return;
       }  
       String[] elementsTwo = set2Elements.getText().split(",");
       Double[] numberTwoElements = new Double[elementsTwo.length];
       
       boolean isCorrect = true;
       try {
           for(int i = 0; i < elementsTwo.length; i++) {
               numberTwoElements[i] = Double.parseDouble(elementsTwo[i]);
           }
        } 
       catch (NumberFormatException e) {
           isCorrect = false;
           JOptionPane.showMessageDialog(rootPane, "Please input only numbers as sample elements");
           sample1CB.setSelected(false);          
        }
       if(isCorrect){
            for(int i = 0; i < numberTwoElements.length; i++) {
               sampleTwo.add(numberTwoElements[i]);
            }
            sampleTwoStd = 0;
            sampleTwoMean = 0;
            for (Double double1 : sampleTwo) {
                 sampleTwoMean+= double1;    
             }
             sampleTwoMean = sampleTwoMean/sampleTwo.size();
              for (Double double1 : sampleTwo) {
                 sampleTwoStd+= Math.pow((double1 - sampleTwoMean), 2);
             }
             sampleTwoVariance = sampleTwoStd/sampleTwo.size();
             sampleTwoStd = Math.pow(sampleTwoStd/sampleTwo.size(),0.5);
             sampleTwoMeanTf.setText(String.format("%.2f",sampleTwoMean));
             sampleTwoStdTF.setText(String.format("%.2f",sampleTwoStd));
       }
       
    }//GEN-LAST:event_sample2CBActionPerformed
    private double getStandartNormalDistrib(int a){
        double z0 = -10;
        switch (a) {
            case 1:
                z0 = 2.302;
                break;
            case 2:
                z0 = 2.005;
                break;
            case 3:
                z0 = 1.808;
                break;
            case 4:
                z0 = 1.704;
                break;
            case 5:
                z0 = 1.604;
                break;
            case 6:
                z0 = 1.505;
                break;
            case 7:
                z0 = 1.407;
                break;
            case 8:
                z0 = 1.400;
                break;
            case 9:
                z0 = 1.304;
                break;
            case 10:
                z0 = 1.208;
                break;
            default:
                break;
        }
        return z0;
    }
    private double getStandartNormalDistrib(double alfa){
        double z0 = -10;
        if(alfa == 0.5){
            z0 = 2.507;
        }
        else if(alfa==1){
            z0=2.302;
        }
        else if(alfa==1.5){
            z0=2.107;
        }
        else if(alfa==2){
            z0=2.005;
        }
        else if(alfa==2.5){
            z0=1.906;
        }
        else if(alfa==3){
            z0=1.808;
        }
        else if(alfa==3.5){
            z0=1.801;
        }
        else if(alfa==4){
            z0=1.704;
        }
        else if(alfa==4.5){
            z0=1.609;
        }
        else if(alfa==5){
            z0=1.604;
        }       
        return z0;
    }
    private void drawBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawBTNActionPerformed
     
        if(operatorCB.getSelectedItem().toString().equals("")){
             JOptionPane.showMessageDialog(rootPane, "You should choose an operator for HA");
             return;
        }
        String alternativeType = "";
        switch (operatorCB.getSelectedItem().toString()) {
            case "!=":
                alternativeType = "Two-Sided Alternative";
                break;
            case ">":
                alternativeType = "Right-Tail Alternative";
                break;
            case "<":
                alternativeType = "Left-Tail Alternative";
                break;
            default:
                break;
        }
        if((sample1CB.isSelected() && sample2CB.isSelected()) || 
                (sample1secondChoiceCB.isSelected() && sampleTwoSecondChoiceCB.isSelected())){
        int alfaValue = 0;
        double z0 = -10;
        double testStatistics = 0;
        boolean isNumber = true;
        double theDifferenceBetweenMeans = 0;
        try {
            alfaValue = Integer.parseInt(alfaTF.getText());
            theDifferenceBetweenMeans = Double.parseDouble(differenceTF.getText());
        } catch (NumberFormatException e) {
            isNumber = false;
            JOptionPane.showMessageDialog(rootPane, "You should only use numbers as input values!");
        }
        if(isNumber){
            if(alfaValue>=90 && alfaValue <= 100){
                z0 = getStandartNormalDistrib(100-alfaValue);
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Alfa must be an integer between 1 and 10 including 1 and 10");
            }
        }
        if(z0 != -10){
            if(Math.pow(sampleOneVariance+sampleTwoVariance,0.5) != 0 ){
              testStatistics = (sampleOneMean - sampleTwoMean-theDifferenceBetweenMeans)/Math.pow(sampleOneVariance+sampleTwoVariance,0.5);  
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Something/0 is not clearly a number.You need ta give samples have possible variances");
                return;
            }
        
        GraphFrame grapFrame = new GraphFrame();
        grapFrame.setSize(650,550);
        grapFrame.setLocation(center);
        if(alternativeType.equals("Two-Sided Alternative")){
           double alfaDivided = (100 - alfaValue)/2;
           z0 = getStandartNormalDistrib(alfaDivided);
        }
        Graph g = new Graph(z0,testStatistics,alternativeType,sampleOneMean,sampleOneStd,sampleTwoMean,sampleTwoStd,sampleOneVariance, sampleTwoVariance);
        grapFrame.add(g);
        grapFrame.setVisible(rootPaneCheckingEnabled);
      
        }
        }else{
             JOptionPane.showMessageDialog(rootPane, "Elements have not chosen!");
        }   
    }//GEN-LAST:event_drawBTNActionPerformed

    private void alfaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfaTFActionPerformed
        JOptionPane.showMessageDialog(rootPane,"The accepted alfa value is greater then %1 and lower then %10.");
    }//GEN-LAST:event_alfaTFActionPerformed

    private void operatorCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operatorCBActionPerformed
        hypoValueTF.setText(differenceTF.getText());
    }//GEN-LAST:event_operatorCBActionPerformed

    private void isClickedOnYou(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isClickedOnYou
        hypoValueTF.setText(differenceTF.getText());
    }//GEN-LAST:event_isClickedOnYou

    private void differenceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_differenceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_differenceTFActionPerformed

    private void sample1secondChoiceCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sample1secondChoiceCBActionPerformed
       if(sample1secondChoiceCB.isSelected()){
       sampleOneMeanTF.setText("0");    
       sampleOneStdTF.setText("0");
       sample1CB.setSelected(false);
       }
       double inputMean = 0;
       double inputStd = 0;
       boolean isTrue = true;
        try {
            inputMean = Double.parseDouble(sampleOneMean2.getText());
            inputStd = Double.parseDouble(sampleOneStd2.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Please only put numbers as mean and std");
            sample1secondChoiceCB.setSelected(false);
            isTrue = false;
        }
        if(isTrue){
            sampleOneMean = inputMean;
            sampleOneStd = inputStd;
            sampleOneVariance = inputStd*inputStd;
            
        }
    }//GEN-LAST:event_sample1secondChoiceCBActionPerformed

    private void sampleTwoSecondChoiceCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sampleTwoSecondChoiceCBActionPerformed
        
        if(sampleTwoSecondChoiceCB.isSelected()){
            sample2CB.setSelected(false);
            sampleTwoMeanTf.setText("0");
            sampleTwoStdTF.setText("0");
        }
       
        double inputMean = 0;
        double inputStd = 0;
        boolean isTrue = true;
        try {
            inputMean = Double.parseDouble(sampleTwoMean2.getText());
            inputStd = Double.parseDouble(sampleTwoStd2.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Please only put numbers as mean and std");
            sampleTwoSecondChoiceCB.setSelected(false);
            isTrue = false;
        }
        if(isTrue){
            sampleTwoMean = inputMean;
            sampleTwoStd = inputStd;
        }
    }//GEN-LAST:event_sampleTwoSecondChoiceCBActionPerformed

    private void MousePressed1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MousePressed1
        if(evt.getSource().equals(sampleTwoMean2) || evt.getSource().equals(sampleTwoStd2)){
        sampleTwoSecondChoiceCB.setSelected(false);}
        else if(evt.getSource().equals(sampleOneMean2) || evt.getSource().equals(sampleOneStd2)){
            sample1secondChoiceCB.setSelected(false);
        }
        
    }//GEN-LAST:event_MousePressed1
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alfaTF;
    private javax.swing.JTextField differenceTF;
    private javax.swing.JButton drawBTN;
    private javax.swing.JTextField hypoValueTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JComboBox<String> operatorCB;
    private javax.swing.JCheckBox sample1CB;
    private javax.swing.JCheckBox sample1secondChoiceCB;
    private javax.swing.JCheckBox sample2CB;
    private javax.swing.JTextField sampleOneMean2;
    private javax.swing.JTextField sampleOneMeanTF;
    private javax.swing.JTextField sampleOneStd2;
    private javax.swing.JTextField sampleOneStdTF;
    private javax.swing.JTextField sampleTwoMean2;
    private javax.swing.JTextField sampleTwoMeanTf;
    private javax.swing.JCheckBox sampleTwoSecondChoiceCB;
    private javax.swing.JTextField sampleTwoStd2;
    private javax.swing.JTextField sampleTwoStdTF;
    private javax.swing.JTextArea set1Elements;
    private javax.swing.JTextArea set2Elements;
    // End of variables declaration//GEN-END:variables
}

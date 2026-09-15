
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class RPS_2A extends javax.swing.JFrame {
    int life1 = 100;
    int life2 = 100;
    
    public RPS_2A() {
        initComponents();
        pbar1.setMaximum(100);
        pbar2.setMaximum(100);
        
        pbar1.setValue(100);
        pbar2.setValue(100);
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        label3 = new java.awt.Label();
        label5 = new java.awt.Label();
        txtp2 = new javax.swing.JTextField();
        txtp1 = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        label6 = new java.awt.Label();
        pbar2 = new javax.swing.JProgressBar();
        label7 = new java.awt.Label();
        pbar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label1.setText("[2] PAPER ");

        label2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("[3] SCISSOR");

        label4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("[1] ROCK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 510, 120));

        label3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("PLAYER 2:");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        label5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("PLAYER 2 HP:");
        jPanel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));
        jPanel1.add(txtp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 220, 60));
        jPanel1.add(txtp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 220, 60));

        btnStart.setText("START");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel1.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 120, 60));

        label6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("PLAYER 1:");
        jPanel1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));
        jPanel1.add(pbar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, -1, 50));

        label7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("PLAYER 1 HP:");
        jPanel1.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        jPanel1.add(pbar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
       int p1 = Integer.parseInt(txtp1.getText());
       int p2 = Integer.parseInt(txtp2.getText());
       
       
       
        if (p1 == p2) {
            JOptionPane.showMessageDialog(this, "DRAW!");
        }
        else if ((p1 == 1 && p2 == 3) || 
                 (p1 == 2 && p2 == 1) || 
                 (p1 == 3 && p2 == 2)) {
            
            life2 = life2 - 20;
             pbar2.setValue(life2);
             
             
             
            JOptionPane.showMessageDialog(this, "Player 1 WIns!");
            txtp1.setText("");
            txtp2.setText("");
        }
        else if ((p2 == 1 && p1 == 3) || 
                 (p2 == 2 && p1 == 1) || 
                 (p2 == 3 && p1 == 2)) {
            
            
             life1 = life1 - 20;
             pbar1.setValue(life1);
             JOptionPane.showMessageDialog(this, "Player 2 WIns!");
             txtp1.setText("");
             txtp2.setText("");
        }
        else {
           JOptionPane.showMessageDialog(this, "Invalid Output!");
            txtp1.setText("");
            txtp2.setText("");
        }
        
        if (life1 == 0) {
            JOptionPane.showMessageDialog(this, "Player 2 Win the game! Better Luck Next Time.");
            pbar1.setValue(100);
            pbar2.setValue(100);
        }
        else if (life2 == 0) {
        JOptionPane.showMessageDialog(this, "Player 1 Win the game! Better Luck Next Time.");
        pbar1.setValue(100);
        pbar2.setValue(100);
        }
       
       
       
    }//GEN-LAST:event_btnStartActionPerformed

   
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPS_2A().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private javax.swing.JProgressBar pbar1;
    private javax.swing.JProgressBar pbar2;
    private javax.swing.JTextField txtp1;
    private javax.swing.JTextField txtp2;
    // End of variables declaration//GEN-END:variables
}

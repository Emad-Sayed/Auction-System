/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import auctionsystem.User;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author emad
 */
public class MyItems extends javax.swing.JInternalFrame {

    /**
     * Creates new form MessageG
     */
    User user;
    public MyItems(User P) {
        user=P;
      ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);                        
        initComponents();
        this.jButton3.setVisible(false);
        this.jButton4.setVisible(false);
        ArrayList<Integer>M=this.user.MyItems();
        System.out.println(M);
        System.out.println("aaaaaaaaaa"+user.ID);
        System.out.println("aaaaaaaaaaaaa"+M);
        ArrayList<JLabel> JL=new ArrayList<JLabel>();
        JL.add(L1_);
        JL.add(L2_);
        JL.add(L3_);
        JL.add(L4_);
        JL.add(L5_);
        if(M!=null)
        {
        for(int i=0;i<M.size();i++)
        {
            JL.get(i).setText("Item ID -> "+M.get(i));
        }  
        }
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        L3_ = new javax.swing.JLabel();
        L1_ = new javax.swing.JLabel();
        L4_ = new javax.swing.JLabel();
        L2_ = new javax.swing.JLabel();
        L5_ = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setBackground(new java.awt.Color(51, 255, 51));
        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 0));
        jLabel7.setText("My Items");

        jButton3.setBackground(new java.awt.Color(102, 255, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Send Message");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        L3_.setBackground(new java.awt.Color(51, 51, 51));
        L3_.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        L3_.setForeground(new java.awt.Color(0, 255, 255));
        L3_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L3_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        L3_.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        L1_.setBackground(new java.awt.Color(51, 51, 51));
        L1_.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        L1_.setForeground(new java.awt.Color(0, 255, 255));
        L1_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L1_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        L1_.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        L4_.setBackground(new java.awt.Color(51, 51, 51));
        L4_.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        L4_.setForeground(new java.awt.Color(0, 255, 255));
        L4_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L4_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        L4_.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        L2_.setBackground(new java.awt.Color(51, 51, 51));
        L2_.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        L2_.setForeground(new java.awt.Color(0, 255, 255));
        L2_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L2_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        L2_.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        L5_.setBackground(new java.awt.Color(51, 51, 51));
        L5_.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        L5_.setForeground(new java.awt.Color(0, 255, 255));
        L5_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L5_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        L5_.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton4.setBackground(new java.awt.Color(102, 255, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("More");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L3_, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                            .addComponent(L2_, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                            .addComponent(L1_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                            .addComponent(L5_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                            .addComponent(L4_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(L1_, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(L2_, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(L3_, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(L4_, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(L5_, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
  
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        


    // Variables declaration - do not modify                     
    private javax.swing.JLabel L1_;
    private javax.swing.JLabel L2_;
    private javax.swing.JLabel L3_;
    private javax.swing.JLabel L4_;
    private javax.swing.JLabel L5_;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}

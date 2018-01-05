/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import auctionsystem.Manager;



/**
 *
 * @author emad
 */
public class ManagerHome extends javax.swing.JInternalFrame {
    private Manager manager=null;
    /**
     * Creates new form HomePage
     */
    public ManagerHome()
    {
      ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);                
        initComponents();
    }
    public ManagerHome(Manager manager)
    {
        this.manager=manager;
      ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);                
        initComponents();
        this.Noti.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Area = new javax.swing.JPanel();
        ManagerBar = new javax.swing.JPanel();
        First = new javax.swing.JButton();
        Third = new javax.swing.JButton();
        Fourth = new javax.swing.JButton();
        Second = new javax.swing.JButton();
        Fifth = new javax.swing.JButton();
        Sixth = new javax.swing.JButton();
        Seventh = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Message = new javax.swing.JLabel();
        Noti = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Timer = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        Auctions = new javax.swing.JLabel();
        ManagerView = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        Area.setBackground(new java.awt.Color(0, 0, 0));
        Area.setForeground(new java.awt.Color(51, 51, 51));

        ManagerBar.setBackground(new java.awt.Color(0, 0, 0));

        First.setBackground(new java.awt.Color(51, 255, 51));
        First.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        First.setText("Add Actor");
        First.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstActionPerformed(evt);
            }
        });

        Third.setBackground(new java.awt.Color(51, 255, 51));
        Third.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Third.setText("Observers Notif");
        Third.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThirdActionPerformed(evt);
            }
        });

        Fourth.setBackground(new java.awt.Color(51, 255, 51));
        Fourth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Fourth.setText("Report");
        Fourth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourthActionPerformed(evt);
            }
        });

        Second.setBackground(new java.awt.Color(51, 255, 51));
        Second.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Second.setText("Search Actor");
        Second.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondActionPerformed(evt);
            }
        });

        Fifth.setBackground(new java.awt.Color(51, 255, 51));
        Fifth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Fifth.setText("Charge");
        Fifth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FifthActionPerformed(evt);
            }
        });

        Sixth.setBackground(new java.awt.Color(51, 255, 51));
        Sixth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sixth.setText("ParySalary");
        Sixth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixthActionPerformed(evt);
            }
        });

        Seventh.setBackground(new java.awt.Color(51, 255, 51));
        Seventh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Seventh.setText("Profile");
        Seventh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeventhActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        Message.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2.png"))); // NOI18N
        Message.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MessageMouseClicked(evt);
            }
        });        Noti.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Noti.setForeground(new java.awt.Color(255, 0, 51));
        Noti.setText("10");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("10");

        Timer.setForeground(new java.awt.Color(255, 0, 0));
        Timer.setText("jLabel1");

        Balance.setForeground(new java.awt.Color(255, 0, 0));
        Balance.setText("jLabel1");

        Auctions.setForeground(new java.awt.Color(255, 0, 0));
        Auctions.setText("Current Auctions : 34");

        javax.swing.GroupLayout ManagerBarLayout = new javax.swing.GroupLayout(ManagerBar);
        ManagerBar.setLayout(ManagerBarLayout);
        ManagerBarLayout.setHorizontalGroup(
            ManagerBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagerBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManagerBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManagerBarLayout.createSequentialGroup()
                        .addGroup(ManagerBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Seventh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Sixth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fifth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fourth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Third, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(First, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Second, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManagerBarLayout.createSequentialGroup()
                        .addGroup(ManagerBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ManagerBarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Message)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ManagerBarLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Noti)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManagerBarLayout.createSequentialGroup()
                        .addComponent(Timer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(Balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Auctions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        ManagerBarLayout.setVerticalGroup(
            ManagerBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagerBarLayout.createSequentialGroup()
                .addGroup(ManagerBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Noti)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ManagerBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Message, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Timer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Balance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Auctions)
                .addGap(24, 24, 24)
                .addComponent(First, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Second, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Third, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fourth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fifth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sixth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Seventh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ManagerView.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout ManagerViewLayout = new javax.swing.GroupLayout(ManagerView);
        ManagerView.setLayout(ManagerViewLayout);
        ManagerViewLayout.setHorizontalGroup(
            ManagerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );
        ManagerViewLayout.setVerticalGroup(
            ManagerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AreaLayout = new javax.swing.GroupLayout(Area);
        Area.setLayout(AreaLayout);
        AreaLayout.setHorizontalGroup(
            AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaLayout.createSequentialGroup()
                .addComponent(ManagerBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ManagerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AreaLayout.setVerticalGroup(
            AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManagerBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ManagerView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    public void FirstActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        this.ManagerView.removeAll();
        this.ManagerView.repaint();
        this.ManagerView.revalidate();      
        AddActor1 A=new AddActor1(this.manager);
        this.ManagerView.add(A);
        A.setVisible(true);
        this.jLabel4.setText("10");
    }                                     

    public void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {
        //Hgeb el Content w adeh l Notification
        this.ManagerView.removeAll();
        this.ManagerView.repaint();
        this.ManagerView.revalidate();
        //Notification S=new Notification();
        //this.ManagerView.add(S);
        //S.setVisible(true);
        //this.jLabel4.setText("10");
    }                                    

    public void SecondActionPerformed(java.awt.event.ActionEvent evt) {                                       
        this.ManagerView.removeAll();
        this.ManagerView.repaint();
        this.ManagerView.revalidate();
        SearchActor S=new SearchActor(this.manager);
        this.ManagerView.add(S);
        S.setVisible(true);
        this.jLabel4.setText("10");
    }                                      

    public void ThirdActionPerformed(java.awt.event.ActionEvent evt) {                                      
        this.ManagerView.removeAll();
        this.ManagerView.repaint();
        this.ManagerView.revalidate();
        ObserveGUI S=new ObserveGUI(this.manager);
        this.ManagerView.add(S);
        S.setVisible(true);
    }                                     

    public void FourthActionPerformed(java.awt.event.ActionEvent evt) {                                       
        this.ManagerView.removeAll();
        this.ManagerView.repaint();
        this.ManagerView.revalidate();
        GUIReport R=new GUIReport(this.manager);
        this.ManagerView.add(R);
        R.setVisible(true);
    }                                      

    public void FifthActionPerformed(java.awt.event.ActionEvent evt) {                                      
        this.ManagerView.removeAll();
        this.ManagerView.repaint();
        this.ManagerView.revalidate();
        Charge S=new Charge(this.manager);
        this.ManagerView.add(S);
        S.setVisible(true);
    }                                     

    public void SixthActionPerformed(java.awt.event.ActionEvent evt) {                                      
        this.ManagerView.removeAll();
        this.ManagerView.repaint();
        this.ManagerView.revalidate();
        Salary S=new Salary(this.manager);
        this.ManagerView.add(S);
        S.setVisible(true);
    }                                     

    public void SeventhActionPerformed(java.awt.event.ActionEvent evt) {                                        
        this.ManagerView.removeAll();
        this.ManagerView.repaint();
        this.ManagerView.revalidate();
        Profile S=new Profile(this.manager);
        this.ManagerView.add(S);
        S.setVisible(true);
    }                                       
    public void MessageMouseClicked(java.awt.event.MouseEvent evt) {  
        this.ManagerView.removeAll();
        this.ManagerView.repaint();
        this.ManagerView.revalidate();
        MessageG M=new MessageG(this.manager);
        this.ManagerView.add(M);
        M.setVisible(true);        
    }    

    // Variables declaration - do not modify                     
    public javax.swing.JPanel Area;
    public javax.swing.JLabel Auctions;
    public static javax.swing.JLabel Balance;
    public static javax.swing.JButton Fifth;
    public static javax.swing.JButton First;
    public javax.swing.JButton Fourth;
    public javax.swing.JPanel ManagerBar;
    public static javax.swing.JPanel ManagerView;
    public javax.swing.JLabel Message;
    public static javax.swing.JLabel Noti;
    public static javax.swing.JButton Second;
    public static javax.swing.JButton Seventh;
    public static javax.swing.JButton Sixth;
    public static javax.swing.JButton Third;
    public static javax.swing.JLabel Timer;
    public javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel7;
    // End of variables declaration                   
}

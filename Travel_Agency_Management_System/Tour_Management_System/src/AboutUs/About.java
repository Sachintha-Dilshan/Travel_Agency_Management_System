package AboutUs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author SACHIN
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    public About() {
        initComponents();
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
        aboutus = new javax.swing.JLabel();
        vision = new javax.swing.JLabel();
        mission = new javax.swing.JLabel();
        team = new javax.swing.JLabel();
        ourvision = new javax.swing.JScrollPane();
        visiontxt = new javax.swing.JTextArea();
        ourmission = new javax.swing.JScrollPane();
        missiontxt = new javax.swing.JTextArea();
        ourteam = new javax.swing.JScrollPane();
        teamtxt = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About Us");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aboutus.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        aboutus.setForeground(new java.awt.Color(51, 0, 0));
        aboutus.setText("About Us");
        jPanel1.add(aboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 240, 70));

        vision.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        vision.setForeground(new java.awt.Color(0, 0, 51));
        vision.setText("Our Vision");
        jPanel1.add(vision, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 50));

        mission.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        mission.setForeground(new java.awt.Color(0, 0, 51));
        mission.setText("Our Mission");
        jPanel1.add(mission, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        team.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        team.setForeground(new java.awt.Color(255, 255, 255));
        team.setText("Our Team");
        jPanel1.add(team, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        visiontxt.setEditable(false);
        visiontxt.setBackground(new java.awt.Color(102, 0, 102));
        visiontxt.setColumns(20);
        visiontxt.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        visiontxt.setForeground(new java.awt.Color(255, 255, 255));
        visiontxt.setLineWrap(true);
        visiontxt.setRows(3);
        visiontxt.setText("Our vision is to become the Island's \nmost trusted and the leading travel \nmanagement company.");
        ourvision.setViewportView(visiontxt);

        jPanel1.add(ourvision, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 370, 140));

        missiontxt.setEditable(false);
        missiontxt.setBackground(new java.awt.Color(102, 0, 102));
        missiontxt.setColumns(20);
        missiontxt.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        missiontxt.setForeground(new java.awt.Color(255, 255, 255));
        missiontxt.setRows(3);
        missiontxt.setText("Our mission is to help you to make \na memorable travel experience. We \nalso intend on adding more destinations \nto our list to serve a larger  client base.");
        ourmission.setViewportView(missiontxt);

        jPanel1.add(ourmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 410, 140));

        teamtxt.setBackground(new java.awt.Color(102, 0, 102));
        teamtxt.setColumns(20);
        teamtxt.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        teamtxt.setForeground(new java.awt.Color(255, 255, 255));
        teamtxt.setRows(5);
        teamtxt.setText("Our team offers a pleasant and professional service on all types of \ntravel to ensure a hassle free travel experience for you. Our team is our \npride and greatest prize. \nOur representatives are professional, friendly and energitic. They always \nready to give you the best service.");
        ourteam.setViewportView(teamtxt);

        jPanel1.add(ourteam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 770, 170));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AboutUs/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(811, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutus;
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mission;
    private javax.swing.JTextArea missiontxt;
    private javax.swing.JScrollPane ourmission;
    private javax.swing.JScrollPane ourteam;
    private javax.swing.JScrollPane ourvision;
    private javax.swing.JLabel team;
    private javax.swing.JTextArea teamtxt;
    private javax.swing.JLabel vision;
    private javax.swing.JTextArea visiontxt;
    // End of variables declaration//GEN-END:variables
}

public class splash extends javax.swing.JFrame {

    public splash() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loadingnumber = new javax.swing.JLabel();
        circleloading = new javax.swing.JLabel();
        pw = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        developer1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        loadingnumber.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30));
        loadingnumber.setForeground(new java.awt.Color(0, 204, 204));
        loadingnumber.setText("0%");
        jPanel1.add(loadingnumber);
        loadingnumber.setBounds(390, 210, 110, 90);

        circleloading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circle loading.gif")));
        circleloading.setText("jLabel1");
        jPanel1.add(circleloading);
        circleloading.setBounds(320, 170, 200, 170);

        pw.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 50));
        pw.setForeground(new java.awt.Color(0, 204, 204));
        pw.setText("Plsease wait");
        jPanel1.add(pw);
        pw.setBounds(210, 30, 430, 130);

        loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loaging_1.gif")));
        jPanel1.add(loading);
        loading.setBounds(570, 90, 110, 30);

        developer1.setForeground(new java.awt.Color(0, 153, 153));
        developer1.setText("");
        jPanel1.add(developer1);
        developer1.setBounds(10, 460, 180, 30);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 4));
        jPanel1.add(background);
        background.setBounds(0, 0, 881, 499);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new splash().setVisible(true);

            }
        });
    }

    private javax.swing.JLabel background;
    private javax.swing.JLabel circleloading;
    private javax.swing.JLabel developer1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loading;
    public javax.swing.JLabel loadingnumber;
    private javax.swing.JLabel pw;

}

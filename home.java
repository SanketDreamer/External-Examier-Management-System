import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class home extends javax.swing.JFrame {

    int Xmouse;
    int Ymouse;

    public home() {
        initComponents();

        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        taskbar = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        scrollPane1 = new java.awt.ScrollPane();
        body = new javax.swing.JPanel();
        Bg_ScrollPane2 = new javax.swing.JScrollPane();
        items = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        rad = new javax.swing.JTextField();
        sm = new javax.swing.JTextField();
        labf = new javax.swing.JTextField();
        lb = new javax.swing.JTextField();
        ef = new javax.swing.JTextField();
        im = new javax.swing.JTextField();
        msf = new javax.swing.JTextField();
        ff = new javax.swing.JTextField();
        ad = new javax.swing.JTextField();
        logout = new javax.swing.JLabel();
        developer = new javax.swing.JLabel();
        Student_Name = new javax.swing.JLabel();
        Batch = new javax.swing.JLabel();
        RegNo = new javax.swing.JLabel();
        Roll = new javax.swing.JLabel();
        Department = new javax.swing.JLabel();
        sn = new javax.swing.JTextField();
        rn = new javax.swing.JTextField();
        bn = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        rln = new javax.swing.JTextField();
        totalcost = new javax.swing.JTextField();
        tc = new javax.swing.JTextField();
        Reset = new javax.swing.JButton();
        total = new javax.swing.JButton();
        getrecipt = new javax.swing.JButton();
        printrecipt = new javax.swing.JButton();
        print_area = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 5));
        jPanel1.setLayout(null);

        taskbar.setBackground(new java.awt.Color(255, 255, 255));
        taskbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                taskbarMousePressed(evt);
            }
        });
        taskbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                taskbarMouseDragged(evt);
            }
        });
        taskbar.setLayout(null);

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/-.jpg")));
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        taskbar.add(minimize);
        minimize.setBounds(962, 0, 30, 60);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpg")));
        x.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
        });
        taskbar.add(x);
        x.setBounds(1010, 0, 30, 60);

        text.setFont(new java.awt.Font("Domino Jack", 0, 24));
        text.setText("External Payment System");
        taskbar.add(text);
        text.setBounds(31, 0, 468, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gotoback.jpg")));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        taskbar.add(jLabel1);
        jLabel1.setBounds(910, 0, 30, 60);

        jPanel1.add(taskbar);
        taskbar.setBounds(0, 0, 1100, 60);

        body.setBackground(new java.awt.Color(0, 204, 204));

        items.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18));
        jCheckBox1.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setText("AcNumber");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox18.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox18.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18));
        jCheckBox18.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox18.setText("TransactionId");
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });

        jCheckBox19.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox19.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18));
        jCheckBox19.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox19.setText("Total Student");
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });

        jCheckBox20.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox20.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18));
        jCheckBox20.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox20.setText("Charge");
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });

        jCheckBox21.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox21.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18));
        jCheckBox21.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox21.setText("HoursCharge");
        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });

        jCheckBox22.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox22.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18));
        jCheckBox22.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox22.setText("Travel");
        jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });

        jCheckBox23.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox23.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18));
        jCheckBox23.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox23.setText("LumpSum");
        jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox23ActionPerformed(evt);
            }
        });

        jCheckBox24.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox24.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18));
        jCheckBox24.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox24.setText("Compensation");
        jCheckBox24.setActionCommand(" Chicken BBQ");
        jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });

        jCheckBox25.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox25.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18));
        jCheckBox25.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox25.setText("AreaofExpertise");
        jCheckBox25.setActionCommand("");
        jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox25ActionPerformed(evt);
            }
        });

        rad.setEditable(false);
        rad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        rad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rad.setText(" ");
        rad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radActionPerformed(evt);
            }
        });

        sm.setEditable(false);
        sm.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        sm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sm.setText("0");
        sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smActionPerformed(evt);
            }
        });

        labf.setEditable(false);
        labf.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        labf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labf.setText("0");
        labf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labfActionPerformed(evt);
            }
        });

        lb.setEditable(false);
        lb.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        lb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lb.setText("0");
        lb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbActionPerformed(evt);
            }
        });

        ef.setEditable(false);
        ef.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        ef.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ef.setText("0");
        ef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efActionPerformed(evt);
            }
        });

        im.setEditable(false);
        im.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        im.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        im.setText("0");
        im.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imActionPerformed(evt);
            }
        });

        msf.setEditable(false);
        msf.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        msf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        msf.setText("0");
        msf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msfActionPerformed(evt);
            }
        });

        ff.setEditable(false);
        ff.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        ff.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ff.setText("0");
        ff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ffActionPerformed(evt);
            }
        });

        ad.setEditable(false);
        ad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        ad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ad.setText("0");
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout itemsLayout = new javax.swing.GroupLayout(items);
        items.setLayout(itemsLayout);
        itemsLayout.setHorizontalGroup(
                itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(itemsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(itemsLayout.createSequentialGroup()
                                                .addGroup(itemsLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jCheckBox18, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(161, 161, 161)
                                                .addGroup(itemsLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ad)
                                                        .addComponent(rad)))
                                        .addGroup(itemsLayout.createSequentialGroup()
                                                .addGroup(itemsLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(itemsLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                .addComponent(jCheckBox21,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jCheckBox19,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jCheckBox20,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addComponent(jCheckBox22)
                                                        .addComponent(jCheckBox23)
                                                        .addComponent(jCheckBox24)
                                                        .addComponent(jCheckBox25,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 195,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(167, 167, 167)
                                                .addGroup(itemsLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ff, javax.swing.GroupLayout.DEFAULT_SIZE, 140,
                                                                Short.MAX_VALUE)
                                                        .addComponent(msf, javax.swing.GroupLayout.PREFERRED_SIZE, 1,
                                                                Short.MAX_VALUE)
                                                        .addComponent(im, javax.swing.GroupLayout.PREFERRED_SIZE, 1,
                                                                Short.MAX_VALUE)
                                                        .addComponent(ef, javax.swing.GroupLayout.PREFERRED_SIZE, 1,
                                                                Short.MAX_VALUE)
                                                        .addComponent(labf, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 1,
                                                                Short.MAX_VALUE)
                                                        .addComponent(sm, javax.swing.GroupLayout.PREFERRED_SIZE, 1,
                                                                Short.MAX_VALUE)
                                                        .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 1,
                                                                Short.MAX_VALUE))))
                                .addContainerGap()));
        itemsLayout.setVerticalGroup(
                itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(itemsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemsLayout
                                                .createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox18)
                                        .addComponent(rad, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox19)
                                        .addComponent(sm, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox20)
                                        .addComponent(labf, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox21)
                                        .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox22)
                                        .addComponent(ef, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox23)
                                        .addComponent(im, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox24)
                                        .addComponent(msf, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox25)
                                        .addComponent(ff, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(18, Short.MAX_VALUE)));

        Bg_ScrollPane2.setViewportView(items);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/L_O 1.png")));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        developer.setForeground(new java.awt.Color(255, 255, 255));
        developer.setText("");

        Student_Name.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20));
        Student_Name.setForeground(new java.awt.Color(255, 255, 255));
        Student_Name.setText("Examiner Name :");

        Batch.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20));
        Batch.setForeground(new java.awt.Color(255, 255, 255));
        Batch.setText("Batch No:");

        RegNo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20));
        RegNo.setForeground(new java.awt.Color(255, 255, 255));
        RegNo.setText("Registation No:");

        Roll.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20));
        Roll.setForeground(new java.awt.Color(255, 255, 255));
        Roll.setText("Teacher Name");

        Department.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20));
        Department.setForeground(new java.awt.Color(255, 255, 255));
        Department.setText("Department:");

        sn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        sn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snActionPerformed(evt);
            }
        });

        rn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        rn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnActionPerformed(evt);
            }
        });

        bn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        bn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnActionPerformed(evt);
            }
        });

        d.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        d.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        rln.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        rln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rlnActionPerformed(evt);
            }
        });

        totalcost.setEditable(false);
        totalcost.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18));
        totalcost.setText(" Total Cost");
        totalcost.setBorder(null);
        totalcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalcostActionPerformed(evt);
            }
        });

        tc.setEditable(false);
        tc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        tc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        total.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        total.setText("Total");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        getrecipt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        getrecipt.setText("Get Receipt");
        getrecipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getreciptActionPerformed(evt);
            }
        });

        printrecipt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        printrecipt.setText("Print Receipt");
        printrecipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printreciptActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 0, 18));
        area.setRows(5);
        print_area.setViewportView(area);

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
                bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(bodyLayout.createSequentialGroup()
                                                .addGroup(bodyLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addGroup(bodyLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(bodyLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        .addComponent(Batch,
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(Student_Name,
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(RegNo,
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                175,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(Bg_ScrollPane2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 520,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(bodyLayout.createSequentialGroup()
                                                                        .addGroup(bodyLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(Roll,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        172,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(Department,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        162,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(bodyLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(sn)
                                                                                .addComponent(rn)
                                                                                .addComponent(bn)
                                                                                .addComponent(rln)
                                                                                .addComponent(d,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        330,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(bodyLayout.createSequentialGroup()
                                                                .addComponent(Reset)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(total,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 95,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bodyLayout
                                                                .createSequentialGroup()
                                                                .addComponent(totalcost,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 204,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(tc,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 175,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(98, 98, 98)
                                                .addGroup(bodyLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(logout)
                                                        .addGroup(bodyLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(print_area,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 400,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(bodyLayout.createSequentialGroup()
                                                                        .addComponent(getrecipt)
                                                                        .addGap(100, 100, 100)
                                                                        .addComponent(printrecipt,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                163,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                bodyLayout.createSequentialGroup()
                                                        .addComponent(developer, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(21, 21, 21)))
                                .addContainerGap(119, Short.MAX_VALUE)));
        bodyLayout.setVerticalGroup(
                bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(bodyLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(bodyLayout.createSequentialGroup()
                                                .addGroup(bodyLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(bodyLayout.createSequentialGroup()
                                                                .addGap(2, 2, 2)
                                                                .addComponent(Student_Name))
                                                        .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(22, 22, 22)
                                                .addGroup(bodyLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(rn, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(RegNo))
                                                .addGap(22, 22, 22)
                                                .addGroup(bodyLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(bn, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Batch))
                                                .addGap(18, 18, 18)
                                                .addGroup(bodyLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Roll)
                                                        .addComponent(rln, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(bodyLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Department)
                                                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(31, 31, 31)
                                                .addComponent(Bg_ScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(7, 7, 7)
                                                .addGroup(bodyLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tc, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(totalcost, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(bodyLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Reset)
                                                        .addGroup(bodyLayout.createSequentialGroup()
                                                                .addGap(11, 11, 11)
                                                                .addComponent(total))))
                                        .addGroup(bodyLayout.createSequentialGroup()
                                                .addComponent(print_area, javax.swing.GroupLayout.PREFERRED_SIZE, 562,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(bodyLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(printrecipt,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(getrecipt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(developer)
                                .addContainerGap(41, Short.MAX_VALUE)));

        scrollPane1.add(body);

        jPanel1.add(scrollPane1);
        scrollPane1.setBounds(0, 60, 1100, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1098,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }

    private void rlnActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void bnActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void rnActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void snActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void tcActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {

        area.setText(null);
        bn.setText(null);
        rln.setText(null);
        sn.setText(null);
        d.setText(null);
        rn.setText(null);

        ff.setText("0");

        ef.setText("0");

        lb.setText("0");
        rad.setText("0");

        im.setText("0");
        msf.setText("0");

        ad.setText(" ");

        sm.setText("0");

        labf.setText("0");

        tc.setText(null);

        jCheckBox1.setSelected(false);
        jCheckBox18.setSelected(false);
        jCheckBox19.setSelected(false);

        jCheckBox20.setSelected(false);
        jCheckBox21.setSelected(false);
        jCheckBox22.setSelected(false);
        jCheckBox23.setSelected(false);
        jCheckBox24.setSelected(false);
        jCheckBox25.setSelected(false);

    }

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {

        double EFR = Double.parseDouble(ad.getText());

        double BM = Double.parseDouble(ff.getText());

        double CC = Double.parseDouble(ef.getText());

        double CF = Double.parseDouble(lb.getText());
        double CFR = Double.parseDouble(rad.getText());

        double CS = Double.parseDouble(im.getText());
        double CSK = Double.parseDouble(msf.getText());

        double PFR = Double.parseDouble(sm.getText());

        double SFR = Double.parseDouble(labf.getText());

        double total = BM + CC + CF + CS + CSK + SFR * PFR;

        String item_total = String.format("%3f", total);
        tc.setText((String) item_total);

    }

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to Logout !", "Logout",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            login log = new login();
            this.dispose();
            log.show();
        }
    }

    private void printreciptActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            area.print();
        } catch (Exception e) {
        }
    }

    private void getreciptActionPerformed(java.awt.event.ActionEvent evt) {

        area.setText("*********************************\n");
        area.setText(area.getText() + "******   Payment Recipt   *******\n");
        area.setText(area.getText() + "*********************************\n");

        Date obj = new Date();
        String date = obj.toString();
        area.setText(area.getText() + "" + date + "\n");

        area.setText(area.getText() + "---------------------------------\n");

        area.setText(area.getText() + "---------------------------------\n");

        area.setText(area.getText() + " Name: " + sn.getText() + "\n");
        area.setText(area.getText() + " Department: " + d.getText() + "\n");
        area.setText(area.getText() + " Batch No: " + bn.getText() + "\n");
        area.setText(area.getText() + " Registation No: " + rn.getText() + "\n");
        area.setText(area.getText() + " Teacher Name: " + rln.getText() + "\n\n");
        area.setText(area.getText() + " Discriptation         Amounts\n");
        area.setText(area.getText() + "---------------------------------\n");
        if (jCheckBox1.isSelected()) {
            area.setText(area.getText() + "Account Number.........." + ad.getText() + "\n");
        }

        if (jCheckBox18.isSelected()) {
            area.setText(area.getText() + "TransactionId..........." + rad.getText() + "\n");
        }
        if (jCheckBox19.isSelected()) {
            area.setText(area.getText() + "Total student..........." + sm.getText() + "\n");
        }
        if (jCheckBox20.isSelected()) {
            area.setText(area.getText() + "Charge per student......" + labf.getText() + "\n");
        }
        if (jCheckBox21.isSelected()) {
            area.setText(area.getText() + " per Hours Charges......" + lb.getText() + "\n");
        }
        if (jCheckBox22.isSelected()) {
            area.setText(area.getText() + " Travel................." + ef.getText() + "\n");
        }
        if (jCheckBox23.isSelected()) {
            area.setText(area.getText() + " Lump Sum Payment......." + im.getText() + "\n");
        }
        if (jCheckBox24.isSelected()) {
            area.setText(area.getText() + "AdditionalCompensation.." + msf.getText() + "\n");
        }
        if (jCheckBox25.isSelected()) {
            area.setText(area.getText() + " Area of Expertise......" + ff.getText() + "\n");
        }

        area.setText(area.getText() + "---------------------------------\n");

        area.setText(area.getText() + " Total Cost       " + tc.getText() + "BDT" + "\n");
        area.setText(area.getText() + "---------------------------------\n\n");
        area.setText(area.getText() + "             ");
    }

    private void dActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void adActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jCheckBox25.isSelected()) {
            ff.setEditable(true);
            ff.setText(" ");
            ff.requestFocus();
        } else {
            ff.setEditable(false);
            ff.setText("0");
        }
    }

    private void ffActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jCheckBox24.isSelected()) {
            msf.setEditable(true);
            msf.setText(" ");
            msf.requestFocus();
        } else {
            msf.setEditable(false);
            msf.setText("0");
        }
    }

    private void msfActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jCheckBox23.isSelected()) {
            im.setEditable(true);
            im.setText(" ");
            im.requestFocus();
        } else {
            im.setEditable(false);
            im.setText("0");
        }
    }

    private void imActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void efActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jCheckBox22.isSelected()) {
            ef.setEditable(true);
            ef.setText(" ");
            ef.requestFocus();
        } else {
            ef.setEditable(false);
            ef.setText("0");
        }
    }

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jCheckBox21.isSelected()) {
            lb.setEditable(true);
            lb.setText(" ");
            lb.requestFocus();
        } else {
            lb.setEditable(false);
            lb.setText("0");
        }
    }

    private void lbActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void labfActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jCheckBox20.isSelected()) {
            labf.setEditable(true);
            labf.setText(" ");
            labf.requestFocus();
        } else {
            labf.setEditable(false);
            labf.setText("0");
        }
    }

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jCheckBox19.isSelected()) {
            sm.setEditable(true);
            sm.setText(" ");
            sm.requestFocus();
        } else {
            sm.setEditable(false);
            sm.setText("0");
        }
    }

    private void smActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void radActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jCheckBox18.isSelected()) {
            rad.setEditable(true);
            rad.setText(" ");
            rad.requestFocus();
        } else {
            rad.setEditable(false);
            rad.setText("0");
        }
    }

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jCheckBox1.isSelected()) {
            ad.setEditable(true);
            ad.setText(" ");
            ad.requestFocus();
        } else {
            ad.setEditable(false);
            ad.setText("0");
        }
    }

    private void xMouseClicked(java.awt.event.MouseEvent evt) {
        if (JOptionPane.showConfirmDialog(frame, "Do you want to exit?", "Exit",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {
        this.setState(JFrame.ICONIFIED);
    }

    private void totalcostActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void taskbarMouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getXOnScreen();
        this.setLocation(x /*- Xmouse*/, y /*-Ymouse*/);
    }

    private void taskbarMousePressed(java.awt.event.MouseEvent evt) {

    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        DashBoard db = new DashBoard();
        this.dispose();
        db.show();
    }

    private JFrame frame;

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new home().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel Batch;
    private javax.swing.JScrollPane Bg_ScrollPane2;
    private javax.swing.JLabel Department;
    private javax.swing.JLabel RegNo;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel Roll;
    private javax.swing.JLabel Student_Name;
    private javax.swing.JTextField ad;
    private javax.swing.JTextArea area;
    private javax.swing.JTextField bn;
    private javax.swing.JPanel body;
    private javax.swing.JTextField d;
    private javax.swing.JLabel developer;
    private javax.swing.JTextField ef;
    private javax.swing.JTextField ff;
    private javax.swing.JButton getrecipt;
    private javax.swing.JTextField im;
    private javax.swing.JPanel items;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField labf;
    private javax.swing.JTextField lb;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField msf;
    private javax.swing.JScrollPane print_area;
    private javax.swing.JButton printrecipt;
    private javax.swing.JTextField rad;
    private javax.swing.JTextField rln;
    private javax.swing.JTextField rn;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTextField sm;
    private javax.swing.JTextField sn;
    private javax.swing.JPanel taskbar;
    private javax.swing.JTextField tc;
    private javax.swing.JLabel text;
    private javax.swing.JButton total;
    private javax.swing.JTextField totalcost;
    private javax.swing.JLabel x;

}

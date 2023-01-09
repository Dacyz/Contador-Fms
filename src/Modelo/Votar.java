package Modelo;

public class Votar extends javax.swing.JFrame {

    public Votar() {
        initComponents();
        this.setLocationRelativeTo(null);
        CompInt();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VariableFondo = new javax.swing.JPanel();
        Parejas = new javax.swing.JComboBox<>();
        PM = new javax.swing.JCheckBox();
        HD = new javax.swing.JCheckBox();
        XM = new javax.swing.JCheckBox();
        TM = new javax.swing.JCheckBox();
        LM = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        AM = new javax.swing.JCheckBox();
        FM = new javax.swing.JCheckBox();
        EM1 = new javax.swing.JCheckBox();
        A2I = new javax.swing.JTextField();
        A2 = new javax.swing.JTextField();
        A2D = new javax.swing.JTextField();
        B2D = new javax.swing.JTextField();
        B2I = new javax.swing.JTextField();
        B2 = new javax.swing.JTextField();
        error = new javax.swing.JLabel();
        EB = new javax.swing.JLabel();
        Iniciar = new javax.swing.JButton();
        EA = new javax.swing.JLabel();
        JA = new javax.swing.JLabel();
        JB = new javax.swing.JLabel();
        ContornoParticipantes = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Resultados = new javax.swing.JPanel();
        RespuestaGeneral = new javax.swing.JLabel();
        EQUIPOA = new javax.swing.JLabel();
        EQUIPOB = new javax.swing.JLabel();
        jtxtPuntajes = new javax.swing.JLabel();
        EASYMODE1 = new javax.swing.JLabel();
        HARDMODE1 = new javax.swing.JLabel();
        EXTREMODE1 = new javax.swing.JLabel();
        TEMAS1 = new javax.swing.JLabel();
        LIBRE3 = new javax.swing.JLabel();
        PERSONAJES1 = new javax.swing.JLabel();
        CXC1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EA_A = new javax.swing.JLabel();
        EA_B = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HM_A = new javax.swing.JLabel();
        HM_B = new javax.swing.JLabel();
        XT_A = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        XT_B = new javax.swing.JLabel();
        TT_A = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TT_B = new javax.swing.JLabel();
        PJ_A = new javax.swing.JLabel();
        PJ_B = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        LL_A = new javax.swing.JLabel();
        LL_B = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        XX_A = new javax.swing.JLabel();
        XX_B = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jtxtPuntajes1 = new javax.swing.JLabel();
        PT_B = new javax.swing.JLabel();
        PT_A = new javax.swing.JLabel();
        jtxtPuntajes3 = new javax.swing.JLabel();
        Iniciar1 = new javax.swing.JButton();
        Votacion = new javax.swing.JPanel();
        ReiniciarButton = new javax.swing.JButton();
        Vote = new javax.swing.JButton();
        EASYMODE = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        HARDMODE = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jComboBox15 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        jComboBox17 = new javax.swing.JComboBox<>();
        jComboBox18 = new javax.swing.JComboBox<>();
        jComboBox19 = new javax.swing.JComboBox<>();
        jComboBox20 = new javax.swing.JComboBox<>();
        jComboBox21 = new javax.swing.JComboBox<>();
        jComboBox22 = new javax.swing.JComboBox<>();
        jComboBox23 = new javax.swing.JComboBox<>();
        jComboBox24 = new javax.swing.JComboBox<>();
        EXTREMODE = new javax.swing.JLabel();
        jComboBox49 = new javax.swing.JComboBox<>();
        jComboBox50 = new javax.swing.JComboBox<>();
        jComboBox51 = new javax.swing.JComboBox<>();
        jComboBox52 = new javax.swing.JComboBox<>();
        jComboBox53 = new javax.swing.JComboBox<>();
        jComboBox54 = new javax.swing.JComboBox<>();
        jComboBox55 = new javax.swing.JComboBox<>();
        jComboBox56 = new javax.swing.JComboBox<>();
        jComboBox57 = new javax.swing.JComboBox<>();
        jComboBox58 = new javax.swing.JComboBox<>();
        jComboBox59 = new javax.swing.JComboBox<>();
        jComboBox60 = new javax.swing.JComboBox<>();
        TEMAS = new javax.swing.JLabel();
        jComboBox25 = new javax.swing.JComboBox<>();
        jComboBox26 = new javax.swing.JComboBox<>();
        jComboBox27 = new javax.swing.JComboBox<>();
        jComboBox28 = new javax.swing.JComboBox<>();
        jComboBox29 = new javax.swing.JComboBox<>();
        jComboBox30 = new javax.swing.JComboBox<>();
        jComboBox31 = new javax.swing.JComboBox<>();
        jComboBox32 = new javax.swing.JComboBox<>();
        jComboBox33 = new javax.swing.JComboBox<>();
        jComboBox34 = new javax.swing.JComboBox<>();
        jComboBox35 = new javax.swing.JComboBox<>();
        jComboBox36 = new javax.swing.JComboBox<>();
        LIBRE2 = new javax.swing.JLabel();
        jComboBox66 = new javax.swing.JComboBox<>();
        jComboBox69 = new javax.swing.JComboBox<>();
        jComboBox70 = new javax.swing.JComboBox<>();
        jComboBox71 = new javax.swing.JComboBox<>();
        jComboBox73 = new javax.swing.JComboBox<>();
        jComboBox74 = new javax.swing.JComboBox<>();
        jComboBox75 = new javax.swing.JComboBox<>();
        jComboBox76 = new javax.swing.JComboBox<>();
        jComboBox77 = new javax.swing.JComboBox<>();
        jComboBox78 = new javax.swing.JComboBox<>();
        jComboBox79 = new javax.swing.JComboBox<>();
        jComboBox80 = new javax.swing.JComboBox<>();
        PERSONAJES = new javax.swing.JLabel();
        jComboBox37 = new javax.swing.JComboBox<>();
        jComboBox38 = new javax.swing.JComboBox<>();
        jComboBox39 = new javax.swing.JComboBox<>();
        jComboBox40 = new javax.swing.JComboBox<>();
        jComboBox41 = new javax.swing.JComboBox<>();
        jComboBox42 = new javax.swing.JComboBox<>();
        jComboBox43 = new javax.swing.JComboBox<>();
        jComboBox44 = new javax.swing.JComboBox<>();
        jComboBox45 = new javax.swing.JComboBox<>();
        jComboBox46 = new javax.swing.JComboBox<>();
        jComboBox47 = new javax.swing.JComboBox<>();
        jComboBox48 = new javax.swing.JComboBox<>();
        CXC = new javax.swing.JLabel();
        jComboBox81 = new javax.swing.JComboBox<>();
        jComboBox82 = new javax.swing.JComboBox<>();
        jComboBox83 = new javax.swing.JComboBox<>();
        jComboBox84 = new javax.swing.JComboBox<>();
        jComboBox85 = new javax.swing.JComboBox<>();
        jComboBox86 = new javax.swing.JComboBox<>();
        jComboBox87 = new javax.swing.JComboBox<>();
        jComboBox88 = new javax.swing.JComboBox<>();
        jComboBox89 = new javax.swing.JComboBox<>();
        jComboBox90 = new javax.swing.JComboBox<>();
        jComboBox91 = new javax.swing.JComboBox<>();
        jComboBox92 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VariableFondo.setBackground(new java.awt.Color(51, 51, 51));
        VariableFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Parejas.setBackground(new java.awt.Color(51, 51, 51));
        Parejas.setForeground(new java.awt.Color(255, 255, 255));
        Parejas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 vs 1", "2 vs 2", "3 vs 3" }));
        Parejas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParejasActionPerformed(evt);
            }
        });
        VariableFondo.add(Parejas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 80, 20));

        PM.setBackground(new java.awt.Color(51, 51, 51));
        PM.setForeground(new java.awt.Color(255, 255, 255));
        PM.setSelected(true);
        PM.setText("Personajes");
        PM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMActionPerformed(evt);
            }
        });
        VariableFondo.add(PM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        HD.setBackground(new java.awt.Color(51, 51, 51));
        HD.setForeground(new java.awt.Color(255, 255, 255));
        HD.setSelected(true);
        HD.setText("Hard Mode");
        HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HDActionPerformed(evt);
            }
        });
        VariableFondo.add(HD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        XM.setBackground(new java.awt.Color(51, 51, 51));
        XM.setForeground(new java.awt.Color(255, 255, 255));
        XM.setSelected(true);
        XM.setText("Extreme Mode");
        XM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XMActionPerformed(evt);
            }
        });
        VariableFondo.add(XM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        TM.setBackground(new java.awt.Color(51, 51, 51));
        TM.setForeground(new java.awt.Color(255, 255, 255));
        TM.setSelected(true);
        TM.setText("Temática");
        TM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TMActionPerformed(evt);
            }
        });
        VariableFondo.add(TM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        LM.setBackground(new java.awt.Color(51, 51, 51));
        LM.setForeground(new java.awt.Color(255, 255, 255));
        LM.setSelected(true);
        LM.setText("Minutos Libres");
        LM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LMActionPerformed(evt);
            }
        });
        VariableFondo.add(LM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("VS");
        VariableFondo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 30, 30));

        AM.setBackground(new java.awt.Color(51, 51, 51));
        AM.setForeground(new java.awt.Color(255, 255, 255));
        AM.setSelected(true);
        AM.setText("Acapella");
        AM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMActionPerformed(evt);
            }
        });
        VariableFondo.add(AM, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        FM.setBackground(new java.awt.Color(51, 51, 51));
        FM.setForeground(new java.awt.Color(255, 255, 255));
        FM.setSelected(true);
        FM.setText("4 x 4");
        FM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FMActionPerformed(evt);
            }
        });
        VariableFondo.add(FM, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        EM1.setBackground(new java.awt.Color(51, 51, 51));
        EM1.setForeground(new java.awt.Color(255, 255, 255));
        EM1.setSelected(true);
        EM1.setText("Easy Mode");
        EM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EM1ActionPerformed(evt);
            }
        });
        VariableFondo.add(EM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        A2I.setBackground(new java.awt.Color(102, 102, 102));
        A2I.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VariableFondo.add(A2I, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 100, 20));

        A2.setBackground(new java.awt.Color(102, 102, 102));
        A2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VariableFondo.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 20));

        A2D.setBackground(new java.awt.Color(102, 102, 102));
        A2D.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2DActionPerformed(evt);
            }
        });
        VariableFondo.add(A2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 100, 20));

        B2D.setBackground(new java.awt.Color(102, 102, 102));
        B2D.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2DActionPerformed(evt);
            }
        });
        VariableFondo.add(B2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 100, 20));

        B2I.setBackground(new java.awt.Color(102, 102, 102));
        B2I.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VariableFondo.add(B2I, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 100, 20));

        B2.setBackground(new java.awt.Color(102, 102, 102));
        B2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        VariableFondo.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 100, 20));

        error.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 51));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VariableFondo.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 330, 40));

        EB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EB.setForeground(new java.awt.Color(255, 255, 255));
        EB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EB.setText("Equipo B");
        VariableFondo.add(EB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 100, 20));

        Iniciar.setText("Iniciar la Votación");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        VariableFondo.add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 130, 40));

        EA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EA.setForeground(new java.awt.Color(255, 255, 255));
        EA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EA.setText("Equipo A");
        VariableFondo.add(EA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 100, 20));

        JA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JA.setForeground(new java.awt.Color(255, 255, 255));
        JA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JA.setText("Jugador A");
        VariableFondo.add(JA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 100, 20));

        JB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JB.setForeground(new java.awt.Color(255, 255, 255));
        JB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JB.setText("Jugador B");
        VariableFondo.add(JB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 100, 20));

        ContornoParticipantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        VariableFondo.add(ContornoParticipantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 310, 230));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Formulario");
        VariableFondo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 100, -1));

        Back.setBackground(new java.awt.Color(51, 51, 51));
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("<");
        Back.setBorderPainted(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        VariableFondo.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 30));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("x");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        VariableFondo.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, 30));

        getContentPane().add(VariableFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 490));

        Resultados.setLayout(null);
        Resultados.add(RespuestaGeneral);
        RespuestaGeneral.setBounds(20, 340, 320, 20);

        EQUIPOA.setBackground(new java.awt.Color(153, 153, 153));
        EQUIPOA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EQUIPOA.setText("(Equipo A)");
        Resultados.add(EQUIPOA);
        EQUIPOA.setBounds(140, 50, 56, 16);

        EQUIPOB.setBackground(new java.awt.Color(153, 153, 153));
        EQUIPOB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EQUIPOB.setText("(Equipo B)");
        Resultados.add(EQUIPOB);
        EQUIPOB.setBounds(220, 50, 55, 16);

        jtxtPuntajes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxtPuntajes.setText("Resumen");
        Resultados.add(jtxtPuntajes);
        jtxtPuntajes.setBounds(130, 20, 90, 22);

        EASYMODE1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EASYMODE1.setText("EasyMode:");
        Resultados.add(EASYMODE1);
        EASYMODE1.setBounds(20, 70, 85, 22);

        HARDMODE1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HARDMODE1.setText("HardMode:");
        Resultados.add(HARDMODE1);
        HARDMODE1.setBounds(20, 100, 86, 22);

        EXTREMODE1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EXTREMODE1.setText("XtremMode:");
        Resultados.add(EXTREMODE1);
        EXTREMODE1.setBounds(20, 130, 95, 22);

        TEMAS1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TEMAS1.setText("Tematicas:");
        Resultados.add(TEMAS1);
        TEMAS1.setBounds(20, 160, 85, 22);

        LIBRE3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LIBRE3.setText("Libre:");
        Resultados.add(LIBRE3);
        LIBRE3.setBounds(20, 220, 44, 22);

        PERSONAJES1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PERSONAJES1.setText("PersonajeO:");
        Resultados.add(PERSONAJES1);
        PERSONAJES1.setBounds(20, 190, 95, 22);

        CXC1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CXC1.setText("4x4:");
        Resultados.add(CXC1);
        CXC1.setBounds(20, 250, 35, 22);

        jLabel1.setText("[0]");
        Resultados.add(jLabel1);
        jLabel1.setBounds(310, 70, 20, 16);

        EA_A.setText("[0]");
        Resultados.add(EA_A);
        EA_A.setBounds(160, 70, 20, 16);

        EA_B.setText("[0]");
        Resultados.add(EA_B);
        EA_B.setBounds(240, 70, 20, 16);

        jLabel6.setText("[0]");
        Resultados.add(jLabel6);
        jLabel6.setBounds(310, 100, 20, 16);

        HM_A.setText("[0]");
        Resultados.add(HM_A);
        HM_A.setBounds(160, 100, 20, 16);

        HM_B.setText("[0]");
        Resultados.add(HM_B);
        HM_B.setBounds(240, 100, 20, 16);

        XT_A.setText("[0]");
        Resultados.add(XT_A);
        XT_A.setBounds(160, 130, 20, 16);

        jLabel15.setText("[0]");
        Resultados.add(jLabel15);
        jLabel15.setBounds(310, 130, 20, 16);

        XT_B.setText("[0]");
        Resultados.add(XT_B);
        XT_B.setBounds(240, 130, 20, 16);

        TT_A.setText("[0]");
        Resultados.add(TT_A);
        TT_A.setBounds(160, 160, 20, 16);

        jLabel19.setText("[0]");
        Resultados.add(jLabel19);
        jLabel19.setBounds(310, 160, 20, 16);

        TT_B.setText("[0]");
        Resultados.add(TT_B);
        TT_B.setBounds(240, 160, 20, 16);

        PJ_A.setText("[0]");
        Resultados.add(PJ_A);
        PJ_A.setBounds(160, 190, 20, 16);

        PJ_B.setText("[0]");
        Resultados.add(PJ_B);
        PJ_B.setBounds(240, 190, 20, 16);

        jLabel25.setText("[0]");
        Resultados.add(jLabel25);
        jLabel25.setBounds(310, 190, 20, 16);

        LL_A.setText("[0]");
        Resultados.add(LL_A);
        LL_A.setBounds(160, 220, 20, 16);

        LL_B.setText("[0]");
        Resultados.add(LL_B);
        LL_B.setBounds(240, 220, 20, 16);

        jLabel32.setText("[0]");
        Resultados.add(jLabel32);
        jLabel32.setBounds(310, 220, 20, 16);

        XX_A.setText("[0]");
        Resultados.add(XX_A);
        XX_A.setBounds(160, 250, 20, 16);

        XX_B.setText("[0]");
        Resultados.add(XX_B);
        XX_B.setBounds(240, 250, 20, 16);

        jLabel37.setText("[0]");
        Resultados.add(jLabel37);
        jLabel37.setBounds(310, 250, 20, 16);

        jtxtPuntajes1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxtPuntajes1.setText("Resultado:");
        Resultados.add(jtxtPuntajes1);
        jtxtPuntajes1.setBounds(20, 310, 100, 22);

        PT_B.setText("[0]");
        Resultados.add(PT_B);
        PT_B.setBounds(240, 280, 20, 16);

        PT_A.setText("[0]");
        Resultados.add(PT_A);
        PT_A.setBounds(160, 280, 20, 16);

        jtxtPuntajes3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxtPuntajes3.setText("Puntaje:");
        Resultados.add(jtxtPuntajes3);
        jtxtPuntajes3.setBounds(20, 280, 65, 22);

        Iniciar1.setText("Guardar");
        Iniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iniciar1ActionPerformed(evt);
            }
        });
        Resultados.add(Iniciar1);
        Iniciar1.setBounds(140, 380, 72, 22);

        getContentPane().add(Resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 490));

        Votacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReiniciarButton.setText("Reiniciar");
        ReiniciarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarButtonActionPerformed(evt);
            }
        });
        Votacion.add(ReiniciarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 110, 40));

        Vote.setText("¡Votar!");
        Vote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoteActionPerformed(evt);
            }
        });
        Votacion.add(Vote, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 110, 40));

        EASYMODE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EASYMODE.setText("EasyMode:");
        Votacion.add(EASYMODE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        Votacion.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        HARDMODE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HARDMODE.setText("HardMode:");
        Votacion.add(HARDMODE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jComboBox22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jComboBox23.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jComboBox24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        EXTREMODE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EXTREMODE.setText("XtremMode:");
        Votacion.add(EXTREMODE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jComboBox49.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        jComboBox49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox49ActionPerformed(evt);
            }
        });
        Votacion.add(jComboBox49, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jComboBox50.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox50, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jComboBox51.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox51, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jComboBox52.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox52, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jComboBox53.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox53, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jComboBox54.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox54, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jComboBox55.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox55, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jComboBox56.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox56, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jComboBox57.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox57, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jComboBox58.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox58, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jComboBox59.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox59, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        jComboBox60.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox60, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        TEMAS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TEMAS.setText("Tematicas:");
        Votacion.add(TEMAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jComboBox25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        jComboBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox25ActionPerformed(evt);
            }
        });
        Votacion.add(jComboBox25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jComboBox26.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox26, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        jComboBox27.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox27, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox28, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        jComboBox29.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox29, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jComboBox30.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox30, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        jComboBox31.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jComboBox32.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox32, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jComboBox33.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        jComboBox33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox33ActionPerformed(evt);
            }
        });
        Votacion.add(jComboBox33, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jComboBox34.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox34, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jComboBox35.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox35, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jComboBox36.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox36, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        LIBRE2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LIBRE2.setText("Libre:");
        Votacion.add(LIBRE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jComboBox66.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox66, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jComboBox69.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox69, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jComboBox70.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox70, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jComboBox71.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox71, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jComboBox73.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox73, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jComboBox74.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox74, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        jComboBox75.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox75, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        jComboBox76.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox76, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        jComboBox77.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox77, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jComboBox78.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox78, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        jComboBox79.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox79, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jComboBox80.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox80, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        PERSONAJES.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PERSONAJES.setText("PersonajeO:");
        Votacion.add(PERSONAJES, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 30));

        jComboBox37.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox37, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jComboBox38.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        jComboBox38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox38ActionPerformed(evt);
            }
        });
        Votacion.add(jComboBox38, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        jComboBox39.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox39, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jComboBox40.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox40, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        jComboBox41.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox41, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        jComboBox42.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox42, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        jComboBox43.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox43, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        jComboBox44.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox44, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        jComboBox45.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox45, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        jComboBox46.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        jComboBox46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox46ActionPerformed(evt);
            }
        });
        Votacion.add(jComboBox46, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jComboBox47.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox47, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jComboBox48.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox48, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        CXC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CXC.setText("4x4:");
        Votacion.add(CXC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jComboBox81.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox81, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jComboBox82.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox82, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        jComboBox83.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox83, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        jComboBox84.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox84, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        jComboBox85.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox85, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        jComboBox86.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox86, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        jComboBox87.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox87, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        jComboBox88.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox88, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        jComboBox89.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox89, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        jComboBox90.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox90, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        jComboBox91.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox91, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        jComboBox92.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        Votacion.add(jComboBox92, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        getContentPane().add(Votacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox46ActionPerformed

    }//GEN-LAST:event_jComboBox46ActionPerformed
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    void CompInt() {
        Votacion.setVisible(false);
        A2I.setVisible(true);
        A2D.setVisible(false);
        A2.setVisible(false);
        B2I.setVisible(true);
        B2D.setVisible(false);
        B2.setVisible(false);
        JA.setVisible(true);
        JB.setVisible(true);
        EB.setVisible(false);
        EA.setVisible(false);
    }
    private void VoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoteActionPerformed
        int easymodea, EasymodeB, HardmodeA, HardmodeB, TematicaA, TematicaB, PersonajeA, PersonajeB, ExtremA, ExtremB, DeluxA, DeluxB, XA, XB, LA, LB, MLA, MLB = 0;
        int PuntajeA, PuntajeB = 0;
        int i = jComboBox1.getSelectedIndex();
        int i2 = jComboBox2.getSelectedIndex();
        int i3 = jComboBox3.getSelectedIndex();
        int i4 = jComboBox4.getSelectedIndex();
        int i5 = jComboBox5.getSelectedIndex();
        int i6 = jComboBox6.getSelectedIndex();
        int i7 = jComboBox7.getSelectedIndex();
        int i8 = jComboBox8.getSelectedIndex();
        int i9 = jComboBox9.getSelectedIndex();
        int i10 = jComboBox10.getSelectedIndex();
        int i11 = jComboBox11.getSelectedIndex();
        int i12 = jComboBox12.getSelectedIndex();
        int i13 = jComboBox13.getSelectedIndex();
        int i14 = jComboBox14.getSelectedIndex();
        int i15 = jComboBox15.getSelectedIndex();
        int i16 = jComboBox16.getSelectedIndex();
        int i17 = jComboBox17.getSelectedIndex();
        int i18 = jComboBox18.getSelectedIndex();
        int i19 = jComboBox19.getSelectedIndex();
        int i20 = jComboBox20.getSelectedIndex();
        int i21 = jComboBox21.getSelectedIndex();
        int i22 = jComboBox22.getSelectedIndex();
        int i23 = jComboBox23.getSelectedIndex();
        int i24 = jComboBox24.getSelectedIndex();
        int i25 = jComboBox25.getSelectedIndex();
        int i26 = jComboBox26.getSelectedIndex();
        int i27 = jComboBox27.getSelectedIndex();
        int i28 = jComboBox28.getSelectedIndex();
        int i29 = jComboBox29.getSelectedIndex();
        int i30 = jComboBox30.getSelectedIndex();
        int i31 = jComboBox31.getSelectedIndex();
        int i32 = jComboBox32.getSelectedIndex();
        int i33 = jComboBox33.getSelectedIndex();
        int i34 = jComboBox34.getSelectedIndex();
        int i35 = jComboBox35.getSelectedIndex();
        int i36 = jComboBox36.getSelectedIndex();
        int i37 = jComboBox37.getSelectedIndex();
        int i38 = jComboBox38.getSelectedIndex();
        int i39 = jComboBox39.getSelectedIndex();
        int i40 = jComboBox40.getSelectedIndex();
        int i41 = jComboBox41.getSelectedIndex();
        int i42 = jComboBox42.getSelectedIndex();
        int i43 = jComboBox43.getSelectedIndex();
        int i44 = jComboBox44.getSelectedIndex();
        int i45 = jComboBox45.getSelectedIndex();
        int i46 = jComboBox46.getSelectedIndex();
        int i47 = jComboBox47.getSelectedIndex();
        int i48 = jComboBox48.getSelectedIndex();
        int i49 = jComboBox49.getSelectedIndex();
        int i50 = jComboBox50.getSelectedIndex();
        int i51 = jComboBox51.getSelectedIndex();
        int i52 = jComboBox52.getSelectedIndex();
        int i53 = jComboBox53.getSelectedIndex();
        int i54 = jComboBox54.getSelectedIndex();
        int i55 = jComboBox55.getSelectedIndex();
        int i56 = jComboBox56.getSelectedIndex();
        int i57 = jComboBox57.getSelectedIndex();
        int i58 = jComboBox58.getSelectedIndex();
        int i59 = jComboBox59.getSelectedIndex();
        int i60 = jComboBox60.getSelectedIndex();
        int i66 = jComboBox66.getSelectedIndex();
        int i69 = jComboBox69.getSelectedIndex();
        int i70 = jComboBox70.getSelectedIndex();
        int i71 = jComboBox71.getSelectedIndex();
        int i73 = jComboBox73.getSelectedIndex();
        int i74 = jComboBox74.getSelectedIndex();
        int i75 = jComboBox75.getSelectedIndex();
        int i76 = jComboBox76.getSelectedIndex();
        int i77 = jComboBox77.getSelectedIndex();
        int i78 = jComboBox78.getSelectedIndex();
        int i79 = jComboBox79.getSelectedIndex();
        int i80 = jComboBox80.getSelectedIndex();
        int i81 = jComboBox81.getSelectedIndex();
        int i82 = jComboBox82.getSelectedIndex();
        int i83 = jComboBox83.getSelectedIndex();
        int i84 = jComboBox84.getSelectedIndex();
        int i85 = jComboBox85.getSelectedIndex();
        int i86 = jComboBox86.getSelectedIndex();
        int i87 = jComboBox87.getSelectedIndex();
        int i88 = jComboBox88.getSelectedIndex();
        int i89 = jComboBox89.getSelectedIndex();
        int i90 = jComboBox90.getSelectedIndex();
        int i91 = jComboBox91.getSelectedIndex();
        int i92 = jComboBox92.getSelectedIndex();
        //Analizamos los Datos
        //EasyMode:
        easymodea = i + i2 + i3 + i4 + i5 + i6;
        EasymodeB = i7 + i8 + i9 + i10 + i11 + i12;
        //HardMode:
        HardmodeA = i13 + i15 + i16 + i17 + i18 + i19;
        HardmodeB = i14 + i24 + i20 + i21 + i22 + i23;
        //Tematicas:
        TematicaA = i25 + i27 + i31 + i30 + i29 + i28;
        TematicaB = i26 + i32 + i33 + i34 + i35 + i36;
        //Personajes:
        PersonajeA = i37 + i38 + i39 + i40 + i41 + i44;
        PersonajeB = i48 + i47 + i46 + i45 + i43 + i42;
        //Extreme Mode
        ExtremA = i49 + i50 + i54 + i55 + i58 + i60;
        ExtremB = i52 + i51 + i53 + i56 + i57 + i59;
        //
        XA = i66 + i69 + i73 + i76 + i77 + i80;
        XB = i70 + i71 + i74 + i75 + i78 + i79;
        //
        LA = i81 + i84 + i85 + i88 + i89 + i91;
        LB = i82 + i83 + i86 + i87 + i90 + i92;
        PuntajeA = easymodea + HardmodeA + TematicaA + PersonajeA + ExtremA + XA + LA;
        PuntajeB = EasymodeB + HardmodeB + TematicaB + PersonajeB + ExtremB + XB + LB;
        int Resta = 0;
        if (PuntajeA < PuntajeB) {
            Resta = PuntajeB - PuntajeA;
        }
        if (PuntajeB < PuntajeA) {
            Resta = PuntajeA - PuntajeB;
        }
        int l = Parejas.getSelectedIndex();
        if (l == 0) {
            if (Resta <= 10) {
                RespuestaGeneral.setText("Se ha llegado a una replica por " + Resta);
            } else if (PuntajeA < PuntajeB) {
                RespuestaGeneral.setText("Ha ganado " + this.A2I.getText() + " con una diferencia de " + Resta + " puntos");
            } else if (PuntajeB < PuntajeA) {
                RespuestaGeneral.setText("Ha ganado " + this.B2I.getText() + " con una diferencia de " + Resta + " puntos");
            }
        }
        if (l == 1) {
            if (Resta <= 10) {
                RespuestaGeneral.setText("Se ha llegado a una replica");
            } else if (PuntajeA < PuntajeB) {
                RespuestaGeneral.setText("Ha ganado el Equipo B con una diferencia de " + Resta + " puntos");
            } else if (PuntajeB < PuntajeA) {
                RespuestaGeneral.setText("Ha ganado el Equipo A con una diferencia de " + Resta + " puntos");
            }
        }
        if (l == 2) {
            if (Resta <= 10) {
                RespuestaGeneral.setText("Se ha llegado a una replica");
            } else if (PuntajeA < PuntajeB) {
                RespuestaGeneral.setText("Ha ganado el Equipo B con una diferencia de " + Resta + " puntos");
            } else if (PuntajeB < PuntajeA) {
                RespuestaGeneral.setText("Ha ganado el Equipo A con una diferencia de " + Resta + " puntos");
            }
        }
        //Result
        EA_A.setText(String.valueOf(easymodea));
        EA_B.setText(String.valueOf(EasymodeB));
        HM_A.setText(String.valueOf(HardmodeA));
        HM_B.setText(String.valueOf(HardmodeB));
        TT_A.setText(String.valueOf(TematicaA));
        TT_B.setText(String.valueOf(TematicaB));
        PJ_A.setText(String.valueOf(PersonajeA));
        PJ_B.setText(String.valueOf(PersonajeB));
        XT_A.setText(String.valueOf(ExtremA));
        XT_B.setText(String.valueOf(ExtremB));

        LL_A.setText(String.valueOf(LA));
        LL_B.setText(String.valueOf(LB));
        XX_A.setText(String.valueOf(XA));
        XX_B.setText(String.valueOf(XB));
        
        PT_A.setText(String.valueOf(PuntajeA));
        PT_B.setText(String.valueOf(PuntajeB));
        result();
    }//GEN-LAST:event_VoteActionPerformed
    private void jComboBox33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox33ActionPerformed

    private void jComboBox38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox38ActionPerformed

    private void jComboBox49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox49ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Carga carga = new Carga();
        carga.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void ReiniciarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarButtonActionPerformed
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jComboBox5.setSelectedIndex(0);
        jComboBox6.setSelectedIndex(0);
        jComboBox7.setSelectedIndex(0);
        jComboBox8.setSelectedIndex(0);
        jComboBox9.setSelectedIndex(0);
        jComboBox10.setSelectedIndex(0);
        jComboBox11.setSelectedIndex(0);
        jComboBox12.setSelectedIndex(0);
        jComboBox13.setSelectedIndex(0);
        jComboBox14.setSelectedIndex(0);
        jComboBox15.setSelectedIndex(0);
        jComboBox16.setSelectedIndex(0);
        jComboBox17.setSelectedIndex(0);
        jComboBox18.setSelectedIndex(0);
        jComboBox19.setSelectedIndex(0);
        jComboBox20.setSelectedIndex(0);
        jComboBox21.setSelectedIndex(0);
        jComboBox22.setSelectedIndex(0);
        jComboBox23.setSelectedIndex(0);
        jComboBox24.setSelectedIndex(0);
        jComboBox25.setSelectedIndex(0);
        jComboBox26.setSelectedIndex(0);
        jComboBox27.setSelectedIndex(0);
        jComboBox28.setSelectedIndex(0);
        jComboBox29.setSelectedIndex(0);
        jComboBox30.setSelectedIndex(0);
        jComboBox31.setSelectedIndex(0);
        jComboBox32.setSelectedIndex(0);
        jComboBox33.setSelectedIndex(0);
        jComboBox34.setSelectedIndex(0);
        jComboBox35.setSelectedIndex(0);
        jComboBox36.setSelectedIndex(0);
        jComboBox37.setSelectedIndex(0);
        jComboBox38.setSelectedIndex(0);
        jComboBox39.setSelectedIndex(0);
        jComboBox40.setSelectedIndex(0);
        jComboBox41.setSelectedIndex(0);
        jComboBox42.setSelectedIndex(0);
        jComboBox43.setSelectedIndex(0);
        jComboBox44.setSelectedIndex(0);
        jComboBox45.setSelectedIndex(0);
        jComboBox46.setSelectedIndex(0);
        jComboBox47.setSelectedIndex(0);
        jComboBox48.setSelectedIndex(0);
        jComboBox49.setSelectedIndex(0);
        jComboBox50.setSelectedIndex(0);
        jComboBox51.setSelectedIndex(0);
        jComboBox52.setSelectedIndex(0);
        jComboBox53.setSelectedIndex(0);
        jComboBox54.setSelectedIndex(0);
        jComboBox55.setSelectedIndex(0);
        jComboBox56.setSelectedIndex(0);
        jComboBox57.setSelectedIndex(0);
        jComboBox58.setSelectedIndex(0);
        jComboBox59.setSelectedIndex(0);
        jComboBox60.setSelectedIndex(0);
        jComboBox66.setSelectedIndex(0);
        jComboBox69.setSelectedIndex(0);
        jComboBox70.setSelectedIndex(0);
        jComboBox71.setSelectedIndex(0);
        jComboBox73.setSelectedIndex(0);
        jComboBox74.setSelectedIndex(0);
        jComboBox75.setSelectedIndex(0);
        jComboBox76.setSelectedIndex(0);
        jComboBox77.setSelectedIndex(0);
        jComboBox78.setSelectedIndex(0);
        jComboBox79.setSelectedIndex(0);
        jComboBox80.setSelectedIndex(0);
        jComboBox81.setSelectedIndex(0);
        jComboBox82.setSelectedIndex(0);
        jComboBox83.setSelectedIndex(0);
        jComboBox84.setSelectedIndex(0);
        jComboBox85.setSelectedIndex(0);
        jComboBox86.setSelectedIndex(0);
        jComboBox87.setSelectedIndex(0);
        jComboBox88.setSelectedIndex(0);
        jComboBox89.setSelectedIndex(0);
        jComboBox90.setSelectedIndex(0);
        jComboBox91.setSelectedIndex(0);
        jComboBox92.setSelectedIndex(0);
        RestablecerContadores();
    }//GEN-LAST:event_ReiniciarButtonActionPerformed
    public void seleciones() {
        if (EM1.isSelected()) {
            jComboBox1.setEnabled(true);
            jComboBox2.setEnabled(true);
            jComboBox3.setEnabled(true);
            jComboBox4.setEnabled(true);
            jComboBox5.setEnabled(true);
            jComboBox6.setEnabled(true);
            jComboBox7.setEnabled(true);
            jComboBox8.setEnabled(true);
            jComboBox9.setEnabled(true);
            jComboBox10.setEnabled(true);
            jComboBox11.setEnabled(true);
            jComboBox12.setEnabled(true);
        } else if (EM1.isSelected() == false) {
            jComboBox1.setEnabled(false);
            jComboBox2.setEnabled(false);
            jComboBox3.setEnabled(false);
            jComboBox4.setEnabled(false);
            jComboBox5.setEnabled(false);
            jComboBox6.setEnabled(false);
            jComboBox7.setEnabled(false);
            jComboBox8.setEnabled(false);
            jComboBox9.setEnabled(false);
            jComboBox10.setEnabled(false);
            jComboBox11.setEnabled(false);
            jComboBox12.setEnabled(false);
        }
        if (HD.isSelected()) {
            jComboBox13.setEnabled(true);
            jComboBox15.setEnabled(true);
            jComboBox16.setEnabled(true);
            jComboBox17.setEnabled(true);
            jComboBox18.setEnabled(true);
            jComboBox19.setEnabled(true);
            jComboBox14.setEnabled(true);
            jComboBox24.setEnabled(true);
            jComboBox20.setEnabled(true);
            jComboBox21.setEnabled(true);
            jComboBox22.setEnabled(true);
            jComboBox23.setEnabled(true);
        } else if (HD.isSelected() == false) {
            jComboBox13.setEnabled(false);
            jComboBox15.setEnabled(false);
            jComboBox16.setEnabled(false);
            jComboBox17.setEnabled(false);
            jComboBox18.setEnabled(false);
            jComboBox19.setEnabled(false);
            jComboBox14.setEnabled(false);
            jComboBox24.setEnabled(false);
            jComboBox20.setEnabled(false);
            jComboBox21.setEnabled(false);
            jComboBox22.setEnabled(false);
            jComboBox23.setEnabled(false);
        }
        if (XM.isSelected()) {
            jComboBox49.setEnabled(true);
            jComboBox50.setEnabled(true);
            jComboBox54.setEnabled(true);
            jComboBox55.setEnabled(true);
            jComboBox58.setEnabled(true);
            jComboBox60.setEnabled(true);
            jComboBox52.setEnabled(true);
            jComboBox53.setEnabled(true);
            jComboBox56.setEnabled(true);
            jComboBox57.setEnabled(true);
            jComboBox59.setEnabled(true);
            jComboBox51.setEnabled(true);
        } else if (XM.isSelected() == false) {
            jComboBox49.setEnabled(false);
            jComboBox50.setEnabled(false);
            jComboBox54.setEnabled(false);
            jComboBox55.setEnabled(false);
            jComboBox58.setEnabled(false);
            jComboBox60.setEnabled(false);
            jComboBox52.setEnabled(false);
            jComboBox53.setEnabled(false);
            jComboBox56.setEnabled(false);
            jComboBox57.setEnabled(false);
            jComboBox59.setEnabled(false);
            jComboBox51.setEnabled(false);
        }
        if (TM.isSelected()) {
            jComboBox25.setEnabled(true);
            jComboBox27.setEnabled(true);
            jComboBox31.setEnabled(true);
            jComboBox30.setEnabled(true);
            jComboBox29.setEnabled(true);
            jComboBox28.setEnabled(true);
            jComboBox26.setEnabled(true);
            jComboBox32.setEnabled(true);
            jComboBox33.setEnabled(true);
            jComboBox34.setEnabled(true);
            jComboBox35.setEnabled(true);
            jComboBox36.setEnabled(true);
        } else if (TM.isSelected() == false) {
            jComboBox25.setEnabled(false);
            jComboBox27.setEnabled(false);
            jComboBox31.setEnabled(false);
            jComboBox30.setEnabled(false);
            jComboBox29.setEnabled(false);
            jComboBox28.setEnabled(false);
            jComboBox26.setEnabled(false);
            jComboBox32.setEnabled(false);
            jComboBox33.setEnabled(false);
            jComboBox34.setEnabled(false);
            jComboBox35.setEnabled(false);
            jComboBox36.setEnabled(false);
        }
        if (LM.isSelected()) {
            jComboBox66.setEnabled(true);
            jComboBox69.setEnabled(true);
            jComboBox73.setEnabled(true);
            jComboBox76.setEnabled(true);
            jComboBox77.setEnabled(true);
            jComboBox80.setEnabled(true);
            jComboBox70.setEnabled(true);
            jComboBox71.setEnabled(true);
            jComboBox74.setEnabled(true);
            jComboBox75.setEnabled(true);
            jComboBox78.setEnabled(true);
            jComboBox79.setEnabled(true);
        } else if (LM.isSelected() == false) {
            jComboBox66.setEnabled(false);
            jComboBox69.setEnabled(false);
            jComboBox73.setEnabled(false);
            jComboBox76.setEnabled(false);
            jComboBox77.setEnabled(false);
            jComboBox80.setEnabled(false);
            jComboBox70.setEnabled(false);
            jComboBox71.setEnabled(false);
            jComboBox74.setEnabled(false);
            jComboBox75.setEnabled(false);
            jComboBox78.setEnabled(false);
            jComboBox79.setEnabled(false);

        }
        if (FM.isSelected()) {
            jComboBox81.setEnabled(true);
            jComboBox84.setEnabled(true);
            jComboBox85.setEnabled(true);
            jComboBox88.setEnabled(true);
            jComboBox89.setEnabled(true);
            jComboBox91.setEnabled(true);
            jComboBox92.setEnabled(true);
            jComboBox90.setEnabled(true);
            jComboBox87.setEnabled(true);
            jComboBox86.setEnabled(true);
            jComboBox83.setEnabled(true);
            jComboBox82.setEnabled(true);
        } else if (FM.isSelected() == false) {
            jComboBox81.setEnabled(false);
            jComboBox84.setEnabled(false);
            jComboBox85.setEnabled(false);
            jComboBox88.setEnabled(false);
            jComboBox89.setEnabled(false);
            jComboBox91.setEnabled(false);
            jComboBox92.setEnabled(false);
            jComboBox90.setEnabled(false);
            jComboBox87.setEnabled(false);
            jComboBox86.setEnabled(false);
            jComboBox83.setEnabled(false);
            jComboBox82.setEnabled(false);
        }
        if (PM.isSelected()) {
            jComboBox37.setEnabled(true);
            jComboBox38.setEnabled(true);
            jComboBox39.setEnabled(true);
            jComboBox40.setEnabled(true);
            jComboBox41.setEnabled(true);
            jComboBox42.setEnabled(true);
            jComboBox43.setEnabled(true);
            jComboBox44.setEnabled(true);
            jComboBox45.setEnabled(true);
            jComboBox46.setEnabled(true);
            jComboBox47.setEnabled(true);
            jComboBox48.setEnabled(true);
        } else if (PM.isSelected() == false) {
            jComboBox37.setEnabled(false);
            jComboBox38.setEnabled(false);
            jComboBox39.setEnabled(false);
            jComboBox40.setEnabled(false);
            jComboBox41.setEnabled(false);
            jComboBox42.setEnabled(false);
            jComboBox43.setEnabled(false);
            jComboBox44.setEnabled(false);
            jComboBox45.setEnabled(false);
            jComboBox46.setEnabled(false);
            jComboBox47.setEnabled(false);
            jComboBox48.setEnabled(false);
        }
    }

    public void RestablecerContadores() {
        RespuestaGeneral.setText("");
    }

    public void join() {
        VariableFondo.setVisible(false);
        Votacion.setVisible(true);
        Resultados.setVisible(false);
    }

    public void result() {
        VariableFondo.setVisible(false);
        Votacion.setVisible(false);
        Resultados.setVisible(true);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox25ActionPerformed

    private void HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HDActionPerformed
        seleciones();
    }//GEN-LAST:event_HDActionPerformed
    private void ParejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParejasActionPerformed
        int l = Parejas.getSelectedIndex();
        if (l == 0) {
            A2I.setVisible(true);
            A2D.setVisible(false);
            A2.setVisible(false);
            B2I.setVisible(true);
            B2D.setVisible(false);
            B2.setVisible(false);
            JA.setVisible(true);
            JB.setVisible(true);
            EB.setVisible(false);
            EA.setVisible(false);
        }
        if (l == 1) {
            A2I.setVisible(false);
            A2D.setVisible(true);
            A2.setVisible(true);
            B2I.setVisible(false);
            B2D.setVisible(true);
            B2.setVisible(true);
            JA.setVisible(false);
            JB.setVisible(false);
            EB.setVisible(true);
            EA.setVisible(true);
        }
        if (l == 2) {
            A2I.setVisible(true);
            A2D.setVisible(true);
            A2.setVisible(true);
            B2I.setVisible(true);
            B2D.setVisible(true);
            B2.setVisible(true);
            JA.setVisible(false);
            JB.setVisible(false);
            EB.setVisible(true);
            EA.setVisible(true);
        }
    }//GEN-LAST:event_ParejasActionPerformed
    private void A2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2DActionPerformed
    }//GEN-LAST:event_A2DActionPerformed
    private void B2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2DActionPerformed
    }//GEN-LAST:event_B2DActionPerformed
    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
    }//GEN-LAST:event_B2ActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        int l = Parejas.getSelectedIndex();
        if (l == 0) {
            B2.setText("");
            A2.setText("");
            A2D.setText("");
            B2D.setText("");
            if (!"".equals(this.B2I.getText())) {
                if (!"".equals(this.A2I.getText())) {
                    if ("".equals(this.B2.getText())) {
                        if ("".equals(this.A2.getText())) {
                            if ("".equals(this.A2D.getText())) {
                                if ("".equals(this.B2D.getText())) {
                                    System.out.println(this.B2I.getText() + " vs " + this.A2I.getText());
                                    join();
                                    EQUIPOA.setText("(" + this.B2I.getText() + ")");
                                    EQUIPOB.setText("(" + this.A2I.getText() + ")");
                                }
                            }
                        }
                    }
                }
            }
        }
        if (l == 1) {
            B2I.setText("");
            A2I.setText("");
            if ("".equals(this.B2I.getText())) {
                if ("".equals(this.A2I.getText())) {
                    if (!"".equals(this.B2.getText())) {
                        if (!"".equals(this.A2.getText())) {
                            if (!"".equals(this.A2D.getText())) {
                                if (!"".equals(this.B2D.getText())) {
                                    System.out.println(this.B2.getText() + " " + this.B2D.getText() + " vs " + this.A2.getText() + " " + this.B2.getText());
                                    join();
                                }
                            }
                        }
                    }
                }
            }
        }
        if (l == 2) {
            if (!"".equals(this.B2I.getText())) {
                if (!"".equals(this.A2I.getText())) {
                    if (!"".equals(this.B2.getText())) {
                        if (!"".equals(this.A2.getText())) {
                            if (!"".equals(this.A2D.getText())) {
                                if (!"".equals(this.B2D.getText())) {
                                    System.out.println("3 vs 3");
                                    join();
                                }
                            }
                        }
                    }
                }
            }
        }
        error.setText("Debes colocar los nombres de los Freestylers");
    }//GEN-LAST:event_IniciarActionPerformed
    private void EM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EM1ActionPerformed
        seleciones();
    }//GEN-LAST:event_EM1ActionPerformed

    private void FMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FMActionPerformed
        seleciones();
    }//GEN-LAST:event_FMActionPerformed

    private void XMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XMActionPerformed
        seleciones();
    }//GEN-LAST:event_XMActionPerformed

    private void TMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TMActionPerformed
        seleciones();
    }//GEN-LAST:event_TMActionPerformed

    private void LMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LMActionPerformed
        seleciones();
    }//GEN-LAST:event_LMActionPerformed

    private void AMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMActionPerformed
        seleciones();
    }//GEN-LAST:event_AMActionPerformed

    private void PMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMActionPerformed
        seleciones();
    }//GEN-LAST:event_PMActionPerformed

    private void Iniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iniciar1ActionPerformed
        
    }//GEN-LAST:event_Iniciar1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Votar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A2;
    private javax.swing.JTextField A2D;
    private javax.swing.JTextField A2I;
    private javax.swing.JCheckBox AM;
    private javax.swing.JTextField B2;
    private javax.swing.JTextField B2D;
    private javax.swing.JTextField B2I;
    private javax.swing.JButton Back;
    private javax.swing.JLabel CXC;
    private javax.swing.JLabel CXC1;
    private javax.swing.JLabel ContornoParticipantes;
    private javax.swing.JLabel EA;
    private javax.swing.JLabel EASYMODE;
    private javax.swing.JLabel EASYMODE1;
    private javax.swing.JLabel EA_A;
    private javax.swing.JLabel EA_B;
    private javax.swing.JLabel EB;
    private javax.swing.JCheckBox EM1;
    private javax.swing.JLabel EQUIPOA;
    private javax.swing.JLabel EQUIPOB;
    private javax.swing.JLabel EXTREMODE;
    private javax.swing.JLabel EXTREMODE1;
    private javax.swing.JCheckBox FM;
    private javax.swing.JLabel HARDMODE;
    private javax.swing.JLabel HARDMODE1;
    private javax.swing.JCheckBox HD;
    private javax.swing.JLabel HM_A;
    private javax.swing.JLabel HM_B;
    private javax.swing.JButton Iniciar;
    private javax.swing.JButton Iniciar1;
    private javax.swing.JLabel JA;
    private javax.swing.JLabel JB;
    private javax.swing.JLabel LIBRE2;
    private javax.swing.JLabel LIBRE3;
    private javax.swing.JLabel LL_A;
    private javax.swing.JLabel LL_B;
    private javax.swing.JCheckBox LM;
    private javax.swing.JLabel PERSONAJES;
    private javax.swing.JLabel PERSONAJES1;
    private javax.swing.JLabel PJ_A;
    private javax.swing.JLabel PJ_B;
    private javax.swing.JCheckBox PM;
    private javax.swing.JLabel PT_A;
    private javax.swing.JLabel PT_B;
    private javax.swing.JComboBox<String> Parejas;
    private javax.swing.JButton ReiniciarButton;
    private javax.swing.JLabel RespuestaGeneral;
    private javax.swing.JPanel Resultados;
    private javax.swing.JLabel TEMAS;
    private javax.swing.JLabel TEMAS1;
    private javax.swing.JCheckBox TM;
    private javax.swing.JLabel TT_A;
    private javax.swing.JLabel TT_B;
    private javax.swing.JPanel VariableFondo;
    private javax.swing.JPanel Votacion;
    private javax.swing.JButton Vote;
    private javax.swing.JCheckBox XM;
    private javax.swing.JLabel XT_A;
    private javax.swing.JLabel XT_B;
    private javax.swing.JLabel XX_A;
    private javax.swing.JLabel XX_B;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox21;
    private javax.swing.JComboBox<String> jComboBox22;
    private javax.swing.JComboBox<String> jComboBox23;
    private javax.swing.JComboBox<String> jComboBox24;
    private javax.swing.JComboBox<String> jComboBox25;
    private javax.swing.JComboBox<String> jComboBox26;
    private javax.swing.JComboBox<String> jComboBox27;
    private javax.swing.JComboBox<String> jComboBox28;
    private javax.swing.JComboBox<String> jComboBox29;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox30;
    private javax.swing.JComboBox<String> jComboBox31;
    private javax.swing.JComboBox<String> jComboBox32;
    private javax.swing.JComboBox<String> jComboBox33;
    private javax.swing.JComboBox<String> jComboBox34;
    private javax.swing.JComboBox<String> jComboBox35;
    private javax.swing.JComboBox<String> jComboBox36;
    private javax.swing.JComboBox<String> jComboBox37;
    private javax.swing.JComboBox<String> jComboBox38;
    private javax.swing.JComboBox<String> jComboBox39;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox40;
    private javax.swing.JComboBox<String> jComboBox41;
    private javax.swing.JComboBox<String> jComboBox42;
    private javax.swing.JComboBox<String> jComboBox43;
    private javax.swing.JComboBox<String> jComboBox44;
    private javax.swing.JComboBox<String> jComboBox45;
    private javax.swing.JComboBox<String> jComboBox46;
    private javax.swing.JComboBox<String> jComboBox47;
    private javax.swing.JComboBox<String> jComboBox48;
    private javax.swing.JComboBox<String> jComboBox49;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox50;
    private javax.swing.JComboBox<String> jComboBox51;
    private javax.swing.JComboBox<String> jComboBox52;
    private javax.swing.JComboBox<String> jComboBox53;
    private javax.swing.JComboBox<String> jComboBox54;
    private javax.swing.JComboBox<String> jComboBox55;
    private javax.swing.JComboBox<String> jComboBox56;
    private javax.swing.JComboBox<String> jComboBox57;
    private javax.swing.JComboBox<String> jComboBox58;
    private javax.swing.JComboBox<String> jComboBox59;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox60;
    private javax.swing.JComboBox<String> jComboBox66;
    private javax.swing.JComboBox<String> jComboBox69;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox70;
    private javax.swing.JComboBox<String> jComboBox71;
    private javax.swing.JComboBox<String> jComboBox73;
    private javax.swing.JComboBox<String> jComboBox74;
    private javax.swing.JComboBox<String> jComboBox75;
    private javax.swing.JComboBox<String> jComboBox76;
    private javax.swing.JComboBox<String> jComboBox77;
    private javax.swing.JComboBox<String> jComboBox78;
    private javax.swing.JComboBox<String> jComboBox79;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox80;
    private javax.swing.JComboBox<String> jComboBox81;
    private javax.swing.JComboBox<String> jComboBox82;
    private javax.swing.JComboBox<String> jComboBox83;
    private javax.swing.JComboBox<String> jComboBox84;
    private javax.swing.JComboBox<String> jComboBox85;
    private javax.swing.JComboBox<String> jComboBox86;
    private javax.swing.JComboBox<String> jComboBox87;
    private javax.swing.JComboBox<String> jComboBox88;
    private javax.swing.JComboBox<String> jComboBox89;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JComboBox<String> jComboBox90;
    private javax.swing.JComboBox<String> jComboBox91;
    private javax.swing.JComboBox<String> jComboBox92;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jtxtPuntajes;
    private javax.swing.JLabel jtxtPuntajes1;
    private javax.swing.JLabel jtxtPuntajes3;
    // End of variables declaration//GEN-END:variables

    private void settext(Object object, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

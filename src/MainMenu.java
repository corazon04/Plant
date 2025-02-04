import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Thread;

public class MainMenu extends javax.swing.JFrame {
        private ImageIcon plantIcon;
        private Plant p;
        private Anggrek anggrek;
        private Mawar mawar;
        private Melati melati;
        protected int stok_air;

        Plant[] arrP = { new Anggrek(), new Mawar(), new Melati() };

        public MainMenu() {
                stok_air = 9;
                initComponents();
                setPlantImageAnggrek();
                setPlantImageMawar();
                setPlantImageMelati();
                setStokAir();
                initComponents();

                setExtendedState(JFrame.MAXIMIZED_HORIZ);
                setVisible(true);
                setResizable(false);
        }

        @SuppressWarnings("unchecked")
        private void initComponents() {
                bodyPanel = new javax.swing.JPanel();
                menuPanel = new javax.swing.JPanel();
                btnHome = new javax.swing.JButton();
                // btnTools = new javax.swing.JButton();
                btnGarden = new javax.swing.JButton();
                btnExit = new javax.swing.JButton();
                btnAbout = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                mainPanel = new javax.swing.JPanel();
                toolsPanel = new javax.swing.JPanel();
                homePanel = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                // ! membuat daftar nama untuk about menggunakan label
                aboutPanel = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();

                gardenPanel = new javax.swing.JPanel();
                img_Mawar = new javax.swing.JLabel();
                img_Melati = new javax.swing.JLabel();
                img_Anggrek = new javax.swing.JLabel();
                btnBeriPupuk = new javax.swing.JButton();
                btnBeriAir = new javax.swing.JButton();
                statusAnggrek = new javax.swing.JTextField();
                statusMawar = new javax.swing.JTextField();
                statusMelati = new javax.swing.JTextField();
                jumlahAirAnggrek = new javax.swing.JTextField();
                jumlahPupukAnggrek = new javax.swing.JTextField();
                jumlahAirMawar = new javax.swing.JTextField();
                jumlahAirMelati = new javax.swing.JTextField();
                jumlahPupukMawar = new javax.swing.JTextField();
                jumlahPupukMelati = new javax.swing.JTextField();
                jLabel99 = new javax.swing.JLabel();
                btnAmbilAir = new javax.swing.JButton();
                StokAir = new javax.swing.JTextField();
                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                // INI JUDUL
                // ! mengganti judul pada Jframe

                setTitle("Siram Tanaman");
                bodyPanel.setBackground(new java.awt.Color(0, 255, 0));
                menuPanel.setBackground(new java.awt.Color(255, 255, 255));
                menuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED,
                                java.awt.Color.white, java.awt.Color.white, java.awt.Color.white,
                                java.awt.Color.white));
                btnHome.setText("HOME");
                btnHome.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnHomeActionPerformed(evt);
                        }
                });

                btnGarden.setText("GARDEN");
                btnGarden.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnGardenActionPerformed(evt);
                        }
                });
                btnExit.setText("EXIT");
                btnExit.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnExitActionPerformed(evt);
                        }
                });
                btnAbout.setText("ABOUT");
                btnAbout.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAboutActionPerformed(evt);
                        }
                });
                jLabel1.setIcon(new javax.swing.ImageIcon("img//benih.jpg"));
                // NOI18N
                javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
                menuPanel.setLayout(menuPanelLayout);
                menuPanelLayout
                                .setHorizontalGroup(menuPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(menuPanelLayout.createSequentialGroup().addContainerGap()
                                                                .addGroup(menuPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(btnHome,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                // .addComponent(btnTools,
                                                                                // javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                // javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                // Short.MAX_VALUE)
                                                                                .addComponent(btnExit,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(btnGarden,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(btnAbout,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                menuPanelLayout.createSequentialGroup()
                                                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel1)))
                                                                .addContainerGap()));
                menuPanelLayout
                                .setVerticalGroup(
                                                menuPanelLayout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(menuPanelLayout.createSequentialGroup()
                                                                                .addGap(50, 50, 50)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                193,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(127, 127, 127)
                                                                                .addComponent(btnHome,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(btnGarden,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(11, 11, 11)
                                                                                // .addComponent(btnTools,
                                                                                // javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                // 35,
                                                                                // javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(11, 11, 11)
                                                                                .addComponent(btnAbout,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(26, 26, 26)
                                                                                .addComponent(btnExit,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addContainerGap(
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)));
                mainPanel.setBackground(new java.awt.Color(255, 255, 255));
                mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED,
                                java.awt.Color.white, java.awt.Color.white, java.awt.Color.white,
                                java.awt.Color.white));
                mainPanel.setLayout(new java.awt.CardLayout());
                // ! awal toolsPanel
                toolsPanel.setBackground(new java.awt.Color(255, 255, 255));
                javax.swing.GroupLayout toolsPanelLayout = new javax.swing.GroupLayout(toolsPanel);
                toolsPanel.setLayout(toolsPanelLayout);
                toolsPanelLayout.setHorizontalGroup(toolsPanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGap(0, 633, Short.MAX_VALUE));
                toolsPanelLayout.setVerticalGroup(toolsPanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGap(0, 695, Short.MAX_VALUE));
                mainPanel.add(toolsPanel, "card4");
                // ! akhir toolsPanel

                homePanel.setBackground(new java.awt.Color(255, 255, 255));
                homePanel.setForeground(new java.awt.Color(255, 255, 255));
                homePanel.setToolTipText("");
                // jLabel2.setBackground(new java.awt.Color(255, 255, 255));
                // ! format label.setFont(new java.awt.Font("tipefont",
                // ketebalanfont,ukuranfont));
                jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
                jLabel2.setText("SELAMAT DATANG");
                jLabel3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
                jLabel3.setText("DI");
                jLabel4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
                jLabel4.setText("Siram Tanaman");

                // ! awal fungsi homePanel(), untuk menampilkan panel atau label Home
                javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
                homePanel.setLayout(homePanelLayout);
                homePanelLayout.setHorizontalGroup(homePanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(homePanelLayout.createSequentialGroup().addContainerGap(109, Short.MAX_VALUE)
                                                .addGroup(homePanelLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                homePanelLayout.createSequentialGroup()
                                                                                                .addComponent(jLabel4)
                                                                                                .addGap(137, 137, 137))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                homePanelLayout.createSequentialGroup()
                                                                                                .addComponent(jLabel2)
                                                                                                .addGap(78, 78, 78))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                homePanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel3)
                                                                                                .addGap(280, 280,
                                                                                                                280)))));
                homePanelLayout.setVerticalGroup(
                                homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(homePanelLayout.createSequentialGroup().addGap(158, 158, 158)
                                                                .addComponent(jLabel2)
                                                                .addGap(42, 42, 42).addComponent(jLabel3)
                                                                .addGap(51, 51, 51).addComponent(jLabel4)
                                                                .addContainerGap(276, Short.MAX_VALUE)));
                mainPanel.add(homePanel, "card2");

                // ! batas akhir aboutPanel

                // ! format label.setFont(new java.awt.Font("tipefont", ketebalanfont,
                // ukuranfont));
                aboutPanel.setBackground(new java.awt.Color(255, 255, 255));
                aboutPanel.setForeground(new java.awt.Color(255, 255, 255));
                aboutPanel.setToolTipText("");
                jLabel5.setFont(new java.awt.Font("Arial", 1, 15));
                jLabel5.setText("Diki Wahyudi – 20200801284");

                jLabel6.setFont(new java.awt.Font("Arial", 1, 15));
                jLabel6.setText("Febiola Novita – 20200801290");

                jLabel7.setFont(new java.awt.Font("Arial", 1, 15));
                jLabel7.setText("Gagas Nurfilael – 20200801287");

                jLabel8.setFont(new java.awt.Font("Arial", 1, 15));
                jLabel8.setText("Muhamad Faral Rafizal - 20200801279");

                jLabel9.setFont(new java.awt.Font("Arial", 1, 15));
                jLabel9.setText("Renaldi Gabriel – 20190801143el ");

                jLabel10.setFont(new java.awt.Font("Arial", 1, 15));
                jLabel10.setText("Renaldy Hiunarto – 20200801381");

                jLabel11.setFont(new java.awt.Font("Arial", 1, 15));
                jLabel11.setText("Nama Kelompok :");

                // ! awal fungsi aboutPanel(), untuk menampilkan panel atau label about
                javax.swing.GroupLayout aboutPanelLayout = new javax.swing.GroupLayout(aboutPanel);
                aboutPanel.setLayout(aboutPanelLayout);
                aboutPanelLayout.setHorizontalGroup(aboutPanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(aboutPanelLayout.createSequentialGroup().addContainerGap(109, Short.MAX_VALUE)
                                                .addGroup(aboutPanelLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                aboutPanelLayout.createSequentialGroup()
                                                                                                .addComponent(jLabel11)
                                                                                                .addGap(20, 20, 20))

                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                aboutPanelLayout.createSequentialGroup()
                                                                                                .addComponent(jLabel5)
                                                                                                .addGap(20, 20, 20))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                aboutPanelLayout.createSequentialGroup()
                                                                                                .addComponent(jLabel6)
                                                                                                .addGap(20, 20, 20))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                aboutPanelLayout.createSequentialGroup()
                                                                                                .addComponent(jLabel7)
                                                                                                .addGap(20, 20, 20))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                aboutPanelLayout.createSequentialGroup()
                                                                                                .addComponent(jLabel8)
                                                                                                .addGap(20, 20, 20))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                aboutPanelLayout.createSequentialGroup()
                                                                                                .addComponent(jLabel9)
                                                                                                .addGap(20, 20, 20))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                aboutPanelLayout.createSequentialGroup()
                                                                                                .addComponent(jLabel10)
                                                                                                .addGap(20, 20,
                                                                                                                20)))));
                aboutPanelLayout.setVerticalGroup(
                                aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(aboutPanelLayout.createSequentialGroup()
                                                                .addGap(50, 50, 50).addComponent(jLabel11)
                                                                .addGap(50, 50, 50).addComponent(jLabel5)
                                                                .addGap(50, 50, 50).addComponent(jLabel6)
                                                                .addGap(50, 50, 50).addComponent(jLabel7)
                                                                .addGap(50, 50, 50).addComponent(jLabel8)
                                                                .addGap(50, 50, 50).addComponent(jLabel9)
                                                                .addGap(50, 50, 50).addComponent(jLabel10)

                                                                .addContainerGap(276, Short.MAX_VALUE)));
                mainPanel.add(aboutPanel, "card4");

                // ! akhir aboutPanel
                gardenPanel.setBackground(new java.awt.Color(255, 255, 255));
                gardenPanel.setToolTipText("");
                img_Mawar.setText("Mawar");
                img_Melati.setText("Melati");
                img_Anggrek.setText("Anggrek");
                btnBeriPupuk.setBackground(new java.awt.Color(176, 224, 230));
                btnBeriPupuk.setText("Beri Pupuk");
                btnBeriPupuk.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBeriPupukActionPerformed(evt);
                        }
                });
                btnBeriAir.setBackground(new java.awt.Color(0, 255, 255));
                btnBeriAir.setText("Beri Air");
                btnBeriAir.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBeriAirActionPerformed(evt);
                        }
                });
                statusAnggrek.setBackground(new java.awt.Color(135, 206, 250));
                statusAnggrek.setText("Status Anggrek");
                statusMawar.setBackground(new java.awt.Color(135, 206, 250));
                statusMawar.setText("Status Mawar");
                statusMelati.setBackground(new java.awt.Color(135, 206, 250));
                statusMelati.setText("Status Melati");
                jumlahAirAnggrek.setBackground(new java.awt.Color(0, 255, 255));
                jumlahAirAnggrek.setText("Jumlah Air");
                jumlahPupukAnggrek.setBackground(new java.awt.Color(176, 224, 230));
                jumlahPupukAnggrek.setText("Jumlah Pupuk");
                jumlahAirMawar.setBackground(new java.awt.Color(0, 255, 255));
                jumlahAirMawar.setText("Jumlah Air");
                jumlahAirMelati.setBackground(new java.awt.Color(0, 255, 255));
                jumlahAirMelati.setText("Jumlah Air");
                jumlahPupukMawar.setBackground(new java.awt.Color(176, 224, 230));
                jumlahPupukMawar.setText("Jumlah Pupuk");
                jumlahPupukMelati.setBackground(new java.awt.Color(176, 224, 230));
                jumlahPupukMelati.setText("Jumlah Pupuk");
                jLabel99.setIcon(new javax.swing.ImageIcon("img/benih.jpg")); // NOI18N
                btnAmbilAir.setBackground(new java.awt.Color(127, 255, 212));
                btnAmbilAir.setText("Ambil Air");
                btnAmbilAir.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAmbilAirActionPerformed(evt);
                        }
                });
                StokAir.setEditable(false);
                StokAir.setBackground(new java.awt.Color(127, 255, 212));
                StokAir.setText("Stok Air");
                StokAir.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                StokAirActionPerformed(evt);
                        }
                });
                javax.swing.GroupLayout gardenPanelLayout = new javax.swing.GroupLayout(gardenPanel);
                gardenPanel.setLayout(gardenPanelLayout);
                gardenPanelLayout.setHorizontalGroup(gardenPanelLayout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                                gardenPanelLayout.createSequentialGroup().addGap(53, 53, 53)
                                                                .addGroup(gardenPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(
                                                                                                gardenPanelLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(img_Anggrek,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                152,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                45,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(img_Mawar,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                152,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(51, 51, 51)
                                                                                                                .addComponent(img_Melati,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                152,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(gardenPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(gardenPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                false)
                                                                                                                .addComponent(jumlahAirAnggrek)
                                                                                                                .addComponent(statusAnggrek,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                152,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jumlahPupukAnggrek))
                                                                                                .addGap(45, 45, 45)
                                                                                                .addGroup(gardenPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                false)
                                                                                                                .addComponent(jumlahAirMawar)
                                                                                                                .addComponent(statusMawar,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                152,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jumlahPupukMawar))
                                                                                                .addGap(51, 51, 51)
                                                                                                .addGroup(gardenPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(statusMelati)
                                                                                                                .addComponent(jumlahAirMelati)
                                                                                                                .addComponent(jumlahPupukMelati))))
                                                                .addGap(28, 28, 28))
                                .addGroup(gardenPanelLayout.createSequentialGroup().addGap(192, 192, 192)
                                                .addComponent(btnBeriAir, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(103, 103, 103)
                                                .addComponent(btnBeriPupuk, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gardenPanelLayout
                                                .createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(gardenPanelLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                gardenPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel99)
                                                                                                .addGap(224, 224,
                                                                                                                224))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                gardenPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(gardenPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(StokAir,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                73,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(btnAmbilAir))
                                                                                                .addGap(256, 256,
                                                                                                                256)))));
                gardenPanelLayout.setVerticalGroup(gardenPanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(gardenPanelLayout.createSequentialGroup().addGap(24, 24, 24)
                                                .addGroup(gardenPanelLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(img_Melati,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                131,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(img_Mawar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                131,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(img_Anggrek,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                131,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(gardenPanelLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(statusAnggrek,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(statusMawar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(statusMelati,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(gardenPanelLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jumlahAirMawar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jumlahAirAnggrek,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jumlahAirMelati,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16,
                                                                Short.MAX_VALUE)
                                                .addGroup(gardenPanelLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jumlahPupukMawar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jumlahPupukAnggrek,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jumlahPupukMelati,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(52, 52, 52)
                                                .addGroup(gardenPanelLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(btnBeriPupuk,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                35,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnBeriAir,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                35,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29).addComponent(jLabel99).addGap(18, 18, 18)
                                                .addComponent(btnAmbilAir)
                                                .addGap(18, 18, 18)
                                                .addComponent(StokAir, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(95, 95, 95)));
                mainPanel.add(gardenPanel, "card3");
                javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
                bodyPanel.setLayout(bodyPanelLayout);
                bodyPanelLayout
                                .setHorizontalGroup(bodyPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(bodyPanelLayout.createSequentialGroup().addContainerGap()
                                                                .addComponent(menuPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(mainPanel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                bodyPanelLayout.setVerticalGroup(bodyPanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout
                                                .createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(bodyPanelLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(mainPanel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(menuPanel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addContainerGap()));
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                                                bodyPanel,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                                                bodyPanel,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                bodyPanel.getAccessibleContext().setAccessibleName("");
                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>
         // ! action untuk tombol exit

        private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {

                // TODO add your handling code here:
                int dialogBtn = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Apakah anda inginkeluar", "PERINGATAN",
                                dialogBtn);

                if (dialogResult == 0) {
                        // true condition
                        System.exit(0);
                } else {
                        // false condition
                }
        }

        // ! action untuk ganti panel ke home
        private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {

                // TODO add your handling code here:

                // remove panel
                mainPanel.removeAll();
                mainPanel.repaint();
                mainPanel.revalidate();

                // add panel
                mainPanel.add(homePanel);
                mainPanel.repaint();
                mainPanel.revalidate();

        }
        // ! action untuk ganti panel ke home

        private void btnGardenActionPerformed(java.awt.event.ActionEvent evt) {

                // TODO add your handling code here:

                // remove panel
                mainPanel.removeAll();
                mainPanel.repaint();
                mainPanel.revalidate();

                // add panel
                mainPanel.add(gardenPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
        }
        // ! action untuk ganti panel ke Tools

        private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {

                // TODO add your handling code here:
                mainPanel.removeAll();
                mainPanel.repaint();
                mainPanel.revalidate();

                mainPanel.add(aboutPanel);
                mainPanel.repaint();
                mainPanel.revalidate();

        }

        protected ImageIcon createImageIcon(String path, String description) {
                java.net.URL imgURL = getClass().getResource(path);
                if (imgURL != null) {
                        return new ImageIcon(imgURL, description);
                } else {
                        System.err.println("Couldn't find file: " + path);
                        return null;
                }
        }

        private void setPlantImageAnggrek() {
                plantIcon = createImageIcon(arrP[0].getImagePath(), arrP[0].getStatusTumbuhText());
                img_Anggrek.setIcon(plantIcon);
        }

        private void setPlantImageMawar() {
                plantIcon = createImageIcon(arrP[1].getImagePath(), arrP[1].getStatusTumbuhText());
                img_Mawar.setIcon(plantIcon);
        }

        private void setPlantImageMelati() {
                plantIcon = createImageIcon(arrP[2].getImagePath(), arrP[2].getStatusTumbuhText());
                img_Melati.setIcon(plantIcon);
        }

        private void btnBeriAirActionPerformed(java.awt.event.ActionEvent evt) {

                if (stok_air <= 0) {
                        System.out.println("Isi Air Dulu");
                } else {
                        System.out.println("beri air");
                        for (int i = 0; i < arrP.length; i++) {
                                arrP[i].beriAir();
                                if (i == 0) {
                                        statusAnggrek.setText(arrP[i].getStatusTumbuhText());
                                        jumlahAirAnggrek.setText("Jumlah Air : " + arrP[i].getJumlahAirShow());
                                } else if (i == 1) {
                                        statusMawar.setText(arrP[i].getStatusTumbuhText());
                                        jumlahAirMawar.setText("Jumlah Air : " + arrP[i].getJumlahAirShow());
                                } else {
                                        statusMelati.setText(arrP[i].getStatusTumbuhText());
                                        jumlahAirMelati.setText("Jumlah Air : " + arrP[i].getJumlahAirShow());
                                }
                                setPlantImageAnggrek();
                                setPlantImageMawar();
                                setPlantImageMelati();
                        }
                        stok_air = stok_air - 3;
                        setStokAir();
                }
        }

        private void btnBeriPupukActionPerformed(java.awt.event.ActionEvent evt) {
                for (int i = 0; i < arrP.length; i++) {
                        arrP[i].beriPupuk();
                        if (i == 0) {
                                statusAnggrek.setText(arrP[i].getStatusTumbuhText());
                                jumlahPupukAnggrek.setText("Jumlah Pupuk : " + arrP[i].getJumlahPupukShow());
                        } else if (i == 1) {
                                statusMawar.setText(arrP[i].getStatusTumbuhText());
                                jumlahPupukMawar.setText("Jumlah Pupuk : " + arrP[i].getJumlahPupukShow());
                        } else {
                                statusMelati.setText(arrP[i].getStatusTumbuhText());
                                jumlahPupukMelati.setText("Jumlah Pupuk : " + arrP[i].getJumlahPupukShow());
                        }
                        setPlantImageAnggrek();
                        setPlantImageMawar();
                        setPlantImageMelati();
                }
        }

        private void btnAmbilAirActionPerformed(java.awt.event.ActionEvent evt) {

                if (stok_air >= 15) {
                        System.out.println("Air Sudah Penuh");
                } else {
                        stok_air = stok_air + 3;
                        setStokAir();
                }
        }

        private void StokAirActionPerformed(java.awt.event.ActionEvent evt) {

                // TODO add your handling code here:

        }

        private String getStokAir() {
                return "Stok Air : " + stok_air;
        }

        public void setStokAir() {
                StokAir.setText(getStokAir());
        }

        /**
         * @param args the command line arguments
         */

        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editorfold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the de fault
                 * look and feel. For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/loo kandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>
                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new MainMenu().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify
        private javax.swing.JTextField StokAir;
        private javax.swing.JPanel bodyPanel;
        private javax.swing.JButton btnAmbilAir;
        private javax.swing.JButton btnBeriAir;
        private javax.swing.JButton btnBeriPupuk;
        private javax.swing.JButton btnExit;
        private javax.swing.JButton btnGarden;
        private javax.swing.JButton btnHome;
        private javax.swing.JButton btnAbout;
        // private javax.swing.JButton btnTools;
        private javax.swing.JPanel gardenPanel;
        private javax.swing.JPanel homePanel;
        private javax.swing.JLabel img_Anggrek;
        private javax.swing.JLabel img_Mawar;
        private javax.swing.JLabel img_Melati;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        // ! label 5-10 untuk nama di panelAbout
        private javax.swing.JPanel aboutPanel;

        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;

        private javax.swing.JLabel jLabel99;
        private javax.swing.JTextField jumlahAirAnggrek;
        private javax.swing.JTextField jumlahAirMawar;
        private javax.swing.JTextField jumlahAirMelati;
        private javax.swing.JTextField jumlahPupukAnggrek;
        private javax.swing.JTextField jumlahPupukMawar;
        private javax.swing.JTextField jumlahPupukMelati;
        private javax.swing.JPanel mainPanel;
        private javax.swing.JPanel menuPanel;
        private javax.swing.JTextField statusAnggrek;
        private javax.swing.JTextField statusMawar;
        private javax.swing.JTextField statusMelati;
        private javax.swing.JPanel toolsPanel;
        // End of variables declaration
}
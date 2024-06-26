package UI;

public class HistoryUI extends javax.swing.JFrame {

        public HistoryUI() {
                initComponents();
        }

        private void initComponents() {

                backgroundPanel = new javax.swing.JPanel();
                toolbarPanel = new javax.swing.JPanel();
                headerToolbar = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                bodyToolbar = new javax.swing.JPanel();
                jPanel1 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                toText = new javax.swing.JTextField();
                fromText = new javax.swing.JTextField();
                jPanel3 = new javax.swing.JPanel();
                searchButton = new javax.swing.JButton();
                toState = new javax.swing.JLabel();
                fromState = new javax.swing.JLabel();
                viewPanel = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                viewTable = new javax.swing.JTable();

                // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Search History");

                toolbarPanel.setBackground(new java.awt.Color(204, 204, 255));

                headerToolbar.setBackground(new java.awt.Color(204, 204, 255));

                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Chart_light@2x.png"))); // NOI18N
                jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

                jLabel2.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 1, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("Search History");
                jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

                javax.swing.GroupLayout headerToolbarLayout = new javax.swing.GroupLayout(headerToolbar);
                headerToolbar.setLayout(headerToolbarLayout);
                headerToolbarLayout.setHorizontalGroup(
                                headerToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(headerToolbarLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(headerToolbarLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));
                headerToolbarLayout.setVerticalGroup(
                                headerToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(headerToolbarLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                78,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                104, Short.MAX_VALUE)
                                                                .addContainerGap()));

                bodyToolbar.setBackground(new java.awt.Color(204, 204, 255));

                jPanel1.setBackground(new java.awt.Color(153, 153, 255));

                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Date_range_duotone.png"))); // NOI18N

                jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel4.setText("To : (dd/mm/yyy)");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                24,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel4,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                38,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));

                jPanel2.setBackground(new java.awt.Color(153, 153, 255));

                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Date_range_duotone.png"))); // NOI18N

                jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel6.setText("From : (dd/mm/yyy)");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                24,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel6,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel6,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel5,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                38,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));

                toText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                toText.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                toTextActionPerformed(evt);
                        }
                });

                fromText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                fromText.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                fromTextActionPerformed(evt);
                        }
                });

                jPanel3.setBackground(new java.awt.Color(204, 204, 255));

                searchButton.setBackground(new java.awt.Color(153, 153, 255));
                searchButton.setFont(new java.awt.Font("MesloLGS Nerd Font", 1, 14)); // NOI18N
                searchButton.setText("Search");
                searchButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(23, 23, 23)
                                                                .addComponent(searchButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                130,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(searchButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 80, Short.MAX_VALUE)));

                toState.setFont(new java.awt.Font("MesloLGM Nerd Font", 2, 8)); // NOI18N
                toState.setForeground(new java.awt.Color(0, 255, 0));
                toState.setText("");

                fromState.setFont(new java.awt.Font("MesloLGM Nerd Font", 2, 8)); // NOI18N
                fromState.setForeground(new java.awt.Color(0, 255, 0));
                fromState.setText("");

                javax.swing.GroupLayout bodyToolbarLayout = new javax.swing.GroupLayout(bodyToolbar);
                bodyToolbar.setLayout(bodyToolbarLayout);
                bodyToolbarLayout.setHorizontalGroup(
                                bodyToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(bodyToolbarLayout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jPanel3,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addComponent(fromState, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(bodyToolbarLayout.createSequentialGroup()
                                                                .addGroup(bodyToolbarLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jPanel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(fromText)
                                                                                .addComponent(jPanel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(toText)
                                                                                .addComponent(toState,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(0, 0, Short.MAX_VALUE)));
                bodyToolbarLayout.setVerticalGroup(
                                bodyToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(bodyToolbarLayout.createSequentialGroup()
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(fromText,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(fromState)
                                                                .addGap(23, 23, 23)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(toText,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(toState)
                                                                .addGap(23, 23, 23)
                                                                .addComponent(jPanel3,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                javax.swing.GroupLayout toolbarPanelLayout = new javax.swing.GroupLayout(toolbarPanel);
                toolbarPanel.setLayout(toolbarPanelLayout);
                toolbarPanelLayout.setHorizontalGroup(
                                toolbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(headerToolbar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bodyToolbar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                toolbarPanelLayout.setVerticalGroup(
                                toolbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(toolbarPanelLayout.createSequentialGroup()
                                                                .addComponent(headerToolbar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(bodyToolbar,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                viewTable.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {

                                }));
                jScrollPane1.setViewportView(viewTable);

                javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
                viewPanel.setLayout(viewPanelLayout);
                viewPanelLayout.setHorizontalGroup(
                                viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569,
                                                                Short.MAX_VALUE));
                viewPanelLayout.setVerticalGroup(
                                viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane1));

                javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
                backgroundPanel.setLayout(backgroundPanelLayout);
                backgroundPanelLayout.setHorizontalGroup(
                                backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                                                .addComponent(toolbarPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(viewPanel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                backgroundPanelLayout.setVerticalGroup(
                                backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(toolbarPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(viewPanel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }// </editor-fold>

        private void toTextActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void fromTextActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        // Variables declaration - do not modify
        private javax.swing.JPanel backgroundPanel;
        private javax.swing.JPanel bodyToolbar;
        public javax.swing.JLabel fromState;
        public javax.swing.JTextField fromText;
        private javax.swing.JPanel headerToolbar;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JScrollPane jScrollPane1;
        public javax.swing.JButton searchButton;
        public javax.swing.JLabel toState;
        public javax.swing.JTextField toText;
        private javax.swing.JPanel toolbarPanel;
        private javax.swing.JPanel viewPanel;
        public javax.swing.JTable viewTable;
}

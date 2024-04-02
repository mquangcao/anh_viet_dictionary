package UI;

public class WordLikeList extends javax.swing.JFrame {
        public WordLikeList() {
                initComponents();
        }

        private void initComponents() {

                backgroundPanel = new javax.swing.JPanel();
                headerPanel = new javax.swing.JPanel();
                separatorHeader = new javax.swing.JSeparator();
                headerTitle = new javax.swing.JLabel();
                bodyPanel = new javax.swing.JPanel();
                buttonPanel = new javax.swing.JPanel();
                jButton1 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                listOption = new javax.swing.JComboBox<>();
                tablePanel = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                footerPanel = new javax.swing.JPanel();
                footerTitle = new javax.swing.JLabel();

                // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Favorite Words");

                headerPanel.setBackground(new java.awt.Color(153, 153, 153));

                headerTitle.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
                headerTitle.setForeground(new java.awt.Color(255, 255, 255));
                headerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                headerTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Favorite@2x.png"))); // NOI18N
                headerTitle.setText("Favorite Words");

                javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
                headerPanel.setLayout(headerPanelLayout);
                headerPanelLayout.setHorizontalGroup(
                                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(headerPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(headerPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(headerTitle,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(separatorHeader))
                                                                .addContainerGap()));
                headerPanelLayout.setVerticalGroup(
                                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(headerTitle,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                59,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(separatorHeader,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));

                jButton1.setFont(new java.awt.Font("JetBrains Mono NL", 1, 14)); // NOI18N
                jButton1.setText("Dislike");
                jButton1.setMaximumSize(new java.awt.Dimension(90, 37));
                jButton1.setMinimumSize(new java.awt.Dimension(90, 37));

                jLabel1.setFont(new java.awt.Font("MesloLGL Nerd Font", 1, 14)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("View : ");

                listOption.setFont(new java.awt.Font("MesloLGL Nerd Font Mono", 1, 14)); // NOI18N
                listOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A - Z", "Z - A" }));

                javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
                buttonPanel.setLayout(buttonPanelLayout);
                buttonPanelLayout.setHorizontalGroup(
                                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(buttonPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                327,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(83, 83, 83)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                156,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(listOption, 0,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                buttonPanelLayout.setVerticalGroup(
                                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                27,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(listOption,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {
                                                "Word", "Meaning"
                                }) {
                        boolean[] canEdit = new boolean[] {
                                        true, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit[columnIndex];
                        }
                });
                jScrollPane1.setViewportView(jTable1);

                javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
                tablePanel.setLayout(tablePanelLayout);
                tablePanelLayout.setHorizontalGroup(
                                tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(tablePanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                784, Short.MAX_VALUE)));
                tablePanelLayout.setVerticalGroup(
                                tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(tablePanelLayout.createSequentialGroup()
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                481, Short.MAX_VALUE)
                                                                .addContainerGap()));

                javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
                bodyPanel.setLayout(bodyPanelLayout);
                bodyPanelLayout.setHorizontalGroup(
                                bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(bodyPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(bodyPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(tablePanel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(buttonPanel,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));
                bodyPanelLayout.setVerticalGroup(
                                bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout
                                                                .createSequentialGroup()
                                                                .addComponent(tablePanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(buttonPanel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                footerPanel.setBackground(new java.awt.Color(204, 204, 204));
                footerPanel.setMaximumSize(new java.awt.Dimension(100, 100));

                footerTitle.setFont(new java.awt.Font("MesloLGL Nerd Font Mono", 0, 12)); // NOI18N
                footerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                footerTitle.setText("@CopyRight mquangcao");

                javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
                footerPanel.setLayout(footerPanelLayout);
                footerPanelLayout.setHorizontalGroup(
                                footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(footerTitle,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                footerPanelLayout.setVerticalGroup(
                                footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(footerTitle,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                52, Short.MAX_VALUE)
                                                                .addContainerGap()));

                javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
                backgroundPanel.setLayout(backgroundPanelLayout);
                backgroundPanelLayout.setHorizontalGroup(
                                backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(footerPanel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                backgroundPanelLayout.setVerticalGroup(
                                backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                                                .addComponent(headerPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(bodyPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(footerPanel,
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

        private javax.swing.JPanel backgroundPanel;
        private javax.swing.JPanel bodyPanel;
        private javax.swing.JPanel buttonPanel;
        private javax.swing.JPanel footerPanel;
        private javax.swing.JLabel footerTitle;
        private javax.swing.JPanel headerPanel;
        private javax.swing.JLabel headerTitle;
        public javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane1;
        public javax.swing.JTable jTable1;
        public javax.swing.JComboBox<String> listOption;
        private javax.swing.JSeparator separatorHeader;
        private javax.swing.JPanel tablePanel;
        // End of variables declaration
        // End of variables declaration
}

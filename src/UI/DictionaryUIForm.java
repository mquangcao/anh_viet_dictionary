package UI;

/**
 *
 * @author mquangcao
 */
public class DictionaryUIForm extends javax.swing.JFrame {

        public DictionaryUIForm() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jTabbedPane1 = new javax.swing.JTabbedPane();
                engviedic = new javax.swing.JPanel();
                engvieheader = new javax.swing.JPanel();
                jSeparator1 = new javax.swing.JSeparator();
                evheadertitle = new javax.swing.JLabel();
                engviebody = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                evworddic = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                evmeaningdic = new javax.swing.JTextArea();
                jPanel3 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jPanel4 = new javax.swing.JPanel();
                jScrollPane3 = new javax.swing.JScrollPane();
                evtabledic = new javax.swing.JTable();
                tooleditev = new javax.swing.JPanel();
                addevButton = new javax.swing.JButton();
                editevButton = new javax.swing.JButton();
                deleteevButton = new javax.swing.JButton();
                vieengdic = new javax.swing.JPanel();
                engvieheader1 = new javax.swing.JPanel();
                jSeparator2 = new javax.swing.JSeparator();
                vieengheader = new javax.swing.JLabel();
                engviebody1 = new javax.swing.JPanel();
                jPanel5 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                veworddic = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                jScrollPane4 = new javax.swing.JScrollPane();
                vemeandic = new javax.swing.JTextArea();
                jPanel6 = new javax.swing.JPanel();
                jLabel6 = new javax.swing.JLabel();
                jPanel7 = new javax.swing.JPanel();
                jScrollPane5 = new javax.swing.JScrollPane();
                vetabledic = new javax.swing.JTable();
                tooleditve = new javax.swing.JPanel();
                addveButton = new javax.swing.JButton();
                editveButton = new javax.swing.JButton();
                deleteveButton = new javax.swing.JButton();

                // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Prevent default close
                // operation

                jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                jTabbedPane1StateChanged(evt);
                        }
                });

                engvieheader.setBackground(java.awt.SystemColor.controlDkShadow);

                evheadertitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                evheadertitle.setForeground(new java.awt.Color(255, 255, 255));
                evheadertitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                evheadertitle.setIcon(
                                new javax.swing.ImageIcon(getClass().getResource("/images/Chart_pin_light@2x.png"))); // NOI18N
                evheadertitle.setText("English -> Vietnamese");

                javax.swing.GroupLayout engvieheaderLayout = new javax.swing.GroupLayout(engvieheader);
                engvieheader.setLayout(engvieheaderLayout);
                engvieheaderLayout.setHorizontalGroup(
                                engvieheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(engvieheaderLayout.createSequentialGroup().addContainerGap()
                                                                .addGroup(engvieheaderLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(evheadertitle,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jSeparator1))
                                                                .addContainerGap()));
                engvieheaderLayout.setVerticalGroup(
                                engvieheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, engvieheaderLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(evheadertitle,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jSeparator1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                10,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));

                engviebody.setBackground(java.awt.SystemColor.controlHighlight);

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel2.setText("Word : ");

                evworddic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                evworddic.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                evworddicActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel1.setText("Meaning :");

                evmeaningdic.setColumns(20);
                evmeaningdic.setRows(5);
                jScrollPane2.setViewportView(evmeaningdic);

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(evworddic)
                                                                                .addComponent(jScrollPane2)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(evworddic,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                34,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane2)
                                                                .addContainerGap()));

                jPanel3.setBackground(java.awt.SystemColor.activeCaptionBorder);

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("Record");

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 506,
                                                                Short.MAX_VALUE));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 36,
                                                                Short.MAX_VALUE));

                evtabledic.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {
                                                "Word", "Meaning"
                                }) {
                        @SuppressWarnings("rawtypes")
                        Class[] types = new Class[] {
                                        java.lang.String.class, java.lang.String.class
                        };
                        boolean[] canEdit = new boolean[] {
                                        false, false
                        };

                        @SuppressWarnings("rawtypes")
                        public Class getColumnClass(int columnIndex) {
                                return types[columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit[columnIndex];
                        }
                });
                jScrollPane3.setViewportView(evtabledic);
                if (evtabledic.getColumnModel().getColumnCount() > 0) {
                        evtabledic.getColumnModel().getColumn(0).setMinWidth(150);
                        evtabledic.getColumnModel().getColumn(0).setMaxWidth(250);
                }

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane3));
                jPanel4Layout.setVerticalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout
                                                                .createSequentialGroup()
                                                                .addComponent(jScrollPane3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                0, Short.MAX_VALUE)
                                                                .addContainerGap()));

                addevButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                addevButton.setText("Add");

                editevButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                editevButton.setText("Edit");

                deleteevButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                deleteevButton.setText("Delete");

                javax.swing.GroupLayout tooleditevLayout = new javax.swing.GroupLayout(tooleditev);
                tooleditev.setLayout(tooleditevLayout);
                tooleditevLayout.setHorizontalGroup(
                                tooleditevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(tooleditevLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(tooleditevLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(addevButton,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(editevButton,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(deleteevButton,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                86, Short.MAX_VALUE))
                                                                .addContainerGap()));
                tooleditevLayout.setVerticalGroup(
                                tooleditevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(tooleditevLayout.createSequentialGroup()
                                                                .addGap(46, 46, 46)
                                                                .addComponent(addevButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                60,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(59, 59, 59)
                                                                .addComponent(editevButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                60,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                68, Short.MAX_VALUE)
                                                                .addComponent(deleteevButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                60,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(32, 32, 32)));

                javax.swing.GroupLayout engviebodyLayout = new javax.swing.GroupLayout(engviebody);
                engviebody.setLayout(engviebodyLayout);
                engviebodyLayout.setHorizontalGroup(
                                engviebodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(engviebodyLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(engviebodyLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(engviebodyLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jPanel2,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(tooleditev,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap()));
                engviebodyLayout.setVerticalGroup(
                                engviebodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(engviebodyLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(engviebodyLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(engviebodyLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jPanel3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(engviebodyLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jPanel2,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(tooleditev,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))))
                                                                .addContainerGap()));

                javax.swing.GroupLayout engviedicLayout = new javax.swing.GroupLayout(engviedic);
                engviedic.setLayout(engviedicLayout);
                engviedicLayout.setHorizontalGroup(
                                engviedicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(engvieheader, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(engviedicLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(engviebody,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                engviedicLayout.setVerticalGroup(
                                engviedicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(engviedicLayout.createSequentialGroup()
                                                                .addComponent(engvieheader,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(engviebody,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                jTabbedPane1.addTab("Eng_Vie", engviedic);

                engvieheader1.setBackground(java.awt.SystemColor.controlDkShadow);

                vieengheader.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                vieengheader.setForeground(new java.awt.Color(255, 255, 255));
                vieengheader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                vieengheader.setIcon(
                                new javax.swing.ImageIcon(getClass().getResource("/images/Chart_pin_light@2x.png"))); // NOI18N
                vieengheader.setText("Vietnamese -> English");

                javax.swing.GroupLayout engvieheader1Layout = new javax.swing.GroupLayout(engvieheader1);
                engvieheader1.setLayout(engvieheader1Layout);
                engvieheader1Layout.setHorizontalGroup(
                                engvieheader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(engvieheader1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(engvieheader1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(vieengheader,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jSeparator2))
                                                                .addContainerGap()));
                engvieheader1Layout.setVerticalGroup(
                                engvieheader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                engvieheader1Layout.createSequentialGroup()
                                                                                .addContainerGap()
                                                                                .addComponent(vieengheader,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jSeparator2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                10,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addContainerGap()));

                engviebody1.setBackground(java.awt.SystemColor.controlHighlight);

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel4.setText("Word : ");

                veworddic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                veworddic.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                veworddicActionPerformed(evt);
                        }
                });

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel5.setText("Meaning :");

                vemeandic.setColumns(20);
                vemeandic.setRows(5);
                jScrollPane4.setViewportView(vemeandic);

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(veworddic)
                                                                                .addComponent(jScrollPane4)
                                                                                .addComponent(jLabel5,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));
                jPanel5Layout.setVerticalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(veworddic,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                34,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane4,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                246, Short.MAX_VALUE)
                                                                .addContainerGap()));

                jPanel6.setBackground(java.awt.SystemColor.activeCaptionBorder);

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel6.setText("Record");

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 506,
                                                                Short.MAX_VALUE));
                jPanel6Layout.setVerticalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 36,
                                                                Short.MAX_VALUE));

                vetabledic.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {
                                                "Word", "Meaning"
                                }) {
                        @SuppressWarnings("rawtypes")
                        Class[] types = new Class[] {
                                        java.lang.String.class, java.lang.String.class
                        };
                        boolean[] canEdit = new boolean[] {
                                        false, false
                        };

                        @SuppressWarnings("rawtypes")
                        public Class getColumnClass(int columnIndex) {
                                return types[columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit[columnIndex];
                        }
                });
                jScrollPane5.setViewportView(vetabledic);
                if (vetabledic.getColumnModel().getColumnCount() > 0) {
                        vetabledic.getColumnModel().getColumn(0).setMinWidth(150);
                        vetabledic.getColumnModel().getColumn(0).setMaxWidth(250);
                }

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane5));
                jPanel7Layout.setVerticalGroup(
                                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout
                                                                .createSequentialGroup()
                                                                .addComponent(jScrollPane5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                0, Short.MAX_VALUE)
                                                                .addContainerGap()));

                addveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                addveButton.setText("Add");

                editveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                editveButton.setText("Edit");

                deleteveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                deleteveButton.setText("Delete");

                javax.swing.GroupLayout tooleditveLayout = new javax.swing.GroupLayout(tooleditve);
                tooleditve.setLayout(tooleditveLayout);
                tooleditveLayout.setHorizontalGroup(
                                tooleditveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(tooleditveLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(tooleditveLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(addveButton,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(editveButton,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(deleteveButton,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                85, Short.MAX_VALUE))
                                                                .addContainerGap()));
                tooleditveLayout.setVerticalGroup(
                                tooleditveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(tooleditveLayout.createSequentialGroup()
                                                                .addGap(46, 46, 46)
                                                                .addComponent(addveButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                60,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(59, 59, 59)
                                                                .addComponent(editveButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                60,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(deleteveButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                60,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(32, 32, 32)));

                javax.swing.GroupLayout engviebody1Layout = new javax.swing.GroupLayout(engviebody1);
                engviebody1.setLayout(engviebody1Layout);
                engviebody1Layout.setHorizontalGroup(
                                engviebody1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(engviebody1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(engviebody1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel6,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(engviebody1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jPanel5,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(tooleditve,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap()));
                engviebody1Layout.setVerticalGroup(
                                engviebody1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(engviebody1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(engviebody1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel7,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(engviebody1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jPanel6,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(engviebody1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jPanel5,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(tooleditve,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))))
                                                                .addContainerGap()));

                javax.swing.GroupLayout vieengdicLayout = new javax.swing.GroupLayout(vieengdic);
                vieengdic.setLayout(vieengdicLayout);
                vieengdicLayout.setHorizontalGroup(
                                vieengdicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(engvieheader1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(vieengdicLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(engviebody1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                vieengdicLayout.setVerticalGroup(
                                vieengdicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(vieengdicLayout.createSequentialGroup()
                                                                .addComponent(engvieheader1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(engviebody1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                jTabbedPane1.addTab("Vie_Eng", vieengdic);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jTabbedPane1)
                                                                .addContainerGap()));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jTabbedPane1)));

                jTabbedPane1.getAccessibleContext().setAccessibleName("Vie_Eng");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }// </editor-fold>

        private void evworddicActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void veworddicActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {
                // TODO add your handling code here:
        }

        // Variables declaration - do not modify
        public javax.swing.JButton addevButton;
        public javax.swing.JButton addveButton;
        public javax.swing.JButton deleteevButton;
        public javax.swing.JButton deleteveButton;
        public javax.swing.JButton editevButton;
        public javax.swing.JButton editveButton;
        private javax.swing.JPanel engviebody;
        private javax.swing.JPanel engviebody1;
        private javax.swing.JPanel engviedic;
        private javax.swing.JPanel engvieheader;
        private javax.swing.JPanel engvieheader1;
        private javax.swing.JLabel evheadertitle;
        public javax.swing.JTextArea evmeaningdic;
        public javax.swing.JTable evtabledic;
        public javax.swing.JTextField evworddic;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JScrollPane jScrollPane5;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        public javax.swing.JTabbedPane jTabbedPane1;
        public javax.swing.JTextArea vemeandic;
        public javax.swing.JTable vetabledic;
        public javax.swing.JTextField veworddic;
        private javax.swing.JPanel tooleditev;
        private javax.swing.JPanel tooleditve;

        private javax.swing.JPanel vieengdic;
        private javax.swing.JLabel vieengheader;

        // Variables declaration - do not modify

        // End of variables declaration
}

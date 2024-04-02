package controller;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import UI.WordLikeList;
import model.Word;

public class WordLikeListController {
    private static WordLikeListController instance = null;
    private WordLikeList wll;

    public static WordLikeListController getInstance() {
        if (instance == null) {
            instance = new WordLikeListController();
        }
        return instance;
    }

    private WordLikeListController() {
        init();

        wll.jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        wll.listOption.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listOptionItemStateChanged(evt);
            }
        });
    }

    public void loadTableData(boolean a_z) {
        DefaultTableModel defaultListModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        defaultListModel.addColumn("Word");
        defaultListModel.addColumn("Meaning");
        TreeMap<String, Word> map = null;
        if (a_z) {
            map = sortA_Z();
        } else
            map = sortZ_A();
        for (Map.Entry<String, Word> entry : map.entrySet()) {
            defaultListModel.addRow(new Object[] { entry.getKey(), entry.getValue() });
        }

        wll.jTable1.setModel(defaultListModel);

    }

    private void init() {
        wll = new WordLikeList();
        setVisible(true);
        wll.setLocationRelativeTo(null);

    }

    public void setVisible(boolean isState) {
        wll.setVisible(isState);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        ListSelectionModel lsm = wll.jTable1.getSelectionModel();
        lsm.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        int[] row = wll.jTable1.getSelectedRows();
        String word = String.valueOf(wll.jTable1.getValueAt(row[0], 0));
        if (TranslateController.getInstance().eng_vie.containsKey(word)) {
            TranslateController.getInstance().favoriteEv.remove(word);
            JOptionPane.showMessageDialog(wll, "Success", "Success", JOptionPane.INFORMATION_MESSAGE);
            wll.jTable1.setModel(new DefaultTableModel());
            if (wll.listOption.getSelectedItem().equals("A - Z")) {
                loadTableData(true);
            } else {
                loadTableData(false);
            }
            return;
        }
        TranslateController.getInstance().favoriteVe.remove(word);
        JOptionPane.showMessageDialog(wll, "Success", "Success", JOptionPane.INFORMATION_MESSAGE);

        wll.jTable1.setModel(new DefaultTableModel());
        if (wll.listOption.getSelectedItem().equals("A - Z")) {
            loadTableData(true);
        } else {
            loadTableData(false);
        }

    }

    private TreeMap<String, Word> sortA_Z() {
        HashMap<String, Word> map = new HashMap<>();
        for (String e : TranslateController.getInstance().favoriteEv) {
            map.put(e, TranslateController.getInstance().eng_vie.get(e));
        }

        for (String e : TranslateController.getInstance().favoriteVe) {
            map.put(e, TranslateController.getInstance().vie_eng.get(e));
        }

        TreeMap<String, Word> sortedMap = new TreeMap<>(map);
        return sortedMap;
    }

    private TreeMap<String, Word> sortZ_A() {
        HashMap<String, Word> map = new HashMap<>();
        for (String e : TranslateController.getInstance().favoriteEv) {
            map.put(e, TranslateController.getInstance().eng_vie.get(e));
        }

        for (String e : TranslateController.getInstance().favoriteVe) {
            map.put(e, TranslateController.getInstance().vie_eng.get(e));
        }

        TreeMap<String, Word> sortedMap = new TreeMap<>(Comparator.reverseOrder());
        sortedMap.putAll(map);

        return sortedMap;
    }

    private void listOptionItemStateChanged(java.awt.event.ItemEvent evt) {
        if (wll.listOption.getSelectedItem().equals("A - Z")) {
            loadTableData(true);
        } else {
            loadTableData(false);
        }
    }
}

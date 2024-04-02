package controller;

import java.util.Iterator;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import UI.DictionaryUIForm;
import model.Word;

public class DictionaryController {
    private static DictionaryController instance = null;

    public static DictionaryController getInstance() {
        if (instance == null) {
            instance = new DictionaryController();
        }
        return instance;
    }

    private DictionaryUIForm dic = null;

    private DictionaryController() {
        init();
    }

    public void setVisible(boolean isVisible) {
        dic.setVisible(isVisible);
    }

    private void init() {

        // init
        dic = new DictionaryUIForm();
        dic.setLocationRelativeTo(null);

        // render
        renderDictionaryTable(dic.evtabledic, TranslateController.getInstance().eng_vie);
        // state tabbed change
        dic.jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        veTableSelectionRow();
        evTableSelectionRow();

        dic.addevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addevButtonActionPerformed(evt);
            }
        });

        dic.addveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addveButtonActionPerformed(evt);
            }
        });

        dic.deleteevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteevButtonActionPerformed(evt);
            }
        });

        dic.deleteveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteveButtonActionPerformed(evt);
            }
        });

        dic.editevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editevButtonActionPerformed(evt);
            }
        });

        dic.editveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editveButtonActionPerformed(evt);
            }
        });

    }

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {
        int index = dic.jTabbedPane1.getSelectedIndex();
        if (index == 0) {
            renderDictionaryTable(dic.evtabledic, TranslateController.getInstance().eng_vie);
        } else if (index == 1) {
            renderDictionaryTable(dic.vetabledic, TranslateController.getInstance().vie_eng);
        }
    }

    private void renderDictionaryTable(javax.swing.JTable table, Map<String, Word> map) {
        DefaultTableModel defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        defaultTableModel.addColumn("Word");
        defaultTableModel.addColumn("Meaning");

        Iterator<Map.Entry<String, Word>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Word> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue().getMeaning();
            defaultTableModel.addRow(new String[] { key, value });
        }
        table.setModel(defaultTableModel);
    }

    private void evTableSelectionRow() {
        ListSelectionModel listSelectionEvent = dic.evtabledic.getSelectionModel();
        listSelectionEvent.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        listSelectionEvent.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int[] rows = dic.evtabledic.getSelectedRows();
                if (rows.length == 0)
                    return;
                String word = String.valueOf(dic.evtabledic.getValueAt(rows[0], 0));
                String meaning = String.valueOf(dic.evtabledic.getValueAt(rows[0], 1));
                dic.evworddic.setText(word);
                dic.evmeaningdic.setText(meaning);
            }
        });
    }

    private void veTableSelectionRow() {
        ListSelectionModel listSelectionEvent = dic.vetabledic.getSelectionModel();
        listSelectionEvent.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        listSelectionEvent.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int[] rows = dic.vetabledic.getSelectedRows();
                if (rows.length != 0) {
                    String word = String.valueOf(dic.vetabledic.getValueAt(rows[0], 0));
                    String meaning = String.valueOf(dic.vetabledic.getValueAt(rows[0], 1));
                    dic.veworddic.setText(word);
                    dic.vemeandic.setText(meaning);
                }
            }
        });
    }

    private void addevButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (dic.evworddic.getText().equals("") || dic.evmeaningdic.getText().equals("")) {
            JOptionPane.showMessageDialog(dic, "Cannot add empty data", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String word = dic.evworddic.getText();
        String meaning = dic.evmeaningdic.getText();
        if (TranslateController.getInstance().eng_vie.containsKey(word)) {
            JOptionPane.showMessageDialog(dic, "This word already exists", "Error", JOptionPane.ERROR_MESSAGE);
            dic.evworddic.setText("");
            dic.evmeaningdic.setText("");
            return;
        }
        TranslateController.getInstance().eng_vie.put(word, new Word(word, meaning));
        JOptionPane.showMessageDialog(dic, "Add the word success", "Success", JOptionPane.INFORMATION_MESSAGE);
        dic.evworddic.setText("");
        dic.evmeaningdic.setText("");
        dic.evtabledic.setModel(new DefaultTableModel());
        renderDictionaryTable(dic.evtabledic, TranslateController.getInstance().eng_vie);
    }

    private void addveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (dic.veworddic.getText().equals("") || dic.vemeandic.getText().equals("")) {
            JOptionPane.showMessageDialog(dic, "Cannot add empty data", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String word = dic.veworddic.getText();
        String meaning = dic.vemeandic.getText();
        if (TranslateController.getInstance().vie_eng.containsKey(word)) {
            JOptionPane.showMessageDialog(dic, "This word already exists", "Error", JOptionPane.ERROR_MESSAGE);
            dic.veworddic.setText("");
            dic.vemeandic.setText("");
            return;
        }
        TranslateController.getInstance().vie_eng.put(word, new Word(word, meaning));
        JOptionPane.showMessageDialog(dic, "Add the word success", "Success", JOptionPane.INFORMATION_MESSAGE);
        dic.veworddic.setText("");
        dic.vemeandic.setText("");
        dic.vetabledic.setModel(new DefaultTableModel());
        renderDictionaryTable(dic.vetabledic,
                TranslateController.getInstance().vie_eng);
    }

    private void deleteevButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (dic.evworddic.getText().equals("") || dic.evmeaningdic.getText().equals("")) {
            JOptionPane.showMessageDialog(dic, "Data must be selected to be deleted", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String word = dic.evworddic.getText();
        if (!TranslateController.getInstance().eng_vie.containsKey(word)) {
            JOptionPane.showMessageDialog(dic, "There is no such word in the dictionary", "Warn",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            TranslateController.getInstance().eng_vie.remove(word);
            JOptionPane.showMessageDialog(dic, "Delete word successfully", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            dic.evtabledic.setModel(new DefaultTableModel());
            renderDictionaryTable(dic.evtabledic, TranslateController.getInstance().eng_vie);
        }
        dic.evmeaningdic.setText("");
        dic.evworddic.setText("");
    }

    private void deleteveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (dic.vemeandic.getText().equals("") || dic.veworddic.getText().equals("")) {
            JOptionPane.showMessageDialog(dic, "Data must be selected to be deleted", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String word = dic.veworddic.getText();
        if (!TranslateController.getInstance().vie_eng.containsKey(word)) {
            JOptionPane.showMessageDialog(dic, "There is no such word in the dictionary", "Warn",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            TranslateController.getInstance().vie_eng.remove(word);
            JOptionPane.showMessageDialog(dic, "Delete word successfully", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            dic.vetabledic.setModel(new DefaultTableModel());
            renderDictionaryTable(dic.vetabledic, TranslateController.getInstance().vie_eng);
        }
        dic.veworddic.setText("");
        dic.vemeandic.setText("");
    }

    private void editevButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (dic.evworddic.getText().equals("") || dic.evmeaningdic.getText().equals("")) {
            JOptionPane.showMessageDialog(dic, "Cannot edit blank data", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String word = dic.evworddic.getText();
        String meaning = dic.evmeaningdic.getText();
        if (TranslateController.getInstance().eng_vie.containsKey(word)
                && TranslateController.getInstance().eng_vie.get(word).getMeaning().equals(meaning)) {
            JOptionPane.showMessageDialog(dic, "This word is already in the dictionary", "Warn",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        int[] rows = dic.evtabledic.getSelectedRows();
        String currentWord = String.valueOf(dic.evtabledic.getValueAt(rows[0], 0));
        if (!TranslateController.getInstance().eng_vie.containsKey(currentWord)) {
            JOptionPane.showMessageDialog(dic, "This word is already in the dictionary", "Warn",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        TranslateController.getInstance().eng_vie.remove(currentWord);
        TranslateController.getInstance().eng_vie.put(word, new Word(word, meaning));
        JOptionPane.showMessageDialog(dic, "Modified word successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        dic.evworddic.setText("");
        dic.evmeaningdic.setText("");
        dic.evtabledic.setModel(new DefaultTableModel());
        renderDictionaryTable(dic.evtabledic, TranslateController.getInstance().eng_vie);
    }

    private void editveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (dic.vemeandic.getText().equals("") || dic.veworddic.getText().equals("")) {
            JOptionPane.showMessageDialog(dic, "Cannot edit blank data", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String word = dic.veworddic.getText();
        String meaning = dic.vemeandic.getText();
        if (TranslateController.getInstance().vie_eng.containsKey(word)
                && TranslateController.getInstance().vie_eng.get(word).getMeaning().equals(meaning)) {
            JOptionPane.showMessageDialog(dic, "This word is already in the dictionary", "Warn",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        int[] rows = dic.vetabledic.getSelectedRows();
        String currentWord = String.valueOf(dic.vetabledic.getValueAt(rows[0], 0));
        if (!TranslateController.getInstance().vie_eng.containsKey(currentWord)) {
            JOptionPane.showMessageDialog(dic, "This word is already in the dictionary", "Warn",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        TranslateController.getInstance().vie_eng.remove(currentWord);
        TranslateController.getInstance().vie_eng.put(word, new Word(word, meaning));
        JOptionPane.showMessageDialog(dic, "Modified word successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        dic.vemeandic.setText("");
        dic.veworddic.setText("");
        dic.vetabledic.setModel(new DefaultTableModel());
        renderDictionaryTable(dic.vetabledic, TranslateController.getInstance().vie_eng);
    }

}

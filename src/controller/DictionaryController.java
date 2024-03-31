package controller;

import java.util.Iterator;
import java.util.Map;

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
        renderDictionaryTable(dic.evtabledic, TranslateController.eng_vie);
        // state tabbed change
        dic.jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        veTableSelectionRow();
        evTableSelectionRow();

    }

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {
        int index = dic.jTabbedPane1.getSelectedIndex();
        if (index == 0) {
            renderDictionaryTable(dic.evtabledic, TranslateController.eng_vie);
        } else if (index == 1) {
            renderDictionaryTable(dic.vetabledic, TranslateController.vie_eng);
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
                String word = String.valueOf(dic.vetabledic.getValueAt(rows[0], 0));
                String meaning = String.valueOf(dic.vetabledic.getValueAt(rows[0], 1));
                dic.veworddic.setText(word);
                dic.vemeandic.setText(meaning);
            }
        });
    }

}

package controller;

import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

import UI.HistoryUI;
import model.Date;
import utils.DateHandle;
import utils.Debounce;
import javax.swing.event.DocumentEvent;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class HistoryController {
    private boolean fromCheck = true;
    private boolean toCheck = true;
    private static HistoryController instance = null;
    private HistoryUI his = null;

    public static HistoryController getInstance() {
        if (instance == null) {
            instance = new HistoryController();
        }
        return instance;
    }

    private HistoryController() {
        init();

    }

    private void init() {
        his = new HistoryUI();
        Debounce debounce = new Debounce();
        his.fromText.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                debounce.debounce(Void.class, new Runnable() {
                    @Override
                    public void run() {
                        handleFromText();
                    }
                }, 200, TimeUnit.MILLISECONDS);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                insertUpdate(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        his.toText.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                debounce.debounce(Void.class, new Runnable() {
                    @Override
                    public void run() {
                        handleToText();
                        if (his.fromText.getText().equals("") && his.toText.getText().equals(""))
                            renderHistoryTable();
                    }
                }, 200, TimeUnit.MILLISECONDS);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                insertUpdate(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        his.searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
    }

    public void setVisible(boolean isState) {
        his.setVisible(isState);
        his.setLocationRelativeTo(null);
        renderHistoryTable();
    }

    private void renderHistoryTable() {
        DefaultTableModel defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };
        defaultTableModel.addColumn("Date(dd/mm/yyyy)");
        defaultTableModel.addColumn("Word");
        defaultTableModel.addColumn("Times");

        for (Date key : TranslateController.getInstance().hisMap.keySet()) {
            for (String word : TranslateController.getInstance().hisMap.get(key).keySet())
                defaultTableModel.addRow(
                        new Object[] { key, word, TranslateController.getInstance().hisMap.get(key).get(word) });
        }

        his.viewTable.setModel(defaultTableModel);
    }

    private void handleFromText() {
        String from = his.fromText.getText();
        if (from.equals("")) {
            his.fromState.setText("");
            fromCheck = false;
            return;
        }

        if (!DateHandle.checkDate(from)) {
            his.fromState.setText("Please enter the correct format (dd/mm/yyyy)");
            his.fromState.setFont(new java.awt.Font("MesloLGM Nerd Font", 2, 8));
            his.fromState.setForeground(new java.awt.Color(255, 0, 0));
            fromCheck = false;
        } else {
            his.fromState.setText("Exactly");
            his.fromState.setForeground(new java.awt.Color(0, 255, 0));
            his.fromState.setFont(new java.awt.Font("MesloLGM Nerd Font", 2, 12));
            fromCheck = true;
        }
    }

    private void handleToText() {

        String to = his.toText.getText();
        if (to.equals("")) {
            his.toState.setText("");
            toCheck = false;
            return;
        }

        if (!DateHandle.checkDate(to)) {
            his.toState.setText("Please enter the correct format (dd/mm/yyyy)");
            his.toState.setForeground(new java.awt.Color(255, 0, 0));
            his.fromState.setFont(new java.awt.Font("MesloLGM Nerd Font", 2, 8));
            toCheck = false;
        } else {
            his.toState.setText("Exactly");
            his.toState.setForeground(new java.awt.Color(0, 255, 0));
            his.fromState.setFont(new java.awt.Font("MesloLGM Nerd Font", 2, 12));
            toCheck = true;
        }

        if (DateHandle.compareDate(his.fromText.getText(), his.toText.getText())) {
            his.fromState.setText("Exactly");
            his.fromState.setForeground(new java.awt.Color(0, 255, 0));
            his.fromState.setFont(new java.awt.Font("MesloLGM Nerd Font", 2, 12));
            fromCheck = true;
        }

    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        boolean isCheck = true;
        if (his.fromText.getText().equals("") && his.toText.getText().equals(""))
            renderHistoryTable();
        if (his.fromText.getText().equals("")) {
            his.fromState.setText("Please enter a start date");
            his.fromState.setForeground(new java.awt.Color(255, 0, 0));
            his.fromState.setFont(new java.awt.Font("MesloLGM Nerd Font", 2, 9));

            isCheck = false;
        }

        if (his.toText.getText().equals("")) {

            his.toState.setText("Please enter the following date");
            his.toState.setForeground(new java.awt.Color(255, 0, 0));
            his.toState.setFont(new java.awt.Font("MesloLGM Nerd Font", 2, 9));

            isCheck = false;
        }

        // if()

        if (isCheck == false)
            return;

        if (!DateHandle.compareDate(his.fromText.getText(), his.toText.getText())) {
            his.fromState.setText("To must be lower than from");
            his.fromState.setForeground(new java.awt.Color(255, 0, 0));
            his.fromState.setFont(new java.awt.Font("MesloLGM Nerd Font", 2, 9));

            his.toState.setText("To must be lower than from");
            his.toState.setForeground(new java.awt.Color(255, 0, 0));
            his.toState.setFont(new java.awt.Font("MesloLGM Nerd Font", 2, 9));

            fromCheck = false;
            toCheck = false;
        } else {
            fromCheck = true;
            toCheck = true;
        }

        if (fromCheck && toCheck) {
            his.viewTable.setModel(new DefaultTableModel());
            DefaultTableModel defaultTableModel = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int r, int c) {
                    return false;
                }
            };
            defaultTableModel.addColumn("Date(dd/mm/yyyy)");
            defaultTableModel.addColumn("Word");
            defaultTableModel.addColumn("Times");
            Iterator<Map.Entry<Date, Map<String, Integer>>> iterator = TranslateController.getInstance().hisMap
                    .entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Date, Map<String, Integer>> outerEntry = iterator.next();
                Date date = outerEntry.getKey();
                if (DateHandle.compareDate(his.fromText.getText(), date.toString())
                        && DateHandle.compareDate(date.toString(), his.toText.getText())) {
                    System.out.println(date);
                    Map<String, Integer> innerMap = outerEntry.getValue();
                    for (Map.Entry<String, Integer> entry : innerMap.entrySet()) {
                        String key = entry.getKey();
                        Integer value = entry.getValue();
                        defaultTableModel.addRow(new Object[] { date, key, value });
                    }
                }
            }
            his.viewTable.setModel(defaultTableModel);
        }

    }

}

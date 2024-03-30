package controller;

import utils.Debounce;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.swing.event.DocumentListener;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import UI.TranslateUI;
import model.Word;
import services.Data;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;

public class TranslateController {
    public Map<String, Word> eng_vie = null;
    public Map<String, Word> vie_eng = null;
    public Map<String, Word> trans = null;
    public TranslateUI tlUI = null;

    public TranslateController() {
        tlUI = TranslateUI.getTranslateInstance();
        tlUI.setVisible(true);
        tlUI.setLocationRelativeTo(null);
        init();
    }

    private void init() {
        // Load data
        try {
            eng_vie = Data.getData("src/assets/Anh_Viet.xml");
            vie_eng = Data.getData("src/assets/Viet_Anh.xml");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        tlUI.inputText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputTextMouseClicked(evt, tlUI.jPanel3, tlUI.inputOption);
            }
        });

        final Debounce debounce = new Debounce();
        handleTranslate(tlUI.inputText, tlUI.outputText, debounce, this);

    }

    private void handleTranslate(javax.swing.JTextArea inputText, javax.swing.JTextArea outputText, Debounce debounce,
            TranslateController tlHDUI) {
        inputText.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                debounce.debounce(Void.class, new Runnable() {
                    @Override
                    public void run() {

                        String input = inputText.getText();
                        if (input.isEmpty()) {
                            outputText.setText("");
                        } else {

                            if (String.valueOf(tlUI.inputOption.getSelectedItem()).equals("English")) {
                                tlHDUI.trans = tlHDUI.eng_vie;
                                Word word = trans.get(input);
                                outputText.setText(word.getMeaning());
                            } else if (String.valueOf(tlUI.inputOption.getSelectedItem()).equals("Vietnamese")) {
                                tlHDUI.trans = tlHDUI.vie_eng;
                                Word word = trans.get(input);
                                outputText.setText(word.getMeaning());
                            } else {
                                JOptionPane.showMessageDialog(tlUI.jPanel3, "Please select language", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                            }

                        }
                    }
                }, 500, TimeUnit.MILLISECONDS);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                insertUpdate(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

    }

    private void inputTextMouseClicked(java.awt.event.MouseEvent evt, JPanel jPanel3, JComboBox<String> inputOption) {
        if (inputOption.getSelectedItem().equals("Select Language")) {
            JOptionPane.showMessageDialog(jPanel3, "Please select language", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

}
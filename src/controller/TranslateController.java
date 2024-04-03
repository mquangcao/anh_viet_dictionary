package controller;

import utils.Debounce;

import utils.Helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import UI.TranslateUI;
import model.Word;
import services.Data;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;

public class TranslateController {
    private static TranslateController instance = null;

    public static TranslateController getInstance() {
        if (instance == null) {
            instance = new TranslateController();
        }
        return instance;
    }

    public Map<String, Word> eng_vie = null;
    public Map<String, Word> vie_eng = null;
    public Map<String, Word> trans = null;
    public Set<String> favoriteEv = null;
    public Set<String> favoriteVe = null;
    public TranslateUI tlUI = null;

    private TranslateController() {
        tlUI = new TranslateUI("Translate");
        tlUI.setVisible(true);
        tlUI.setLocationRelativeTo(null);
        init();
        loadFavoriteEv();
        loadFavoriteVe();

        tlUI.likeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likeButtonActionPerformed(evt);
            }
        });

        tlUI.dislikeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dislikeButtonActionPerformed(evt);
            }
        });

        tlUI.FavoriteWordsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FavoriteWordsMenuItemActionPerformed(evt);
            }
        });

        tlUI.HistoryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryMenuItemActionPerformed(evt);
            }
        });
    }

    private void HistoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        HistoryController.getInstance().setVisible(true);
    }

    private void likeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (tlUI.inputOption.getSelectedItem().equals("English")) {
            favoriteEv.add(tlUI.inputText.getText());
            tlUI.inputText.setText("");
            tlUI.outputText.setText("");
            clearRecommendList(tlUI.recommendList);
            JOptionPane.showMessageDialog(tlUI, "Added word to favorites list successfully", "Successfully",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        favoriteVe.add(tlUI.inputText.getText());
        tlUI.inputText.setText("");
        tlUI.outputText.setText("");
        clearRecommendList(tlUI.recommendList);
        JOptionPane.showMessageDialog(tlUI, "Added word to favorites list successfully", "Successfully",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void dislikeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (tlUI.inputOption.getSelectedItem().equals("English")) {
            favoriteEv.remove(tlUI.inputText.getText());
            tlUI.inputText.setText("");
            tlUI.outputText.setText("");
            clearRecommendList(tlUI.recommendList);
            JOptionPane.showMessageDialog(tlUI, "Successfully removed word from favorites list", "Successfully",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        favoriteVe.remove(tlUI.inputText.getText());
        tlUI.inputText.setText("");
        tlUI.outputText.setText("");
        clearRecommendList(tlUI.recommendList);
        JOptionPane.showMessageDialog(tlUI, "Successfully removed word from favorites list", "Successfully",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void setOnButtonLike() {
        tlUI.likeButton.setEnabled(true);
        tlUI.dislikeButton.setEnabled(false);
    }

    private void setOffButtonLike() {
        tlUI.likeButton.setEnabled(false);
        tlUI.dislikeButton.setEnabled(true);
    }

    private void setOffAllButton() {
        tlUI.likeButton.setEnabled(false);
        tlUI.dislikeButton.setEnabled(false);
    }

    private void loadFavoriteEv() {
        favoriteEv = new HashSet<>();
        favoriteEv.add("a");

        String filePath = "./src/assets/favoriteEv.txt";
        try {
            FileReader fileReader = new FileReader(filePath);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                favoriteEv.add(line);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFavoriteVe() {
        favoriteVe = new HashSet<>();
        String filePath = "./src/assets/favoriteVe.txt";
        try {
            FileReader fileReader = new FileReader(filePath);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                favoriteEv.add(line);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
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
        handleTranslate(tlUI.inputText, tlUI.outputText, debounce, this, 300);

        // recommend select
        selectionItemJList(tlUI.recommendList, tlUI.inputText, tlUI.outputText);

        tlUI.DictionaryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DictionaryMenuItemActionPerformed(evt);
            }
        });

    }

    private void handleTranslate(javax.swing.JTextArea inputText, javax.swing.JTextArea outputText, Debounce debounce,
            TranslateController tlHDUI, int ms) {
        inputText.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                debounce.debounce(Void.class, new Runnable() {
                    @Override
                    public void run() {
                        String input = inputText.getText();
                        if (input.isEmpty()) {
                            outputText.setText("");
                            clearRecommendList(tlUI.recommendList);
                            setOffAllButton();
                        } else {
                            if (String.valueOf(tlUI.inputOption.getSelectedItem()).equals("English")) {
                                tlHDUI.trans = tlHDUI.eng_vie;
                                if (trans.containsKey(input)) {
                                    Word word = trans.get(input);
                                    outputText.setText(word.getMeaning());
                                    setRecommendList(Helper.recommendWords(input, eng_vie), tlUI.recommendList);
                                    if (favoriteEv.contains(word.getWord())) {
                                        setOffButtonLike();
                                    } else {
                                        setOnButtonLike();
                                    }
                                } else {
                                    outputText.setText("");
                                    setOffAllButton();
                                }

                            } else if (String.valueOf(tlUI.inputOption.getSelectedItem()).equals("Vietnamese")) {
                                tlHDUI.trans = tlHDUI.vie_eng;
                                if (trans.containsKey(input)) {
                                    Word word = trans.get(input);
                                    outputText.setText(word.getMeaning());
                                    setRecommendList(Helper.recommendWords(input, vie_eng), tlUI.recommendList);
                                    if (favoriteVe.contains(word.getWord())) {
                                        setOffButtonLike();
                                    } else {
                                        setOnButtonLike();
                                    }
                                } else {
                                    outputText.setText("");
                                    setOffAllButton();
                                }

                            } else {
                                JOptionPane.showMessageDialog(tlUI.jPanel3, "Please select language", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                setOffAllButton();
                            }

                        }
                    }
                }, ms, TimeUnit.MILLISECONDS);
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

    private void setRecommendList(ArrayList<String> recommendList, JList<String> list) {
        DefaultListModel<String> defaultListModel = new DefaultListModel<>();
        for (String word : recommendList) {
            defaultListModel.addElement(word);
        }
        list.setModel(defaultListModel);
    }

    private void clearRecommendList(JList<String> list) {
        list.setModel(new DefaultListModel<>());
    }

    private void selectionItemJList(JList<String> jList, JTextArea inputText, JTextArea outputText) {
        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedValue = jList.getSelectedValue();
                    if (selectedValue != null) {
                        inputText.setText(selectedValue);
                        Word word = null;
                        if (String.valueOf(tlUI.inputOption.getSelectedItem()).equals("English")) {
                            word = eng_vie.get(selectedValue);
                            outputText.setText(word.getMeaning());
                            if (favoriteEv.contains(word.getWord())) {
                                setOffButtonLike();
                            } else
                                setOnButtonLike();

                        } else {
                            word = vie_eng.get(selectedValue);
                            outputText.setText(word.getMeaning());
                            if (favoriteVe.contains(word.getWord())) {
                                setOffButtonLike();
                            } else
                                setOnButtonLike();
                        }

                    }

                }
            }
        });
    }

    private void DictionaryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        DictionaryController.getInstance().setVisible(true);
    }

    private void FavoriteWordsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        WordLikeListController.getInstance().loadTableData(true);
        WordLikeListController.getInstance().setVisible(true);
    }

}

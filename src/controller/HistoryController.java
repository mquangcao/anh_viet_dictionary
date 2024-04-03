package controller;

import UI.HistoryUI;

public class HistoryController {
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
    }

    public void setVisible(boolean isState) {
        his.setVisible(isState);
        his.setLocationRelativeTo(null);
    }

}

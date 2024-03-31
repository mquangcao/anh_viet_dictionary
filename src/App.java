import controller.*;

public class App {
    public static void main(String[] args) {
        TranslateController.getInstance();
        DictionaryController.getInstance().setVisible(true);
    }
}

import controller.*;
import utils.TXTHandle;
import utils.XMLHandle;

public class App {
    public static void main(String[] args) {

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                XMLHandle.WriteXMLFile("./src/assets/Anh_Viet.xml", TranslateController.getInstance().eng_vie);
                XMLHandle.WriteXMLFile("./src/assets/Viet_Anh.xml", TranslateController.getInstance().vie_eng);
                TXTHandle.TXTWriteFile("./src/assets/favoriteEv.txt", TranslateController.getInstance().favoriteEv);
                TXTHandle.TXTWriteFile("./src/assets/favoriteVe.txt", TranslateController.getInstance().favoriteVe);

            }
        });

        TranslateController.getInstance();
    }
}

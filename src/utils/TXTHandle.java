package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class TXTHandle {
    public static void TXTWriteFile(String file, Set<String> set) {
        FileWriter writer;
        try {
            writer = new FileWriter(file);
            BufferedWriter buffer = new BufferedWriter(writer);
            for (String element : set) {
                buffer.write(element);
                buffer.newLine();
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Success...");
    }

}

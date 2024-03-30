package services;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import model.Word;

public class Data {
    public static Map<String, Word> getData(String path)
            throws ParserConfigurationException,
            SAXException,
            IOException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(path);
        Element record = doc.getDocumentElement();

        NodeList wordList = record.getElementsByTagName("word");
        NodeList meanList = record.getElementsByTagName("meaning");

        Map<String, Word> records = new HashMap<>();
        for (int i = 0; i < wordList.getLength(); i++) {
            Word w = new Word();
            String word = wordList.item(i).getTextContent();
            w.setWord(word);
            String meaning = meanList.item(i).getTextContent();
            if (records.containsKey(word)) {
                meaning += records.get(word).getMeaning();
            }
            w.setMeaning(meaning);
            records.put(w.getWord(), w);
        }
        return records;
    }

}

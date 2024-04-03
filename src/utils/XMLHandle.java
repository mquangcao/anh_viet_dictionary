package utils;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import model.Word;

public class XMLHandle {
    public static void WriteXMLFile(String path, Map<String, Word> map) {
        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            // Tạo root element
            Element root = document.createElement("dictionary");
            document.appendChild(root);

            map.forEach((key, value) -> {
                // Tạo child element
                Element employee = document.createElement("record");
                root.appendChild(employee);

                // Tạo sub-elements cho employee element
                Element word = document.createElement("word");
                word.appendChild(document.createTextNode(key));
                employee.appendChild(word);

                Element meaning = document.createElement("meaning");
                meaning.appendChild(document.createTextNode(value.getMeaning()));
                employee.appendChild(meaning);
            });

            // Tạo transformer để ghi XML file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);

            transformer.setOutputProperty("indent", "yes");

            // Ghi XML file
            StreamResult streamResult = new StreamResult(new FileOutputStream(new File(path)));
            transformer.transform(domSource, streamResult);

            System.out.println("XML file write success");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

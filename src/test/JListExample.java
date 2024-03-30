package test;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");
        JList<String> jList = new JList<>(listModel);

        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Lấy chỉ số của item đã được chọn
                    int selectedIndex = jList.getSelectedIndex();
                    // Lấy giá trị của item đã được chọn
                    String selectedValue = jList.getSelectedValue();
                    // Xử lý sự kiện ở đây
                    System.out.println("Selected Index: " + selectedIndex);
                    System.out.println("Selected Value: " + selectedValue);
                }
            }
        });

        frame.add(new JScrollPane(jList));
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

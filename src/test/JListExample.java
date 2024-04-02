package test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class JListExample {
    public static void main(String[] args) {
        // Khởi tạo một HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Thêm các phần tử vào HashMap
        hashMap.put("b", 2);
        hashMap.put("a", 1);
        hashMap.put("c", 3);
        hashMap.put("ac", 3);

        // In ra HashMap trước khi sắp xếp
        System.out.println("HashMap trước khi sắp xếp: " + hashMap);

        // Tạo một TreeMap và đưa toàn bộ các entry của HashMap vào
        TreeMap<String, Integer> sortedMap = new TreeMap<>(Comparator.reverseOrder());
        sortedMap.putAll(hashMap);

        // In ra TreeMap đã sắp xếp theo key
        System.out.println("TreeMap sau khi sắp xếp: " + sortedMap);
    }
}

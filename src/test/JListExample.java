package test;

import model.*;
import utils.XMLHandle;

import java.util.HashMap;
import java.util.Map;

public class JListExample {
    public static void main(String[] args) {
        // Tạo và đăng ký một shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                // Đoạn mã được thực thi khi chương trình đóng
                System.out.println("Chương trình đang được đóng...");
                // Thực hiện các hoạt động cần thiết trước khi chương trình kết thúc
                // Ví dụ: Đóng kết nối cơ sở dữ liệu, lưu trạng thái, ghi log, v.v.
            }
        });

        // Mô phỏng hoạt động của chương trình
        System.out.println("Chương trình đang chạy...");
        try {
            // Giả lập thời gian hoạt động của chương trình
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Giả lập việc kết thúc chương trình
        System.exit(0);
    }
}
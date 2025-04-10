package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно! —\n" +
                "Вот последняя правда, открытая мной.\n";

        String s = "Hello";

//        FileWriter writer = null;

//        try {
////            writer = new FileWriter("C:\\Users\\skasimov\\Desktop\\new_course_pro-main\\src\\main\\java\\work_with_files\\test1.txt");
//            writer = new FileWriter("src\\main\\java\\work_with_files\\test2.txt");
//            for(int i = 0; i < rubai.length(); i ++) {
//                writer.write(rubai.charAt(i));
//            }
////            writer.write(s);
//            System.out.println("Done!");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            writer.close();
//        }

        try (FileWriter writer = new FileWriter("src\\main\\java\\work_with_files\\test2.txt")) {
            for(int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

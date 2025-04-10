package work_with_files;

import java.io.*;

public class CopyEx2 {

    public static void main(String[] args) {
        try (
                FileInputStream fileInputStream = new FileInputStream("src\\main\\java\\work_with_files\\just_photo.jpg");
                FileOutputStream fileOutputStream = new FileOutputStream("src\\main\\java\\work_with_files\\just_photo2.jpg")
        ) {

            int i;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }

            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

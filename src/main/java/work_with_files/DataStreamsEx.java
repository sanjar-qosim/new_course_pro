package work_with_files;

import java.io.*;

public class DataStreamsEx {

    public static void main(String[] args) {
        try(
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("test4.bin"));
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream("test4.bin"));
                ) {

            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeByte(5);
            dataOutputStream.writeShort(120);
            dataOutputStream.writeInt(500);
            dataOutputStream.writeLong(1_000_000);
            dataOutputStream.writeDouble(123.454);

            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readShort());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readLong());
            System.out.println(dataInputStream.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

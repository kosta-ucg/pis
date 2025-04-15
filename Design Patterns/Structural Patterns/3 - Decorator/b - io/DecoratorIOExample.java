import java.io.*;

public class DecoratorIOExample {
    public static void main(String[] args) {
        try {
            // 1. Osnovni stream - čita bajtove iz fajla
            FileInputStream fileStream = new FileInputStream("example.txt");

            // 2. Dekorator koji dodaje buffering za brže čitanje
            BufferedInputStream bufferedStream = new BufferedInputStream(fileStream);

            // 3. Dekorator koji omogućava čitanje podataka kao int, float, string itd.
            DataInputStream dataStream = new DataInputStream(bufferedStream);

            while (dataStream.available() > 0) {
                int b = dataStream.readByte();
                System.out.print((char) b);
            }

            dataStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.*;

public class ThrowsDemo {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt");
        fr.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println(e+" File not found");
        }
    }
}

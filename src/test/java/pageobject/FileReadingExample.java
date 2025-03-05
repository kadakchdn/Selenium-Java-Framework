package pageobject;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadingExample {

    // Method that declares it throws IOException
    public void readFile(String filePath) throws IOException {
        // FileInputStream is used without a try-catch block
        FileInputStream fis = new FileInputStream(filePath);
      
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        
    }

    public static void main(String[] args) {
        FileReadingExample example = new FileReadingExample();
        try {
            example.readFile("example.txt");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

import java.io.*;

public class Reading {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\RCOEM\\Desktop\\Java.txt");

            int character;
            while ((character = reader.read()) != -1) { 
                System.out.print((char) character); 
            }

            reader.close();

            System.out.println("\nReading Complete"); 
        } catch (IOException e) {
            System.out.println("Some Error Occurred: " + e.getMessage()); 
        }
    }
}

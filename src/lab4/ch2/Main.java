package lab4.ch2;

import lab4.io.Contact;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

    }

    public static void storeContactToFile(String fileName , Contact contact){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

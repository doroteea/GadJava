package lab4.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void storeContactToFile(String fileName , Contact contact){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("C:\\Users\\Doroteea\\IdeaProjects\\JavaGadW1\\src\\lab4\\io\\contacts.txt");
        //System.out.println(phoneBook);
        System.out.println(phoneBook.findContact("Abbey"));
        //storeContactToFile("C:\\Users\\Doroteea\\IdeaProjects\\JavaGadW1\\src\\lab4\\io\\foundContacts.txt");
    }
}

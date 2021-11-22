package lab4.ch3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static String[] getWordsFromFile(String inputFile){
        String[] words = new String[0];
        Scanner s=null;
        try{
            s = new Scanner(new BufferedReader(new FileReader(inputFile)));
            String word;
            while (s.hasNext()){
                int indexWords = words.length+1;
                word = s.next();
                words = Arrays.copyOf(words,indexWords);
                words[indexWords-1] = word;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            if(s!= null) s.close();
        }
        return words;
    }
}

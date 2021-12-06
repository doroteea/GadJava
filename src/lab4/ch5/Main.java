package lab4.ch5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String inputFile = "C:\\Users\\Doroteea\\IdeaProjects\\JavaGadW1\\src\\lab4\\ch5\\in.txt";
    public static void main(String[] args) {
        String[] words = new String[0];
        try {
            words=readFromFile(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

//    private static WordOccurence[] countAppearances(String[] words) {
//        WordOccurence[] differentWords = new WordOccurence[0];
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            WordOccurence wrd;
//            Boolean unique = true;
//            for (WordOccurence wo : differentWords){
//                if(wo.equals(word)){
//                    unique=false;
//                    break;
//                }
//            }
//            if (unique==false) {
//              //  word.plusOcc();
//            } else {
//                differentWords = Arrays.copyOf(differentWords, differentWords.length + 1);
//                differentWords[differentWords.length - 1] = new WordOccurence(word);
//            }
//        }
//       // return uniqueWords;
//    }

    private static String[] readFromFile(String fileName) throws FileNotFoundException {
        String[] words = new String[0];
        Scanner s = null;
        int index = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            while (s.hasNext()) {
                words = Arrays.copyOf(words, words.length + 1);
                words[index++] = s.next();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (s != null) s.close();
        }
        return words;
    }
}

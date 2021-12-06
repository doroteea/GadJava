package lab4.ch4;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class NumberToLCD {

    private static final String inputFile="C:\\Users\\Doroteea\\IdeaProjects\\JavaGadW1\\src\\lab4\\ch4\\in.txt";
    private static final String outputFile="C:\\Users\\Doroteea\\IdeaProjects\\JavaGadW1\\src\\lab4\\ch4\\out.txt";

    public static void main(String[] args) {
        String[] inputNumbers = new String[0];
        try {
            inputNumbers=readFromFile(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(String n : inputNumbers){
            writeToFile(numberFormat(n),n.length());
        }
    }

    private static String[] readFromFile(String fileName) throws FileNotFoundException {
        String[] numbers = new String[0];
        Scanner s = null;
        int index = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            while (s.hasNext()) {
                numbers = Arrays.copyOf(numbers, numbers.length + 1);
                numbers[index++] = s.next();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (s != null) s.close();
        }
        return numbers;
    }

    private static int[][][] numberFormat(String nr) {
        int index = nr.length();
        int[][][] digits = new int[index][3][3];// in seven segment display
        int[][] d0= {{0, 1, 0}, {1, 0, 1}, {1, 1, 1}};
        int[][] d1 = {{0, 0, 0},{0, 0, 1}, {0, 0, 1}};
        int[][] d2 = {{0, 1, 0}, {0, 1, 1}, {1, 1, 0}};
        int[][] d3 = {{0, 1, 0}, {0, 1, 1}, {0, 1, 1}};
        int[][] d4 = {{0, 0, 0}, {1, 1, 1}, {0, 0, 1}};
        int[][] d5 = {{0, 1, 0}, {1, 1, 0}, {0, 1, 1}};
        int[][] d6 = {{0, 1, 0}, {1, 1, 0}, {1, 1, 1}};
        int[][] d7 = {{0, 1, 0}, {0, 0, 1}, {0, 0, 1}};
        int[][] d8 = {{0, 1, 0}, {1, 1, 1}, {1, 1, 1}};
        int[][] d9 = {{0, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        for (int i = 0; i < index; i++) {
            if (nr.charAt(i) == '0') digits[i] = d0;
            else if (nr.charAt(i) == '1') digits[i] = d1;
            else if (nr.charAt(i) == '2') digits[i] = d2;
            else if (nr.charAt(i) == '3') digits[i] = d3;
            else if (nr.charAt(i) == '4') digits[i] = d4;
            else if (nr.charAt(i) == '5') digits[i] = d5;
            else if (nr.charAt(i) == '6') digits[i] = d6;
            else if (nr.charAt(i) == '7') digits[i] = d7;
            else if (nr.charAt(i) == '8') digits[i] = d8;
            else if (nr.charAt(i) == '9') digits[i] = d9;
        }
        return digits;
    }

    private static void writeToFile(int[][][] digits, int index) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
            toLCD(digits, index, bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void toLCD(int[][][] digits, int index, Writer writer) throws IOException {
        try {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < index; i++) {
                    for (int k = 0; k < 3; k++) {
                        if (digits[i][j][k] == 1) {
                            if (k == 1){ writer.write("_");//non middle row
                                System.out.print("_");
                                 }
                            else {writer.write("|");
                                System.out.print("|");}
                        } else {writer.write(" ");
                            System.out.print(" ");
                        }
                    }
                    writer.write(" ");
                    System.out.print(" ");
                }
                writer.write("\n");
                System.out.println();
            }
        } finally {
            if (writer != null) writer.close();
        }
    }

}

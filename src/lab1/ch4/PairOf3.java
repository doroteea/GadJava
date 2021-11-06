package lab1.ch4;

import java.util.ArrayList;
import java.util.Scanner;

public class PairOf3 {

    private static int countPairs(ArrayList<Integer> myArray) {
        int counter = 0;
        ArrayList<Integer> copyList = new ArrayList<>();
        copyList.addAll(myArray);
        for (int i = 0; i <= myArray.size() - 2; i++) {
            for (int j = i; j < myArray.size() - 1; j++) {
                int s = myArray.get(i) + myArray.get(j);
                if (copyList.contains(-s)) {
                    int index = copyList.indexOf(-s);
                    copyList.remove(index);
                    counter++;

                }
            }

        }
        return counter;
    }
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length of the array:");
        int size = scanner.nextInt();
        System.out.println("Elements of the array");
        for(int i=0;i<size;i++){
            myArray.add(scanner.nextInt());
        }
        System.out.println("Number of pairs: " + countPairs(myArray));
    }
}

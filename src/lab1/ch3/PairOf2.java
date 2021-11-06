package lab1.ch3;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class PairOf2 {
    private static int foundPair(ArrayList<Integer> myArray,Integer element){
        for (int i=0;i<myArray.size();i++){
            if(myArray.get(i)+element==0){
                return i;
            }
        }
        return -1;
    }
    private static int countPairs(ArrayList<Integer> myArray){
        int counter=0;
        for (Integer i : new ArrayList<>(myArray)){
            System.out.println("elem: "+ i);
            int index=foundPair(myArray,i);
            if (index!=-1 && i!=0){
                System.out.println(i+ " ," + myArray.get(index));
                myArray.remove(index);
                myArray.remove(i);
                counter++;
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

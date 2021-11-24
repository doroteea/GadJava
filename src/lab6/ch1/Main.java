package lab6.ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void findLeaders(ArrayList<Integer> numbers){
        int max = numbers.get(numbers.size()-1);
        System.out.println(max);
        for(int i = numbers.size()-2; i>=0 ; i-- ){
            if(max < numbers.get(i)){
                max = numbers.get(i);
                System.out.println(max);
            }
        }
    }

    public static void findLeaders2(ArrayList<Integer> numbers){
        Collections.reverse(numbers);
        int max = numbers.get(0);
        System.out.println(max);
        for(Integer currentNumber : numbers ){
            if(max < currentNumber){
                max = currentNumber;
                System.out.println(max);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<> (Arrays.asList(11,5,3,1,2));
        findLeaders(integers);
        findLeaders2(integers);

    }
}

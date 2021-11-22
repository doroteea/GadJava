package lab3.ch1;

public class ArrayCustomIterator {

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
    }

    int arr[] ;
    int index;
    boolean hasNext(){
        index++;
        if(index>arr.length){
            return false;
        }
        return true;
    }
    int next(){
        int i = index-1;
        return arr[i];
    }
}

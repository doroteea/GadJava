package lab3.ch4;

import java.util.Arrays;

public class Teacher implements ObservedSubject{
    Observer[] students = new Observer[0];
    @Override
    public void register(Observer obj) {
        int len = students.length+1;
        students = Arrays.copyOf(students,len);
        students[len-1] = obj;
    }

    @Override
    public void unregister(Observer obj) {
        Observer[] anotherArray = new Observer[students.length - 1];
        for(int i=0,k=0;i<students.length;i++){
            if(students[i]!=obj){
                anotherArray[k++] = students[i];
            }
        }
        students = Arrays.copyOf(anotherArray,anotherArray.length);
    }

    @Override
    public void notifyObservers(String message) {
        for(int i=0;i<students.length;i++){
            students[i].update(message);
        }
    }

    public void teach(String message){
        for(int i=0;i<students.length;i++){
            students[i].update(message);
        }
    }
}

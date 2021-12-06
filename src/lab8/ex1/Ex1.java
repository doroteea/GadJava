package lab8.ex1;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
    static java.util.Optional<Integer> getTopStudent(List<Student> students){
        return students.stream()
                .filter((Student s) -> s.getGradYear() == 2011 )
                .map((Student s) -> s.getScore())
                .max(Integer::compareTo);
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("S1",2011,9),
                new Student("S2",2011,8),
                new Student("S3",2012,10));
        System.out.println(getTopStudent(students));
    }
}

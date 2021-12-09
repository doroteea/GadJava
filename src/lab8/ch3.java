package lab8;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ch3 {
    public static List<String> ex2(List<String> words){
      return words.stream()
              .filter(s->s.length()%2==0)
              .collect(Collectors.toList());
    }
    private static List<String> ex3(List<String> words) {
        return words.stream()
                        .map(w -> w.toUpperCase())
                                .collect(Collectors.toList());

    }
    private static List<String> ex4(List<String> words) {
        return words.stream()
                .map(w -> w.toUpperCase())
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        //List<String> res=ex2(Arrays.asList("abc","cder","u","1234"));
        List<String> res=ex3(Arrays.asList("abc","cder","u","1234"));
        System.out.println(res);
    }
}

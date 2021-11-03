package lab1.ch2;

public class FooBar {
    public static String fooBarQuiz(int num){
        String toReturn = "";
        if(num%3==0){
            toReturn = toReturn + "Foo";
        }
        if(num%5==0){
            toReturn = toReturn + "Bar";
        }
        if(num%7==0){
            toReturn += "Qix";
        }
        String s=String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='3'){
                toReturn = toReturn + "Foo";
            }
            if(s.charAt(i)=='5'){
                toReturn = toReturn + "Bar";
            }
            if(s.charAt(i)=='7'){
                toReturn = toReturn + "Qix";
            }
        }
        if(toReturn==""){
            toReturn+=""+num;
        }
        return toReturn;
    }

    public static void main(String[] args) {
        FooBar fb = new FooBar();

        for(int i=1; i<=53;i++){
        System.out.println(i+" "+fb.fooBarQuiz(i));}
    }
}

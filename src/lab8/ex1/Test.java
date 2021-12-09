package lab8.ex1;

public class Test {
    private int j;
    public int testLambda(){
        //this = new Object(); -> cannot do this
        int i=0;
        j++;
        Runnable r = () -> {
            System.out.println(i);
            System.out.println(this.j);

        };
        r.run();
        return i;
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.testLambda();
        System.out.println(test);
    }
}

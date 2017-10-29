package example1;

/**
 * Created by zhaojin on 10/29/17.
 */
public class Main {
    public static void main(String[] args) {
        MyIntegerCalculator myIntegerCalculator = (s1) -> s1 * 2;

        System.out.println("1- Result x2 : " + myIntegerCalculator.calcIt(5));

    }
}

interface MyIntegerCalculator {

    public Integer calcIt(int s1);

}

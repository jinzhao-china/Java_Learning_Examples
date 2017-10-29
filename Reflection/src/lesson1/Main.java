package lesson1;

/**
 * Created by zhaojin on 10/29/17.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        TestReflect testReflect = new TestReflect();
        System.out.println(testReflect.getClass().getName());
        // 结果 net.xsoftlab.baike.TestReflect
    }
}

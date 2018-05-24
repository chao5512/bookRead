package src.test;

/**
 * Created by wangchao on 2018/4/12.
 */
public class Singleton2{
    public static int value1;
    public static int value2 = 0;
    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2(){
        System.out.println("构造了一个singleton2");
        value1++;
        value2++;
    }

    public static Singleton2 getInstance2(){
        return singleton2;
    }

}

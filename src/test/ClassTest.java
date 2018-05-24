package src.test;

import org.junit.Test;

/**
 * Created by wangchao on 2018/4/12.
 */
public class ClassTest {
    @Test
    public void testClassInit() {
//        Singleton singleton = Singleton.getInstance();
//        System.out.println("Singleton1 value1:" + singleton.value1);
        System.out.println("Singleton1 value2:" + Singleton.value2);

        Singleton2 singleton2 = Singleton2.getInstance2();
        System.out.println("Singleton2 value1:" + singleton2.value1);
        System.out.println("Singleton2 value2:" + singleton2.value2);
    }

}

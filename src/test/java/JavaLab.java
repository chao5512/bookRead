import org.junit.Test;

/**
 * Created by wangchao on 2018/3/2.
 */
public class JavaLab {
    /**
     * final 关键字修饰属性的测试
     * a==c是因为 final b的值在编译期已经确切知道
     */
    @Test
    public void testFinal(){
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println((a == c));
        System.out.println((a == e));
        System.out.println(a.equals(e));
    }
    @Test
    public void testDiff(){
        MyClass a = new MyClass();
        MyClass b = new MyClass();
        System.out.println(a.i);
        System.out.println(b.i);
        System.out.println(a.j);
        System.out.println(b.j);
    }

    /**
     * 整形溢出的问题
     */
    @Test
    public void testAbs(){
        System.out.println(Math.abs(-2147483647));
        System.out.println(Math.abs(-2147483648));
    }

    /**
     * 1/0会抛出java.lang.ArithmeticException: / by zero 异常
     * 1.0/0.0会得到无穷大
     */
    @Test
    public void testdZero(){
        System.out.println(1/0);
        System.out.println(1.0/0.0);
    }
    /**
     * 负数的除、余
     * (a/b)*b+a%b=a
     */
    @Test
    public void testLeft(){
        System.out.println(-14%3);
        System.out.println(14%-3);
    }

    /**
     * for循环和while的区别，while结束后递增变量可用
     */
    @Test
    public void testWhile(){
        int x=10;
        while (x>0){
            x--;
        }
        System.out.println(x);
        int y =10;
        for (y=10;y>0;y--){

        }
        System.out.println(y);
    }
    @Test
    public void testIf(){
        if(1<2) System.out.println(1);
        else System.out.println(2);
    }
}
class MyClass{
    public final double i = Math.random();
    //static修饰的类成员变量只保留一份副本，所以当前类的不同实例的j的值相同
    public static double j = Math.random();
}

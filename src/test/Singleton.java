package src.test;

/**
 * Created by wangchao on 2018/4/12.
 */
class Singleton{
    //静态变量只在类初始化的时候加载一次
//    private static Singleton singleton = new Singleton();
//    public static int value1;
    public static final int value2 = 0;
    static {
        System.out.println("zoule");
    }

    private Singleton(){
//        value1++;
//        value2++;
        System.out.println("构造了一个singleton"+value2);
    }

//    public static Singleton getInstance(){
//        return singleton;
//    }

}



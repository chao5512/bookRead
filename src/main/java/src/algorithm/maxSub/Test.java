package src.algorithm.maxSub;

import pattern.iterator.chaosCollection.Iterator;

/**
 * Created by wangchao on 2018/4/19.
 */
public class Test {
    int[] a = {1,-2,3,10,-4,7,2,-5};
    @org.junit.Test
    public void testExhaust() {
        FindMaxSub t1 = new T1();
        System.out.println(t1.maxSub(a,0,a.length-1));
    }
    @org.junit.Test
    public void testPartition(){
        FindMaxSub t1 = new T2();
        System.out.println(t1.maxSub(a,0,a.length-1));
    }
    @org.junit.Test
    public void testAnalysis(){
        FindMaxSub t1 = new T7();
        System.out.println(t1.maxSub(a,0,a.length-1));
    }
    @org.junit.Test
    public void testBigData(){
        FindMaxSub t1 = new T1();
        FindMaxSub t2 = new T2();
        FindMaxSub t3 = new T3();
        FindMaxSub t4 = new T6();
        int length = 10000;
        int[] ints = t1.makeArray(length, 50);
//        for (int anInt : ints) {
//            System.out.print(anInt+",");
//        }
        System.out.println();
        long s1 = System.currentTimeMillis();
        System.out.println(t1.maxSub(ints,0,ints.length-1));
        long s2 = System.currentTimeMillis();
        System.out.println(t2.maxSub(ints,0,ints.length-1));
        long s3 = System.currentTimeMillis();
//        System.out.println(t3.maxSub(ints,0,ints.length-1));
        long s4 = System.currentTimeMillis();
        System.out.println(t4.maxSub(ints,0,ints.length-1));
        long s5 = System.currentTimeMillis();

        System.out.println("数据长度为："+length);
        System.out.println("暴力法时间："+(s2-s1));
        System.out.println("分治法时间："+(s3-s2));
        System.out.println("分析法时间(修正后的T5)："+(s5-s4));


    }
    @org.junit.Test
    public void testT5(){
        int [] a = {19,-33,15,-1,0,17,-37,-30,-21,3,4,-21,14,-39,-1,23,34,47,-38,2};
        T1 t1 = new T1();
        FindMaxSub t5 = new T7();
        System.out.println(t1.maxSub(a,0,a.length-1));
        System.out.println(t5.maxSub(a,0,a.length-1));
    }
}

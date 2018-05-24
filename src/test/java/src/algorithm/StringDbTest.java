package src.algorithm;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangchao on 2018/1/26.
 */
public class StringDbTest {
    StringDB stringDB;
    /*
    Q:成员变量的初始化时机
    A:成员变量会在构造方法调用前被初始化
    S:在构造方法中对成员变量进行重新调整
    O:有没有改进的办法？
     */
    @Before
    public void init(){
        stringDB = new StringDB(100);
        String[] strings = stringDB.getAll();
        System.out.println("StringDb的大小为："+strings.length);

        for(int i = 0 ; i < 10 ; i++ ){
            for(int j = 0 ; j < 10 ; j++ ){
                stringDB.add("data"+i);
            }
        }
    }
    /*
    get匹配值的方法
     */
    @Test
    public void test1(){
        System.out.println(stringDB.getByContent("data1").length);
    }

}

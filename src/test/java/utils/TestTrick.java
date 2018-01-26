package utils;

import org.junit.Test;

/**
 * Created by wangchao on 2017/11/9.
 */
public class TestTrick {
    boolean overAllFlag;
    @Test
    public void testBooleanInit(){
//        boolean partFlag;
        boolean partFlag =false;
        System.out.println("全局变量boolean的默认值是  "+overAllFlag);
        //局部变量boolean如果没有显式初始化，在后面直接使用的话会编译期异常
        System.out.println("局部变量boolean未赋值直接使用会报错"+partFlag);
    }
}

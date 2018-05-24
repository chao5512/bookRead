package src.bitTests;

import org.junit.Test;

/**
 * Created by wangchao on 2018/1/30.
 */
public class bitOpration {
    @Test
    public void growTwice(){
        int n = 64;
        n |= n >>> 1;
        System.out.println(n);
        n |= n >>> 2;
        System.out.println(n);
        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;
        System.out.println(n);
    }
}

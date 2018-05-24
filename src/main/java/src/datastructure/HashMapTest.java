package src.datastructure;

import org.junit.Test;

import java.util.HashMap;

/**
 * Created by wangchao on 2018/1/30.
 */
public class HashMapTest {
    @Test
    public void test1(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("k1","v1");
        String put = map.put("k", "v");
        System.out.println(put);
        System.out.println(map.size());
    }
}

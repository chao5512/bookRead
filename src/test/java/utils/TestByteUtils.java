package utils;

import org.junit.Test;

/**
 * Created by wangchao on 2017/11/6.
 */
public class TestByteUtils {
    byte[] A = {0x001,0x002};//,//0x003,0x004,0x004};
    byte[] B = {0x001,0x002};
    byte[] C = {0x002,0x003};
    @Test
    public void testIsContained(){
        boolean isC = ByteUtils.isContained(A, B);
        System.out.println("A的开头是否是B"+isC);

        isC = ByteUtils.isContained(A, C);
        System.out.println("A的开头是否是C"+isC);
    }
    @Test
    public void testBytesToInt(){
        byte[] bytes = new byte[1];
        bytes[0] = -127;
        System.out.println("未与0xFF："+bytes[0]);
        //0xFF是int类型的字面量
        int i = bytes[0] & 0xFF;
        System.out.println("与0xFF："+i);
    }
    @Test
    public void testBytesCompare(){
        int i = src.hbase.Bytes.compareTo(A, 0, A.length, B, 0, B.length);
        System.out.println(i);
    }
    //空位补充零
    @Test
    public void testTillBytes(){
        byte[] bytes = new byte[3];
        for(int i = 0;i<2;i++){
            bytes[i] = A[i];
        }
        System.out.println(bytes[3]);
    }
}

package src.delegate.v2;

import src.delegate.ReadBook;
import src.delegate.ReadBookInterface;
import org.junit.Test;

/**
 * Created by wangchao on 2017/10/26.
 */
public class TestV2 {
    @Test
    public void testRead(){
        ReadBookInterface target = new ReadBook();
        ReadBookProxyFactory readBookProxyFactory = new ReadBookProxyFactory(target);
        ReadBookInterface proxyInstance = (ReadBookInterface)readBookProxyFactory.getProxyInstance();
        proxyInstance.read("数据库系统概念");
    }
}

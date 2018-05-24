package src.jdk;

import pattern.iterator.chaosCollection.ArrayList;

import java.util.Arrays;

/**
 * Arrays包里有一个ArrayList内部类，与真正的ArrayLIst都同样继承了AbstractList。
 所以Arrays产生的Arraylist可以作为真正的ArrayList的构造参数来构造ArrayList
 这么做的好处是既可以扩展ArrayList的构造途径又可以不破坏本身的构造方法组织
 * Created by wangchao on 2018/3/14.
 */
public class TestDemo {
    public void asList(String ... a){
        java.util.ArrayList<String> strings = new java.util.ArrayList<String>(Arrays.asList(a));
        new java.util.ArrayList();
    }
}

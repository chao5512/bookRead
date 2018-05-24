package pattern.proxy;

import pattern.InvacationHandler;

import java.lang.reflect.Method;

/**
 * 获得moveable 的move方法的运行时间
 * Created by wangchao on 2018/3/7.
 */
public class $Proxy1 implements pattern.proxy.test.UserMgr{
    InvacationHandler h;

    public $Proxy1(InvacationHandler h) {
        this.h = h;
    }
    public void addUser() {
        try {
            Method method = pattern.proxy.test.UserMgr.class.getMethod("addUser");
            h.invoke(method);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }}
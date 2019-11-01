/**
 * Company: ALIBABA
 * Author： ZHOUZHIQIANG
 * FileName:HireProxy
 * Time:2019/11/111:25
 * Description:
 */
package dynamic_proxy;

import com.sun.tracing.dtrace.ArgsAttributes;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HireProxy implements InvocationHandler {
    private Object obj;
    public HireProxy(Object obj) {
        super();
        this.obj = obj;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("前置工作");
        Object o1 = method.invoke(obj, objects);
        System.out.println("后置工作");
        return o1;
    }
}

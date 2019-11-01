/**
 * Company: ALIBABA
 * Author： ZHOUZHIQIANG
 * FileName:Client
 * Time:2019/11/111:09
 * Description:
 */
package dynamic_proxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        RealHireHouse rehi = new RealHireHouse();
        HireHouse hireHouse = (HireHouse) Proxy.newProxyInstance(rehi.getClass().getClassLoader(), rehi.getClass().getInterfaces(), new HireProxy(rehi));
        hireHouse.hireHouese();
    }
}

/**
 * Company: ALIBABA
 * Author： ZHOUZHIQIANG
 * FileName:Client
 * Time:2019/11/111:09
 * Description:
 */
package static_proxy;

public class Client {
    public static void main(String[] args) {
        HireHouse hh=new HireHouseProxy(new RealHireHouse());
        hh.hireHouese();
        HireHouse hireHouse=new RealHireHouse();
        hireHouse.hireHouese();
    }
}

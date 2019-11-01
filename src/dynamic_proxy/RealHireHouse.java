/**
 * Company: ALIBABA
 * Author： ZHOUZHIQIANG
 * FileName:RealHireHouse
 * Time:2019/11/111:04
 * Description:
 */
package dynamic_proxy;

public class RealHireHouse implements HireHouse {

    @Override
    public void hireHouese() {
        System.out.println("我要租房子");
    }
}

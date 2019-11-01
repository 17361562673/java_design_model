/**
 * Company: ALIBABA
 * Author： ZHOUZHIQIANG
 * FileName:HireHouseProxy
 * Time:2019/11/111:04
 * Description:
 */
package static_proxy;

public class HireHouseProxy implements HireHouse{
    private RealHireHouse hh;

    public HireHouseProxy(RealHireHouse hh) {
        super();
        this.hh = hh;
    }

    @Override
    public void hireHouese() {
        System.out.println("收中介费");
        hh.hireHouese();
        System.out.println("扣押金");
    }
}

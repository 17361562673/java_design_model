/**
 * Company: ALIBABA
 * Author： ZHOUZHIQIANG
 * FileName:Coffee
 * Time:2019/10/3014:21
 * Description:
 */
package decoration;

public class Coffee implements ICoffee{
    @Override
    public void description() {
        System.out.print("原味咖啡");
    }

    @Override
    public double cost() {
        return 3;
    }
}

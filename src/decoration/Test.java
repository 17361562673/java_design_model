/**
 * Company: ALIBABA
 * Author： ZHOUZHIQIANG
 * FileName:Test
 * Time:2019/10/3014:28
 * Description:
 */
package decoration;

public class Test {
    public static void main(String[] args) {
        ICoffee coffee=new Coffee();
        coffee=new SugarDecorator(coffee);
        System.out.print("描述：");
        coffee.description();
        System.out.println("价格："+coffee.cost());
    }
}

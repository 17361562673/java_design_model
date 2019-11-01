/**
 * Company: ALIBABA
 * Author： ZHOUZHIQIANG
 * FileName:SugarDecorator
 * Time:2019/10/3014:26
 * Description:
 */
package decoration;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public void description() {
        super.description();
         sugarDes();
    }
    public void sugarDes(){
        System.out.println("加糖");
    }

    @Override
    public double cost() {
        return super.cost()+sugarCost();
    }
    public double sugarCost(){
        return 0.5;
    }
}

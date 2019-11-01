/**
 * Company: ALIBABA
 * Author： ZHOUZHIQIANG
 * FileName:CoffeeDecorator
 * Time:2019/10/3014:24
 * Description:
 */
package decoration;

public abstract class CoffeeDecorator implements ICoffee{
        private ICoffee coffee;
        public CoffeeDecorator(ICoffee coffee) {
            this.coffee = coffee;
        }

    @Override
    public void description() {
        coffee.description();
    }

    @Override
    public double cost() {
        return coffee.cost();
    }
}

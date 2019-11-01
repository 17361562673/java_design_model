/**
 * Company: ALIBABA
 * Author： ZHOUZHIQIANG
 * FileName:SingletonDemo
 * Time:2019/10/2917:20
 * Description:
 */
package single;

public class SingletonDemo {
    private SingletonDemo(){

    }
    private static  SingletonDemo singletonDemo=new SingletonDemo();
    public static SingletonDemo getSingletonDemo(){
        return singletonDemo;
    }

    public static void main(String[] args) {
        System.out.println(getSingletonDemo());
    }
}

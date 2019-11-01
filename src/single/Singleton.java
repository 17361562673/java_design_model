/**
 * Company: ALIBABA
 * Author： ZHOUZHIQIANG
 * FileName:Singleton
 * Time:2019/10/2917:12
 * Description: 懒汉式 加了锁
 */
package single;

public class Singleton {
    private static Singleton singleton;
    private  Singleton (){

    }
    public synchronized static  Singleton getSingleton(){
        if (singleton == null) {
            singleton=new Singleton();
        }
        return singleton;
    }
    public static void main(String[] args) {
        System.out.println(getSingleton());
    }
}

package site.elegentjs.onjava8.basic;

/**
 * 演示接口中的静态方法
 */
public class StaticInter {
    public static void main(String[] args) {
        StaticInterface.staticMethod();
    }
}


interface StaticInterface {
    public static void staticMethod() {
        System.out.println("Static method in interface");
    }
}

package site.elegentjs.onjava8.basic;

/**
 * 演示java初始化顺序
 * 
 * 包含静态变量、静态代码块、实例变量、实例代码块、构造方法
 * 并且带类的继承体系
 */
public class Initilization {
    public static void main(String[] args) {
        Circle circle = new Circle();
    }
}


class Sharp {
    private static String sharpName = "Sharp";

    private String name = "sharp";

    static {
        System.out.println("Sharp static block");
    }

    {
        System.out.println("Sharp instance block");
    }

    public Sharp() {
        System.out.println("Sharp constructor");
    }
}


class Circle extends Sharp {
    private static String circleName = "Circle";

    private String name = "circle";

    static {
        System.out.println("Circle static block");
    }

    {
        System.out.println("Circle instance block");
    }

    public Circle() {
        System.out.println("Circle constructor");
    }
}

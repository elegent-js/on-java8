package site.elegentjs.onjava8.basic;

/**
 * 演示环墧变量和系统属性
 */
public class EnvAndProperties {

    public static void main(String[] args) {
        // 获取环境变量
        System.out.println("环境变量：");
        System.getenv().forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });

        // 获取系统属性
        System.out.println("==================================");
        System.out.println("系统属性：");
        System.getProperties().forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });

        // 获取指定的系统属性
        System.out.println("==================================");
        System.out.println("指定的系统属性：");
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));
    }
}

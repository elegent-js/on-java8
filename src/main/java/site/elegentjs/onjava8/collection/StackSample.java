package site.elegentjs.onjava8.collection;

import java.util.LinkedList;

/**
 * 演示Stack的使用
 * 
 * Java集合采用LinkedList实现Stack
 * 
 * 入栈：push -> 添加到栈顶
 * 出栈：pop -> 从栈顶取出元素
 * 取栈顶元素：peek -> 查看栈顶元素
 * @author liupj 
 * @since 2024-04-01
 */
public class StackSample {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < 100; i ++) {
            stack.push(i);
        }


        while (stack.peek() != null) {
            System.out.println(stack.pop());
            
        }
    }
}

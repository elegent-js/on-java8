package site.elegentjs.onjava8.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * 演示Queue的使用
 * 
 * 入列： offer -> 添加到队列尾部
 * 出列： poll -> 从队列头部取出元素
 * 
 */
public class QueueSample {
    public static void main(String[] args) {
        Queue queue = new LinkedList();

        Random rand = new Random(47);
        for (int i = 0; i < 100; i ++) {
            queue.offer(rand.nextInt(i + 10));
        }

        print(queue);


        Queue<Character> qc = new LinkedList<>();

        for (char c : "Hello World".toCharArray()) {
            qc.offer(c);
        }

        print(qc);
    }


    /**
     * 打印队列
     * @param queue
     */
    public static void print(Queue queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println();
    }
}

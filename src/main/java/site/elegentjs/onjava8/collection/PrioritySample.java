package site.elegentjs.onjava8.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/** 
 * 演示PriorityQueue的使用
 * 
 * 默认按照自然排序进行排序
 * 可传入Comparator进行排序
 */
public class PrioritySample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Random rand = new Random(47);

        for (int i = 0; i < 100; i ++) {
            pq.offer(rand.nextInt(i + 10));
        }

        print(pq);

        PriorityQueue<Character> pc = new PriorityQueue<>();
        for (char c : "Hello World".toCharArray()) {
            pc.offer(c);
        }
        print(pc);

        PriorityQueue<Integer> ps = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < 100; i ++) {
            ps.offer(rand.nextInt(i + 10));
        }

        print(ps);
    }


    public static void print(PriorityQueue<?> pq) {
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

}
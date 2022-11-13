package tamara.stream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    static Random random = new Random();
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 100_000_000; i++) {
            list.add(random.nextInt(11));
        }
        long time = System.currentTimeMillis();
        double sum = list.stream().reduce(Integer::sum).get();
        System.out.println(System.currentTimeMillis() - time);
      //  System.out.println(sum);
        System.out.println("*****************************************");

//        long time1 = System.currentTimeMillis();
//        double sum1 = list.parallelStream().reduce(Integer::sum).get();
//        System.out.println(System.currentTimeMillis() - time1);
       // System.out.println(sum1);
    }
}
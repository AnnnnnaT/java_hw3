// 2.Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;

public class task2 {
    public static void main(String[] args){
        Random rand = new Random();
        List <Integer> list = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            list.add(rand.nextInt(20));
        }
        System.out.println(list);

        Iterator <Integer> iter = list.iterator();

        while(iter.hasNext()){
            if(iter.next() %2 == 0){
                iter.remove();
            }
        }
        System.out.println();
        System.out.println(list);    
    }
}

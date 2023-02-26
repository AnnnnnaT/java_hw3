// /3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main (String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите количество чисел для списка: ");
        int x = iScanner.nextInt();
        ArrayList<Integer> list = createArr(x);
        iScanner.close();
        
        System.out.println(list);
        System.out.printf("Минимальное число - %d.\n", getMin(list));
        System.out.printf("Максимальное число - %d.\n", getMax(list));
        System.out.printf("Среднее арифметическое списка - %d.\n", getAverage(list));
    
    }
     
    public static Integer getMax (ArrayList<Integer> list){
        int max = list.get(0);
        for (int i= 0; i < list.size(); i++) {
            if(max<list.get(i)){
                max = list.get(i);
            }
        }
        return max;        
    }

    public static Integer getMin(ArrayList<Integer> list){
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(min>list.get(i)){
                min = list.get(i);
            }
        }
        return min;        
    }
    
    public static Integer getAverage(ArrayList<Integer> list){
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count+=list.get(i);
        }
        int average = count/list.size();
        return average; 
    }

    public static ArrayList <Integer> createArr(int x){
        ArrayList <Integer> list = new ArrayList<>();
        Random rand = new Random();    
        for (int i = 0; i < x; i++) {
            list.add(rand.nextInt(0,100));
        }
        return list;
    }
}

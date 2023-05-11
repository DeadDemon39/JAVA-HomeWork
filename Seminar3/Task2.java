package Seminar3;

//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        

        ArrayList<Integer> my_list = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int randNum = rand.nextInt(10);
            my_list.add(randNum);
        }
        System.out.println(my_list);

        for (int i = 0; i < my_list.size(); i++) {
            if (my_list.get(i) % 2 == 0) {
                my_list.remove(my_list.get(i));
                i--;
            }
        }

        System.out.println(my_list);
    }
}

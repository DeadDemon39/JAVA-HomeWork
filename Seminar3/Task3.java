package Seminar3;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        

        ArrayList<Integer> myList = new ArrayList<>();
        Random rand = new Random();

        int amountElem = 20;
        for (int i = 0; i < amountElem; i++) {
            int randNum = rand.nextInt(100);
            myList.add(randNum);
        }
        System.out.println(myList);

        int minNum = Collections.min(myList);
        System.out.printf("Минимальное число в списке %d \n", minNum);

        int maxNum = Collections.max(myList);
        System.out.printf("Максимальное число в списке %d \n", maxNum);

        int sumList = myList.stream().mapToInt(Integer::intValue).sum();
        int average = sumList / amountElem;
        System.out.printf("Среднее арифметическое в списке %d \n", average);
    
    }
    
}

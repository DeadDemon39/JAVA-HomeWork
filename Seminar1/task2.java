package Seminar1;

// Вывести все простые числа от 1 до 1000

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        
        System.out.print("Введите положительное число: ");
        int input = new Scanner(System.in).nextInt();
        
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
}
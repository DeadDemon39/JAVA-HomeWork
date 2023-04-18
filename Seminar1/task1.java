package Seminar1;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        
        System.out.println("Введите число: ");
        int num = new Scanner(System.in).nextInt();

        System.out.printf("Треугольное число: %d\n", isTriangular(num));
    }
    public static int isTriangular(int a) {
        return (a * (a + 1)) / 2;
    }
}

/**
 * ВТОРОЙ ВАРИАНТ ИСПОЛЬЗУЯ ЦИКЛ ****FOR****!!!!!
 */
public class task1 {

    public static void main(String[] args) {

        System.out.println("Введите число: ");
        int number = new Scanner(System.in).nextInt();

        int sumNumbers = 0;
        int productNumbers = 1;

        for (int i = 1; i <= number; i++) {
            sumNumbers += i;
            productNumbers *= i;
        }
        System.out.println("Сумма чисел треугольного числа = " + sumNumbers);
        System.out.println("Произведение чисел треугольного числа = " + productNumbers);
    }
}


 

package Seminar1;
import java.util.Scanner;
public class task3_1 {
    public static void main(String[] args) {
        
        // // Реализовать простой калькулятор (+ - / *)
// // Ввод числа ->
// // Ввод знака ->
// // Ввод числа ->



    
        
        System.out.println("Введите первое число: ");
        int numb_a = new Scanner(System.in).nextInt();

        System.out.println("Введите операцию + - / *: ");
        char operation = new Scanner(System.in).next().charAt(0);

        System.out.print("Введите второе число: ");
        int numb_b = new Scanner(System.in).nextInt();

        int res;
        switch (operation) {
            case '+':
                res = numb_a + numb_b;
                System.out.printf("Результат: %d",res);
                break;
            case '-':
                res = numb_a - numb_b;
                System.out.printf("Результат: %d",res);
                break;
            case '/':
                res = numb_a / numb_b;
                System.out.printf("Результат: %d",res);
                break;
            case '*':
                res = numb_a * numb_b;
                System.out.printf("Результат: %d",res);
                break;

        }
        
    }
}
    

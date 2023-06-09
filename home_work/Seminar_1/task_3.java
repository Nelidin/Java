// Реализовать простой калькулятор
// + - / *

// Введите первое число: A \n
// Введите знак: *
// Введите второе число: B
// Результат: A*B

// sc.next() -- считывает символ
// sc.nextLine() -- считывает всю строчку
// sc.nextInt() -- считывает число, но без перехода на след. строчку

package home_work.Seminar_1;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int numb_a = sc.nextInt();
        System.out.print("Введите операцию + - / *: ");
        char operation = sc.next().charAt(0);
        System.out.print("Введите второе число: ");
        int numb_b = sc.nextInt();
        switch (operation) {
            case '+':
                System.out.println(numb_a + " + " + numb_b + " = " + (numb_a + numb_b));
                break;
            case '-':
                System.out.println(numb_a + " - " + numb_b + " = " + (numb_a - numb_b));
                break;
            case '/':
                double res = (double) numb_a / numb_b;
                System.out.println(numb_a + " / " + numb_b + " = " + res);
                break;
            case '*':
                System.out.println(numb_a + " * " + numb_b + " = " + (numb_a * numb_b));
                break;
        }
        sc.close();
    }
}

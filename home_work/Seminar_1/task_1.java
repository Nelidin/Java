// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package home_work.Seminar_1;

import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = scn.nextInt();
        System.out.printf("Треугольное число: %d\n", getTriangleNumber(n));
        System.out.printf("Факториал: %d\n", getFactorial(n));
        scn.close();
    }

    public static int getTriangleNumber(int n) {
        return (n * (n + 1)) / 2;
    }

    static int getFactorial(int n) {
        int result = 1;
        for (int index = 0; index < n; index++) {
            result *= index + 1;
        }
        return result;
    }
}

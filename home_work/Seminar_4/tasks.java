// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка.
// Одно или два числа могут быть отрицательными.

// Даны два Deque, цифры в обратном порядке.
// [3,2,1,-] - пример Deque
// [5,4,3]- пример второго Deque
// 1) -123 * 345 = -42 435
// Ответ всегда - связный список, в обычном порядке
// [-,4,2,4,3,5] - пример ответа

package home_work.Seminar_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class tasks {
    public static void main(String[] args) {
        Deque<String> deq_1 = new LinkedList<>(Arrays.asList("3", "2", "1", "-"));
        Deque<String> deq_2 = new LinkedList<>(Arrays.asList("5", "4", "3"));
        int first_num = makeInt(deq_1);
        int second_num = makeInt(deq_2);

        int multiplication = first_num * second_num;
        String mult = Integer.toString(multiplication);
        String[] strMult = mult.split("");
        ArrayList<String> list_1 = new ArrayList<String>(Arrays.asList(strMult));

        int summa = first_num + second_num;
        String sum = Integer.toString(summa);
        String[] strSum = sum.split("");
        ArrayList<String> list_2 = new ArrayList<String>(Arrays.asList(strSum));

        // System.out.println();
        // System.out.println("1) " + first_num + " * " + second_num + " = " + list_1);
        // System.out.println("2) " + first_num + " + " + second_num + " = " + list_2);

        System.out.println();
        System.out.println("1) " + first_num + " * " + second_num + " = " + multiplication);
        System.out.println("    Ответ: " + list_1);
        System.out.println();
        System.out.println("2) " + first_num + " + " + second_num + " = " + summa);
        System.out.println("    Ответ: " + list_2);

    }

    static int makeInt(Deque<String> arr) {
        int result = 0;
        String temp;
        int krat = 1;

        while (arr.size() != 0) {
            temp = arr.pollFirst();
            if (!temp.equals("-")) {
                result = result + krat * (Integer.parseInt(temp));
                krat *= 10;
            } else {
                result *= -1;
            }
        }
        return result;
    }
}
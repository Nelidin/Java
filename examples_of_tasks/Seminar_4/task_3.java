// Реализовать консольное приложение, которое:

// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в выводе, а первая введённая - последней в выводе 
// и чистит структуру
// 3. Выход - exit

// qwe
// [qwe]
// tre
// [qwe, tre]
// zxc
// [qwe, tre, zxc]
// print
// zxc tre qwe
// []

package examples_of_tasks.Seminar_4;

import java.util.Scanner;
import java.util.Stack;

public class task_3 {
    public static void main(String[] args) {
        System.out.println("Введите строку и нажмите Enter: ");
        try (Scanner sc = new Scanner(System.in, "cp866")) {
            Stack<String> sl = new Stack<String>();
            String str = "";
            while (!str.equals("exit")) {
                str = sc.nextLine().trim();
                if (str.equals("print")) {
                    while (!sl.empty()) {
                        System.out.print(sl.pop() + " ");
                    }
                    System.out.println();
                } else {
                    sl.push(str.trim());
                    System.out.println(sl);
                }

            }
        }
    }
}
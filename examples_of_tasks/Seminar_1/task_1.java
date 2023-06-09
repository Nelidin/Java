// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

package examples_of_tasks.Seminar_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.printf("Введите имя: ");
        String name = sc.nextLine();
        System.out.printf("Привет, %s", name);
        if (sc != null)
            sc.close();

    }
}
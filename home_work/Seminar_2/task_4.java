// Дополнительные задания.
// К калькулятору из предыдущего ДЗ добавить логирование.
// 4+2=6
// 6-1=5

package home_work.Seminar_2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_4 {
    public static void main(String[] args) throws IOException {
        Logger memory = Logger.getLogger(task_4.class.getName());
        String logsPath = "home_work\\Seminar_2\\Calculator_log.txt";
        FileHandler fh = new FileHandler(logsPath, false);
        memory.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int numb_a = sc.nextInt();
        System.out.print("Введите операцию + - / *: ");
        char operation = sc.next().charAt(0);
        System.out.print("Введите второе число: ");
        int numb_b = sc.nextInt();
        switch (operation) {
            case '+':
                int sum = numb_a + numb_b;
                System.out.println(numb_a + " + " + numb_b + " = " + sum);
                memory.info(numb_a + " + " + numb_b + " = " + sum);
                break;
            case '-':
                int difference = numb_a - numb_b;
                System.out.println(numb_a + " - " + numb_b + " = " + difference);
                memory.info(numb_a + " - " + numb_b + " = " + difference);
                break;
            case '/':
                double division = (double) numb_a / numb_b;
                System.out.println(numb_a + " / " + numb_b + " = " + division);
                memory.info(numb_a + " / " + numb_b + " = " + division);
                break;
            case '*':
                int multiplication = numb_a * numb_b;
                System.out.println(numb_a + " * " + numb_b + " = " + multiplication);
                memory.info(numb_a + " * " + numb_b + " = " + multiplication);
                break;
        }
        sc.close();
        memory.warning("logger off");
    }
}
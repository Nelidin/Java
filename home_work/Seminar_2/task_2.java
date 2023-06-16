// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package home_work.Seminar_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_2 {
    public static void main(String[] args) throws IOException {
        int numbers[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("\n" + "Исходный массив: " + Arrays.toString(numbers) + "\n");
        bubbleSort(numbers);
        System.out.println("\n" + "Отсортированный массив: " + Arrays.toString(numbers) + "\n");
    }

    public static void bubbleSort(int[] numbers) throws IOException {
        Logger memory = Logger.getLogger(task_2.class.getName());
        String logsPath = "home_work\\Seminar_2\\log.txt";
        FileHandler fh = new FileHandler(logsPath, false);
        memory.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                    memory.info("element swap" + " " + temp);
                }
            }
        }
        memory.warning("logger off");
    }
}
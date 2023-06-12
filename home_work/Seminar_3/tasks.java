// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

package home_work.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class tasks {
    public static void main(String[] args) {
        int numbers[] = new int[15];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        List<Integer> delNum = DeleteEvenNumbers(numbers);
        System.out.println("Массив без четных чисел: " + delNum);

        int max = getMax(numbers);
        System.out.println("Максимальное значение: " + max);

        int min = getMin(numbers);
        System.out.println("Минимальное значение: " + min);

        double average = getAverage(numbers);
        String result = String.format("%.3f", average);
        System.out.println("Среднее арифметическое значение: " + result);
    }

    public static List<Integer> DeleteEvenNumbers(int[] inputArray) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (Integer num : inputArray) {
            if (num % 2 != 0) {
                numbers.add(num);
            }
        }
        return numbers;
    }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static double getAverage(int[] inputArray) {
        double sum = 0;
        for (int x : inputArray) {
            sum += x;
        }
        return sum / inputArray.length;
    }
}
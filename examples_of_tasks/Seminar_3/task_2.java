// Заполнить сисок десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

package examples_of_tasks.Seminar_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class task_2 {
    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>(10);
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
           randomList.add(r.nextInt(100));            
        }
        System.out.println(randomList.toString());
        randomList.sort(Comparator.naturalOrder());
        System.out.println(randomList.toString());
    }    
}

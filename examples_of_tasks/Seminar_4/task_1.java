// 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.

// 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.

package examples_of_tasks.Seminar_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            al.add(0, 0);
        }
        long timeStop = System.currentTimeMillis();
        System.out.println(timeStop - timeStart);

        LinkedList<Integer> ll = new LinkedList<>();
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            ll.add(0, 0);
        }
        timeStop = System.currentTimeMillis();
        System.out.println(timeStop - timeStart);
    }
}

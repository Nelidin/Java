// Создать список типа ArrayList.
// Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.

package examples_of_tasks.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class task_3 {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(Arrays.asList("dsfs", 45, "fhgfhgf", 89, "fdsdf", "fdgdf", 56, 78, "fddsdf"));
        System.out.println(list);
        // for (int i = 0; i < list.size(); i++) {
        //    if (list.get(i) instanceof Integer) {
        //     list.remove(i);
        //     i--;            
        //    } 
        Iterator<Object> iter = list.iterator();
        while (iter.hasNext()) {            
            if (iter.next() instanceof Integer) 
                iter.remove(); 
        }   
        System.out.println(list);
    }
}
    


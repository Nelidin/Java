// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.

package examples_of_tasks.Seminar_1;

public class task_2 {
    public static void main(String[] args) {
        int[] binary = new int[] { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 };
        int maxlength = 0;
        int temp_length = 0;
        int max_index = 0;
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 1) {
                temp_length++;
            } else {
                if (maxlength < temp_length) {
                    maxlength = temp_length;
                    max_index = i - maxlength;
                }
                temp_length = 0;
            }
        }
        if (maxlength < temp_length) {
            maxlength = temp_length;
            max_index = binary.length - maxlength;
        }
        System.out.println(max_index);
        System.out.println(maxlength);
        for (int i = max_index; i < max_index + maxlength; i++) {
            System.out.printf("%d ", binary[i]);
        }
    }
}
// Напишите метод, который сжимает строку. 
// Пример: вход aaaabbbcddaa.
// Ответ: результат - a4b3cd2a2

package examples_of_tasks.Seminar_2;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Введите строку для сжатия: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println(ZipString(str));
    }

    public static String ZipString(String str) {
        StringBuilder zipStr = new StringBuilder();
        zipStr.append(str.charAt(0));
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                count++;
            } else {
                if (count != 1) {
                    zipStr.append("" + count);
                    count = 1;
                    zipStr.append(str.charAt(i));
                } else {
                    zipStr.append(str.charAt(i));
                }
            }
        }
        if (count != 1)
            zipStr.append("" + count);
        return zipStr.toString();
    }
}

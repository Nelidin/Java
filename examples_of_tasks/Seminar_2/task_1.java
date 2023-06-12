// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

package examples_of_tasks.Seminar_2;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Введите первый символ: ");
        String a = sc.nextLine();
        System.out.println("Введите второй символ: ");
        String b = sc.nextLine();
        System.out.println("Введите длинну строки: ");
        int n = sc.nextInt();
        System.out.println(CreatString(a, b, n));  
        sc.close();
    }
    
    public static String CreatString(String a, String b, int n) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
                 str.append(a+b);
        }    
        return str.toString();
    }
}

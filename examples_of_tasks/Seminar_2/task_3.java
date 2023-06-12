package examples_of_tasks.Seminar_2;

import java.io.File;
import java.io.FileReader;

public class task_3 {
        //Записать слово TEST в файл 10 раз
        public static void main(String[] args) {
            // int n = 10;
            // String text = "TEST";
            // try(FileWriter writer = new FileWriter("GB_Learn_Java\\text.txt", true)){
            //     for (int i = 0; i < n; i++) {
            //         writer.write(text);
            //         writer.write("\n");
            //     }
            //     System.out.println("Получилось!");
            // }
            // catch (Exception e){
            //     System.out.println("Что то пошло не так");
            // }
            File file = new File("GB_Learn_Java\\text.txt");
            try{
                FileReader fileReader = new FileReader(file);
                char[] arr = new char[(int) file.length()];
                fileReader.read(arr);
                for (char c : arr) {
                    System.out.print(c);
                }
                fileReader.close();
            }
            catch(Exception e){
                System.out.println("Что то пошло не так");
            }
        }
    }
    

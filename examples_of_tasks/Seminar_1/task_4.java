package examples_of_tasks.Seminar_1;

public class task_4 {
    public static void main(String[] args) {
     
    
    String phrase = "Добро пожаловать на курс по Java";
        String[] words = phrase.split(" ");
        phrase = "";
        for (int i = words.length - 1; i >= 0; i--)
        {
            phrase = phrase + " " + words[i];            
        }
        System.out.println(phrase);
    
}
}

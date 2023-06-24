package examples_of_tasks.Seminar_6;

import java.util.ArrayList;
import java.util.List;

public class Cat {
    String name;
    int age;   
    boolean isVaccinated;
    List<String> diseases = new ArrayList<>();

    public void mayN(int n) {
        System.out.println(this.name + " мяукнул " + n + " раз");
    }
    public void vaccinated() {
        if (isVaccinated) {
            System.out.println(this.name + " уже привит!");
        }
        else {
            isVaccinated = true;
            System.out.println("Мы привили кота " + this.name);
        }
    }
    public void addDiseases(String disease) {
        this.diseases.add(disease);
        System.out.println(this.diseases);
    } 
    public void showDiseases() {
        System.out.println(this.diseases);
    }
}

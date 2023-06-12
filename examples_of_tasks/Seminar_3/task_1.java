// Запонить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой поланеты и количество его повторений в списке.
// Земля, Земля, Земля, Юпитер

// Земля: 3
// Юпитер: 1

package examples_of_tasks.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task_1 {
    public static void main(String[] args) {
        List<String> planetList = new ArrayList<>(Arrays.asList("Earch", "Mars", "Mars", "Luna", "Jupiter", "Mars", "Luna"));
        List<String> isPlanetList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < planetList.size(); i++) {
            if (!isPlanetList.contains(planetList.get(i))) {
                isPlanetList.add(planetList.get(i));
                for (int j = i; j < planetList.size(); j++) {
                    if (planetList.get(i) == planetList.get(j))
                        count++;
                }
                System.out.print(planetList.get(i) + ": " + count + "\n");
                count = 0;
            }
        }
    }
}
// Продумайте структуру класса Кот для информационной системой ветеринарной клиники

// Поля:
// Имя 
// Возраст
// Привит ли (boolean)


// Методы:
// Кот .. мяукнул n раз
// Метод прививки кота
// 1 придумаем

package examples_of_tasks.Seminar_6;

public class task_2 {
    public static void main(String[] args) {
        Cat bars = new Cat();
        bars.name = "Barsic";
        bars.age = 5;
        bars.isVaccinated = false;
        bars.addDiseases("gripp");
        bars.addDiseases("covid");
        bars.showDiseases();
        bars.vaccinated();
        bars.mayN(10);
    }
}
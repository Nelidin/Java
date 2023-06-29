// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД hd hdd
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

package home_work.Seminar_6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        NoteBook notebook1 = new NoteBook("asus_tuf", "8", 500, "Windows", "Черный");
        Brand brandAsus = new Brand("ASUS");
        notebook1.addBrand(brandAsus);

        NoteBook notebook2 = new NoteBook("acer_swift_3", "16", 1000, "Windows", "Черный");
        Brand brandAcer = new Brand("ACER");
        notebook2.addBrand(brandAcer);

        NoteBook notebook3 = new NoteBook("apple_macBook_air_m2", "8", 500, "ios", "Белый");
        Brand brandApple = new Brand("Apple");
        notebook3.addBrand(brandApple);

        NoteBook notebook4 = new NoteBook("msi_creator_z17", "32", 2000, "Windows", "Серый");
        Brand brandMsi = new Brand("MSI");
        notebook4.addBrand(brandMsi);

        NoteBook notebook5 = new NoteBook("dell_vostro", "16", 1000, "Linux", "Черный");
        Brand brandDell = new Brand("Dell");
        notebook5.addBrand(brandDell);

        Set<NoteBook> NoteBook = new HashSet<>();
        NoteBook.add(notebook1);
        NoteBook.add(notebook2);
        NoteBook.add(notebook3);
        NoteBook.add(notebook4);
        NoteBook.add(notebook5);

        NoteBook FilterNoteBook = new NoteBook();
        System.out.println(FilterNoteBook.newFilter(NoteBook));
    }
}
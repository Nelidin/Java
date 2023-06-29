package home_work.Seminar_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NoteBook {

    private List<Brand> brands;
    private String model;
    private String operativeMemory;
    private int hardDisk;
    private String operatingSystem;
    private String color;

    public NoteBook() {
    }

    public NoteBook(String model, String operativeMemory, int hardDisk, String operatingSystem, String color) {
        this.brands = new ArrayList<>();
        this.model = model;
        this.operativeMemory = operativeMemory;
        this.hardDisk = hardDisk;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getOperativeMemory() {
        return operativeMemory;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void addBrand(Brand brand) {
        brands.add(brand);
    }

    public String newFilter(Set<NoteBook> NoteBook) {
        Scanner scan = new Scanner(System.in, "cp866");
        Set<NoteBook> listNoteBook = new HashSet<>(NoteBook);
        System.out.println("\nЗдравствуйте!");
        System.out.println("\nВведите параметр для поиска: \n" +
                "\n1. Объем оперативной памяти(ОЗУ).\n2. Объем жёсткого диска(HDD).\n3. Операционная система.\n4. Цвет.\n");
        String userRequest = scan.nextLine();

        for (int i = 0; i < userRequest.length(); i++) {
            if (1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("\nУкажите количество оперативной памяти в Гб\nВ наличии : 8, 16, 32\n");
                String enterOperativeMemory = scan.nextLine();
                for (NoteBook tempNoteBook : NoteBook) {
                    if ((enterOperativeMemory.equals(tempNoteBook.operativeMemory)) == false) {
                        listNoteBook.remove(tempNoteBook);
                    }
                }
            }

            if (2 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("\nУкажите размер жёсткого диска в Мб\nВ наличии : 500, 1000, 2000\n");
                String enterHardDisk = scan.nextLine();
                int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
                for (NoteBook tempNoteBook : NoteBook) {
                    if (intParseEnterHardDisk != tempNoteBook.hardDisk) {
                        listNoteBook.remove(tempNoteBook);
                    }
                }
            }

            if (3 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("\nУкажите операционную систему\nВ наличии : Linux, ios, Windows\n");
                String enterOperatingSystem = scan.nextLine();
                for (NoteBook tempNoteBook : NoteBook) {
                    if ((enterOperatingSystem.equals(tempNoteBook.operatingSystem) == false)) {
                        listNoteBook.remove(tempNoteBook);
                    }
                }
            }

            if (4 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("\nУкажите цвет ноутбука\nВ наличии : Черный, Белый, Серый\n");
                String enterColor = scan.nextLine();
                for (NoteBook tempNoteBook : NoteBook) {
                    if ((enterColor.equals(tempNoteBook.color)) == false) {
                        listNoteBook.remove(tempNoteBook);
                    }
                }
            }
        }
        scan.close();
        return "\nЭта подборка для Вас:\n" + listNoteBook.toString().replaceAll("^\\[|\\,|\\]$", "");
    }

    @Override
    public String toString() {
        String result = brands.toString().replace("[", "").replace("]", "");
        return "\n" + result + "\nМарка ноутбука = " + model + "\nОбъем оперативной памяти(ОЗУ) = "
                + operativeMemory + " Гб" + "\nОбъем жёсткого диска(HDD) = " + hardDisk + " Мб"
                + "\nОперационная система = " + operatingSystem + "\nЦвет = " + color + "\n";
    }
}
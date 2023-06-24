package home_work.Seminar_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class task {
    static void sortedPrint(Map<String, ArrayList> map) {
        Set<String> keySet = map.keySet();
        int maxCount = 0;
        int minCount = 1_000_000;

        for (var item : map.entrySet()) {
            if (maxCount < item.getValue().size())
                maxCount = item.getValue().size();
            if (minCount > item.getValue().size())
                minCount = item.getValue().size();
        }

        Stack<String> st = new Stack<>();
        int num = minCount;
        while (num <= maxCount) {
            for (var item : map.entrySet()) {
                if (item.getValue().size() == num) {
                    st.push(item.getKey());
                }
            }
            num += 1;
        }

        String name;
        for (int i = 0; i < keySet.size(); i++) {
            name = st.pop();
            for (var item : map.entrySet()) {
                if (name == item.getKey()) {
                    System.out.printf("%8s: ", item.getKey());
                    System.out.println(item.getValue());
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Map<String, ArrayList> abon = new HashMap<>();
        System.out.println();
        System.out.println("Исходные данные: ");
        sortedPrint(abon);
        
        Scanner scan = new Scanner(System.in, "cp866");
        Boolean getOut = false;
        String st;
        while (!getOut) {
            System.out.println("Введите номер действия (1 - добавить абонента, 2 - добавить номер, 9 - выйти из программы):");
            st = scan.nextLine();
            String name = "";
            String phString;
            ArrayList<Integer> arrInt = new ArrayList<>();
            switch (st) {
                case "1": {
                    System.out.println("Введите фамилию абонента:");
                    name = scan.nextLine();
                    if (abon.containsKey(name)) {
                        System.out.println("Такой абонент есть!");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Введите номера телефонов через запятую: ");
                        phString = scan.nextLine();
                        String[] arr = phString.split(",");

                        for (String item : arr) {
                            arrInt.add(Integer.parseInt(item.trim()));
                        }
                        abon.putIfAbsent(name, arrInt);
                        System.out.println();
                        sortedPrint(abon);
                        break;
                    }
                }
                case "2": {
                    System.out.println("Введите фамилию абонента:");
                    name = scan.nextLine();
                    if (abon.containsKey(name)) {
                        System.out.println("Такой абонент есть:");
                        System.out.println("Добавте номер телефона: ");
                        phString = scan.nextLine();
                        String[] arr = phString.split(",");
                        ArrayList<Integer> newArrInt = new ArrayList<>();
                        for (String item : arr) {
                            newArrInt.add(Integer.parseInt(item.trim()));
                        }
                        abon.computeIfAbsent(name, k -> new ArrayList<>()).add(newArrInt);
                        System.out.println();
                        sortedPrint(abon);
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Такого абонента нет, выберите другую операцию:");
                        break;
                    }
                }
                case "9": {
                    getOut = true;
                    System.out.println();
                    System.out.println("До новых встреч!");
                    System.out.println();
                    break;
                }                
            }
        }scan.close();
    }
}
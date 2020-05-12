import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> carLetter = new ArrayList<>() {{
            add("C");
            add("M");
            add("T");
            add("B");
            add("A");
            add("P");
            add("O");
            add("H");
            add("E");
            add("Y");
            add("K");
            add("X");
        }};


        ArrayList<String> carNumber = new ArrayList<>();
        for (int i = 111; i <= 999; i += i) {
            for (int j = 0; j < carLetter.size(); j++) {
                for (int k = 0; k < carLetter.size(); k++) {
                    for (int l = 0; l < carLetter.size(); l++) {
                        for (int region = 1; region <= 199; region++) {
                            String first = carLetter.get(j);
                            String second = carLetter.get(k) + carLetter.get(l);
                            int number = i;
                            if (region < 10) {
                                carNumber.add(first + number + second + "0" + region);
                            } else {
                                carNumber.add(first + number + second + region);
                            }
                        }
                    }
                }
            }
        }

        HashSet<String> hashSetCarNumber = new HashSet<>();
        hashSetCarNumber.addAll(carNumber);

        TreeSet<String> treeSetCarNumber = new TreeSet<>();
        treeSetCarNumber.addAll(carNumber);

        System.out.println("Введите номер авто в формате XNNNYZR - пример, A111BC197");
        while (true) {
            String found;
            String inputCarNumber = reader.readLine();
            if (!inputCarNumber.matches("^([A-Z])(\\d{3})([A-Z]{2})(\\d{2,3})$")){
                System.out.println("Введите правильный номер!");
                continue;
            }

            //Поиск перебором
            long arrayStart = System.nanoTime();
            Boolean arrayListContains = carNumber.contains(inputCarNumber);
            long arraySearchDuration = System.nanoTime() - arrayStart;
            if (arrayListContains) {
                found = "Найден";
            } else {
                found = "Не найден";
            }
            System.out.println("Поиск перебором: номер " + found + ", поиск занял " + arraySearchDuration + " нс");

            //Бинарный поиск
            Collections.sort(carNumber);
            long binarySearchStart = System.nanoTime();
            int bynarySearchContains = Collections.binarySearch(carNumber, inputCarNumber);
            long binarySearchDuration = System.nanoTime() - binarySearchStart;
            if (bynarySearchContains == -1){
                found = "Не найден";
            } else {
                found = " Найден";
            }
            System.out.println("Бинарный поиск: номер " + found + ", поиск занял " + binarySearchDuration + " нс");


            //Поиск по HashSet
            long hashSetSearchStart = System.nanoTime();
            boolean hashSetFound = hashSetCarNumber.contains(inputCarNumber);
            long hashSetDuration = System.nanoTime() - hashSetSearchStart;
            if (hashSetFound){
                found = "Найден";
            } else {
                found = "Не найден";
            }
            System.out.println("Поиск в HashSet: номер " + found + ", поиск занял " + hashSetDuration + " нс");


            //Поиск по TreeSet
            long treeSetStart = System.nanoTime();
            boolean treeSetFound = treeSetCarNumber.contains(inputCarNumber);
            long treeSetDuration = System.nanoTime() - treeSetStart;
            if (treeSetFound){
                found = "Найден";
            } else {
                found = "Не найден";
            }
            System.out.println("Поиск в TreeSet: номер " + found + ", поиск занял " + treeSetDuration + " нс");
        }


    }
}



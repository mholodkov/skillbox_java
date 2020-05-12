import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Map;

import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, String> phoneBook = new TreeMap<>();
        phoneBook.put("Maks", "123");

        while (true) {
            String command = reader.readLine();

            Pattern namePattern = Pattern.compile("(\\D+)");
            Matcher nameMatcher = namePattern.matcher(command);

            Pattern numberPattern = Pattern.compile("(\\d+)");
            Matcher numberMatcher = numberPattern.matcher(command);
            if (command.equals("LIST")) {
                getKeyValue(phoneBook);
                continue;
            }
            if (nameMatcher.find()) {
                if (!phoneBook.containsKey(command)) {
                    System.out.println("Новый пользователь! \nВведите номер телефона!");
                    String number = reader.readLine();
                    phoneBook.put(command, number);
                } else {
                    System.out.println("Name: " + command + ",  Number: " + phoneBook.get(command));
                }
                continue;

            }
            if (numberMatcher.find()) {
                String number = command;
                if (!phoneBook.containsValue(number)){
                    System.out.println("Новый пользователь! \nВведите имя!");
                    String name = reader.readLine();
                    phoneBook.put(name,number);
                } else {
                    System.out.println("Name: " + getKeys(phoneBook, number) + ",  Number: " + number);
                }
            }
        }
    }

    public static void getKeyValue(TreeMap<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }
    }
    public static<K, V> Set<K> getKeys(Map<K, V> map, V value) {
        Set<K> keys = new HashSet<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }
}


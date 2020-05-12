import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> emailList = new HashSet<>();
        welcome();
        while (true) {
            System.out.println("Пожалуйста, веди команду:");
            String command = reader.readLine();
            Pattern patternAdd = Pattern.compile("^(ADD)\\s+(.+)");
            Matcher matcherAdd = patternAdd.matcher(command);

            Pattern patternList = Pattern.compile("^(LIST)$");
            Matcher matcherList = patternList.matcher(command);
            while (matcherList.find()) {
                if (matcherList.group(1).equals("LIST")) {
                    for (String mail : emailList) {
                        System.out.println(mail);
                    }
                }
            }
            while (matcherAdd.find()) {
                if (matcherAdd.group(1).equals("ADD") && matcherAdd.group(2).matches("^[A-Za-z0-9+_.-]+@.+$")) {
                    emailList.add(matcherAdd.group(2));
                } else System.out.println("Введен некорректный email!");
            }
        }

    }

    public static void welcome() {
        System.out.println("Привет, я предлагаю поработать со списком email!\n" +
                "Наши команды:\n" +
                "\tLIST - посмотреть список дел\n" +
                "\tADD - добавить запись в списко дел\n"
        );
    }
}

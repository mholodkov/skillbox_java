import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void welcome() {
        System.out.println("Привет, я предлагаю поработать со списком!\n" +
                "Наши команды:\n" +
                "\tLIST - посмотреть список дел\n" +
                "\tADD - добавить запись в списко дел\n" +
                "\tDELETE - удалить дело\n" +
                "\tEDIT - Изменить название дела\n" +
                "\tHELP - Вывести список доступных команд\n" +
                "\tEXIT - Выход из программы\n"
        );
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> taskList = new ArrayList<>();
        taskList.add("ssdf");

        welcome();
        while (true) {
            System.out.println("Пожалуйста, введи команду:");
            String task = reader.readLine();

            Pattern info = Pattern.compile("^(LIST|HELP)$");
            Pattern act = Pattern.compile("^(ADD|DELETE|EDIT)\\s+(.+)");

            Matcher infoMatcher = info.matcher(task);
            Matcher actMatcher = act.matcher(task);

            while (infoMatcher.find()) {
                if (infoMatcher.group(1).equals("LIST")) {
                    if (taskList.isEmpty()) {
                        System.out.println("Список дел пуст!");
                    } else {
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println(i + " - " + taskList.get(i));
                        }
                    }

                }
                if (infoMatcher.group(1).equals("HELP")) {
                    welcome();
                }

            }
            while (actMatcher.find()) {
                if (actMatcher.group(1).equals("ADD")) {
                    if (actMatcher.group(2).matches("^(\\d+)\\s+(.+)")) {
                        int number = Integer.parseInt(actMatcher.group(2).replaceFirst("(\\d+)\\s+(.+)", "$1"));
                        String text = actMatcher.group(2).replaceFirst("(\\d+)\\s+(.+)", "$2");
                        if (number > taskList.size()) {
                            taskList.add(text);
                        } else {
                            taskList.add(number, text);
                        }
                    } else {
                        taskList.add(actMatcher.group(2));
                    }
                }
                if (actMatcher.group(1).equals("DELETE")) {
                    if (actMatcher.group(2).matches("\\d+")) {
                        int deleteNumber = Integer.parseInt(actMatcher.group(2));
                        if (deleteNumber >= taskList.size()) {
                            System.out.println("Нельзя удалить несуществуещее дело!");
                        } else {
                            taskList.remove(deleteNumber);
                        }
                    } else {
                        System.out.println("Неккореектно введены данные!");
                        continue;
                    }
                }
                if (actMatcher.group(1).equals("EDIT")) {
                    if (actMatcher.group(2).matches("^(\\d+)\\s+(.+)")) {
                        int editNumber = Integer.parseInt(actMatcher.group(2).replaceFirst("(\\d+)\\s+(.+)", "$1"));
                        String editText = actMatcher.group(2).replaceFirst("(\\d+)\\s+(.+)", "$2");
                        if (editNumber >= taskList.size()) {
                            System.out.println("Невозможно изменить дело! =(");
                        } else {
                            taskList.remove(editNumber);
                            taskList.add(editNumber, editText);
                        }
                    } else {
                        System.out.println("Неккореектно введены данные!");
                        continue;
                    }
                    if (task.equals("EXIT")) {
                        System.out.println("Bue!");
                        break;
                    }

                }
            }
        }
    }
}
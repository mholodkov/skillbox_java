
public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        //indexOf(), lastIndexOf(), substring() и trim()
        String [] newText = text.split(", ");
        int sum = 0;


        for(int i = 0; i < newText.length; i++)
        {
            String number = newText[i].replaceAll("[^0-9]+", "");
            sum += Integer.parseInt(number);
            System.out.println(number);
        }
        System.out.println("Общая сумма заработка: " + sum);
    }
}
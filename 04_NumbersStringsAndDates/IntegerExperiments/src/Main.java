public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;
        System.out.println(sumDigits(container.count));

        char ch = '9';
        int intFromChar = Character.getNumericValue(ch);
        System.out.println(intFromChar);
    }


    public static Integer sumDigits(Integer number) {
        String stringNum = Integer.toString(number);
        int result = 0;
        for (int i = 0; i < stringNum.length(); i++){
            result += Integer.parseInt(String.valueOf(stringNum.charAt(i)));
        }
            return result;
    }
}

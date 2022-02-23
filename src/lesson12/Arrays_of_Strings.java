package lesson12;

public class Arrays_of_Strings {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 10;

        String[] strings = new String[3];
        strings[0] = "Ruby";
        strings[1] = "Java";
        strings[2] = "Kotlin";

        // Простой перебор циклом for
        for(int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }

        System.out.println();

        // Перебор циклом for each
        for(String string: strings){
            System.out.println(string);
        }

        int[] digits = {1, 2, 5, 8};
        int sum = 0;
        for(int digit: digits){
            sum += digit;
        }
        System.out.println(sum);

        int value = 0;

        // Выделяется память на ссылку, по умолчанию указывает на null.
        String s;









    }
}

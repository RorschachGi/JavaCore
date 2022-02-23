package lesson11;

public class Arrays {
    public static void main(String[] args){
        int number = 20; // примитивный тип данных [20]
        char character = 'a'; // тоже примитивный тип данных

        String s = "Hello";
        String s1 = new String("Hi"); // Ссылочный тип данных

        int[] numbers = new int[5]; // numbers -> [массив] Ссылочный тип данных

        // Заполнение массива
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i;
        }

        // Вывод массива в консоль
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // Другой способ инициализации
        int[] numbersOne = {1, 35, 67, 245, 67};



    }
}

package lesson23;

public class StringBuilderLesson {
    public static void main(String[] args){

        //StringBuilder создает изменяемую строку
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friends!");
        System.out.println(sb.toString());

        /* Из-за создания новых строк увеличивается потребление памяти, потому что строки - неизм.об
                String stringOne = "Hello";
                String stringTwo = "my";
                String stringThree = "friends";
                String stringAll = stringOne + stringTwo + stringThree;
                System.out.println(stringAll);
         */

        // Форматирование строк ( \n - перенос строки, %d - вставка числа, %s - вставка строки,
        // %f - для вещественных
        System.out.printf("String %10d \n", 453);
        System.out.printf("String %10d \n", 100000);
        System.out.printf("String %10d \n", 1000000000);
        System.out.printf("String %.2f \n", 2.4567);


    }
}

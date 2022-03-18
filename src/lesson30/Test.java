package lesson30;

public class Test {
    public static void main(String[] args){
        // Приведение типов
        // Примитивные типы: int, short, byte, long - целые числа
        // Примитивные типы: double, float - вещественные числа
        // Примитивные типы - хранят в себе данные, а не ссылаются на них ссылкой

        float f = 123.2f; // изначально double, а стало float

        int a = 123;
        long l = a; // Неявное приведение типов

        int x = (int)l; // Явное приведение


        byte b = (byte)129;

        System.out.println(b);








    }
}

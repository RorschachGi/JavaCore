package lesson31;

public class Test {
    public static void main(String[] args){
        int x = 1;

        // Double, Float, Integer, Long, Short, Byte, Character, Boolean - классы обертки с методами

        Integer x2 = new Integer(10); // избыточно
        Integer.parseInt("123"); // Из строки в int

        // Если необходимо обычное число, то используем примитив, если нужны методы, то класс-обертку

        Integer a = 34; // Java самостоятельно упакует примитив в обертку

        int t = Integer.parseInt("214");
        System.out.println(t);




    }
}

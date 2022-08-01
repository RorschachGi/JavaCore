package lesson22;

public class finalWord {
    public static void main(String[] args){
        // final используется для переменных, которые не могут быть изменены (константы)

        final int X = 10;

        System.out.println(X);
    }
}

class Test{

    // Константы внутри класса часто statiс для экономии памяти
    public static final int CONSTANT = 0;


}

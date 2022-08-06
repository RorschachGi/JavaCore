package lesson42;

public class Test {
    public static void main(String[] args){
        int x = 1;
        int y = 1;

        //Сравнение примитива
        System.out.println(x == y);


        // == сравнивает ссылки на объекты, а не сами объекты, их структуру
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(2);

        // Если мы хотим сравнивать структуру объектов, то нужно воспользоваться методом equals(), который наследуется от класса Object, однако сначала его нужно переопределеить в классе наследнике
        System.out.println(animal1.equals(animal2));


        // метод equals() так используем для сравнения строк
        String string1 = "Hello";
        String string2 = "Hello";

        System.out.println(string1.equals(string2));

        // Тоже сработает, благодаря String Pool, т.к Java ссылает указатели на одну и ту же строку, если они одинаковы для экономии памяти. Однако лучше пользоваться equals()
        System.out.println(string1 == string2);



    }
}

package lesson28.packageOne;

public class Test {
    public static void main(String[] args){
        Person personTwo = new Person();

        // Получаем доступ т.к protected в пределах пакета
        System.out.println(personTwo.login);
    }
}

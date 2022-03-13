package lesson28;


import lesson28.packageOne.Person;

public class Test extends Person {


    private void technicalMethod(){} // Приватный метод в пределах класса

    public static void main(String[] args){
        // public, private, default, protected - модификаторы доступа
        // public - доступ в пределах проекта
        // private - доступ в пределах класса
        // default - доступ в пределах пакета
        // protected - доступ в пределах одного пакета и всем подклассам даже если они вне декларированы вне пакета

        Person personOne = new Person();
        System.out.println(personOne.CONSTANT);

        // Доступа не будет т.е иной пакет
        Person personThree = new Person();
        //System.out.println(personThree.login);

    }

}



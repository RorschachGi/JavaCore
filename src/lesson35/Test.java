package lesson35;

public class Test {
    public static void main(String[] args){

        //Если хотим изменить метод eat, то можем создать другой наследующий класс и переопределить его там
        Animal animal = new Animal();
        animal.eat();

        //OtherAnimal otheranimal = new OtherAnimal();
        //otheranimal.eat();

        //Однако создавать отдельный класс для переопределения метода избыточно, поэтому существуют анонимные классы
        // Мы можем переопределить метод после создания объекта прямо на месте.
        /* На самом деле при таком написании создается анонимный класс, который наследует от Animal и переопределяет метод eat() */

        Animal animal2 = new Animal() {
            public void eat(){
                System.out.println("New animal is eating...");
            }
        };

        animal2.eat();

        interface AnimalAbleToEat{
            public void eat();
        }

        // Мы не создаем объект интерфейса ( нельзя ). На самом деле здесь создается безымянный класс, реализующий интерфейс. Мы одновременнно объявляем класс и создаем один его объект
        AnimalAbleToEat animal3 = new AnimalAbleToEat() {
            @Override
            public void eat() {
                System.out.println("I`m eat");
            }
        };

        animal3.eat();
    }
}

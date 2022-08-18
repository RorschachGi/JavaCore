package lesson48;

public class Test {

      public static void main(String[] args){

          /*Animal animal = Animal.CAT;

          switch (animal){
              case CAT:
                  System.out.println("It`s a cat");
                  break;

              case DOG:
                  System.out.println("It`s a dog");

              default:
                  System.out.println("Unknown");

          }*/

          Animal animal1 = Animal.CAT;
          Animal animal2 = Animal.DOG;
          Animal animal3 = Animal.FROG;

          System.out.println(animal2.getTranlation());

          Season season = Season.SUMMER;

          //Метод name() возвращает название перечисления
          System.out.println(season.name());

          // Метод valueOf() возвращает enum по строке ( названию )
          Animal cat = Animal.valueOf("CAT");

          // Метод ordinal() возвращает индекс enum
          System.out.println(season.ordinal());

          System.out.println(season.getTemperature());

          //Иерархия наследования:
          //Object -> Enum -> Season

          //Ключевое слово instanceof проверяет является ли объект объектом данного класса
          /*System.out.println(season instanceof Season);

          switch (season){

              case SUMMER:
                  System.out.println("It`s warm outside");
                  break;

              case WINTER:
                  System.out.println("It`s cold outside");
                  break;

          }*/

      }
}

import builder.Person;
import factory.Shape;
import factory.ShapeFactory;
import strategy.AnimalType;
import strategy.Cat;
import strategy.Dog;

/**
 * Created by NeverForgive on 2017-12-11.
 */
public class Main {

    public static void main(String[] args){


        //Strategy Pattern

        AnimalType animalType1 = new AnimalType();
        animalType1.setAnimalType(new Dog());
        System.out.println(animalType1.getAnimalType());

        AnimalType animalType2 = new AnimalType();
        animalType2.setAnimalType(new Cat());
        System.out.println(animalType2.getAnimalType());



        //Factory Pattern

        Shape triangle = ShapeFactory.getShape("triangle");
        triangle.draw();

        Shape rectangle = ShapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();


        // Fluent Builder

        Person person = Person.getBuilder()
                .firstName("John")
                .lastName("Smith")
                .age(22)
                .country("USA")
                .build();

        System.out.println(person);
    }
}

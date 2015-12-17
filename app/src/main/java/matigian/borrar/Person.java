package matigian.borrar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by italiano Leo on 17-12-2015.
 */
public class Person {
    public String name;
    public String age;


    Person(String name, String age) {
        this.name = name;
        this.age = age;

    }
}

private List<Person> persons;

    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old"));
        persons.add(new Person("Lavery Maiss", "25 years old"));
        persons.add(new Person("Lillie Watts", "35 years old"));
    }

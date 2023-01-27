package Exercise4;

public class Person {

    int age;
    String name;

    Person(String personName, int personAge){
        this.name = personName;
        this.age = personAge;
    }
    void addFriend(Person Friend) {
    System.out.println(name + "Is Friends with " + Friend.name );
    }

    void addClassmate(Person Classmate) {
        System.out.println(name + " Is classmate with " + Classmate.name);

    }
    void addCar(Person Car){
        System.out.println(name + "bought this car" + Car.name);
    }
}

package Exercise4;
public class Pet {

    
    // Atrrib
    String name;
    int age;
    Person owner;



    // Contructor
    Pet(String petName, int petAge , Person ownerName){
        this.name = petName;
        this.age = petAge;
        this.owner = ownerName;
       
    }
        
        void showOwner() {
            System.out.println("My pet name is " + this.name + " My owner name is "+ owner.name);
    }
    
}

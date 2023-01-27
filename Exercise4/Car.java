package Exercise4;

public class Car {
    
    String name;
    String color;
    String brand;
    Person owner;
    
    Car(String carColor,String carBrand,Person ownerName){
        this.color = carColor;
        this.brand = carBrand;
        this.owner = ownerName;
    } 

    

    void showOwner(){
        System.out.println("My Car brand is  "+ this.brand + " Owner name is " + owner.name + " Color of my bugatti is " + this.color);
    
}
}

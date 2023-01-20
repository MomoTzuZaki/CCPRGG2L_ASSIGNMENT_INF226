package Classesandobjects;

public class App {
    public static void main(String[] args) {

        Character Knight = new Character();

        Knight.strength = 10;
        Knight.agility = 5;
        Knight.intelligence = 0;
        Knight.name = "Chen";
        Knight.sayMyName();

       Character mage = new Character();
        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
       thief.name = "Gondar";
        thief.sayMyName();

        Character Archer = new Character();
        Archer.name= ("Reksai");
        Archer.strength=50;
        Archer.agility = 70;
        Archer.intelligence= 99;
        Archer.attack();
        
        
        Weapon Sword = new Weapon();

        Sword.Damage= 100;
        Sword.Name = "katana";
        Sword.Rarity = "Legendary";
        Sword.addDamage(5);
        System.out.print(Sword.showNameandRarity());

    
        
    

    }
}

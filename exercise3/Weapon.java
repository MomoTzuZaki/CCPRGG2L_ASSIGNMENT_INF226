package Classesandobjects;

public class Weapon {
    
    public static final Object ShowRarity = null;
    String Name;
    int Damage;
    int addDamage;
    String Rarity;
    public Object showName;
    
    
    void addDamage (int additionaldamage) {
        int newDamage = this.Damage + additionaldamage;

        System.out.println("Damage increased from "+ this.Damage + " to "+ newDamage);
        this.Damage = newDamage;
    
    }

    String showNameandRarity() {
    return "Name: " + Name + "\n" + "Rarity: " + Rarity;   

   }

}




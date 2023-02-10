public class App {
    
    public static void main (String[]args) throws Exception {

         // Polymorphic Variable 
         // item in form of a diaper
        GroceryItem item1 = new Diaper();
        item1.name = "Huggies";
        item1.price = 50;
        item1.showItemName(); 

        // Item in form of a softdrink
         GroceryItem item2 = new Softdrinks();
         item2.name = "Mountain Dew";
         item2.price = 50;
         item2.showItemName();

        // Cashier object 
         Cashier c1 = new Cashier();

         // Polymorphic parameter
         c1.checkOut(item1);
         c1.checkPrice(item1);
         
         c1.checkOut(item2);
         c1.checkPrice(item2);

         GroceryItem[] itemArray = new GroceryItem[2];

         itemArray[0] = item1;
         itemArray[1] = item2;

         double totalAmount = 0.00;
         for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();
            System.out.println(itemArray[i].price);
   
         totalAmount += itemArray[i].price;  
    
        } 
 
         System.out.println(totalAmount);

        // Pet mypet = new pet();

         Cat mycat = new Cat();
         mycat.eat();

    }
}

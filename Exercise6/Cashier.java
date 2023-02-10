public class Cashier {

    public void checkOut(GroceryItem item){
       System.out.println(" You have purchased this item " + item.name);
    }

    public void checkPrice(GroceryItem item){
        System.out.println("Item price is " + item.price);

    }

}

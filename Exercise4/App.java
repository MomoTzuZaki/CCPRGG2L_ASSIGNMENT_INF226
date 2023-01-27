package Exercise4;

    public class App {
        public static void main(String[]args) throws Exception{
    
    
            Person me =new Person ("Andrei",19);
            Person Friend =new Person ("Juswa",19);
            me.addFriend(Friend);
            
            Person Classmate =new Person ("Raven",19);
            Person Classmate2 =new Person ("Ronin",19);
            Person Classmate3 = new Person ("Sig",19);
            me.addClassmate(Classmate);
            me.addClassmate(Classmate2);
            me.addClassmate(Classmate3);

        System.out.println();

            Pet Dog = new Pet("Cookie ",3,me);
            Dog.showOwner();

            Car superCar = new Car ("White over Black","Bugatti",me);
            superCar.showOwner();
        } 
        
    }

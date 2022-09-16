
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class VendingMachine {

    public static class Item {
        public Item (int id, String name, int amount, int quantity) {
            this.id = id;
            this.name = name;
            this.amount = amount;
            this.quantity = quantity;
        }

        int id;
        String name;
        int amount;
        int quantity;
    }
 
    //Default Wallet
    public static  void main(String[] args) {
        int Wallet = 1000;

        List<Item> items = new ArrayList<>();

        //Adding items in vending machine
        Item chips = new Item(1, "lays", 20, 10);
        Item pepsi = new Item(2, "pepsi", 15, 10);
        Item redbull = new Item(3, "Redbull", 100, 10);
        Item cake = new Item(4, "Fruit Cake", 100, 10);
    
    
    //Pushing items in list
    items.add(chips);
    items.add(pepsi);
    items.add(redbull);
    items.add(cake);

    System.out.println("__________________________");
    System.out.printf("|%10s |%10s |%10s |%10s|\n","S.no","Item","Price","Qty");

    for(int i=0; i<items.size();i++){
        System.out.printf("|%10s |%10s |%10s |%10s|\n",items.get(i).id, items.get(i).name, items.get(i).amount, items.get(i).quantity);
    }

    System.out.println("____________________________");
    
    int selection = -1;

    while(selection != 11) {
        System.out.println("____________________________");
        System.out.printf("|%10s |%10s |%10s |%10s |%10s\n",
                          "=> Press 0 to get to balance",
                          "=> Press 1-"+items.size()+"to buy item",
                          "=> Press 99 to add item",
                          "=> Press 88 to list items",
                          "=> Press 11 to exit");
        System.out.println("__________________________");
        Scanner sc = new Scanner(System.in);
        selection = sc.nextInt();
        
        if(selection == 0){
            System.out.println("Your balance is:"+ Wallet);
        }
        if(selection == 99){
            System.out.println("Enter Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Enter Amout: ");
            int amount = sc.nextInt();
            System.out.println("Enter Qty:");
            int qty = sc.nextInt();
            Item item = new Item(items.size()+1, name, amount, qty);
            
            items.add(item);
            System.out.println("Item Added!");
        }
        if(selection == 88){
            System.out.println("___________________________");
            System.out.printf("|%10s |%10s |%10s |%10s\n", "S.no","Item","Price","Qty");

            for(int i=0; i<items.size(); i++){
                System.out.printf("|%10s |%10s |%10s |%10s\n", items.get(i).id,items.get(i).name,items.get(i).amount,items.get(i).quantity);
            }

            System.out.println("_________________________");
        } else if(selection>0 && selection<=items.size()){
            Item selected = items.get(selection-1);

            if(selected.quantity<1){
                System.out.println(selected.name+" not available!");
            } else if(Wallet<selected.amount){
                System.out.println("Insufficient funds!");
            } else {
                selected.quantity = selected.quantity-1;
                Wallet = Wallet - selected.amount;
                System.out.println(selected.name+"Purchased successful!");
            }
        } else if(selection == 11){
            System.out.println("Bye");
        }
    }
    
    }
   
}
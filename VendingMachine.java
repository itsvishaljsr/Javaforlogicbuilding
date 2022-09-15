import java.lang.invoke.VarHandle.AccessMode;
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

    for(int i=0; items.size();i++){
        System.out.printf("|%10s |%10s |%10s |%10s|\n",items.get(i).id, items.get(i).name, items.get(i).amount, items.get(i).quantity);
    }

    System.out.println("____________________________");
    
    int selection = -1;

    while(selection != 11) {
        System.out.println("____________________________");
        System.out.printf("|%10s |%10s |%10s |%10s |%10s");
    }
    
    }
   
}
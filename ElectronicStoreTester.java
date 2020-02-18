// Author: Deniz Erdem 101161756
// Date: January 31, 2020
// Class: COMP 1406

import java.util.Scanner;


public class ElectronicStoreTester{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("My store has these items:");

        ElectronicStore electronicStore = new ElectronicStore("deniz");

        electronicStore.populate();
        electronicStore.printStock();

        String itemName = "";

        while(true) {
            System.out.println("What would you like to search for?:");

            itemName = scanner.next();

            if (itemName.equals("quit")) {
                break;
            } else if (electronicStore.searchStock(itemName)) {
                System.out.println("Match Found");
            } else {
                System.out.println("No Match");
            }
        }

        System.out.println("Goodbye");
    }
}
import java.util.ArrayList;

public class ElectronicStore {
    private String storeName;
    private Desktop[] desktops;
    private Laptop[] laptops;
    private Fridge[] fridges;

    private void printAStock(Object[] stock) {
        for(int i = 0; i < 3; i++){
            System.out.println(stock[i]);
        }
    }

    public ElectronicStore() {
        this("");
    }

    public ElectronicStore(String storeName) {
        this.storeName = storeName;

        this.desktops = new Desktop[3];
        this.laptops = new Laptop[3];
        this.fridges = new Fridge[3];
    }

    // Populate the stock of desktops, laptops, and fridges with values
    public void populate() {
        desktops[0] = new Desktop(4.2, 16, 500, true);
        desktops[1] = new Desktop(3.5, 12, 256, false);
        desktops[2] = new Desktop(5.5, 16, 500, true);

        laptops[0] = new Laptop(2.4, 8, 256, true, 14);
        laptops[1] = new Laptop(2.1, 6, 128, false, 13);
        laptops[2] = new Laptop(3.1, 12, 512, true, 15);

        fridges[0] = new Fridge(14.6, true, "space grey");
        fridges[1] = new Fridge(9.6, false, "white");
        fridges[2] = new Fridge(18, true, "metallic blue");
    }

    public void printStock() {
        printAStock(desktops);
        printAStock(laptops);
        printAStock(fridges);
    }

    public boolean searchStock(String itemNameRaw) {
        String itemName = itemNameRaw.toLowerCase(); // set any item name to lower case to ignore case

        // Add all arrays to a unified array list
        ArrayList<Object[]> allStock = new ArrayList<Object[]>();
        allStock.add(desktops);
        allStock.add(laptops);
        allStock.add(fridges);

        for (int i = 0; i < allStock.size(); i++) { // loop through all arrays
            for (int j = 0; j < allStock.get(i).length; j++) { // loop through all objects
                Object item = allStock.get(i)[j]; // get current object
                String itemToStringLower = item.toString().toLowerCase(); // set to lower case just like item name to ignore case

                if (itemToStringLower.contains(itemName)) {
                    return true;
                }
            }
        }

        return false;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}

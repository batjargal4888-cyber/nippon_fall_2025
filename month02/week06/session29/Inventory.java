public class Inventory {
    String[] items;

    // Constructor
    public Inventory(String[] initialItems) {
        this.items = initialItems;
    }

    // Бараа хайх функц
    public boolean findItem(String itemToFind) {
        for(String item : items) {
            if(item.equals(itemToFind)) {
                return true;
            }
        }
        return false;
    }    
}

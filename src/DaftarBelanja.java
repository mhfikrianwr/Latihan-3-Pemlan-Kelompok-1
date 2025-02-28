package src;
import java.util.*;
public class DaftarBelanja {
    private static List<Item> shoppingList = new ArrayList<>(); 

    public DaftarBelanja() {
        // Default Constructor
    }

    public void addItem(Item item) {
        shoppingList.add(item);
        System.out.println("Item " + item.getItem_name() + " has been added to shopping list.");
    }

    public void removeItem(String itemName) {
        Iterator<Item> iterator = shoppingList.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getItem_name().equalsIgnoreCase(itemName)) {
                iterator.remove();
                System.out.println("Item " + itemName + " has been removed from shoppig list.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("ERROR: Item " + itemName + " not found in shopping list.");
        }
    }

    public void showShoppingList() {
        if (shoppingList.isEmpty()) {
            System.out.println("Shopping list is empty.");
        } else {
            int count = 0;
            System.out.println("-----Shopping List-----");
            for (Item sample : shoppingList) {
                count++;
                System.out.println(count + ". " + sample.getItem_name());
            }
            System.out.println("-----------------------");
        }
    }
}
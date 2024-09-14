package MapInventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        return inventory.get(productId);
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        List<String> productIds = new ArrayList<>();
        for (String productId : inventory.keySet()) {
            if (inventory.get(productId) == price) {
                productIds.add(productId);
            }
        }
        return productIds;
    }
}

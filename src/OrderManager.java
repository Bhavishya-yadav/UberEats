import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    Map<String, Order> orderMap;

    public OrderManager() {
        orderMap = new HashMap<>();
    }
    
    public void placeOrder(Order order) {
        orderMap.put(order.getOrderId(), order);
    }

    public Order getOrderById(String orderId) throws Exception {
        if(!orderMap.containsKey(orderId)) {
            throw new Exception("No Such Order exist!!!");
        }
        return orderMap.get(orderId);
    }
}

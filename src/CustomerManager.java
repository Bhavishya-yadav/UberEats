import java.util.HashMap;
import java.util.Map;

public class CustomerManager {
    Map<String, Customer> customersMap;

    public CustomerManager() {
        customersMap = new HashMap<>();
    }
    
    public void addCustomer(Customer customer) {
        customersMap.put(customer.getId(), customer);
    }

    public void removeCustomer(String customerId) throws Exception {
        if(!customersMap.containsKey(customerId)) {
            throw new Exception("Customer Doesn't exist");
        }
        customersMap.remove(customerId);
    }

    public void updateCustomer(Customer customer) throws Exception {
        if(!customersMap.containsKey(customer.getId())) {
            throw new Exception("Customer Doesn't exist");
        }
        customersMap.put(customer.getId(), customer);
    }

    public Customer getCustomerById(String customerId) throws Exception {
        if(!customersMap.containsKey(customerId)) {
            throw new Exception("Customer Doesn't exist");
        }
        return customersMap.get(customerId);
    }
}

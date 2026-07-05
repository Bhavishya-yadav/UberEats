package com.java;

import java.util.List;
import java.util.Set;

import com.java.payment.paymentConfig.CashConfig;
import com.java.payment.paymentConfig.UpiPaymentConfig;
import com.java.payment.paymentEnum.PaymentMode;


public class UberEatsFEApplication {

    private static final CustomerManager customerManager = CustomerManager.getInstance();
    private static final RestaurantManager restaurantManager = RestaurantManager.getInstance();

    private static final UberEatsOrderAndPaymentOrchestrator orderPaymentOrchestrator = new UberEatsOrderAndPaymentOrchestrator();
    public static void main(String[] args) throws Exception {

        // -------------------- Register Restaurants --------------------

        Restaurant dominos = new Restaurant("Dominos", "Bangalore", new FoodMenu());
        Restaurant behrouz = new Restaurant("Behrouz Biryani", "Bangalore", new FoodMenu());
        Restaurant haldiram = new Restaurant("Haldiram", "Delhi", new FoodMenu());

        restaurantManager.addRestaurant(dominos);
        restaurantManager.addRestaurant(behrouz);
        restaurantManager.addRestaurant(haldiram);

        // -------------------- Add Food Items --------------------

        dominos.addItemInFoodMenu(new FoodItem("Margherita Pizza",
                CuisineType.ITALIAN, true, 250));

        dominos.addItemInFoodMenu(new FoodItem("Farmhouse Pizza",
                CuisineType.ITALIAN, true, 350));

        behrouz.addItemInFoodMenu(new FoodItem("Chicken Biryani",
                CuisineType.INDIAN, false, 400));

        behrouz.addItemInFoodMenu(new FoodItem("Veg Biryani",
                CuisineType.INDIAN, true, 280));

        haldiram.addItemInFoodMenu(new FoodItem("Chole Bhature",
                CuisineType.INDIAN, true, 180));

        haldiram.addItemInFoodMenu(new FoodItem("Raj Kachori",
                CuisineType.INDIAN, true, 160));


        // -------------------- Register Users --------------------

        Customer customer1 = new Customer("Bhavishya", "Bangalore");
        Customer customer2 = new Customer("Amit", "Delhi");

        customerManager.addCustomer(customer1);
        customerManager.addCustomer(customer2);


        // // -------------------- Update Customer --------------------

        // customer1.updateAddress("Whitefield, Bangalore");


        // -------------------- Search Restaurant --------------------

        Set<Restaurant> restaurantsInBangalore = restaurantManager.getAllRestaurantsInCity("Bangalore");

        Set<Restaurant> restaurantsWithName = restaurantManager.searchRestaurantByName("Dominos");

        System.out.println("----------------------START----------------------------");

        System.out.println(restaurantsInBangalore);

        System.out.println("----------------------END----------------------------");

        System.out.println("----------------------START----------------------------");

        System.out.println(restaurantsWithName);

        System.out.println("----------------------END----------------------------");


        // -------------------- View Menu --------------------

        System.out.println("----------------------START----------------------------");

        System.out.println(dominos.getFoodMenu());

        System.out.println("----------------------END----------------------------");

        System.out.println("----------------------START----------------------------");

        System.out.println(behrouz.getFoodMenu());

        System.out.println("----------------------END----------------------------");


        // -------------------- Filter Food --------------------

        System.out.println("----------------------START----------------------------");

        System.out.println(dominos.getFilteredFoodItems(List.of(new CuisineBasedFilter(CuisineType.ITALIAN))));

        System.out.println("----------------------END----------------------------");

        System.out.println("----------------------START----------------------------");

        System.out.println(behrouz.getFilteredFoodItems(List.of(new VegNonVegFilter(true))));

        System.out.println("----------------------END----------------------------");


        // -------------------- Customer1 Cart --------------------

        

        FoodItem pizza = dominos.getFilteredFoodItems(List.of(new FoodNameFilter("Farmhouse Pizza"))).getFirst();
        FoodItem biryani = behrouz.getFilteredFoodItems(List.of(new FoodNameFilter("Veg Biryani"))).getFirst();

        customerManager.addItemInCart(customer1.getId(), pizza);
        customerManager.addItemInCart(customer1.getId(), biryani);

        System.out.println("----------------------START----------------------------");

        System.out.println(customer1.getCart());

        System.out.println("----------------------END----------------------------");

        customerManager.removeItemFromCart(customer1.getId(), biryani);

        System.out.println("----------------------START----------------------------");

        System.out.println(customer1.getCart());

        System.out.println("----------------------END----------------------------");


        // // -------------------- Apply Coupon --------------------

        // Coupon coupon = couponManager.getCoupon("WELCOME100");

        // Bill bill = billManager.generateBill(cart1, coupon);

        // bill.printBill();


        // -------------------- Place Order using UPI --------------------

        String orderId1 = orderPaymentOrchestrator.handleOrderAndPayment(customer1.getCart(), customer1.getId(), dominos.getRestaurantId(), "Company Bagh, Rewari, Haryana", PaymentMode.UPI, new UpiPaymentConfig("bhavishya@axl"));


        // // -------------------- Customer2 Cart --------------------

        // Cart cart2 = new Cart();

        FoodItem choleBhature = haldiram.getFilteredFoodItems(List.of(new FoodNameFilter("Chole Bhature"))).getFirst();

        customerManager.addItemInCart(customer2.getId(), choleBhature);

        System.out.println("----------------------START----------------------------");

        System.out.println(customer2.getCart());

        System.out.println("----------------------END----------------------------");


        // // -------------------- Place Order using Cash --------------------

        String orderId2 = orderPaymentOrchestrator.handleOrderAndPayment(customer2.getCart(), customer2.getId(), haldiram.getRestaurantId(), "Yogi Ji's Kothi, Gorakhpur, Uttar Pradesh", PaymentMode.CASH, new CashConfig());

        System.out.println(orderId2);

        orderPaymentOrchestrator.collectCashOfCODOrder(orderId2);


        // // -------------------- Order History --------------------

        // orderManager.getOrdersByCustomer(customer1.getId());

        // orderManager.getOrdersByCustomer(customer2.getId());


        // // -------------------- Cancel Order --------------------

        // orderManager.cancelOrder("<order-id>");
    }
}

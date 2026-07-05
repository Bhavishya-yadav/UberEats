## Uber Eats

Link - https://github.com/mayankbansal93/lld-food-delivery-zomato-swiggy

## Requirements
```
Restaurant can register themselves.
User can create, update, delete, get their profiles.
User can search for the restaurant using restaurant name, city name.
Restaurant can add, update foodmenu.
User can see the foodmenu. User can get the food items based on Meal type or Cuisine type.
User can add/remove items to/from the cart. User can get all the items of the cart. 
User can place or cancel the order. User can get all the orders ordered by him/her.
User can apply the coupons. User can get the detailed bill containing tax details.
User can made a payment using different modes of payment - credit card, wallet, etc.
Delivery boy can get all the deliveries made by him using his Id.
User can get the order status anytime. Success, Out for Delivery, Delivered, etc.
```

## Output
```
bhavyada@bhavyada-mac UberEats %  /usr/bin/env /Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetails
InExceptionMessages -cp /Users/bhavyada/Documents/FinalLLd/UberEats/bin com.java.app.UberEatsFEApplication 
----------------------START----------------------------
[Restaurant{restaurantId='db686d46-8d9c-4958-9802-5c8d5b728552', restaurantName='Behrouz Biryani', cityName='Bangalore', foodMenu=Menu ID : 9ed35004-a028-4045-b3dd-919ab136a98d
Food Items:
FoodItem{foodItemId='f2dbda1d-3b2e-4ed7-a84c-8e740d57069d', name='Chicken Biryani', cuisineType=INDIAN, isVeg=false, price=400}
FoodItem{foodItemId='6fa256bb-2255-4ac6-a3ab-d0ef124f3490', name='Veg Biryani', cuisineType=INDIAN, isVeg=true, price=280}
}, Restaurant{restaurantId='cf53eb29-6ed4-4e9c-9172-d9076bae6629', restaurantName='Dominos', cityName='Bangalore', foodMenu=Menu ID : 5ebf6a0b-8352-455c-8b2f-8ee29bf5a9a8
Food Items:
FoodItem{foodItemId='163992b1-2740-49c0-aae5-0311ac689206', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}
FoodItem{foodItemId='6ae8cb04-a192-4cbb-ac67-35246e9d8463', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}
}]
----------------------END----------------------------
----------------------START----------------------------
[Restaurant{restaurantId='cf53eb29-6ed4-4e9c-9172-d9076bae6629', restaurantName='Dominos', cityName='Bangalore', foodMenu=Menu ID : 5ebf6a0b-8352-455c-8b2f-8ee29bf5a9a8
Food Items:
FoodItem{foodItemId='163992b1-2740-49c0-aae5-0311ac689206', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}
FoodItem{foodItemId='6ae8cb04-a192-4cbb-ac67-35246e9d8463', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}
}]
----------------------END----------------------------
----------------------START----------------------------
Menu ID : 5ebf6a0b-8352-455c-8b2f-8ee29bf5a9a8
Food Items:
FoodItem{foodItemId='163992b1-2740-49c0-aae5-0311ac689206', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}
FoodItem{foodItemId='6ae8cb04-a192-4cbb-ac67-35246e9d8463', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}

----------------------END----------------------------
----------------------START----------------------------
Menu ID : 9ed35004-a028-4045-b3dd-919ab136a98d
Food Items:
FoodItem{foodItemId='f2dbda1d-3b2e-4ed7-a84c-8e740d57069d', name='Chicken Biryani', cuisineType=INDIAN, isVeg=false, price=400}
FoodItem{foodItemId='6fa256bb-2255-4ac6-a3ab-d0ef124f3490', name='Veg Biryani', cuisineType=INDIAN, isVeg=true, price=280}

----------------------END----------------------------
----------------------START----------------------------
[FoodItem{foodItemId='163992b1-2740-49c0-aae5-0311ac689206', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}, FoodItem{foodItemId='6ae8cb04-a192-4cbb-ac67-35246e9d8463', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}]
----------------------END----------------------------
----------------------START----------------------------
[FoodItem{foodItemId='6fa256bb-2255-4ac6-a3ab-d0ef124f3490', name='Veg Biryani', cuisineType=INDIAN, isVeg=true, price=280}]
----------------------END----------------------------
----------------------START----------------------------
Cart ID: 60928538-00b1-43a1-ac47-3f87071f2d61
Items in Cart:
Food: Veg Biryani, Quantity: 1, Price: ₹280, Total: ₹280
Food: Farmhouse Pizza, Quantity: 1, Price: ₹350, Total: ₹350
---------------------------------
Total Amount: ₹630
----------------------END----------------------------
----------------------START----------------------------
Cart ID: 60928538-00b1-43a1-ac47-3f87071f2d61
Items in Cart:
Food: Farmhouse Pizza, Quantity: 1, Price: ₹350, Total: ₹350
---------------------------------
Total Amount: ₹350
----------------------END----------------------------

Bill for order
Bill{cartAmount=350, discount=35.0, amountAfterDiscount=315.0, tax=15.75, finalBillAmount=330.75, coupons=[Coupon{couponCode='SAVE10', description='10% OFF', discountStrategy=com.java.strategy.coupon.PercentageDiscountStrategy@548a9f61}], taxes=[CGST, SGST]}

Payment processing
Payment done via UPI: bhavishya@axl
Payment is successful!!! via UPI
----------------------START----------------------------
Cart ID: 2448cb47-e7f8-4227-ac87-c95ffa4fe7b7
Items in Cart:
Food: Chole Bhature, Quantity: 1, Price: ₹180, Total: ₹180
---------------------------------
Total Amount: ₹180
----------------------END----------------------------

Bill for order
Bill{cartAmount=180, discount=10.0, amountAfterDiscount=170.0, tax=8.5, finalBillAmount=178.5, coupons=[Coupon{couponCode='SAVE10', description='Flat ₹10 OFF', discountStrategy=com.java.strategy.coupon.FlatDiscountStrategy@59f99ea}], taxes=[CGST, SGST]}

Payment will done via COD!!!
Payment is successful!!! via CASH
Cash collect for orderId: 2105e125-05dc-4666-aebe-127c4afc694d amount: 178
```
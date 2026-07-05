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
bhavyada@bhavyada-mac UberEats %  /usr/bin/env /Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptionMessage
s -cp /Users/bhavyada/Documents/FinalLLd/UberEats/bin com.java.UberEatsFEApplication 
----------------------START----------------------------
[Restaurant{restaurantId='1409df1b-dcf5-4c2d-96ce-7c591bc00751', restaurantName='Behrouz Biryani', cityName='Bangalore', foodMenu=Menu ID : 2eff33e2-98db-4821-b513-d30d68f95b8a
Food Items:
FoodItem{foodItemId='affc92ad-185a-4faa-a902-133438938653', name='Chicken Biryani', cuisineType=INDIAN, isVeg=false, price=400}
FoodItem{foodItemId='dc4a144a-33e7-4624-9156-31624b2062ce', name='Veg Biryani', cuisineType=INDIAN, isVeg=true, price=280}
}, Restaurant{restaurantId='c1333a89-a0b9-4938-b1c2-531a522509a6', restaurantName='Dominos', cityName='Bangalore', foodMenu=Menu ID : 8d6f36c1-9059-4fd7-b218-b79b96e43c46
Food Items:
FoodItem{foodItemId='a1c9e441-132e-46db-bdae-24803d4ebb3a', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}
FoodItem{foodItemId='3113816f-2c65-4e68-81ff-6fd20e1168e7', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}
}]
----------------------END----------------------------
----------------------START----------------------------
[Restaurant{restaurantId='c1333a89-a0b9-4938-b1c2-531a522509a6', restaurantName='Dominos', cityName='Bangalore', foodMenu=Menu ID : 8d6f36c1-9059-4fd7-b218-b79b96e43c46
Food Items:
FoodItem{foodItemId='a1c9e441-132e-46db-bdae-24803d4ebb3a', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}
FoodItem{foodItemId='3113816f-2c65-4e68-81ff-6fd20e1168e7', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}
}]
----------------------END----------------------------
----------------------START----------------------------
Menu ID : 8d6f36c1-9059-4fd7-b218-b79b96e43c46
Food Items:
FoodItem{foodItemId='a1c9e441-132e-46db-bdae-24803d4ebb3a', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}
FoodItem{foodItemId='3113816f-2c65-4e68-81ff-6fd20e1168e7', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}

----------------------END----------------------------
----------------------START----------------------------
Menu ID : 2eff33e2-98db-4821-b513-d30d68f95b8a
Food Items:
FoodItem{foodItemId='affc92ad-185a-4faa-a902-133438938653', name='Chicken Biryani', cuisineType=INDIAN, isVeg=false, price=400}
FoodItem{foodItemId='dc4a144a-33e7-4624-9156-31624b2062ce', name='Veg Biryani', cuisineType=INDIAN, isVeg=true, price=280}

----------------------END----------------------------
----------------------START----------------------------
[FoodItem{foodItemId='a1c9e441-132e-46db-bdae-24803d4ebb3a', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}, FoodItem{foodItemId='3113816f-2c65-4e68-81ff-6fd20e1168e7', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}]
----------------------END----------------------------
----------------------START----------------------------
[FoodItem{foodItemId='dc4a144a-33e7-4624-9156-31624b2062ce', name='Veg Biryani', cuisineType=INDIAN, isVeg=true, price=280}]
----------------------END----------------------------
----------------------START----------------------------
Cart ID: 6074ba1d-dff9-4b4c-8fcf-86443722c951
Items in Cart:
Food: Veg Biryani, Quantity: 1, Price: ₹280, Total: ₹280
Food: Farmhouse Pizza, Quantity: 1, Price: ₹350, Total: ₹350
---------------------------------
Total Amount: ₹630
----------------------END----------------------------
----------------------START----------------------------
Cart ID: 6074ba1d-dff9-4b4c-8fcf-86443722c951
Items in Cart:
Food: Farmhouse Pizza, Quantity: 1, Price: ₹350, Total: ₹350
---------------------------------
Total Amount: ₹350
----------------------END----------------------------
Payment processing
Payment done via UPI: bhavishya@axl
BY: orderId added in map b4dfb76c-0395-4863-bed5-e9455ab4c14a
Payment is successful!!! via UPI
----------------------START----------------------------
Cart ID: 40658a91-6380-47e1-8834-eb20096e50f5
Items in Cart:
Food: Chole Bhature, Quantity: 1, Price: ₹180, Total: ₹180
---------------------------------
Total Amount: ₹180
----------------------END----------------------------
Payment will done via COD!!!
BY: orderId added in map 08eca1f6-40d6-4a33-af3e-546db9caf224
Payment is successful!!! via CASH
08eca1f6-40d6-4a33-af3e-546db9caf224
Cash collect for orderId: 08eca1f6-40d6-4a33-af3e-546db9caf224 amount: 180
```
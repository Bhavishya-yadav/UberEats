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
[Restaurant{restaurantId='74acd17c-f862-41fc-bdd5-47ac93b5e017', restaurantName='Behrouz Biryani', cityName='Bangalore', foodMenu=Menu ID : 440608d4-df2d-4b89-8798-498ed6d52b43
Food Items:
FoodItem{foodItemId='456e6e58-4a77-4d76-917e-e48c16856eca', name='Chicken Biryani', cuisineType=INDIAN, isVeg=false, price=400}
FoodItem{foodItemId='819e82e6-df80-4412-a10c-05e699131ce3', name='Veg Biryani', cuisineType=INDIAN, isVeg=true, price=280}
}, Restaurant{restaurantId='d9bb3d52-e1ea-493d-8fc6-3f2d298496ec', restaurantName='Dominos', cityName='Bangalore', foodMenu=Menu ID : c3771ab0-7c16-4185-9e86-59ca42e460be
Food Items:
FoodItem{foodItemId='b1a07fe0-80b7-497f-ae88-3377266affa9', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}
FoodItem{foodItemId='5872be0b-d3f4-447e-be3a-0211d244ed68', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}
}]
----------------------END----------------------------
----------------------START----------------------------
[Restaurant{restaurantId='d9bb3d52-e1ea-493d-8fc6-3f2d298496ec', restaurantName='Dominos', cityName='Bangalore', foodMenu=Menu ID : c3771ab0-7c16-4185-9e86-59ca42e460be
Food Items:
FoodItem{foodItemId='b1a07fe0-80b7-497f-ae88-3377266affa9', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}
FoodItem{foodItemId='5872be0b-d3f4-447e-be3a-0211d244ed68', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}
}]
----------------------END----------------------------
----------------------START----------------------------
Menu ID : c3771ab0-7c16-4185-9e86-59ca42e460be
Food Items:
FoodItem{foodItemId='b1a07fe0-80b7-497f-ae88-3377266affa9', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}
FoodItem{foodItemId='5872be0b-d3f4-447e-be3a-0211d244ed68', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}

----------------------END----------------------------
----------------------START----------------------------
Menu ID : 440608d4-df2d-4b89-8798-498ed6d52b43
Food Items:
FoodItem{foodItemId='456e6e58-4a77-4d76-917e-e48c16856eca', name='Chicken Biryani', cuisineType=INDIAN, isVeg=false, price=400}
FoodItem{foodItemId='819e82e6-df80-4412-a10c-05e699131ce3', name='Veg Biryani', cuisineType=INDIAN, isVeg=true, price=280}

----------------------END----------------------------
----------------------START----------------------------
[FoodItem{foodItemId='b1a07fe0-80b7-497f-ae88-3377266affa9', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}, FoodItem{foodItemId='5872be0b-d3f4-447e-be3a-0211d244ed68', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}]
----------------------END----------------------------
----------------------START----------------------------
[FoodItem{foodItemId='819e82e6-df80-4412-a10c-05e699131ce3', name='Veg Biryani', cuisineType=INDIAN, isVeg=true, price=280}]
----------------------END----------------------------
----------------------START----------------------------
Cart ID: 656ce008-9c99-4001-b520-990329f38e55
Items in Cart:
Food: Veg Biryani, Quantity: 1, Price: ₹280, Total: ₹280
Food: Farmhouse Pizza, Quantity: 1, Price: ₹350, Total: ₹350
---------------------------------
Total Amount: ₹630
----------------------END----------------------------
----------------------START----------------------------
Cart ID: 656ce008-9c99-4001-b520-990329f38e55
Items in Cart:
Food: Farmhouse Pizza, Quantity: 1, Price: ₹350, Total: ₹350
---------------------------------
Total Amount: ₹350
----------------------END----------------------------
Payment processing
Payment done via UPI: bhavishya@axl
Payment is successful!!! via UPI
----------------------START----------------------------

Bill for order
Bill{cartAmount=350, discount=35.0, amountAfterDiscount=315.0, tax=15.75, finalBillAmount=330.75, coupons=[Coupon{couponCode='SAVE10', description='10% OFF', discountStrategy=com.java.strategy.coupon.PercentageDiscountStrategy@28feb3fa}], taxes=[CGST, SGST]}

----------------------END----------------------------
----------------------START----------------------------
Cart ID: 5600dcc5-8b33-4aba-b351-8ea63deae4c0
Items in Cart:
Food: Chole Bhature, Quantity: 1, Price: ₹180, Total: ₹180
---------------------------------
Total Amount: ₹180
----------------------END----------------------------
Payment will done via COD!!!
Payment is successful!!! via CASH
----------------------START----------------------------

Bill for order
Bill{cartAmount=180, discount=10.0, amountAfterDiscount=170.0, tax=8.5, finalBillAmount=178.5, coupons=[Coupon{couponCode='SAVE10', description='Flat ₹10 OFF', discountStrategy=com.java.strategy.coupon.FlatDiscountStrategy@27efef64}], taxes=[CGST, SGST]}

----------------------END----------------------------
Cash collect for orderId: 82a7e897-a5d3-468b-a849-d09f807fa4f0 amount: 178
```
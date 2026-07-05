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
[Restaurant{restaurantId='2b5d29fa-3bb5-4318-bb8e-4d86cd6c69ca', restaurantName='Behrouz Biryani', cityName='Bangalore', foodMenu=Menu ID : 565df025-c27d-4f06-82af-5007b4fa9dd0
Food Items:
FoodItem{foodItemId='0eb69865-5303-4fdb-8027-5955afb4c513', name='Chicken Biryani', cuisineType=INDIAN, isVeg=false, price=400}
FoodItem{foodItemId='a794fb21-fb9b-42ec-80e9-3cce8281698d', name='Veg Biryani', cuisineType=INDIAN, isVeg=true, price=280}
}, Restaurant{restaurantId='c0b9b478-adce-43ac-b319-b89237674788', restaurantName='Dominos', cityName='Bangalore', foodMenu=Menu ID : 88fe88cf-f470-4c3e-9469-29c8d45467a4
Food Items:
FoodItem{foodItemId='d69b33ef-2edc-4b94-aa32-dc4bdcc6ec32', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}
FoodItem{foodItemId='c31e676e-4db9-440f-b171-e31e0e784700', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}
}]
----------------------END----------------------------
----------------------START----------------------------
[Restaurant{restaurantId='c0b9b478-adce-43ac-b319-b89237674788', restaurantName='Dominos', cityName='Bangalore', foodMenu=Menu ID : 88fe88cf-f470-4c3e-9469-29c8d45467a4
Food Items:
FoodItem{foodItemId='d69b33ef-2edc-4b94-aa32-dc4bdcc6ec32', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}
FoodItem{foodItemId='c31e676e-4db9-440f-b171-e31e0e784700', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}
}]
----------------------END----------------------------
----------------------START----------------------------
Menu ID : 88fe88cf-f470-4c3e-9469-29c8d45467a4
Food Items:
FoodItem{foodItemId='d69b33ef-2edc-4b94-aa32-dc4bdcc6ec32', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}
FoodItem{foodItemId='c31e676e-4db9-440f-b171-e31e0e784700', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}

----------------------END----------------------------
----------------------START----------------------------
Menu ID : 565df025-c27d-4f06-82af-5007b4fa9dd0
Food Items:
FoodItem{foodItemId='0eb69865-5303-4fdb-8027-5955afb4c513', name='Chicken Biryani', cuisineType=INDIAN, isVeg=false, price=400}
FoodItem{foodItemId='a794fb21-fb9b-42ec-80e9-3cce8281698d', name='Veg Biryani', cuisineType=INDIAN, isVeg=true, price=280}

----------------------END----------------------------
----------------------START----------------------------
[FoodItem{foodItemId='d69b33ef-2edc-4b94-aa32-dc4bdcc6ec32', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}, FoodItem{foodItemId='c31e676e-4db9-440f-b171-e31e0e784700', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}]
----------------------END----------------------------
----------------------START----------------------------
[FoodItem{foodItemId='a794fb21-fb9b-42ec-80e9-3cce8281698d', name='Veg Biryani', cuisineType=INDIAN, isVeg=true, price=280}]
----------------------END----------------------------
----------------------START----------------------------
Cart ID: f4f99355-2631-442c-8506-dda6493a57c5
Items in Cart:
Food: Farmhouse Pizza, Quantity: 1, Price: ₹350, Total: ₹350
Food: Veg Biryani, Quantity: 1, Price: ₹280, Total: ₹280
---------------------------------
Total Amount: ₹630
----------------------END----------------------------
----------------------START----------------------------
Cart ID: f4f99355-2631-442c-8506-dda6493a57c5
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
----------------------END----------------------------
----------------------START----------------------------
Cart ID: 12746b64-bfd8-4fc0-812d-b00429cfdaf6
Items in Cart:
Food: Chole Bhature, Quantity: 1, Price: ₹180, Total: ₹180
---------------------------------
Total Amount: ₹180
----------------------END----------------------------

Bill for order
Bill{cartAmount=180, discount=10.0, amountAfterDiscount=170.0, tax=8.5, finalBillAmount=178.5, coupons=[Coupon{couponCode='SAVE10', description='Flat ₹10 OFF', discountStrategy=com.java.strategy.coupon.FlatDiscountStrategy@59f99ea}], taxes=[CGST, SGST]}

Payment will done via COD!!!
Payment is successful!!! via CASH
----------------------START----------------------------
----------------------END----------------------------
Cash collect for orderId: a7e43c9b-41db-4f33-a19a-56ea0c91a65c amount: 178
bhavyada@bhavyada-mac UberEats %  cd /Users/bhavyada/Documents/FinalLLd/UberEats ; /usr/bin/env /Library/Java/JavaVirtualMachines/temurin-2
1.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /Users/bhavyada/Documents/FinalLLd/UberEats/bin com.java.app.UberE
atsFEApplication 
----------------------START----------------------------
[Restaurant{restaurantId='412ee19b-2ec5-4791-aa0d-df030404a2bf', restaurantName='Behrouz Biryani', cityName='Bangalore', foodMenu=Menu ID : 53efe9a5-e3b4-4535-9259-f0766275e1a7
Food Items:
FoodItem{foodItemId='050417ac-bfb7-4dc7-bf81-9bb840ac6f2f', name='Chicken Biryani', cuisineType=INDIAN, isVeg=false, price=400}
FoodItem{foodItemId='abc91128-b89f-4d3f-838b-8d171ff8b938', name='Veg Biryani', cuisineType=INDIAN, isVeg=true, price=280}
}, Restaurant{restaurantId='9615179e-4576-4cf2-b735-8845e670445a', restaurantName='Dominos', cityName='Bangalore', foodMenu=Menu ID : 271c0038-4cf3-48c1-8b56-1b8215187cab
Food Items:
FoodItem{foodItemId='10226132-8c3c-48a4-99be-a7f60913be2f', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}
FoodItem{foodItemId='2f37b5b8-3b50-4432-b88a-a3d8d6d853bd', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}
}]
----------------------END----------------------------
----------------------START----------------------------
[Restaurant{restaurantId='9615179e-4576-4cf2-b735-8845e670445a', restaurantName='Dominos', cityName='Bangalore', foodMenu=Menu ID : 271c0038-4cf3-48c1-8b56-1b8215187cab
Food Items:
FoodItem{foodItemId='10226132-8c3c-48a4-99be-a7f60913be2f', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}
FoodItem{foodItemId='2f37b5b8-3b50-4432-b88a-a3d8d6d853bd', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}
}]
----------------------END----------------------------
----------------------START----------------------------
Menu ID : 271c0038-4cf3-48c1-8b56-1b8215187cab
Food Items:
FoodItem{foodItemId='10226132-8c3c-48a4-99be-a7f60913be2f', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}
FoodItem{foodItemId='2f37b5b8-3b50-4432-b88a-a3d8d6d853bd', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}

----------------------END----------------------------
----------------------START----------------------------
Menu ID : 53efe9a5-e3b4-4535-9259-f0766275e1a7
Food Items:
FoodItem{foodItemId='050417ac-bfb7-4dc7-bf81-9bb840ac6f2f', name='Chicken Biryani', cuisineType=INDIAN, isVeg=false, price=400}
FoodItem{foodItemId='abc91128-b89f-4d3f-838b-8d171ff8b938', name='Veg Biryani', cuisineType=INDIAN, isVeg=true, price=280}

----------------------END----------------------------
----------------------START----------------------------
[FoodItem{foodItemId='10226132-8c3c-48a4-99be-a7f60913be2f', name='Farmhouse Pizza', cuisineType=ITALIAN, isVeg=true, price=350}, FoodItem{foodItemId='2f37b5b8-3b50-4432-b88a-a3d8d6d853bd', name='Margherita Pizza', cuisineType=ITALIAN, isVeg=true, price=250}]
----------------------END----------------------------
----------------------START----------------------------
[FoodItem{foodItemId='abc91128-b89f-4d3f-838b-8d171ff8b938', name='Veg Biryani', cuisineType=INDIAN, isVeg=true, price=280}]
----------------------END----------------------------
----------------------START----------------------------
Cart ID: 3c3f2f07-5028-4e19-acdb-924e3cb578af
Items in Cart:
Food: Farmhouse Pizza, Quantity: 1, Price: ₹350, Total: ₹350
Food: Veg Biryani, Quantity: 1, Price: ₹280, Total: ₹280
---------------------------------
Total Amount: ₹630
----------------------END----------------------------
----------------------START----------------------------
Cart ID: 3c3f2f07-5028-4e19-acdb-924e3cb578af
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
Cart ID: 5191d2bb-c078-45ba-8795-6e56df9b48a4
Items in Cart:
Food: Chole Bhature, Quantity: 1, Price: ₹180, Total: ₹180
---------------------------------
Total Amount: ₹180
----------------------END----------------------------

Bill for order
Bill{cartAmount=180, discount=10.0, amountAfterDiscount=170.0, tax=8.5, finalBillAmount=178.5, coupons=[Coupon{couponCode='SAVE10', description='Flat ₹10 OFF', discountStrategy=com.java.strategy.coupon.FlatDiscountStrategy@59f99ea}], taxes=[CGST, SGST]}

Payment will done via COD!!!
Payment is successful!!! via CASH
Cash collect for orderId: 629ab0dc-0e15-4c30-b3c8-32751d4fb9ec amount: 178
```
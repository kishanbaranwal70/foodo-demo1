# foodo_backend
Backend of foodo

It is food delivery api containing multiple endpoint

Tools Used :- 
Backend :- Spring Boot
Database :- MongoDB
 

# Login :- 

POST :- http://foodobackend.herokuapp.com/login

Request :- {"password":" ",    "email":" "}

Response :- { "flag": true,  "msg": "login successful", "role": "Customer", "_id": ""}


# Signup :- 

POST :- http://foodobackend.herokuapp.com/signup

Request :- { "name":"Kishan", "email":"abc@gmail.com", "password":"password", "phone":8796966557, "address": "Banglore", "role":"Customer" }

Response :- {"flag": false,"msg": "User already exists", "_id": null }

# Get Request for Home page 

GET :- http://foodobackend.herokuapp.com/home-customer/{_id}

Response :- {"name": "Kishan", "address": "Banglore"}

# Add food 

POST :-  http://foodobackend.herokuapp.com/addfood

Request :- { "foodID":2, "restaurantID":"62e110a06268bb46a627d008","foodName":"Maggi", "cuisineType":"NorthIndian", "price": 50}

Response :- {"status" : " " ,"message": " "}

# Add Restaurant

POST :- http://foodobackend.herokuapp.com/addrestaurant

Resquest :- {"restaurantID":10, "name":"Spice Zone", "address":"East Bangalore", "owner":"Suryansh", "phoneno":9356442190 }

Response :-  {"flag" :" " ,status:" "}

# Search By Cuisine Type

GET :- http://foodobackend.herokuapp.com/searchResultsbyCuisine/{CuisineType}    CuisineType can be Mexican, SouthIndian, NorthIndian, Chinese, Italian, Continental

Response :- [{"name": "Burger King", "address": "Central Bangalore", "owner": "Ashutosh", "phoneno": "9666442190","_id": "62e250a2609284311f8c46c7", "resId": 0 }]


# Seach By Restautart and Cuisine Type

GET :- http://foodobackend.herokuapp.com/showRestaurantDetails?_id={restaurant_id}&cuisine={CuisineType}

Response :- [{"foodID": 1, "restaurantID": "62e23a22ff4a6b0e794ae942", "foodName": "Aloo Paratha", "cuisineType": "NorthIndian", "price": 50.0 }]









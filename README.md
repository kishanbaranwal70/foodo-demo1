# foodo_backend
Backend of foodo

It is food delivery api containing multiple endpoint

**#Login :- **
POST :- http://foodobackend.herokuapp.com/login
Request :- {"password":" ",    "email":" "}
Response :- { "flag": true,  "msg": "login successful", "role": "Customer", "_id": ""}

**#Signup :- **
POST :- http://foodobackend.herokuapp.com/signup
Request :- { "name":"Kishan", "email":"abc@gmail.com", "password":"password", "phone":8796966557, "address": "Banglore", "role":"Customer" }
Response :- {"flag": false,"msg": "User already exists", "_id": null }






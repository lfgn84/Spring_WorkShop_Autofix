# Spring WorkShop Autofix
## **Project creation**

- This Springboot project for the Java 19 course from ITHS was developed by Nicklas Johansson and Luis Gutierrez, Elena Ten, Rauf Rajput.

## **Projects obstacles**

- The most diffuculty in our project was to figure out the proper functionality for Security tokens and Spring Session. Here we had to split into separate api and web security classes.  

![](https:/xiztencia/github.com//Spring_Workshop_Autofix/workflows/Java%20CI/badge.svg)

# Endpoints 
## [Client](#client-1)
## [Employee](#employee-1)
## [SparePart](#sparepart-1)
## [Maintenance](#maintenance-1)
## [Vehicle](#vehicle-1)


# Client
# POST
|Method|Description|URL|
|---|---|--|
|POST|Create a user client to registry |http://localhost:8080/api/client/create|
```ruby
{
	"username":"Kalle",
	"email":"kalle@ankeborg.org",
	"password":"skuldberg"
}
```
|Response Body Exemple|
|---|
```ruby
{
  "id": 16,
  "username": "Kalle",
  "firstname": null,
  "lastname": null,
  "email": "kalle@ankeborg.org",
  "password": "$2a$10$Z..kRuBj25u7flA14X3aJOqto0zQ.P91U0JsWYyZzji/dQvmBSJri",
  "vehicles": [],
  "maintenances": [],
  "spareParts": []
}
```
|Method|Description|URL|
|---|---|--|
|POST|Get user token |http://localhost:8080/api/authenticate|
```ruby
{
	"username":"Kalle",
	"password":"skuldberg"
}
```
|Response Body Example|
|---|
```ruby
{
  "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJLYWxsZSIsImV4cCI6MTYxMDkwNzkyNCwiaWF0IjoxNjEwOTA3MzI0fQ.SnK3jnS3IeQsU5R5pS5qExjHecmPCsX5eyFmLYBQJvqv58Nns0Wg547d9wJK6LPCB5wxzhzQDd7OS_CC_jZQbg"
}  
 ```
# PUT
|Method|Description|URL|
|---|---|--|
|PUT|Update user client in registry |http://localhost:8080/api/client/update/{id}|
```ruby
{
	"username":"user",
	"firstname":"Anka",
	"password":"godkomplex"
}
```
|Response Body Example|
|---| 
```ruby
{
  "id": 3,
  "username": "user",
  "firstname": "Anka",
  "lastname": null,
  "email": null,
  "password": "$2a$10$5wQTwu9Mg458kOTt.Uc.UeWVd9phBt9nyBiOjp7bEP6hPxjxoQ1k2",
  "vehicles": [],
  "maintenances": [],
  "spareParts": []
}
```
# GET
|Method|Description|URL|
|---|---|--|
|GET|Find all clients from registry|http://localhost:8080/api/client/findall|

|Response Body Exemple|
|---|
```ruby
[
  {
    "id": 3,
    "username": "user",
    "firstname": "user",
    "lastname": "user",
    "email": "user",
    "password": "$2a$10$e7TIdM/C4U3sIgrMrbJ69.fBWTrrAxTdAQRCur7lz4nhEmc/d2hN6",
    "vehicles": [],
    "maintenances": [],
    "spareParts": []
  },
  {
    "id": 5,
    "username": "user2",
    "firstname": "Jn",
    "lastname": "Doe",
    "email": "jhon_doe@google.com",
    "password": "$2a$10$gi8r0PWZ6mxzhDogc84aduS2mUyeKpBBVM9pQ5FBqpywwVbsrkqBS",
    "vehicles": [],
    "maintenances": [],
    "spareParts": []
  }
]
```
|Method|Description|URL|
|---|---|--|
|GET|Find a user client by id from registry|http://localhost:8080/api/client/id/{id}|

|Response Body Example|
|---|
```ruby
{"id":3,"username":"user","firstname":"Anka","lastname":null,"email":null,"password":"$2a$10$5wQTwu9Mg458kOTt.Uc.UeWVd9phBt9nyBiOjp7bEP6hPxjxoQ1k2","vehicles":[],"maintenances":[],"spareParts":[]}
```
# DELETE
|Method|Description|URL|
|---|---|--|
|DELETE|Remove an existing user client with given ID from registry|http://localhost:8080/api/client/delete/{id}|

|Response Body Example|
|---|

```ruby
Deleted Client with id: 3
```

# Employee
# POST
|Method|Description|URL|
|---|---|--|
|POST|Create a user employee to registry |http://localhost:8080/api/employee/create|
```ruby
{
	"username":"Kalle",
	"email":"kalle@ankeborg.org",
	"password":"skuldberg"
}
```
|Response Body Exemple|
|---|
```ruby
{
  "id": 11,
  "username": "Kalle",
  "firstname": null,
  "lastname": null,
  "email": "kalle@ankeborg.org",
  "password": "$2a$10$84q00vyscEmUJ30MVJR9Huj4bLPvIMnBmiuPmFH/GugwwSUrrC916"
}
```
|Method|Description|URL|
|---|---|--|
|POST|Get user token |http://localhost:8080/api/authenticate|
```ruby
{
	"username":"Kalle",
	"password":"skuldberg"
}
```
|Response Body Example|
|---|
```ruby
{
  "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJLYWxsZSIsImV4cCI6MTYxMDkwNzkyNCwiaWF0IjoxNjEwOTA3MzI0fQ.SnK3jnS3IeQsU5R5pS5qExjHecmPCsX5eyFmLYBQJvqv58Nns0Wg547d9wJK6LPCB5wxzhzQDd7OS_CC_jZQbg"
}  
 ```
# PUT
|Method|Description|URL|
|---|---|--|
|PUT|Update user employee in registry |http://localhost:8080/api/employee/update/{id}|
```ruby
{
	"username":"user",
	"firstname":"Luigi",
	"password":"godkomplex"
}
```
|Response Body Example|
|---| 
```ruby
{
  "id": 1,
  "username": "admin",
  "firstname": "Luigi",
  "lastname": null,
  "email": null,
  "password": "$2a$10$mToxj3TdFIaPFoAf3gpAiOIH6B.oC6rGDZMD1nj7kqsHIN8dT/UMC"
}
```
# GET
|Method|Description|URL|
|---|---|--|
|GET|Find all employees from registry|http://localhost:8080/api/employee/findall|

|Response Body Exemple|
|---|
```ruby
[
  {
    "id": 1,
    "username": "admin",
    "firstname": "admin",
    "lastname": "admin",
    "email": "admin",
    "password": "$2a$10$2HqBA7Vg.ee533ZCtFsS4O2iWK0k/T8/L8Jiu2JlwCo4bfSpXSvNW"
  }
]
```
|Method|Description|URL|
|---|---|--|
|GET|Find a user employee by id from registry|http://localhost:8080/api/employee/id/{id}|

|Response Body Example|
|---|
```ruby
{"id":1,"username":"admin","firstname":"admin","lastname":"admin","email":"admin","password":"$2a$10$2HqBA7Vg.ee533ZCtFsS4O2iWK0k/T8/L8Jiu2JlwCo4bfSpXSvNW"}
```
# DELETE
|Method|Description|URL|
|---|---|--|
|DELETE|Remove an existing user employee with given ID from registry|http://localhost:8080/api/employee/delete/{id}|

|Response Body Example|
|---|

```ruby
Deleted Employee with id: 11
```

# SparePart
# POST
|Method|Description|URL|
|---|---|--|
|POST|Create a spare part category that only admin can do, if you don't put any sparepart and send an error message will occur "Fill in spare part name" |http://localhost:8080/api/sparepart/create|
```ruby
{
    "part":"car wheel",
    "category":"wheels",
    "price":"549.0",
    "quantity":"2"
}
```
|Response Body Exemple|
|---|
```ruby
{
  "id": 13,
  "part": "car wheel",
  "category": "wheels",
  "price": 549.0,
  "quantity": 2,
  "client": null
}
```
# GET 
|Method|Description|URL|
|---|---|--|
|GET| Find all spare parts in registry |http://localhost:8080/api/sparepart/findall

|Response Body Example|
|---|
```ruby
[
  {
    "id": 7,
    "part": "car wheel",
    "category": "wheels",
    "price": 800.0,
    "quantity": 1,
    "client": null
  },
  {
    "id": 8,
    "part": "back wheel",
    "category": "mirrors",
    "price": 549.0,
    "quantity": 1,
    "client": null
  },
  {
    "id": 9,
    "part": "front light",
    "category": "lights",
    "price": 1200.0,
    "quantity": 2,
    "client": null
  }
]
```
|Method|Description|URL|
|---|---|--|
|GET| Find all spare parts by id in registry. If wrong ID is entered the message "The spare part id was not found" will occur |http://localhost:8080/api/sparepart/id/{id}|

|Response Body Example|
|---|
```ruby
{
  "id": 9,
  "part": "front light",
  "category": "lights",
  "price": 1200.0,
  "quantity": 2,
  "client": null
}
```
|Method|Description|URL|
|---|---|--|
|GET| find all spare parts by client|http://localhost:8080/api/sparepart/findbyclient/{id}
|Method|Description|URL|
|---|---|--|
|GET| find all spare parts by clients username, only the the person with admin role can access this|http://localhost:8080/api/sparepart/findallsparepartsbyclientusername/{nameUser}

# PUT
|Method|Description|URL|
|---|---|--|
|PUT|Update user employee in registry |http://localhost:8080/api/employee/update/{id}|

|Response Body Example|
|---| 
```ruby
{
  "id": 9,
  "part": "back light",
  "category": "lights",
  "price": 1100.0,
  "quantity": 2,
  "client": null
}
```
# DELETE
|Method|Description|URL|
|---|---|--|
|DELETE|Remove an existing spare part with given ID, only person with admin roles can do this |http://localhost:8080/api/sparepart/delete/{id}

|Response Body Example|
|---|
```ruby
```


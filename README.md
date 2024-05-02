1 . The root url is 

 starting url :-   http://localhost:8080/api/dis 


2 . for GET all the categories
http://localhost:8080/api/categories

3.  for GET all the products
 
http://localhost:8080/api/products

 4 .POST - create a new category
 http://localhost:8080/api/categories
 note:- 
      use postman and pass the jsn string 
      for add categories like
      {
    "cid":18,
   "cname":"ai",
   "level":"low"
    }

5. 4 .POST - create a new products
http://localhost:8080/api/products
 note:- 
      use postman and pass the jsn string 
      for add categories like
      {
    "pid":18,
   "pname":"ai",
    }

6 GET category by Id

http://localhost:8080/api/categories/2

 7 GET porduct by Id

 http://localhost:8080/api/product/4


8 PUT - update category by id

http://localhost:8080/api/categories/15
this 15 cid must be present  into the database table  and pass the which name can you want to change 

 {
    "cid":15,
   "cname":"ai",
   "level":"low"
    }

9 . PUT - update product by id
http://localhost:8080/api/products/3
this 3 pid must be present  into the database table  and pass the which name can you want to change 

 {
    "pid":3,
   "pname":"ai",

    }

10.
    DELETE - Delete category by id
    http://localhost:8080/api/categories/13

11.
DELETE - Delete product by id
 http://localhost:8080/api/products/13


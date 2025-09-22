# Shopping App API Testing (Postman)

This repository contains Postman collections created for testing the **Fake Store API** (used as a demo shopping application).  
The collection covers key features of a shopping app, including products, carts, users, and authentication.  

---

## 📂 Files
- `Shopping App.postman_collection.json` → Main Postman collection.  
- (Optional) `ShoppingAppEnvironment.json` → Postman environment file if you want to save variables like `{{url}}`.  

---

## 🚀 Features Tested
### 🔹 Products
- Get all products  
- Get product by ID  
- Get products by category  
- Get all categories  
- Add new product  
- Update product  
- Delete product  

### 🔹 Carts
- Get all carts  
- Get cart by ID  
- Get cart for a specific user  
- Add a new cart  
- Update cart  
- Delete cart  

### 🔹 Users
- Get all users  
- Get user by ID  
- Add new user  
- Update user details  
- Delete user  

### 🔹 Authentication
- User login (valid credentials)  

---

## 🔧 How to Use
1. Clone or download this repository.  
2. Open **Postman**.  
3. Go to **File → Import**.  
4. Select the `Shopping App.postman_collection.json` file.  
5. Make sure your environment has:  
   ```json

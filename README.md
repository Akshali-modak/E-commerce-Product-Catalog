## Instructions
- **Step 1:** clone the Project.
- **Step 2:** You should have the java version 21.
-  **Step 3:** Change the database configuration from Application.properties file
- **Step 3:** Run the Application.
- **Step 4:** After Run the Application check out the functionalities using postman.
  
### Insert Categories
**Endpoint:** `localhost:8081/categories/add`
**Method:** `POST`
**Request Body:** JSON representing the categories
```json
{
    
    "name": "Electronics"
    
}
```
**Usage:** To insert a new category, send a POST request to the `localhost:8081/categories/add` endpoint with the JSON payload representing the category.
### Insert Product
**Endpoint:** `localhost:8081/products/add`
**Method:** `POST`
**Request Body:** JSON representing the Products
```json
{
    "id": 203,
    "name": "Boat Smart watch",
    "price": 3000.0,
    "category": {
        "id": 52,
        "name": null
    }
}
## Get product by category_id
**Endpoint:** `http://localhost:8081/byCategory{categoryId}`
**Method:** `GET`
**Usage:** To retrieve a product by category_id, send a GET request to the `http://localhost:8081/byCategory{categoryId}'
```
**Usage:** To update a product, send a PUT request to the `http://localhost:8081/{productId}` endpoint with the JSON payload representing the updated product, replacing `{productId}` with the actual product ID.
## Delete product
**Endpoint:** `http://localhost:8081//remove/{productId}`
**Method:** `DELETE`
**Usage:** To delete a product, send a DELETE request to the `http://localhost:8081//remove/{productId}` endpoint, replacing `{productId}` with the actual product ID.

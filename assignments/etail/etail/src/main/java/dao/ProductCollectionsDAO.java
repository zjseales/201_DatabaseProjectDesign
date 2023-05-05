/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Product;
import java.util.*;

/** ProductCollectionsDAO.java
 *  INFO 201, Lab 10
 *  etail Project
 * 
 *  The data-access class for managing and storing Product objects.
 *@author Zac Seales - 6687905
 */
public class ProductCollectionsDAO {
    /* A Products ArrayList. */
    private static Collection<Product> products
            = new HashSet<>();
    
    private static Collection<String> categories
            = new HashSet<>();
    
    private static Map<String, Product> idMap
            = new HashMap<>();
    
    /** Adds a product to the list.
     * @param product - the new product.
     */
    public void saveProduct(Product product){
        categories.add(product.getCategory());
        products.add(product);
        idMap.put(product.getProductID(), product);
    }
    
    /** Takes a product ID as a parameter and returns
     *  the corresponding product (if it exists).
     *@param id - the id being searched.
     *@return - the product (or null).
     */
    public Product searchByID(String id){
        Product p = null;
        if (idMap.containsKey(id)){
            p = idMap.get(id);
        }
        return p;
    }
    
    /** Returns the list of products.
     * @return products - the array list.
     */
    public Collection<Product> getProducts(){
        return products;
    }
    
    /** Returns all products of the given category argument.
     * @param category - the category.
     * @return - the list of products within the category.
     */
    public Collection<Product> filterByCategory(String category){
        if (category.equals("All")){
            return products;
        }
        Iterator<Product> pIterate = products.iterator();
        Collection<Product> p = new HashSet<>();
        while(pIterate.hasNext()){
            Product curr = pIterate.next();
            if (curr.getCategory().equals(category)){
                p.add(curr);
            }
        }
        return p;        
    }
    
    /** Returns all categories.
     * @return - the collection of categories.
     */
    public Collection<String> getCategories(){
        return categories;
    }
    
    /** Removes the Product argument from the list.
     * @param product - the product being removed.
     */
    public void removeProduct(Product product){
        products.remove(product);
        //comment these lines out to keep old data
        idMap.remove(product.getProductID());
        //categories.remove(product.getCategory());
    }
    
}

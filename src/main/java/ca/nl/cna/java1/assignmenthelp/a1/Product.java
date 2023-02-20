package ca.nl.cna.java1.assignmenthelp.a1;

/**
 * Simple product class for assignment 1. Will represent products on line items on invoices.
 *
 * Create a class called Product which has three attributes:
 * id (int), description (String) and price (double).
 * Create a constructor that takes in all three attributes and create a getting and setter for each.
 * Don’t let the id attribute or the price be negative.
 *
 * @author josh.taylor
 */
public class Product {

    private int id;
    private String description;
    private double price;

    /**
     * Simple constructor that sets a new product's id. Id and price must be greater than 0 or it's set to 0.
     * @param id Id - must be greater than 0
     * @param description description
     * @param price price - must be greater than 0
     */
    public Product(int id, String description, double price){
        if(id > 0){
            this.id = id;
        }
        this.description = description;
        if(price > 0){
            this.price = price;
        }
    }

    /**
     * Get the product ID
     * @return product ID
     */
    public int getId(){
        return this.id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id){
        if(id > 0){
            this.id = id;
        }
    }

    /**
     * Get the description
     * @return description
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * Set the description
     * @param description description
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * Get the price
     * @return price
     */
    public double getPrice(){
        return this.price;
    }

    /**
     * Set the product price. Must be greater than 0.
     * @param price price
     */
    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }
    }

}

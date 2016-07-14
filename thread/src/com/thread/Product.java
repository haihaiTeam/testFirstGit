package com.thread;

/**
 * 产品对象
 * @author t440
 *
 */
public class Product {

	int id;    
    public Product(int id) {    
        super();    
        this.id = id;    
    }    
       
    public String toString(){  
    	System.out.println("2016-07-15");
        return "Product:" + id;    
    } 
}

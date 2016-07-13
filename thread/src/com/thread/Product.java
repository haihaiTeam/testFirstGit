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
        return "Product:" + id;    
    } 
}

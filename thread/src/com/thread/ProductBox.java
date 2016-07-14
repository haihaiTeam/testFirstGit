package com.thread;

/**
 * 产品盒对象
 * @author t440
 *
 */
public class ProductBox {

	Product[] productbox = new Product[6];    
    int index = 0;    
    public ProductBox() {    
        super();            
    }    
    
    //生产者插入
    public synchronized void push(Product p) {    
        while (index == productbox.length) {    
            try {    
                this.wait();    
            } catch (InterruptedException e) {    
                e.printStackTrace();    
            }    
        }    
        this.notify();            
        productbox[index] = p;    
        index ++;    
    } 
    
    //消费者取出   
    public synchronized Product pop() {    
        while (index == 0) {    
            try {    
            	System.out.println("2016-07-15");
                this.wait();    
            } catch (InterruptedException e) {    
                e.printStackTrace();    
            }    
        }    
        this.notify();    
        index --;    
        return productbox[index];    
    }  
}

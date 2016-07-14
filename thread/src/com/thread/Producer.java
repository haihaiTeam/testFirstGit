package com.thread;

/**
 * 生产者
 * @author t440
 *
 */
public class Producer implements Runnable{

	ProductBox productbox = null;    
    
    public Producer(ProductBox productbox) {    
        super();    
        this.productbox = productbox;    
    }    
    @Override  
    public void run() {    
        for (int i=0; i<10; i++) {    
            Product p = new Product(i);    
            productbox.push(p);    
            System.out.println("produce:" + p);    
            System.out.println("2016-07-15");   
            try {    
                Thread.sleep((int)(Math.random() * 200));    
            } catch (InterruptedException e) {    
                e.printStackTrace();    
            }    
        }    
    } 
}

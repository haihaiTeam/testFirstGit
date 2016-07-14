package com.thread;

/**
 * 生产者消费者问题 
 * @author t440
 *
 */
public class ProducerConsumer {

	/**    
     * @param args    
     */  
    public static void main(String[] args) {            
        ProductBox pb = new ProductBox();    
        Producer p = new Producer(pb);    
        Consumer c = new Consumer(pb);    
           
        Thread pThread = new Thread(p);    
        Thread cThread = new Thread(c);    
        //setPriority():设置线程的优先级数值
        pThread.setPriority(Thread.MAX_PRIORITY);    
           
        pThread.start();    
        cThread.start(); 
        System.out.println("2016-07-15");
        System.out.println("2016-07-15");
    }
}

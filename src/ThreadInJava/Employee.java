package ThreadInJava;
/**
 * 
 * @author vishwas 
 * creating class Employee and main method
 * than creating object of thread and  
 * implementing run method and then crating synchronizing 
 * block and locking String class as mention in question
 * and calling Sleep method to sleep for 7 seconds and 
 * using try catch block to handle exception 
 */

public class Employee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Thread thrad1 = new Thread(new Runnable() {
			  
		    public void run() {
		    	
		      synchronized (String.class) {
		        System.out.println(" locking for String.class object of Thread1");
		        try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				} 
		     
		        synchronized (Integer.class) {
		          System.out.println(" locking for Integer.class object of Thread1");
		        }
		      }
		    }
		  });
		  /**
		   * creating tread2 and implementing run method and then 
		   * crating synchronizing block and locking String class 
		   * as mention in question and calling Sleep method to
		   * sleep for 7 seconds and using try catch block to handle exception
		   *  
		   */
		  Thread thrad2 = new Thread(new Runnable() {
		    public void run() {
		      synchronized (String.class) {
		    	  
		        System.out.println(" locking for String.class object of Thread2 ");
		        try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
	
					e.printStackTrace();
				} 
		        synchronized (Integer.class) {
		          System.out.println(" lock for Integer.class object of Thread2");
		        }
		      }
		    }
		  });

		  thrad1.start();
		  thrad2.start();
	}

}

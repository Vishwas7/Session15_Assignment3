package ThreadInJava;
/**
 * 
 * @author Vishwas a class Student and main method 
 *
 */
public class Student {
	
		public static void main(String[] args) {
			//Creating object of thread 
			  Thread thread1 = new Thread(new Runnable() {
				  /**
				   * implementing run method and then crating synchronizing 
				   * block and locking String class as mention in question
				   * and calling Sleep method to sleep for 7 seconds and 
				   * using try catch block to handle exception 
				   */
			    public void run() {
			    	
			      synchronized (String.class) {
			        System.out.println(" lock for String.class object of Thread1");
			        try {
						Thread.sleep(7000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					} 
			     /**
			      * In here using synchronizing block and locking Integer class
			      * as mention in the question
			      */
			        synchronized (Integer.class) {
			          System.out.println(" lock for Integer.class object of Thread1");
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
			  Thread thread2 = new Thread(new Runnable() {
			    public void run() {
			      synchronized (Integer.class) {
			        System.out.println(" locking for Integer.class object of Thread2 ");
			        try {
						Thread.sleep(7000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					} 
			        synchronized (String.class) {
			          System.out.println(" locking for String.class objec of Thread2");
			        }
			      }
			    }
			  });
			  /**
			   * calling start()
			   */
			  thread1.start();
			  thread2.start();
		}
}

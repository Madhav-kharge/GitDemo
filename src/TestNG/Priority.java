package TestNG;

import org.testng.annotations.Test;

public class Priority {
   
	// Priority Can Be Negative
	// If priority is not Given then Default priority will be 0
	  @Test(priority = 3)
	   public void WebLoginPersonalloan(){
		 
		   System.out.println("Web Login Personal loan");
	  }

	   @Test(priority = 1)
       public void MobileLoginPersonalloan(){
	    
     	System.out.println("Mobile Login Personal loan");
		  }
	   
	   @Test(priority = 2)
	   public void APILoginPersonalloan(){
		    
      	System.out.println("API Login Personal loan");
		  }
}

package TestNG;

import org.testng.annotations.Test;

  
   public class PersonalLoan {
	   
	   
	   //Alphabetically runs the TestCases
	   @Test 
	   public void WebLoginPersonalloan(){
		 
		   System.out.println("Web Login Personal loan");
	  }
  
	   @Test
       public void MobileLoginPersonalloan(){
	    
        	System.out.println("Mobile Login Personal loan");
		  }
	   
	   @Test
	   public void APILoginPersonalloan(){
		    
         	System.out.println("API Login Personal loan");
		  }
}

package DataProvider;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataP1 {
   
	@DataProvider(name="Data-Provider")
	public Object[][] dataproviderMethod(){
		return new Object[][] { {"Data One"},{"Data Two"},{"Data Three"} };
		
	 @Test(dataProvider ="Data-Provider")
	 public void  method1(String data){
         System.out.println("Data is " + data);
	 }
	   
		
		}
}

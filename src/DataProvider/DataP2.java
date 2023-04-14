package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataP2 {

	@DataProvider
	public Object[][] getdata(){
		
		Object[][]data =new Object[3][2];
		data [0][0]= "user1";
		data [0][1]= "pwd1";
		
		data [1][0]= "user2";
		data [1][1]= "pwd2";
		
		data [2][0]= "user3";
		data [2][1]= "pwd3";
		
		return data;	
		
	}
	
	@Test(dataProvider="getData")
	public void login(String username,String pwd) {
		System.out.println(username);
		System.out.println(pwd);
	}

}

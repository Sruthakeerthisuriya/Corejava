package Assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st = sc.nextLine(); 
	      String p = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}";
	      System.out.println("The password is "+st.matches(p));
		
		
		
		

	}

}

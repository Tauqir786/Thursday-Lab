package Loop;

import java.util.Scanner;

public class FirstAndLast {
	public static void main(String args[])
    {  
		// declaring variable
        int number,firstDigit = 0,lastDigit = 0;
        
        // taking value from the user
        Scanner sc = new Scanner(System.in);         
        System.out.println("Enter any digit");
       number=sc.nextInt();
      
       // process to get last digit
        lastDigit = number%10;
        System.out.println("Last digit: "+lastDigit);
 
        // process to get first digit
        while(number!=0) {
            firstDigit = number%10;
            number /= 10;
        }
        System.out.println("First digit: "+firstDigit);
    }
}



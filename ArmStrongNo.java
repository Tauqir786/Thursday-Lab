package Loop;

import java.util.Scanner;

public class ArmStrongNo {
	public static void main(String[] args) {
		 int n, temp, rem, sum = 0; // taking variable
		 Scanner sc=new Scanner(System.in);
			System.out.println("enter number to check armstrong or not:"); // taking input from user
			n=sc.nextInt();

		 temp = n;
		 while (temp>0) {
		  rem = temp % 10; // dividing temp number by 10 to get remaining
		  sum=sum+(rem*rem*rem*rem); 
		  temp /= 10;
		 }
		  if(sum == n)
		   System.out.println(n + " is an Armstrong number."); 
		  else
		   System.out.println(n + " is not an Armstrong number.");
		 }

}

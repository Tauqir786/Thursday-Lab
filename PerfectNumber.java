//wap to check the number is perfect number or not
package Loop;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
    int num, sum = 0; // taking variable
        
        System.out.println("Enter a number"); // taking input from user
            
        Scanner sc=new Scanner(System.in);
        num = sc.nextInt();
            
        
        if (num > 0) {

          for (int i = 1; i < num; i++) { // condition to check perfect number

            if ( num % i == 0) { // number dividing ny i to check is equal to 0 or not
                sum = sum + i;
            }
        }
    
          if ( sum == num) {
              System.out.println(num + " is a perfect number ");

          } else {
              System.out.println (num + " is not a perfect number ");
          }
            
       }   else {
                
            System.out.println (" Please enter positive number ");
       }

	}

}

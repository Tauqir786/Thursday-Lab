package Loop;
import java.util.Scanner;
public class NumberPattern2 {
	public static void main(String[] args) 
    {
		int row;
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("Enter row");
        row = sc.nextInt();
        System.out.println("Here is your pattern....!!!");
        
        int i,j,k;
		for(i=1;i<=row;i++)//row
		{
			for(j=row;j>=i;j--)//space
			{
			System.out.print(" ");//  
		}
		for(k=1;k<=i;k++) // star
		{
			System.out.print("* ");
		}
		System.out.println(); // new line for next row
	}
}
}
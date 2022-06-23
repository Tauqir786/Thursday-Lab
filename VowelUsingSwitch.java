//checking vowel and consonant using switch case

package Training;
import java.util.Scanner;
public class VowelUsingSwitch {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any alphabet to check alphabet is vowel or consonant :");  //taking input from user
		ch=sc.next().charAt(0);

		//applying switch case
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
	}

}

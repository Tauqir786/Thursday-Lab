package OOPs.inhertance;
//interface
interface LibraryUser {
	//method
	public void registerAccount();
	public void requestbook();
}
class KidUsers implements LibraryUser  //class implementing interface
{

	private int age = 12;
	private String bookType = "kids";
	

	@Override
	public void registerAccount() {
		
		if (age< 12) {
			System.out.println("You have successfully registered under a Kids Account");
		} else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}

	@Override
	public void requestbook() {
		
		//checking age is less than 12 or not and book types
		if (age<12 && bookType=="kids")
		{
			System.out.println("Book Issued Successfully,please return the book within 10 days");
		}
		else
		{
			System.out.println("OOps you are allowed to take only kids books ");
		}
	}
//setter 
	public void setAge(int age) {
		this.age = age;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	
	
}

class AdultUser implements LibraryUser //class implementing interface
{

	private int age;
	private String bookType="Fiction";
	@Override
	public void registerAccount() 
	{
		if (age > 12)
		{
			System.out.println("You have successfully registered under an Adult  Account");
		} else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
	}
	@Override
	public void requestbook()
	{
		if ( bookType == "Fiction") //checking book types
		{
			System.out.println("Book Issued successfully, please return the book within 10 day");
		} else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}		
	}
	//setter
	public void setAge(int age) {
		this.age = age;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	
}
public class Library {

	public static void main(String[] args) {

		KidUsers kd=new KidUsers();
		kd.setAge(10); //set the age
		kd.registerAccount(); //invoking 
		kd.requestbook(); 
		
		System.out.println(".......................");
		
		AdultUser ad = new AdultUser();
		ad.setAge(10);
		ad.registerAccount();
		ad.requestbook();
		
		
	}

}

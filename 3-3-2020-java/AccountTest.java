import java.util.Scanner;
public class AccountTest{
	public static void main(String[] args){
	Account obj = new Account();
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your first name: ");
    String firstName = input.next();
    
	obj.setFirstName(firstName);
	System.out.println("Enter you last name: ");
	String lastName = input.next();
	obj.setLastName(lastName);
    System.out.printf("Welcome %s %s The quiz would begin in a moment",obj.getFirstName(),obj.getLastName());
    input.close();
	}
}
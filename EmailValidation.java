
import java.util.Scanner;
import java.util.*;
public class EmailValidation {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("monika@gmail.com");
		al.add("mathi@gmail.com");
		al.add("nivetha@gmail.com");
		al.add("yazhini@gmail.com");
		al.add("ranjani@gmail.com");
		 System.out.println("Enter the EmailId to search");
			//Get input from user to search emailid
		 Scanner sc=new Scanner(System.in);
		   String s=sc.next();
		   for (String element : al){
		         if (element.contains(s)) {
		               System.out.println("valid emailID");
		                break;}
		               else {
		               System.out.println("Invalid emailID");
		               break;
		               
		               }
		      }
		       }
}
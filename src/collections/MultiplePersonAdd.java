package collections;
import java.util.*;

public class MultiplePersonAdd {
     
	static char ch = 'y';
	 static ArrayList<NewContact> contactList = new ArrayList<>();
	 
	 static Scanner input = new Scanner(System.in);

	 public static void getcontacts()
	 {
		 
	        NewContact person = new NewContact();

	      //  System.out.println("enter no.of entries to entered :");
	       // int n = input.nextInt();
	        
	        do {
	        System.out.println("Enter person first name: ");
	        String firstName = input.next();

	        System.out.println("Enter person last name: ");
	        String lastName = input.next();

	        System.out.println("Enter mobile number: ");
	        long phoneNumber = input.nextLong();

	        System.out.println("Enter the Email id: ");
	        String emailId = input.next();

	        System.out.println("Enter address: ");
	        String address = input.next();

	        System.out.println("Enter city: ");
	        String  city = input.next();

	        System.out.println("Enter State name: ");
	        String state = input.next();

	        System.out.println("Enter zip: ");
	        int zip = input.nextInt();

	        contactList.add(new NewContact(firstName,lastName ,phoneNumber,emailId ,address ,city,state,zip));
	        
	        System.out.println();
	        System.out.println("contact added");
	       
	        System.out.println("enter y to add new person to the contact : ");
	        ch = input.next().charAt(0);
	        }while(ch=='y');
	     
 }
	 
	 public static void displaycontacts()
	 {
		 for  (int i = 0 ; i < contactList.size(); i ++ )
		 {
             System.out.println("FIRST NAME : "+contactList.get(i).getFirstName());
			 System.out.println("LAST NAME :  "+contactList.get(i).getLastName());
			 System.out.println("PHONE NUMBER : "+contactList.get(i).getPhoneNumber());
			 System.out.println("EMAIL ID  : "+contactList.get(i).getEmailId());
			 System.out.println("address : "+contactList.get(i).getAddress());
			 System.out.println("CITY : "+contactList.get(i).getCity());
			 System.out.println("STATE NAME : "+contactList.get(i).getState());
			 System.out.println("ZIP CODE : "+contactList.get(i).getZip());
			 
		 }
	 }
	 
	 public static void main(String[] args) {
		
		 MultiplePersonAdd obj = new MultiplePersonAdd();
		 System.out.println("******************ENTER CHOICE**************************");
	    	System.out.println(" ");
	    	
	    	int choice = 0;
			do {
	    	System.out.println(" 1.getcontacts-- \n 2.displaycontacts--  ");
	    	int ch = input.nextInt();
	    
	    	         switch(ch)
	    	          {
	    	  
	    	                 case 1: obj.getcontacts();
	    	                          break;
	    	            
	    	                 case 2: obj.displaycontacts();
	    	                          break;
	    	                          
	    	                 default : System.out.println("invalid input");
	                           break;
	          }             
	                	
	              System.out.println("press '5' to continue....");
	              choice = input.next().charAt(0);
	         
	    }while(choice=='5');
	 }		
}
		

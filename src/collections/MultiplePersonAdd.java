package collections;
import java.util.*;

public class MultiplePersonAdd {
     
	static char ch = 'y';
	 static ArrayList<NewContact> contactList = new ArrayList<>();
	 
	 static Scanner input = new Scanner(System.in);

	 public static void getcontacts()
	 {
		 
	        NewContact person = new NewContact();

	        do {
	        System.out.println("Enter person first name: ");
	        person.setFirstName(input.next());

	        System.out.println("Enter person last name: ");
	        person.setLastName(input.next());

	        System.out.println("Enter mobile number: ");
	        person.setPhoneNumber(input.nextLong());

	        System.out.println("Enter the Email id: ");
	        person.setEmailId(input.next());

	        System.out.println("Enter address: ");
	        person.setAddress(input.next());

	        System.out.println("Enter city: ");
	        person.setCity(input.next());

	        System.out.println("Enter State name: ");
	        person.setState(input.next());

	        System.out.println("Enter zip: ");
	        person.setZips(input.nextInt());

	        contactList.add(person);
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
		

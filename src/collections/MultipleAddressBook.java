package collections;

import java.util.*;
import java.util.Scanner;

public class MultipleAddressBook {
	
	private String name;
	
	public MultipleAddressBook() {
		// TODO Auto-generated constructor stub
	}
	public MultipleAddressBook(String name) {
		// TODO Auto-generated constructor stub
		this.name = name ;
	}
	 
		public String getName() {
		    return name;
	       }
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return ("name : "+name);
		}

	public void setName(String name) {
		this.name = name;
	  }

		static char ch = 'y';
		static int index = 0;
		 static HashSet<MultipleAddressBook> AddressbookList = new HashSet<>();
		 MultipleAddressBook book = new MultipleAddressBook();
		 
		 static Scanner input = new Scanner(System.in);
		 public static void getaddressbooklist()
		 {
		        do {
		    
		              System.out.println("Enter Addressbook name: ");
		              String name = input.next();
		               
		              AddressbookList.add(new MultipleAddressBook(name));
		               System.out.println(" ");
                           
		              System.out.println("enter y to add new addressbook names : ");
		              ch = input.next().charAt(0);
		        	 	       
		            }while(ch=='y');
		 }
		 
		 public static void displayaddressbook()
		 {
			Iterator<MultipleAddressBook> iterate = AddressbookList.iterator();
			while(iterate.hasNext())
			{
				System.out.println(iterate.next().getName());
			}
		 }
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 MultipleAddressBook obj = new MultipleAddressBook();
		 System.out.println("******************ENTER CHOICE**************************");
	    	System.out.println(" ");
	    	
	    	int choice = 0;
			do {
	    	System.out.println(" 1.getaddressbooklist-- \n 2.displayaddressbook--  ");
	    	int ch = input.nextInt();
	    
	    	         switch(ch)
	    	          {
	    	  
	    	                 case 1: obj.getaddressbooklist();
	    	                          break;
	    	            
	    	                 case 2: obj.displayaddressbook();
	    	                          break;
	    	                          
	    	                 default : System.out.println("invalid input");
	                           break;
	          }             
	                	
	              System.out.println("press '5' to continue....");
	              choice = input.next().charAt(0);
	         
	    }while(choice=='5');
	 }		
}
		

	



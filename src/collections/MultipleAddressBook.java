package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleAddressBook {
	
	private String name;
	
	 
		public String getName() {
		    return name;
	       }

	public void setName(String name) {
		this.name = name;
	  }

		static char ch = 'y';
		static int index = 0;
		 static ArrayList<MultipleAddressBook> AddressbookList = new ArrayList<>();
		 
		 static Scanner input = new Scanner(System.in);
		 static int i = 0 ;
		 public static void getaddressbooklist()
		 {
			 
		   MultipleAddressBook addressbook = new MultipleAddressBook();

		        do {
		    
		              System.out.println("Enter Addressbook name: ");
		               addressbook.setName(input.next());
		               
		               AddressbookList.add(addressbook);
		               i++;
		               index = i ;
		        	 
		                System.out.println();
                           
		                System.out.println("enter y to add new addressbook names : ");
		               ch = input.next().charAt(0);
		        	 	       
		            }while(ch=='y');
		     
		 }
		 
		 public static void displayaddressbook()
		 {
			 for  ( index = 0 ; index < AddressbookList.size(); index ++ )
			 {
	             System.out.println("ADDRESS BOOK NAME : "+AddressbookList.get(index).getName());
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
		

	



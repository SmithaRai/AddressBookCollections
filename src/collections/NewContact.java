package collections;

import java.util.Scanner;


public class NewContact {

	  private String firstName;
	   private String lastName;
	   private long phoneNumber;
	   private String emailId;
	   private String address;
	   private String city;
	   private String state;
	   private int zip;
	    
	    static Scanner input = new Scanner(System.in);

	    public String getFirstName() {
			return firstName;
		}
	    public void setFirstName(String firstName){
	        this.firstName = firstName;
	    }
	    

	    

	    public String getLastName() {
			return lastName;
		}
	    public void setLastName(String lastName){
	        this.lastName = lastName;
         }

	    
	    
	    public long getPhoneNumber() {
			return phoneNumber;
		}
	    public void setPhoneNumber(long phoneNumber){
	        this.phoneNumber = phoneNumber;
	    }
	    
	    public String getEmailId() {
			return emailId;
	    }
	    public void setEmailId(String emailId){
	        this.emailId = emailId;
	    }
	    
	    
	    public String getAddress() {
			return address;
		}
	    public void setAddress(String address){

	        this.address = address;
	    }
	    
	    
	    public String getCity() {
			return city;
		}

	    public void setCity(String city){

	        this.city = city;
	    }
	    
	    
	    public String getState() {
			return state;
		}
	    public  void setState(String state){
	        this.state = state;
	    }
	    
	    
	    public int getZip() {
			return zip;
		}
	    public void setZips(int zip) {
	        this.zip = zip;
	    }
	    
	    public static void main(String[] args) {
			
	    	  NewContact person = new NewContact();

		        System.out.println("add person details");
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter First name: ");
		        person.setFirstName(scanner.next());

		        System.out.println("Enter Last name: ");
		        person.setLastName(scanner.next());

		        System.out.println("Enter Mobile Number: ");
		        person.setPhoneNumber(scanner.nextLong());

		        System.out.println("Enter  Email id: ");
		        person.setEmailId(scanner.next());

		     
		        System.out.println("Enter Address: ");
		        person.setAddress(scanner.next());

		        System.out.println("Enter City: ");
		        person.setCity(scanner.next());

		        System.out.println("Enter State : ");
		        person.setState(scanner.next());

		        System.out.println("Enter Zip: ");
		        person.setZips(scanner.nextInt());
		        
		        System.out.println("****************Person details******************** ");
		        System.out.println(" ");
		        
		        System.out.println("FirstName    : "+person.firstName);
		        System.out.println("LastName     : "+person.lastName);
		        System.out.println("PhoneNumber  : "+person.phoneNumber);
		        System.out.println("Email id     : "+person.emailId);
		        System.out.println("Address      : "+person.address);
		        System.out.println("City         : "+person.city);
		        System.out.println("State        : "+person.state);
		        System.out.println("Zip          : "+person.zip);
		}
	
}

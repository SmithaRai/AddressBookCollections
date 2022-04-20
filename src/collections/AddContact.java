package collections;


public class AddContact {

	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String emailId;
	private String address;
	private String city;
	private String state;
	private int zip;
    
    
    public AddContact (String firstName, String lastName, long phoneNumber,
            String emailId, String address, String city, String state, int zip) {
    	
          this.firstName = firstName;
          this.lastName = lastName;
          this.phoneNumber = phoneNumber;
          this.emailId = emailId;
          this.address = address;
          this.city = city;
          this.state = state;
          this.zip = zip;
       
       }
	public static void main(String[] args) {
		
		System.out.println("**********ADDRESS BOOK CREATED USING COLLECTIONS*************");
		
		
		 AddContact contacts = new AddContact("Smitha", "Rai", 453274351, "smitha@gmail.com",
                 "abdse", "banglore","karnataka", 65432 );
System.out.println("FirstName : "+contacts.firstName);
System.out.println("LastName : " +contacts.lastName);
System.out.println("PhoneNumber : "+contacts.phoneNumber);
System.out.println("EmailId : " +contacts.emailId);
System.out.println("Address : "+contacts.address);
System.out.println("City : " +contacts.city);
System.out.println("State : " +contacts.state);
System.out.println("Zip : "+contacts.zip);
	}
}

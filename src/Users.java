public class Users
{
	int userID;
	static String firstName;
	String lastName;
	
	public Users(int userID, String firstName, String lastName)
	{
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public  void main()
	{
		Users user = new Users(1,"Lionel","Messi");
		Users user1 = new Users(2,"Cristiano","Ronaldo");
		Users user2 = new Users(3,"Neymar","jr");
		
	}
}
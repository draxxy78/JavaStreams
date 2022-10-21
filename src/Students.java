public class Students {
    
    private int rollNumber;
    private String firstName;
    private String lastName;
    private int marks;
	public Students(int rollNumber, String firstName, String lastName, int marks) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "rollNumber=" + rollNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", marks="
				+ marks;
	}
    
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SchoolStream 
{
	private static Optional<Students> highestMark;

	public static void main(String[] args) 
	{
		List<Students> studentList = new ArrayList<>(Arrays.asList(
		        new Students(1,"Aby","J", 33), 
		        new Students(2,"Anne","K", 26), 
		        new Students(4,"Alice","P",22), 
		        new Students(3,"Brandon","O", 42)));

		List<Students> sortedList = studentList.stream()
		        .sorted(Comparator.comparing(Students::getFirstName))
		        .collect(Collectors.toList());

		System.out.println("Student records sorted by First Name:");
		sortedList.forEach(System.out::println);
		
		Students maxMark = studentList.stream().max(Comparator.comparingInt(Students::getMarks)).get();
		System.out.println("");
		System.out.println(maxMark.getFirstName() +" is the topper with "+ maxMark.getMarks()+ " marks." );	
		
	}
}

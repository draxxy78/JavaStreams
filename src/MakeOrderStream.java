import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class MakeOrderStream 
{
	public static List<Integer> createList(int listSize)
	{
		System.out.println("Enter "+listSize+" list elements :");
		List<Integer> myList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		for(int i=0 ; i < listSize ; i++){
		    myList.add(input.nextInt());
		}
		input.close();
		return myList;
	}
	
	private static void makeOrdered(List<Integer> myList) 
	{
		System.out.print("The Ordered list is :");
		myList.stream().sorted().forEach(x -> System.out.print(x+","));
	}


	public static void main(String[] args) 
	{
		System.out.println("Enter the List Size :");
		Scanner scanner = new Scanner(System.in);
		int listSize = scanner.nextInt();
		List<Integer> myList = new ArrayList<>();
	    myList = createList(listSize);
	    makeOrdered(myList);
	}

	
}

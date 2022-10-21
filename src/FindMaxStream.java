import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FindMaxStream 
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
	

	private static int findMax(List<Integer> myList) 
	{
		int max = myList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		return max;
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter the List Size :");
		Scanner scanner = new Scanner(System.in);
		int listSize = scanner.nextInt();
		List<Integer> myList = new ArrayList<>();
	    myList = createList(listSize);
		System.out.println("The biggest element in the list is " + findMax(myList));
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectEvenNumberWithStream 
{
	public static void main(String[] args)
	{
		List<Integer> numberList = new ArrayList<>();
		for (int i =1 ; i <= 10 ; i++)
		{
			numberList.add(i);
		}
		System.out.println(numberList);
		
		List<Integer> secondNumberList = numberList.stream().filter( i -> i % 2 ==0).collect(Collectors.toList());
		
		System.out.println(secondNumberList);
	}
}
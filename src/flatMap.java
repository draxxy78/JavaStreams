import java.util.Arrays;
import java.util.List;

public class flatMap 
{
	public void main()
	{
		List<Integer> numbers  = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		numbers.stream().forEach(number ->System.out.println(number));
	}
	
}
 
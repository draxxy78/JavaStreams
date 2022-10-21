import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Filter
{

	public static void main(String[] args) 
	{
		List<String> versions = new ArrayList<>();
		versions.add("Lollipop");
        versions.add("KitKat");
        versions.add("Jelly Bean");
        versions.add("Ice Cream Sandwhich");
        versions.add("Honeycomb");
        versions.add("Gingerbread");
        versions.stream().filter(v -> v.length() > 10).forEach(System.out::println);
        System.out.println("Elements whose length is > 5 and starts with 'G'");
        versions.stream().filter(s -> s.length() > 8).filter( s -> s.startsWith("G")).forEach(System.out::println);
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 12, 18);
        Optional<Integer> LCM = listOfNumbers.stream().filter(i -> i%2 == 0).filter(i -> i%3 == 0).findFirst();
        System.out.println("The number divisible by 2 and 3 is:"+LCM);
	}
}
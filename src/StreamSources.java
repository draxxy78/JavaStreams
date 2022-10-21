import java.util.stream.Stream;

public class StreamSources 
{
	public static Stream<String> stringNumersStream()
	{
		return Stream.of("One","Two","Three","Four","Five");
	}
	
	public static Stream<Integer> intNumbersStream() 
	{
		return Stream.iterate(0, i-> i+2  ).limit(10);
	}
	
	public static Stream<Users> userStream()
	{
		return Stream.of(
					new Users(1,"Cristiano","Ronaldo"),
					new Users(1,"Gareth","Bale"),
					new Users(1,"Karim","Benzema")
				);
	}


}

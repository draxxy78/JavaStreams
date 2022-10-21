import java.io.*;
 
import java.util.*;
 
import java.util.stream.*;
 

public class FilterCollect {

	
	public static void main(String[] args) {
		ArrayList<Integer > al = new ArrayList<Integer>();
		al.add(2);
	    al.add(6);
	    al.add(9);
	    al.add(4);
	    al.add(20);
	    System.out.println("Priting collecion" + al);
	    List<Integer> ls = al.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
	    System.out.println("The new list after filter: "+ ls);
	}

}

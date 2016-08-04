package book;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class sample_22_1 {
	public static void main(String arg[])
	{
		Set<String> city = new HashSet<String>();
		Set<String> city1 = new LinkedHashSet<String>();
		
		city.add("chopper");
		city.add("zoro");
		city.add("sanji");
		city.add("lufy");
		city.add("nami");
		city.add("robin");
		city.add("zoro");
		
		city1.add("chopper");
		city1.add("zoro");
		city1.add("sanji");
		city1.add("lufy");
		city1.add("nami");
		city1.add("robin");
		city1.add("zoro");
		
		Iterator<String> it = city.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next().toUpperCase());
		}
		
		System.out.println("----------next------------");
		
		for(Object e:city1)
		{
			System.out.println(e.toString());
		}
	}
}

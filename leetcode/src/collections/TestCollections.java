package collections;

import java.util.*;

import org.testng.annotations.Test;

public class TestCollections {

	@Test
	public void TestHashSet() {

		Set<String> set = new HashSet<String>();
		
		set.add("London");
		set.add("Paris");
		set.add("Bei Jing");
		set.add("Paris");
		set.add("london");
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
	}
}

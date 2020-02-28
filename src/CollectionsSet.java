import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsSet {
 public static void main(String[] args) {
	Set<String>s=new HashSet<>();
	s.add("java");
	s.add("dotnet");
	s.add("python");
	s.add("java");
	/*Iterator itr=s.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}*/
	for(String a:s)
	{
		System.out.println(a);
	}
	s.add("c");
	for(String a1:s)
	{
		System.out.println(a1);
	}
	}
}

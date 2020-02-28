import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsList {
	public static void main(String[] args) {
		List<String>ll=new ArrayList<>();
		ll.add("java");
		ll.add("dotnet");
		ll.add("python");
		ll.add("java");
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ll.add(2,"c");
		Iterator itr1=ll.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		ll.clear();
		System.out.println(ll);
	}

}

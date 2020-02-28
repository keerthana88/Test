import java.util.HashMap;
import java.util.Map;

public class CollectionsMap {
public static void main(String[] args) {
	Map<Integer,String>m=new HashMap<>();
	m.put(10,"java");
	m.put(20,"dotnet");
	m.put(30,"python");
	for(Map.Entry<Integer,String>e:m.entrySet())
	{
		System.out.println(e);
	}
	System.out.println("adding put");
	m.put(40,"c");
	for(Map.Entry<Integer,String>e:m.entrySet())
	{
		System.out.println(e);
	}
	System.out.println("removing key");
	m.remove(10);
	for(Map.Entry<Integer,String>e:m.entrySet())
	{
		System.out.println(e);
	}
	System.out.println("replacing c");
	m.replace(40, "c", "database");
	for(Map.Entry<Integer,String>e:m.entrySet())
	{
		System.out.println(e.getKey()+" "+e.getValue());
	}

}
}

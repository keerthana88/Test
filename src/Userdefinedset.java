import java.util.HashSet;
import java.util.Set;

public class Userdefinedset
{
	int age;
	int sal;
	String name;
	public Userdefinedset(int age,int sal,String name)
	{
		this.age=age;
		this.sal=sal;
		this.name=name;
	}
	public static void main(String[] args) {
		Userdefinedset u=new Userdefinedset(20,20000,"java");
		Userdefinedset v=new Userdefinedset(30,30000,"dotnet");
        Userdefinedset w=new Userdefinedset(40,40000,"python");
		Set<Userdefinedset> s=new HashSet<>();
        s.add(u);
        s.add(v);
        s.add(w);
		 for(Userdefinedset a:s)
		 {
			 System.out.println(a.age+","+a.sal+","+a.name);
		 }
		 s.remove(u);
		 
		 for(Userdefinedset a:s)
		 {
			 System.out.println(a.age+","+a.sal+","+a.name);
		 }
	
		
	}

}

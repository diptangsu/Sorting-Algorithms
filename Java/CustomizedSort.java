// comparable & comparator interface in our own Employee class

import java.util.*;
class Employee implements Comparable
{
	int id;
	String name;
	Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public int compareTo(Object obj)
	{
		int id1,id2;
		id2=((Employee)obj).id;		// id2 is the id of object2
		id1=this.id;			// id1 is the id of object1
		if(id1>id2)
		{
			return +1;
		}
		else if(id1<id2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	public String toString()
	{
		return name+"--"+id;
	}
}
class Main
{
	public static void main(String ab[])
	{
		TreeSet<Employee> t1=new TreeSet<Employee>();		// Comparable interface
		Employee e1=new Employee(4,"Ayush");
		Employee e2=new Employee(1,"Anish");
		Employee e3=new Employee(3,"Atul");
		Employee e4=new Employee(5,"Animesh");
		Employee e5=new Employee(2,"Dhanwan");
		Employee e6=new Employee(6,"Jaini");
		t1.add(e1);						// no comparison needed as it is first element
		t1.add(e2);						// e2=obj1, e1=obj2
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);
		System.out.println("Using comparable interface="+t1);
		TreeSet<Employee> t2=new TreeSet<Employee>(new MyComparator());		// Comparator interface
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		t2.add(e6);
		System.out.println("Using comparator interface="+t2);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		return e1.name.compareTo(e2.name);
	}
}
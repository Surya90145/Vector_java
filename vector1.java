// ******  VECTOR *********
/*it was intrdouced in jdk1.0 verson
  it is a legacy collection
  it is a direct implementation class to list interface
  */
 import java.util.*;
class  vector1
{
	public static void main(String[] args) 
	{
		// here second parametr tells every time increment with 5
		/* 1.public vector()
		   2.public vector(int capacity)
		   3.public vector(int capacity,int incremental_capacity)
		   4.public vector(collection c)
		   */
		Vector<Integer> v=new Vector<Integer>(5);
		System.out.println(v.capacity());
		for(int i=1;i<=6;i++)
		{
			v.add(i);
		}
		System.out.println(v.capacity());
		for(int i=7;i<=11;i++)
		{
			v.add(i);
		}
		System.out.println(v.capacity());
		for(int i=12;i<=16;i++)
		{
			v.add(i);
		}
		System.out.println(v.capacity());
		System.out.println("****************");
        System.out.println("4th constructor");
        Vector<String> v1=new Vector<String>();
		v1.add("AAA");
		v1.add("BBB");
		v1.add("CCC");
		v1.add("DDD");
		System.out.println(v1);
		System.out.println("Copy above the data");
		Vector<String> v2=new Vector<String>(v1);
		System.out.println(v2);

		System.out.println("*********************VECTOR METHODS******************");
        System.out.println("**addElementmethod *****");
		Vector<String> v3=new Vector<String>();
		v3.addElement("AAA");
		v3.addElement("BBB");
		v3.addElement("CCC");
		v3.addElement("DDD");
        System.out.println(v2); 
		System.out.println("FirstElemetMethod");
		System.out.println(v3.firstElement());
		 
		System.out.println("LastElementMethod");
		System.out.println(v3.lastElement());
		System.out.println("removeElementMethod");
        v3.removeElementAt(2);
		System.out.println(v3);
		System.out.println("removeAllElementsMethod");
        v3.removeAllElements();
		System.out.println(v3);
	}
}

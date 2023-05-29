
// Q. WRITE A PROGRAM TO REMOVE ALL THE DUPLICATE ELEMENT FROM AM ARRAYLIST.?

import java.util.ArrayList;
import java.util.HashSet;
class  Dublicate
{
	public static void main(String[] args) 
	{
	   ArrayList al = new ArrayList();
	   al.add(212);
	   al.add(2);
	   al.add(2);
	   al.add(4);
	   al.add(5);
	   al.add(25);
	   al.add(45);
	   al.add(5);
	   al.add(55);
	   al.add(5);
	   al.add(55);
	   al.add(65);
	   al.add(5);
	   al.add(56);
	   al.add(5);
	   al.add(58);
	   al.add(55);
	   System.out.println(al);
	 HashSet  hs = new HashSet(al);
	   al=new ArrayList(hs);
	   System.out.println(al);
	}
}

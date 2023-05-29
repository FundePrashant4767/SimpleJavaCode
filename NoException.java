import java.util.ArrayList;
import java.util.Iterator;
class  NoException
{
	public static void main(String[] args)
	{
		 ArrayList al=new ArrayList();
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 al.add(40);
		 System.out.println(al);
		 Iterator i=al.iterator();
		 try
		 {
			System.out.println(i.next());
		 }
		 catch (NoSuchElementException  e)
		 {
			 System.out.println("Element not Found");
		 }
	}

}
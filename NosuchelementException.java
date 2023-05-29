import java.util.Iterator;
import java.util.ArrayList;
class  Collection5
{
	public static void main(String[] args) 
	{
	    ArrayList   al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		try
		{
			System.out.println(i.next());
		}
		catch (NoSuchElementException e)
		{
			 System.out.println("Element Not Foun");
			 }
    }
}
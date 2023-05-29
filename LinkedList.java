import java.util.Iterator;
import java.util.LinkedList;
class   LinkedList1
{
	public static void main(String[] args) 
	{
	  LinkedList <String> l1=new LinkedList<String>();
	  l1.add("TINKU");
	  l1.add("(PINKU");
	  l1.add("Sonya");
	  l1.add("Krish");
	  Iterator i=l1.iterator();
	  while(i.hasNext());
		{
			System.out.println(i.next()+" ");
		}
		System.out.println(i);
	}
}

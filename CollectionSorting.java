import java.util.ArrayList;
class  Collection1
{
	public static void main(String[] args) 
	{
	    ArrayList   al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}
}
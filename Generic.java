import java.util.ArrayList;
class Generic
{
	public static void main(String[] args)
	{
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(400);
	al.add(500);
	System.out.println(al);
	for(int a: al)
		{
		System.out.println(a);
		}
   }
}
import java.util.ArrayList;
class ArrayList3
{
	public static void main(String[] args) 
	{
		ArrayList al =new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		ArrayList al2 =new ArrayList();
         al2.add(10);
		 al2.add(20);
		 al2.add(30);
		 al.retainAll(al2);
		 System.out.println(al);
		 al.removeAll(al2);
		 System.out.println(al);

		
	}
}
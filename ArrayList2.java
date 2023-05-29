import java.util.ArrayList;
class ArrayList2 
{
	public static void main(String[] args) 
	{
		ArrayList al =new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		ArrayList al2 =new ArrayList();
		al2 .add(al);
		al2.add(1990);
		System.out.println(al2);  
		System.out.println("Hello");
    }
}

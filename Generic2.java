import java.util.ArrayList;
class Book
{
	String name;
	int Pages;
	Book(String name,int Pages){
		this.name=name;
		this.Pages=Pages;
	}
	@Override
		public String toString(){
		return "Name :"+name +",Pages :" +Pages;
	}
}
class BookCollection
{
	public static void main (String[] args)
	{
		ArrayList <Book>  al=new ArrayList <Book>();
		Book b1=new Book("JAVA",1000);
		Book b2=new Book("PYTHON",1500);
		Book b3=new Book("C Programing",2000);
		al.add(b1);
		al.add(b2);
		al.add(b3);
		
			System.out.println(b1);
			System.out.println(b2);
			System.out.println(b3);
}
}
import java.util.HashSet;
import java.util.Iterator;
class Book1
{
	String name;
	int pages;
	Book1(String name,int pages){
		this.name=name;
		this.pages=pages;
	}
	@Override
		public String toString(){
		return "Name : "+name + ",pages : " + pages;
	}
	@Override
		public boolean equals(Object o){
		Book1 temp=(Book1)o;
			if(this.name.equals(temp.name)&& this.pages==temp.pages)
		{
			return true;
		}
		return false;
	}
	@Override
		public int Hashcode(){
		 return name.hashcode()+((Integer)pages).hashcode();
	}
	public static void main(String[] args)
	{
		HashSet bookhs=new HashSet();
		bookhs.add(new Book1("java",1000));
		bookhs.add(new Book1("java",1000));
		bookhs.add(new Book1("python",500));
		Iterator i=iterator();
		while(i.hashNext());
		{
			System.out.println(i.next());
		}
	}
}
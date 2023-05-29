import java.util.HashSet;
import java.util.Iterator;
class Movie implements Comparable
{
	String title;
	 double time;
	 int year;
	Movie(String title,double time,int year){
		this.title=title;
		this.time=time;
		this.year=year;
	}
	@Override
		public String toString(){
		return "Title :"+title +",Time :" + time +",Year :" +year;
	}
	@Override
		public boolean equals(Object o){
		 Movie temp=(Movie)o;
		 if(this.title.equals(temp.title))
		{
			 return true;
		}
		return false;
	}
	@Override
		public int hashcode(){
		return title.hashCode() ;
	}
	@Override
		public int comparetor(Object o){
		Movie p=(Movie)o;
		if(this.title.equals(title) > p.title.equals(title)) ;
		{
			return 1;
		}
		if(this.title.equals(title) < p.title.equals(title)) ;
		{
			return -1;
		}
		return 0;
	}
	}
class Movie1
{
	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		hs.add(new Movie("Diljale",2.59,1999));
	hs.add(new Movie("Divangi",2.59,2000));
		hs.add(new Movie("Diljale",2.59,1999));
		hs.add(new Movie("Dhadkan",2.59,1999));
		hs.add(new Movie("Veed",2.59,2023));
		hs.add(new Movie("Sirat",2.59,2017));
		hs.add(new Movie("Dil To Pagal He",2.59,1999));
		Iterator i=hs.iterator() ;
		while(i.hastNext());
		{
			System.out.println(i.next());
		}
	}
}
		


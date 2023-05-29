abstract class Application
{
	abstract void playsong();
	abstract void addorremovesong();
	abstract void editsong();
}
abstract lass Application extends App
{
	@Override
		public static void playsong(){
		System.out.println("Play All Song's");
       System.out.println("Play Rndom Song's");
       System.out.println("Chose to play");
        System.out.println("Go Back");
}
@Override
	public static void addorremovesong(){
	System.out.println("Add Song");
System.out.println("Remove Song");
System.out.println("Go Back");
}
@Override
	public static void editsong(){
	System.out.println("Select Song to Edit");
}
public static void main(String[] args)
	{
	   App a1=new App();
	   System.out.println("---------------------------** Play Song **---------------------------");
	   a1.playsong();
        System.out.println("---------------------------** Add / Remove Song **---------------------------");
		a1.addorremovesong();
		 System.out.println("---------------------------** Edit Song **---------------------------");
		 a1.editsong();
	}
}

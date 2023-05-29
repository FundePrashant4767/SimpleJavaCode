class  Ola 
{
	 String  vehicale="SUVI          :       MINI             :            AUTO";
}
class  Auto extends Ola
{
	void Auto(){
		System.out.println("Auto");
}
}
class Mini extends Ola
{
	void Mini(){
		 System.out.println("Mini");
}
}
class Suvi extends Ola
{
	void Suvi(){
		                 System.out.println("Suvi");
    }
	public static void main(String[] arg)
	{
		
		Ola s;   
		//Suvi s4 = (Suvi)s3;
		Auto a1= new Auto();
		Mini m1=new Mini();
		Suvi s3=new Suvi();
		Suvi s4 = (Suvi)s3;
		System.out.println(s4.vehicale);
		a1.Auto();
		m1.Mini();
	  s3.Suvi();
	  }
}
//Example :2 Multiple  Inheritance:
interface Qspiders
{
	void testing();
}
interface Jspiders
{
	void devloping();
}
interface Pyspiders
{
	void pythondev();
}
class Testyantra 
{
	 void work(){
		 System.out.println("Employee Working");
}
}
class Employee extends Testyantra implements Qspiders,Jspiders,Pyspiders
{
	@Override
		public void testing(){
		 System.out.println("Some Testers are Working");
	}
	@Override
		public void devloping(){
		System.out.println("Some Devlopers are Working");
	}
	@Override
		public void pythondev(){
		System.out.println("Some Python Devlopers");
	}
	@Override
		public void work(){
		System.out.println("****Employee Are Working Under in Some Department****");
	}
	public  static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.work();
		e1.testing();
		e1.devloping();
		e1.pythondev();
		//e1.work();

    }
}
/*----------------------------------------------OutPut--------------------------------------------------------------------------
C:\Users\prash\OneDrive\Desktop\java>javac MultipleInterface.java

C:\Users\prash\OneDrive\Desktop\java>java Employee
****Employee Are Working Under in Some Department****
Some Testers are Working
Some Devlopers are Working
Some Python Devlopers
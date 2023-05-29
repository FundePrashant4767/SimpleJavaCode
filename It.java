class Employee extends Object 
{
	public void work(){
		System.out.println("Work is mandetory for Employee...!!");
	}
}
class SoftwareEnginner extends Employee
{
	public void app(){
		System.out.println("Work regarding to software Application....!!");
}
}
class SoftwareDevloper extends SoftwareEnginner
{
	public void coding(){
		System.out.println("Develop the application by using coding...!!");
}
}
class Company
{
	public static void main(String[] args) 
	{
		System.out.println("...................WELCOME IT INDUSTRY.........................");
		SoftwareDevloper se=new SoftwareDevloper();
		
		se.coding();
           se.work();
		se.app();
	}
}

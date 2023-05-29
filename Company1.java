class Company
{
	public static void main(String[] args){
	Employee e=new Employee();
	e.work();
	System.out.println();

	//Downcasting from parent to child.
	//Employee to Softeware Enginner.
	SoftewareEnginner se=new (SoftewareEnginner)e;//CTC
	se.work();
	se.app();
	}
}

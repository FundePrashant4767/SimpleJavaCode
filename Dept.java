class Student
{
int a;
int b;
double c;
double d;
double e;

 static void add(int a,int b){
	System.out.println(a+b);
}
static void add(double c,double d,double e){
System.out.println(c+d+e);	
}
/*class Dept extends Student
{
	Dept(){
		System.out.println("Department is computer science");
}*/

	public static void main(String[] args) 
	{
		System.out.println("Welcome to computer science department");
		Student d1= new Student();
		d1.add(10,20);
		d1.add(15.2,16,18);
	//	d1.Dept();
	}
}

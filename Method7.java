class Student1
 {
  String name;
  int age;
Student1(String name,int age)
{
  this.name=name;
  this.age=age;
 }
  void Display()
  {
   System.out.println("\n=========Details===============");
   System.out.println("Name="+name);
   System.out.println("Age="+age);
   }
 public static void main(String[] args)
 {
  Student1 s1=new Student1("vaibhav",21);
  Student1 s2=new Student1("Dipak",21);
  Student1 s3=new Student1("Rushi Tambe",21);
Student1 s4=new Student1("Rushi Aware",21);
Student1 s5=new Student1("Ganesh",21);
Student1 s6=new Student1("Abhi",21);
Student1 s7=new Student1("Prashant",21);
Student1 s8=new Student1("Anu",21);
Student1 s9=new Student1("sonya",18);
  s1.Display();
  s2.Display();
  s3.Display();
  s4.Display();
  s5.Display();
  s6.Display();
  s7.Display();
  s8.Display();
  s9.Display();
 }
}

======================================OUTPUT=======================================================

C:\Users\prash\OneDrive\Desktop\java>javac Student1.java

C:\Users\prash\OneDrive\Desktop\java>java Student1

=========Details===============
Name=vaibhav
Age=21

=========Details===============
Name=Dipak
Age=21

=========Details===============
Name=Rushi Tambe
Age=21

=========Details===============
Name=Rushi Aware
Age=21

=========Details===============
Name=Ganesh
Age=21

=========Details===============
Name=Abhi
Age=21

=========Details===============
Name=Prashant
Age=21

=========Details===============
Name=Anu
Age=21

=========Details===============
Name=sonya
Age=18

C:\Users\prash\OneDrive\Desktop\java>














































































































































































































































































































































































































































































































































































































































































































































































































class Method7
{
  public static int add()
  {
   int a=10;
   int b=10;
   System.out.println(a+b);
  }
  public static void main(String[] args)
  {
   System.out.println(add());
   System.out.println(sub());
  }
  public static int sub();
  {
   a=100.10;
   b=200;
  System.out.println(a-b);
  }
}
































































































































































































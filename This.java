class Student
 {
  String name;
  int age;
Student(String name,int age)
{
  this.name="Tinku";
  this.age=21;
 }
 public static void main(String[] args)
 {
  Student s1=new Student("Tinku",21);
  System.out.println(s1.name);
  System.out.println(s1.age);
 }
}
class Timepass
 {
  String name;
  int age;
  double income;
  String job;
  String add;
  
 Timepass(String name,int age,double income,String job,String add)
{
  this.name=name;
  this.age=age;
  this.income=income;
  this.job=job;
  this.add=add;
 }
  void Display()
  {
   System.out.println("=========Details===============");
   System.out.println("Name :"+name);
   System.out.println("Age :"+age);
  System.out.println("Job :"+job);
   System.out.println("Income :"+income);
   System.out.println("Add :"+add);
   }
 public static void main(String[] args)
 {
Timepass s1 = new Timepass("vaibhav",21,4.00000,"Soft-Eng","Shevgavon");
 Timepass s2 = new Timepass("Dipak",21,45.0000,"Soft-Dev","Adgavon");
 Timepass s3 = new Timepass("Rushi Tambe",21,10.00000,"CEO","Nevasa");
Timepass s4= new Timepass("Rushi Aware",21,15.00000,"HR","mumbai");
Timepass s5= new Timepass("Ganesh",21,10.0000,"ANALYST","Hydrabad");
Timepass s6= new Timepass("Abhi",21,20.00000,"TEST ENG","Pune");
Timepass s7= new Timepass("Prashant",21,8.00000,"SOFT_ENG","Pathardi");
Timepass s8= new Timepass("Anu",21,7.00000,"WEB DEV","Pune");
Timepass s9= new Timepass("sonya",18,5.00000,"SOFT DEV","Nager");
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

----------------------------OUTPUT-----------------------------------------------------

C:\Users\prash\OneDrive\Desktop\java>javac Timepass.java

C:\Users\prash\OneDrive\Desktop\java>java Timepass
=========Details===============
Name :vaibhav
Age :21
Job :Soft-Eng
Income :4.0
Add :Shevgavon
=========Details===============
Name :Dipak
Age :21
Job :Soft-Dev
Income :45.0
Add :Adgavon
=========Details===============
Name :Rushi Tambe
Age :21
Job :CEO
Income :10.0
Add :Nevasa
=========Details===============
Name :Rushi Aware
Age :21
Job :HR
Income :15.0
Add :mumbai
=========Details===============
Name :Ganesh
Age :21
Job :ANALYST
Income :10.0
Add :Hydrabad
=========Details===============
Name :Abhi
Age :21
Job :TEST ENG
Income :20.0
Add :Pune
=========Details===============
Name :Prashant
Age :21
Job :SOFT_ENG
Income :8.0
Add :Pathardi
=========Details===============
Name :Anu
Age :21
Job :WEB DEV
Income :7.0
Add :Pune
=========Details===============
Name :sonya
Age :18
Job :SOFT DEV
Income :5.0
Add :Nager

C:\Users\prash\OneDrive\Desktop\java>

















































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































S
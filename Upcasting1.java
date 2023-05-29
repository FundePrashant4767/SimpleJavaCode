package classCasting; 
class One
{
  void m1() 
  { 
     System.out.println("m1 method in class One"); 
   } 
 } 
 class Two extends One 
{ 
  void m2() 
  { 
     System.out.println("m2 method in class Two"); 
   } 
   public static void main(String[] args) 
  { 
     One o = (One)new Two(); // Upcasting. Here, super class reference o refers to sub class object. 
       o.m1(); 
    // o.m2(); // Compile-time error message. 
   } 
 } 
 
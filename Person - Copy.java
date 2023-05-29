//CONSTRUCTOR CHAINING:

class Person
 {
  Person(){
           System.out.println("No argument constructor");
        }
  Person(int a){
           this();
           System.out.println(a);
         }
  Person(String s1){
             this(10);
             System.out.println(s1);
          }
    public static void main(String[] args)
   {
    Person p1=new Person("Hello");
   }
 }

-------------------OUTPUT--------------------
C:\Users\prash\OneDrive\Desktop\java>javac Person.java

C:\Users\prash\OneDrive\Desktop\java>java Person
No argument constructor
10
Hello

C:\Users\prash\OneDrive\Desktop\java>



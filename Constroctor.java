class Demo
{
  String name;
  int id;
  double age;
 Demo(String name){
  this.name=name;
  }
  Demo(int id,String name){
   this.id=id;
    this.name=name;
   }
  Demo(double age,int id,String name){
    this.age=age;
    this.id=id;
    this.name=name;
  }
 void display()
 {
  System.out.println("========================");
  System.out.println("AGE:"+age);
  System.out.println("ID:"+id);
  System.out.println("Name:"+name);
 }
 public static void main(String[] args)
  {
   Demo e1 = new Demo("employee");
  e1.display();
 }
}
  
  
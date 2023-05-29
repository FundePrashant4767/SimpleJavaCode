class Board
{
  double length;
   String color;
  float breadth;
  int price;
  Board(double length){
   this.length=length;
   }
  Board(int price){
    this.price=price;
    }
   Board(float breadth){
    this.breadth=breadth;
    }
   Board(String color,int price,float breadth,double length){
    this.color=color;
    this.price=price;
    this.breadth=breadth;
    this.length=length;
    }
  void display()
  {
   System.out.println("Color:"+color);
   System.out.println("Price:"+price);
 System.out.println("Breadth:"+breadth);
 System.out.println("length:"+length);
 }
public static void main(String[] args)
{
  Board b1 = new Board("WHITE",4000,25,15.5);
  b1.display();
 }
}
 

------------------------------OUTPUT---------------------------------------------

C:\Users\prash\OneDrive\Desktop\java>javac Board.java

C:\Users\prash\OneDrive\Desktop\java>java Board
Color:WHITE
Price:4000
Breadth:25.0
length:15.5

C:\Users\prash\OneDrive\Desktop\java>


  
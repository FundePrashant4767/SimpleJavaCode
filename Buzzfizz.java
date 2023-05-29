class Buzzfizz
{
  public static void main(String[] args)
  {
    for(int i=0;i<=15;i++)
    {
     if(i%3==0 && i%5==0)
     {
       System.out.println("Hi Love YOU");
      }
      else if(i%3==0)
      {
       System.out.println("HI");
       }
       else if(i%5==0)
       {
        System.out.println("Sorry I heat you");  
       }
       else
       {
        System.out.println(i);
       }
     }
  }
}

------------------------OUTPUT------------------------------------
C:\Users\prash\OneDrive\Desktop\java>javac Buzzfizz.java

C:\Users\prash\OneDrive\Desktop\java>java Buzzfizz
Hi Love YOU
1
2
HI
4
Sorry I heat you
HI
7
8
HI
Sorry I heat you
11
HI
13
14
Hi Love YOU
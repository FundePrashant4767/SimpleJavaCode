class Palindrome
{
  public static void main(String[] args)
   {
     int num=12321;
      int rev=0;
      int numcopy=num;
     while(num>0)
    {
     int last =num%10;
      rev=rev*10+last;
      num/=10;
     }
      if(numcopy==rev)
      {
        System.out.println("Palindrome");
       }
       else
       {
        System.out.println("Not Palindrome");
        }
      }
  }
class Last
{
  public static void main(String[] args)
  {
   int num=1259;
   System.out.println("Number before reverse"+num);
   System.out.println("Number after reverse:");
    while(num>0)
     {
        int last=num%10;
        System.out.print(last);
       num/=10;
     }
  }
}
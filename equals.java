class  College 
{
	String name;
	int code;
	String add;
	College(String name,int code,String add){
		this.name=name;
		this.code=code;
		this.add=add;
	}
	/*@Override
	public String toString(){
		   return "Name:"+name,  "Code:"  +code, "Addd:" +add ;
	}*/
	@Override
	public boolean eduals(Object o){
		College temp=(College)o;
		if(this.name==temp.name&&this.code==temp.code&&this.add==temp.add){
			return true;
		}
		else
		{
			return false;
		}
	}
	      public static void main(String[] args) 
	{
		College c1=new College("N.A.C.S.CS",221,"Shevgavon");
		College c2=new College("M.M.N.V.P",121,"Pathardi");
		//System.out.printl(c1);
		//System.out.printl(c2);
		//System.out.printl(c1==c2);
		System.out.println(c1.equals(c2));
	}
}

class  InstagramV1
{
	void post(){
		                  System.out.println(" Upload Post's Immages ");
	                   }
}
class InstagramV2 extends InstagramV1
{
	@Override
		void post(){
		                    super.post();
		                      System.out.println(" Upload video's");
	                        }
							void Dm(){
								                 System.out.println("User Text Messeges");
							}
              }
	class  InstagramV3 extends  InstagramV2
	{
		  @Override
		  void post(){
			                  super.post();
							  System.out.println("Text Messeges");
	                         }
	     void Dm(){
			                 super.Dm();
							 System.out.println("upload Immages");
		                  }
		 void Reels(){
			                      System.out.println("30 second videos");
		                     }
				public static void main(String[] args)
		{
					System.out.println("Welcome To Instagram");
					InstagramV3 i1=new InstagramV3();
					i1.post();
					i1.Dm();
					i1.Reels();
					System.out.println("Thank You For Using Instagram");
		}
	}
	
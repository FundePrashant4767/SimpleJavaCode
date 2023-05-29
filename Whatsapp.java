class  WhatsAppV1
{
	void display(){
		                  System.out.println("Single Tick");
	                   }
}
class WhatsAppV2 extends WhatsAppV1
{
	@Override
		void display(){
		                     super.display();
		                      System.out.println("Double Tick");
	                        }
							void Call(){
								                 System.out.println("Voice Call");
							}
              }
	class WhatsAppV3 extends WhatsAppV2
	{
		  @Override
			  void display(){
			                            super.display();
										System.out.println("Blue Tick");
										}
			void Call(){
				                 super.Call();
								 System.out.println("Video Call");
			}
			void Stories(){
				                        System.out.println("Post & Stories");
			}
			public static void main(String[] args)
		{
				WhatsAppV3 w1=new WhatsAppV3();
				w1.display();
				w1.Call();
				w1.Stories();
		   }
	}

class ThrowDemo 
	{
	  static void demo() 
		{
		  try {
			throw new NullPointerException("heloooo");
		      } 
		  catch(NullPointerException e) 
		      {
			System.out.println("Caught inside demo.");
			throw e; // rethrow the exception
		      }
	 catch(Exception e) 
		      {
			System.out.println("Caught inside demo.");
			//in a ladder of catch only one  catch can access 
		      }
		}
	  public static void main(String args[]) 
		{
		  try {
			demo();
		      } 
		  catch(NullPointerException e) 
		      {
			System.out.println("Recaught: " + e);
		      }
		}
	}
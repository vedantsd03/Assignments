
/*     * * * * 
      	* * * 
      	 * * 
          *   */

class Pattern3
{
     
	public static void main (String[] args)
	{
     
	   	 int num = 5;
     
   		 for(int i=num; i >= 1; i--)
   		 {
        	 	for(int j = i; j < num; j++)
		            	System.out.print(" ");
        		for(j = 1; j <= (2 * i - 1); j++)
        	    		System.out.print("*");
       		 System.out.println("");
    		}
	}
}

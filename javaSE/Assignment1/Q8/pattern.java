/*  * 
   * * 
  * * * 
 * * * * 
  * * * 
   * * 
    * 
*/
class Pattern4
{
    public static void main (String args[])
    {
        int num = 5;
        for(int i=1; i< num; i++)
        {   
            for(int j=1; j< num-i; j++)
                System.out.print(" ");
            for(int k=1; k<=i; k++)
                System.out.print("*"+" ");
            System.out.println();
        }

        for(int i=1; i< num-1; i++)
        {  
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            for(int k=1; k< num-i; k++)
                System.out.print("*"+" ");
        System.out.println();
        }
    }
}


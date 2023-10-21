/*8) solve following patten programs:


    * 
   * * 
  * * * 
 * * * * 
* * * * * 
*/

public class Pattern2 {
	public static void main(String[] args) {

		int num=6;
		for(int i =0;i<num;i++) {
			//space
			for(int j=num-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int j =0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

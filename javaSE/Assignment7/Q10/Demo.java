/*10)
create a class "Demo" with "disp()" which can take variable number of int arguments and display the sum of all numbers passed to it.
invoke "disp()" from main function.
*/

package Problem8;

public class Demo {

	static void disp(int ... k) {
		int sum=0;
		for(int i =0 ;i<k.length;i++) {
			sum += k[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		disp();
		disp(10);
		disp(10,20,30);
		disp(10,20,30,40);
		
	}

}


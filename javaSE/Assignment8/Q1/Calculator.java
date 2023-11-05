
package Problem1;

public class Calculator {
	
	public static int caldouble(int num)throws MyArithException  {
		if(num==0) {
			throw new MyArithException("Zero not allowed");
		}
		else if(num<0) {
			throw new MyArithException("negative not allowed");
		}
		
		return(num+num);	
	}
}

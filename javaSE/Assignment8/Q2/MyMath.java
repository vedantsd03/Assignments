
package clientpack;

import devpack.NumberNotDivisibleBySevenException;

public class MyMath {
	public void disp(int num) throws NumberNotDivisibleBySevenException {
		if(!(num%7==0)) {
			
			throw new NumberNotDivisibleBySevenException("Number is Not Divisible By Seven");
		}
		else
		{
			System.out.println("Number is Divisible By Seven");
		}
	}
}

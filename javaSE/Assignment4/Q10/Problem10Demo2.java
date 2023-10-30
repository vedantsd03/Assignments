/*
10)	Define an interface “Vechicle” with “start()” function . 
Now derive  classes like “TwoWheeler”, “ThreeWheeler”,”FourWheeler” etc.
from “Vehicle” and override “start()” function. Define a class “VDemo” in which  write  main()  function.
In the main function create a reference to Vehicle  class referring to any of the sub class. 
Using this reference, call “start" method.
*/
//by creating the static method

package day_4_1;

public class Problem10Demo2 {
	static void perform(Vechicle v) {
		v.start();
	}
	public static void main(String[] args) {
		perform(new TwoWheeler());
		perform(new ThreeWheeler());
		perform(new FourWheeler());
		
	}
	
}

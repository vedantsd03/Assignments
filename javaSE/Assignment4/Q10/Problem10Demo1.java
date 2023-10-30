/*
10)	Define an interface “Vechicle” with “start()” function . 
Now derive  classes like “TwoWheeler”, “ThreeWheeler”,”FourWheeler” etc.
from “Vehicle” and override “start()” function.
Define a class “VDemo” in which  write  main()  function.
In the main function create a reference to Vehicle  class referring to any of the sub class.
Using this reference, call “start" method.
*/
//by the object of parent class
package day_4_1;

public class Problem10Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechicle arr [] = new Vechicle[3];
		arr[0] = new TwoWheeler();
		arr[1] = new ThreeWheeler();
		arr[2] = new FourWheeler();
	
		for(int i=0;i<arr.length;i++)
			arr[i].start();
		
	}

}

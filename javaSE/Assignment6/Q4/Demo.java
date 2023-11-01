
/*
4) Code this:
on the developer side create following interface:
	create necessary jar file and documentation

interface Vehicle { 
      
    // all are the abstract methods. 
    void changeGear(int a); 
    void speedUp(int a); 
    void applyBrakes(int a); 
} 


on the client side define following classes:

class FourWheeler implements Vehicle
{
	public void changeGear(int a)
	{
		// how to change gear in FourWheeler
	}
	public void speedUp(int a)
	{
		// how to speed up FourWheeler
	}
	public void applyBrakes(int a)
	{
		// how to apply brakes of FourWheeler
	}
}


class TwoWheeler implements Vehicle
{
	public void changeGear(int a)
	{
		// how to change gear in TwoWheeler
	}
	public void speedUp(int a)
	{
		// how to speed up TwoWheeler
	}
	public void applyBrakes(int a)
	{
		// how to apply brakes of TwoWheeler
	}
}

create one more class "Demo" with
	main and static perform method
while calling perform pass any implementation of "Vehicle" and invoke the methods polymorphically.
*/

package clientpack;

import devpack.*;

public class Demo {
	
	public static void perform(Vehicle v, int gear, int speed, int brake) {
		v.changeGear(gear--);
		v.speedUp(speed=speed-30);
		v.applyBrakes(brake);
	}

	public static void main(String[] args) {
		Vehicle v[] = new Vehicle[2];

		v[0] = new FourWheeler();
		v[1] = new TwoWheeler();
		
		for(int i=0; i<v.length; i++) {
			perform(v[i], 3, 80, 0);
			System.out.println();
		}
	}
}



/*
1)
public abstract class Course
{
	public void start()
	{
		// start process
	}
	public abstract double getFee();
	public abstract void evaluate();
}

define child classes of above abstract class
	DACDBDACourse extends Course
	MSCitCourse extends Course

show late binding with the help of "perform()" method.
*/

package Problem1;

public class Demo {
	static void perform(Course c) {
		c.start();
		c.getFee();
		c.evaluate();
	}

	public static void main(String[] args) {
			
		perform(new DACDBDACourse());
		System.out.println();
		perform(new MSCitCourse());
			
	}

}

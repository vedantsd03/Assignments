/*8)
public class Course
{
	public void start()
	{
	}
	public void stop()
	{
	}
}
now define 3 child classes 
	DACDBDACourse,MSCit and Basic

inside "DACDBDACourse" class define one more method "public void orientation()"

define one more class "CourseDemo" with main function.
inside main function
	create an array of "Course" of 3 elements.
store all the child classes objects. Traverse the array and invoke "start()" and "stop()" of all the objects. Also invoke "orientation()" method wherever object of "DACDBDACourse" is present.
*/

package Problem8;

public class DemoCourse {
	
	public static void main(String[] args) {
		Course course[] = new Course[3];
		course[0] = new DACDBDACourse();
		course[1] = new MSCit();
		course[2]= new Basic();
		
		for(int i =0 ;i<course.length;i++) {
			course[i].start();
			if( course[i] instanceof DACDBDACourse ) {
				DACDBDACourse d =(DACDBDACourse)course[i];
				d.orientation();
			}
			course[i].Stop();
			System.out.println();
		}

	}

}

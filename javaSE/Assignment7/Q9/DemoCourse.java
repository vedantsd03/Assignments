/*9)
Interface Course
{
	void start();
	void stop();
}
now define 3 implementations: 
	DACDBDACourse,MSCit and Basic

inside "DACDBDACourse" class define one more method "public void orientation()"

define one more class "CourseDemo" with main function and "public static void show()" method.
from main function
	invoke "show()" method by passing object of any implementations and invoke "start()" and "stop()" methods. Also invoke "orientation()" method whenever object of "DACDBDACourse" is passed.
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

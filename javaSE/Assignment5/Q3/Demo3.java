3) Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.

package Problem1;

public class Demo3 {

	public static void main(String[] args) {
		Engineering [] engg = new Engineering[4] ;
		engg[0]=new Civil();
		engg[1]= new Mechnical();
		engg[2]= new Electronics();
		engg[3]= new ComputerScience();
		
		for(int i=0;i<engg.length;i++) {
			engg[i].assignCourse();
		}
	}

}


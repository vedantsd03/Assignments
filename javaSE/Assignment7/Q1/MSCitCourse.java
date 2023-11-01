
package Problem1;

public class MSCitCourse extends Course {

	@Override
	public double getFee() {
		double fee = 20_000;
		return fee;
	}

	@Override
	public void evaluate() {
		System.out.println("Evalution of MS CIT Course is started");
	}

}

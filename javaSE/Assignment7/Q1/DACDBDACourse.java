

package Problem1;

public class DACDBDACourse extends Course {

	@Override
	public double getFee() {
		double fee = 1_25_000;
		return fee;
	}

	@Override
	public void evaluate() {
		System.out.println("Evalution is satrted for DAC and DBDA Course");
		
	}

}

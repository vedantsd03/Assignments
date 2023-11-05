
package clientpack;
import devpack.InvalidLengthException;
public class Authenticator {
	Authenticator(String s)throws InvalidLengthException{
		if(!(s.length()>5 && s.length()<10))   {
			throw new InvalidLengthException("  ");
		}
		else {
		done();
		}
	}
	void done() {
		System.out.println("successful authentication");
	}
}

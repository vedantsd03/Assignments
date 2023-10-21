/*display all prime numbers between 3 to 30*/
public class PrimeNumber {
	public static void main(String[] args) {
		int count=0;
		for(int i=3;i<31;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0)
					count++;
				
			}
			if(count==0)
				System.out.println(i);
			count=0;
		}
	}
}

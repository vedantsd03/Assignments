/*
7) using nested for loop display following :

A  a
A  b
A  c

B  a
B  b
B  c

C  a
C  b
C  c

*/

public class Pattern1 {
	public static void main(String[] args) {
		char a = 'A';
		char b = 'a';
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(a +"\t"+b++);
			}
			a++;b='a';
			System.out.println();
		}
	}
}

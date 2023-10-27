package Day2;
class A{
	private static int nums=30 ;
	private int num;
	static {
		System.out.println("from Static block A");
	}
	A(int num){
		this.num = num;
	}

	public static int getNums() {
		return nums;
	}

	public int getNum() {
		return num;
	}	
}

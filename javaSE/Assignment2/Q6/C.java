package Day2;
class C{
	private static int nums=30 ;
	private int num;
	static {
		System.out.println("from Static block C");
	}
	C(int num){
		this.num = num;
	}

	public static int getNums() {
		return nums;
	}

	public int getNum() {
		return num;
	}	
}

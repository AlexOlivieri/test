package basicworkflow;

public class Test1 {
	
	private String test;
	
	public Test1() {
		this.test = "Here my test";
	}
	
	public static void main(String[] args) {
		Test1 myTest = new Test1();
		System.out.println(myTest.getTestName());
	}
	
	public String getTestName() {
		return this.test;
	}
}

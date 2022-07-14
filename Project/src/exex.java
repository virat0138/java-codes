
public class exex {
	int a=10;
	int b=0;
	int ex() {
		try {
			return a/b;
		}
		catch(ArithmeticException ae) {	
			return 1;
		}
		finally {
			System.out.println("after exception");
		}
	}
	
	public static void main(String args[]) {
		
		exex e = new exex();
		System.out.println(e.ex());
	}

}

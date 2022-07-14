
interface inter1{
	void dis(int a, int b);
}
public class funcinter {
	
	public static void main(String args[]) {



		        /*inter1 in=new inter1() {
		            public void disp()
		            {
		                System.out.println("hello");
		            }
		        };
		        in.disp();*/

		        inter1 in=(a,b)->
		        {
		            System.out.println(a+b);
		        };
		        in.dis(3,4);

		    }

}

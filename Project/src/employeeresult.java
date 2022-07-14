import java.util.*;
public class employeeresult {
	
	public static void main(String[] args) {

        System.out.println("How many records want to store");

        Scanner sc=new Scanner(System.in);
        int rec=sc.nextInt();

        List<employee> l=new ArrayList<employee>();  //generics jdk1.5


        for(int i=0;i<rec;i++)
        {
            employee e;
            int no=sc.nextInt();
            String name=sc.next();
            int sal=sc.nextInt();        
            l.add(new employee(no,sal,name));

        }

        for(employee em:l) //foreach (or) enhanced for loop jdk1.5
        {
            if(em.getSal()<5000)
            {
            System.out.println(em.getEno());
            System.out.println(em.getName());
            System.out.println(em.getSal());
            }
        }

    }
}

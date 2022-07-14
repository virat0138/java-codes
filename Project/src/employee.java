
public class employee {
	
	int eno;
	int sal;
	String name;
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public employee(int eno, int sal, String name) {
		super();
		this.eno = eno;
		this.sal = sal;
		this.name = name;
	}

	
}

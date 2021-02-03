public class Employee {
	private int empno;
	private String name;
	private long salary;
	public Employee(int empno,String name,long salary) {
		setEmpno(empno);
		setName(name);
		setSalary(salary);
		this.salary = salary ;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String desc() {
		String descrition = "員工編號:" + empno + ",姓名:" + name + ",薪資:" + salary;
		return descrition;
	}
	
}

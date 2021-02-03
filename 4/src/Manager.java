
public class Manager extends Employee {
	private long bonus;
	public Manager(int empno, String name, long salary,long bonus) {
		super(empno, name, salary);
		this.bonus = bonus;
	}
	
	public String desc() {
		String descrition = super.desc();
		descrition = descrition + ",薪水+紅利:" + (getSalary()+bonus) ;
		return descrition;
	}
	
	public static void main (String[] args) {
		Employee E1 = new Manager(001, "David", 50000, 5000 );
		System.out.println(E1.desc());
	}
	
}

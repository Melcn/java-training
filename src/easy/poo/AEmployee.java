package easy.poo;

public class AEmployee {

	private String name_employee;
	private int id;
	private double salary;
	private ASociety SocietyName;

	public AEmployee() {
		super();
	}

	public AEmployee(String name_employee, int id, double salary, ASociety societyName) {
		super();
		this.name_employee = name_employee;
		this.id = id;
		this.salary = salary;
		SocietyName = societyName;
	}

	public String getName_employee() {
		return name_employee;
	}

	public void setName_employee(String name_employee) {
		this.name_employee = name_employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public ASociety getSocietyName() {
		return SocietyName;
	}

	public void setSocietyName(ASociety societyName) {
		SocietyName = societyName;
	}

	@Override
	public String toString() {
		return "AEmployee [name_employee=" + name_employee + ", id=" + id + ", salary=" + salary + ", SocietyName="
				+ SocietyName + "]";
	}

}

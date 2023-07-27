package easy.poo;

import java.util.Arrays;

public class ASociety {

	private String name_society;
	private AEmployee tab_employee[] = new AEmployee[4];
	private double payroll = 0;

	public ASociety() {
		super();
	}

	public ASociety(String name_society, AEmployee[] tab_employee, double payroll) {
		super();
		this.name_society = name_society;
		this.tab_employee = tab_employee;
		this.payroll = payroll;
	}

	public String getName_society() {
		return name_society;
	}

	public void setName_society(String name_society) {
		this.name_society = name_society;
	}

	public AEmployee[] getTab_employee() {
		return tab_employee;
	}

	public void setTab_employee(AEmployee[] tab_employee) {
		this.tab_employee = tab_employee;
	}

	public double getPayroll() {
		return payroll;
	}

	public void setPayroll(double payroll) {
		this.payroll = payroll;
	}

	@Override
	public String toString() {
		return "ASociety [name_society=" + name_society + ", tab_employee=" + Arrays.toString(tab_employee)
				+ ", payroll=" + payroll + "]";
	}

}

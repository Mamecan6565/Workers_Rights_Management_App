public class Managers extends Administrator implements commonMethods{

	protected Managers(String name, int iDNumber, Boolean isWorking, String jobTitle, String jobPosition) {
		super(name, iDNumber, isWorking, jobTitle, jobPosition);
		// TODO Auto-generated constructor stub
	}
	
		
	public void secretMethod() {
		
		System.out.println("Bu metoda sadece managers mi ulasabilir?");
	}
	
	

	@Override
	public void payments(int workedHours) {
	
	double managerSalary = workedHours*getPayPerHour();
	
	System.out.println("Manager salary; " + managerSalary);
		
	}

	@Override
	public void vocation(int workDays, int cooficient) {
		
		double vocatinalPay = workDays*cooficient;

		System.out.println("Payment for the vocation; " + vocatinalPay);
	}

	@Override
	public void bonus(int halfSalary) {
		
		double bonusPay = halfSalary*0.5;
		
		System.out.println("Bonus payment;" + bonusPay);
	}
	
	
		

	@Override
	public String toString() {
		return "Managers [isWorking=" + isWorking + ", jobTitle=" + jobTitle + ", jobPosition=" + jobPosition
				+ ", getName()=" + getName() + ", getIsWorking()=" + getIsWorking() + ", getJobTitle()=" + getJobTitle()
				+ ", getJobPosition()=" + getJobPosition() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}

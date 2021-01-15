
public class Teachers extends Administrator implements commonMethods {

	
protected Teachers(String name, int iDNumber, Boolean isWorking, String jobTitle, String jobPosition) {
		super(name, iDNumber, isWorking, jobTitle, jobPosition);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void payments(int workedHours) {
		
	double teacherSalary = workedHours*getPayPerHour();
	
	System.out.println("Teacher salary; " + teacherSalary);
		
	}
	
	@Override
	public void vocation(int workDays, int cooficient) {

		double teacherSalary = workDays*2*getPayPerHour();


	}

	@Override
	public void bonus(int halfSalary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Teachers [isWorking=" + isWorking + ", jobTitle=" + jobTitle + ", jobPosition=" + jobPosition + "]";
	}

	
	
	
}

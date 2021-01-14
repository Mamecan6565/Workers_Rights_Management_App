
public class Stuffs extends Administrator implements commonMethods {	


    protected Stuffs(String name, int iDNumber, Boolean isWorking, String jobTitle, String jobPosition) {
    	
		super(name, iDNumber, isWorking, jobTitle, jobPosition);
		// TODO Auto-generated constructor stub
	}

	Administrator writer = new Stuffs("Can", 1222333, true, "Senior", "Full Time");
	
		

	@Override
	public void payments(int workedHours) {
		
	double stuffSalary = workedHours*getPayperhour();
	
	System.out.println("Stuff salary; " + stuffSalary);
		
	}

	@Override
	public void vocation(int workDays, int cooficient) {

		double stuffVocation = workDays*getPayperhour();

	}

	@Override
	public void bonus(int halfSalary) {

		double stuffBonus = halfSalary*getPayperhour();

	}

	

}

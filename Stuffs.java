public class Stuffs extends Administrator implements commonMethods {


    protected Stuffs(String name, int iDNumber, Boolean isWorking, String jobTitle, String jobPosition) {
    	
		super(name, iDNumber, isWorking, jobTitle, jobPosition);
		// TODO Auto-generated constructor stub
	}

	Administrator writer = new Stuffs("Can", 1222333, true, "Senior", "Full Time");
	
		

	@Override
	public void payments(int workedHours) {
		
	double stuffSalary = workedHours*getPayPerHour();
	
	System.out.println("Stuff salary; " + stuffSalary);
		
	}

	@Override
	public void vocation(int workDays, int cooficient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bonus(int halfSalary) {
		// TODO Auto-generated method stub
		
	}

	

}

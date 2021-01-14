
public class Administrator {
		
	private static final int instNumber = 001; // ?
	private static final String institution = "Marcus JSC"; //?
	
	private String Name = "name-surname";
	private int IDNumber = 0;
	protected Boolean isWorking= null ; 
	String jobTitle = "employee title";
	String jobPosition = "employee position";

	private static final int payPerHour = 3 ; // ?? This one must be just visible in the all sub classes of this package but no one can can change it!
		
	protected Administrator(String name, int iDNumber, Boolean isWorking, String jobTitle, String jobPosition) {
		super();
		Name = name;
		IDNumber = iDNumber;
		this.isWorking = isWorking;
		this.jobTitle = jobTitle;
		this.jobPosition = jobPosition;
	}


	public void personeliDCard ( int iDNumber, String name, String jobTitle) {
		System.out.println("_____________________________");
		System.out.println("|PERSONEL ID CARD           |");
		System.out.println("|===========================|");
		System.out.println("|ID Number: " + IDNumber +" |"); 
		System.out.println("|Name/Surname: " + Name + " |");
		System.out.println("|Job Title: " + jobTitle +" |");
		System.out.println("|___________________________|");
	}

	public static int getInstnumber() {
		return instNumber;
	}


	public static String getInstitution() {
		return institution;
	}


	public String getName() {
		return Name;
	}


	public int getIDNumber() {
		return IDNumber;
	}


	public Boolean getIsWorking() {
		return isWorking;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public String getJobPosition() {
		return jobPosition;
	}


	public static int getPayperhour() {
		return payPerHour;
	}


}





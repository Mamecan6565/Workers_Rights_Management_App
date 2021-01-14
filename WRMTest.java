

public class WRMTest {

	public static void main(String[] args) {
		
			
		Managers generalManager = new Managers("Ali", 0001, true,"Full Time", "Admin");
		Managers coManager = new Managers("Ahmet", 0002, true,"Full Time", "ExAdmin");
		Managers hipManager = new Managers("Mehmet", 0002, true,"Full Time", "RetrAdmin");	
		
		
		Teachers master = new Teachers("Ali", 0001, true,"Full Time", "Admin");
		Teachers coMaster = new Teachers("Ahmet", 0002, true,"Full Time", "ExAdmin");
		Teachers asistant = new Teachers("Mehmet", 0002, true,"Full Time", "RetrAdmin");
		
		Stuffs stewart = new Stuffs("Ali", 0001, true,"Full Time", "Admin");
		Stuffs techics = new Stuffs("Ahmet", 0002, true,"Full Time", "ExAdmin");
		Stuffs security = new Stuffs("Asli", 998567, true, "Part Time", "New worker");
		
		
		System.out.println(master.toString());
		
		
		
		Administrator buAdam = new Managers(null, 0, null, null, null); //Polimorfic
		
		Managers buAdam2 = new Managers(null, 0, null, null, null); //Polimorfic
		
		
		
		
		
		
		((Managers)buAdam).secretMethod(); // Casting
		
		
		coManager.payments(30);
		coManager.vocation(21, 5);
		coManager.bonus(250);
		coManager.personeliDCard(1234565, "Ali", "Manager");
		
	}
	
	
}

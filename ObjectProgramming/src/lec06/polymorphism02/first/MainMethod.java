package lec06.polymorphism02.first;

public class MainMethod {

	public static void main(String[] args) {

		// 다형성
		Company cmpElecs = new Eletronics();
		Company cmpShips = new Ships();
		
		cmpElecs.builtCompany();
//		cmpElecs.systemDevice();
		
		Eletronics eletronics = new Eletronics();
		eletronics.systemDevice();
		
		boolean boolCompany = cmpElecs instanceof Company;
		System.out.println("같은가?: " + boolCompany);
		
		boolean booleletronics = eletronics instanceof Company;
		System.out.println("같은가? boolEletronics: " + booleletronics);
		
		Ships ships = new Ships();
		boolean boolShips = ships instanceof Company;
		System.out.println("같은가? boolShips: " + boolShips);
		
		if (ships instanceof Ships) {
			System.out.println("조선회사가 맞습니다.");
		}
	}

}

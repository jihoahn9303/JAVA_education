package lec06.polymorphism02.first;

public class MainMethod {

	public static void main(String[] args) {

		// ������
		Company cmpElecs = new Eletronics();
		Company cmpShips = new Ships();
		
		cmpElecs.builtCompany();
//		cmpElecs.systemDevice();
		
		Eletronics eletronics = new Eletronics();
		eletronics.systemDevice();
		
		boolean boolCompany = cmpElecs instanceof Company;
		System.out.println("������?: " + boolCompany);
		
		boolean booleletronics = eletronics instanceof Company;
		System.out.println("������? boolEletronics: " + booleletronics);
		
		Ships ships = new Ships();
		boolean boolShips = ships instanceof Company;
		System.out.println("������? boolShips: " + boolShips);
		
		if (ships instanceof Ships) {
			System.out.println("����ȸ�簡 �½��ϴ�.");
		}
	}

}

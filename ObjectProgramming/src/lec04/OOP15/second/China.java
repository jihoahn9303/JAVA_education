package lec04.OOP15.second;

public class China extends Country {

	public String special = "�а� �α��� ����.";
	
	public void showDefault() {
		String species = super.species;
		String haveMust = super.haveMust;
		
		System.out.println("��: " + species);
		System.out.println("�ʿ��� ��: " + haveMust);
	}

	@Override
	public void mainEat() {
		// TODO Auto-generated method stub
		System.out.println("������ �ʹ�⸦ �Դ´�.");
	}
	
	
}

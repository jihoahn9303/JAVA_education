package lec06.enum01.first;

public class EnumMain {

	public static void main(String[] args) {

		EnumCRUD eCreate = EnumCRUD.CREATE;
		EnumCRUD eRead = EnumCRUD.READ;
		EnumCRUD eUpdate = EnumCRUD.UPDATE;
		EnumCRUD eDelete = EnumCRUD.DELETE;
		
		System.out.println("����: " + eCreate.getStrName());
		System.out.println("�б�: " + eRead.getStrName());
		System.out.println("����: " + eUpdate.getStrName());
		System.out.println("����: " + eDelete.getStrName());
		
		int kindLogicValue = 1;
//		int kindLogicValue = 2;
//		int kindLogicValue = 3;
//		int kindLogicValue = 4;
		
		if (EnumCRUD.CREATE.getIntValue() == kindLogicValue) {
			System.out.println("���� �����Դϴ�.");
		}  else if (EnumCRUD.READ.getIntValue() == kindLogicValue) {
			System.out.println("�б� �����Դϴ�.");
		}  else if (EnumCRUD.UPDATE.getIntValue() == kindLogicValue) {
			System.out.println("���� �����Դϴ�.");
		}  else if (EnumCRUD.DELETE.getIntValue() == kindLogicValue) {
			System.out.println("���� �����Դϴ�.");
		}
	}

}

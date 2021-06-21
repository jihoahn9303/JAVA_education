package lec06.anonymousclass05.first;

/*
 * �͸� Ŭ������ ���
 * 1. ��� ���� : ���α׷� ���ο��� �ѹ��� ��ü�� ���� ����ϴ� ��Ȳ�� �߻��ϱ� ����
 * 2. �ַ� ����ϴ� �� : Thread(Runnable), Event Listener ��ü ����, UI handling ��
 */
public class MainMethod {

	public static void main(String[] args) {

		// �͸� Ŭ���� : ������ �����Ͽ��� Ŭ���� �Ǵ� �������̽��� �����԰� ���ÿ� ��ü ������ ����! 
		new Company() {
			@Override
			public String returnCompanyName() {
				return super.returnCompanyName();
			}			
		};
		
		Company comp = new Company("Korea Gas") {			
			@Override
			public String returnCompanyName() {
				return super.returnCompanyName();
			}			
		};
		
		System.out.println(comp.returnCompanyName());
		
		
		new Runnable() {			
			@Override
			public void run() {
				
			}
		};
	}

}

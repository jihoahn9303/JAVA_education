package lec06.interface03.first;

public class SampleClass implements SampleInterface {

	@Override
	public void interfaceMethod() {
		System.out.println("SampleClass���� ��üȭ�Ǿ����ϴ�");
	}

	@Override
	public void abstractMethod() {
		System.out.println("SampleClass���� ��üȭ�Ǿ����ϴ�.");
	}

	@Override
	public void defaultMethod() {
		System.out.println("default �޼ҵ��Դϴ�. Sample class���� �����Ǿ����ϴ�.");
	}

	@Override
	public void callPrivateMethodInDefaultMethod() {
		System.out.println("private �޼��带 ȣ���ϴ� �޼����Դϴ�. Sample class���� �����Ǿ����ϴ�.");
	}

}

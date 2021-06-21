package lec06.interface03.first;

/*
 * �������̽��� �߻� �޼ҵ��� ����
 * 1. ���� ��, ����ϴ� keyword : implements vs extends
 * 2. ���� ���� : ���� ��ü�� ������ ���Ͻ�Ű�� ���� vs �־��� ����� �״�� ����ϰų� Ȯ���ϱ� ����
 * 3. ���� ����� �� : ���� ���� �������̽� ���� ���� ���� vs �� �ϳ��� Ŭ������ ��� ����(���� ��� x)
 */
public interface SampleInterface {

	// �߻� �޼ҵ�� ����������, �������̽��� ��ӹ޴� Ŭ������ ���ο� ������ �߻� �޼ҵ带 �����ϵ��� �����Ѵ�.
	public void interfaceMethod();
	public abstract void abstractMethod();
	
	public String OS_NAME = "windows10";
	public final static String DOWNLOAD_PATH = "C:/";
	
	public class sampleFirst {
		public int sampleCount = 3;
	}
	
	public static class sampleStaticClass {
		public static int staticSampleCount = 1;
	}
	
	public interface innerInterface {
		public void showMsg();
	}
	
	public enum D {CREATE, READ, UPDATE, DELETE}
	
	// �������̽� ���ο����� default Ű���带 ����Ͽ� �Ϲ� �޼ҵ��� ������ �����ϴ�.
	public default void defaultMethod() {
		System.out.println("�⺻ �޼ҵ��Դϴ�. JAVA 1.8 ���ĺ��� ��� �����մϴ�.");
	}
	
	public static void staticVoidMethod() {
		System.out.println("static �޼ҵ嵵 ����� �����մϴ�. �� ���� 1.8���� ����� �����մϴ�.");
	}
	
	private void privateMethod() {
		System.out.println("interface ������ private �޼ҵ��Դϴ�. JAVA 11 ���ĺ��� ��� �����մϴ�.");
	}
	
	default void callPrivateMethodInDefaultMethod() {
		privateMethod();
	}
}

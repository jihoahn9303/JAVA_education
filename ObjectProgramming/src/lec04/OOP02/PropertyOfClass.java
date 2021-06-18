package lec04.OOP02;

public class PropertyOfClass {

	// ���� ��������
	// ���� Ŭ�������, �� ���� �����ϰ� �ȴ�.
	public static int entityCount;
	
	// ���� ����(�ν��Ͻ� ����)
	// Ŭ������ �� ��ü����, ������ ���� ������ �ȴ�.
	public String goodsNo;
	public String goodsName;
	public String goodsPrice;
	
	// enum���� ������ ���, {}�ȿ� ǥ���� ���� ����� �� �ִ�.
	public enum EnumDataType {
		INSERT, UPDATE, DELETE, NORMAL
	}	
	public EnumDataType enumDataType = EnumDataType.NORMAL;
	
	// static �ʱ�ȭ block
	// Ŭ������ ����, ���� �ν��Ͻ��� �����ϴ���, �� �ѹ��� ȣ��ȴ�.
	static {
		System.out.println("Goods ::: ���� �ʱ�ȭ ����");
		System.out.println("Goods entity count : " + entityCount);
		System.out.println("���� �ʱ�ȭ�� ������ ����ɱ��?");
	}
	
	// �Ϲ� �ʱ�ȭ block
	// �ν��Ͻ��� ������ ������ ȣ��Ǵ� block, �����ں��� ���� ȣ��ȴ�
	{
		System.out.println("�ʱ�ȭ ���� �����մϴ�.");
		entityCount++;
		
		goodsNo = "goods" + entityCount;
		
		System.out.println("��ǰ��ȣ : " + goodsNo);
	}
	
	// ������ �Լ�
	public PropertyOfClass() {
		System.out.println("�⺻ ������ �Լ��� �����մϴ�.");
	}
	
	public PropertyOfClass(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public PropertyOfClass(String goodsName, String goodsPrice) {
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;		
	}

	// toString : �ش� �ν��Ͻ��� ���� ���� ���� �˰� ���� ��, �ַ� ����Ѵ�.
	// mouse right click -> source -> generate toString
	@Override
	public String toString() {
		return "PropertyOfClass [goodsNo=" + goodsNo + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + "]";
	}
	
	// static inner class
	// Ŭ���� ���ο��� Ŭ������ ������ �� �ִ�.
	// �� ��, Ŭ������ ��� ��ü�� ������ ���� ������ �� ��� ����Ѵ�.
	public static class InnerClassInfo {
		public static String[] innerClassPropertiesName = new String[] {"��ǰ��ȣ", "��ǰ��", "�ܰ�"};
		public static int[] innerClassPropertiesPrice = new int[] {100, 1500, 2000, 3000};		
	}
	
}

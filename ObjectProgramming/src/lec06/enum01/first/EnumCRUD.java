package lec06.enum01.first;

public enum EnumCRUD {

	// ������ ���� �� �ִ� ���� ������ �����Ǿ� �ִ� ���, enum �ڷ����� ����Ѵ�.
	CREATE(1, "����"), READ(2, "�б�"), UPDATE(3, "����"), DELETE(4, "����");
	
	// EnumCRUD��� enum �ڷ����� ������ ���� ����
	private int intValue;
	private String strName;
	
	// �ܺο��� ���� ������ �� ������, private Ű���带 ���(�̹� ���� ������ �����Ƿ�)
	// ��ġ �����ڿ� ������ ������.
	private EnumCRUD(int intValue, String strName) {
		this.intValue = intValue;
		this.strName = strName;
	}

	public int getIntValue() {
		return intValue;
	}


	public String getStrName() {
		return strName;
	}


	
	
}

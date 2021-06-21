package lec06.enum01.first;

public enum EnumCRUD {

	// 변수가 가질 수 있는 값의 종류가 한정되어 있는 경우, enum 자료형을 사용한다.
	CREATE(1, "저장"), READ(2, "읽기"), UPDATE(3, "수정"), DELETE(4, "삭제");
	
	// EnumCRUD라는 enum 자료형에 저장할 값의 종류
	private int intValue;
	private String strName;
	
	// 외부에서 값을 변경할 수 없도록, private 키워드를 사용(이미 값이 정해져 있으므로)
	// 마치 생성자와 유사한 형태임.
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

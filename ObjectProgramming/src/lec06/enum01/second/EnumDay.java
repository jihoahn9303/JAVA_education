package lec06.enum01.second;

public enum EnumDay {
	MON("��"), TUE("ȭ"), WED("��"), THU("��"), FRI("��"), SAT("��"), SUN("��");
	
	public String strName;
	
	private EnumDay(String day) {
		this.strName = day;
	}
}

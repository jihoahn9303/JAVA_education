package lec06.enum01.second;

import java.util.Scanner;

public class EnumDayMain {

	public static void main(String[] args) {
		
		while (true) {
			System.out.print("������ �Է��ϼ���.  ");
			
			Scanner scanner = new Scanner(System.in);
			String strNext = scanner.next();
			
			if (strNext.equals(EnumDay.MON.strName)) {
				System.out.println("�������Դϴ�.");
			} else if (strNext.equals(EnumDay.TUE.strName)) {
				System.out.println("ȭ�����Դϴ�.");
			} else if (strNext.equals(EnumDay.WED.strName)) {
				System.out.println("�������Դϴ�.");
			} else if (strNext.equals(EnumDay.THU.strName)) {
				System.out.println("������Դϴ�.");
			} else if (strNext.equals(EnumDay.FRI.strName)) {
				System.out.println("�ݿ����Դϴ�.");
			} else if (strNext.equals(EnumDay.SAT.strName)) {
				System.out.println("������Դϴ�.");
			} else if (strNext.equals(EnumDay.SUN.strName)) {
				System.out.println("�Ͽ����Դϴ�.");
			} else	break;
		}
	}

}

package lec06.enum01.first;

import java.util.Scanner;

public class EnumSecondMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("���� �Է��ϼ���.  ");
			int scIn = scanner.nextInt();
			
			if (scIn == EnumCRUD.CREATE.getIntValue()) {
				System.out.println("���� �����Դϴ�.");
			} else if (scIn == EnumCRUD.READ.getIntValue()) {
				System.out.println("�б� �����Դϴ�.");
			} else if (scIn == EnumCRUD.UPDATE.getIntValue()) {
				System.out.println("���� �����Դϴ�.");
			} else if (scIn == EnumCRUD.DELETE.getIntValue()) {
				System.out.println("���� �����Դϴ�.");
			} else	break;
		}
	}

}

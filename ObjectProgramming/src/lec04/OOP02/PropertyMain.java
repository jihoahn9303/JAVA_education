package lec04.OOP02;

public class PropertyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyOfClass propertyOfClass = new PropertyOfClass();
		PropertyOfClass propertyOfClassHasName = new PropertyOfClass("Ŀ��");
		PropertyOfClass propertyOfClassHasNamePrice = new PropertyOfClass("�ٳ���", "1500");
		
		propertyOfClassHasNamePrice.enumDataType = PropertyOfClass.EnumDataType.INSERT;
		
		System.out.println();
		System.out.println(propertyOfClass.toString());
		System.out.println(propertyOfClassHasName.toString());
		System.out.println(propertyOfClassHasNamePrice.toString());
		
		System.out.println();
		
		String[] innerClassPropertiesName = PropertyOfClass.InnerClassInfo.innerClassPropertiesName;
		for (String strVar : innerClassPropertiesName) {
			System.out.println("strVar : " + strVar);
		}
		
		System.out.println();
		
		int[] innerClassPropertiesPrice = PropertyOfClass.InnerClassInfo.innerClassPropertiesPrice;
		for (int intVar : innerClassPropertiesPrice) {
			System.out.println("intVar : " + intVar);
		}
	}

}

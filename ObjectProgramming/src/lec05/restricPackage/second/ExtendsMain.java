package lec05.restricPackage.second;

import lec05.restricPackage.first.GoodsVO;

public class ExtendsMain extends GoodsVO{

	public static void main(String[] args) {
//		super.goodsName;  
		ExtendsMain extendsMain = new ExtendsMain();
		extendsMain.showMethod();
		
	}
	
	public void showMethod() {
		String goodsName = super.goodsName;
		int goodsCount = super.goodsCount;
		
		System.out.println("상품 이름 : " + goodsName);
		System.out.println("상품 가격 : " + goodsCount);
	}
}

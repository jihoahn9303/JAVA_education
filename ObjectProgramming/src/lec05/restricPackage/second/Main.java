package lec05.restricPackage.second;

import lec05.restricPackage.first.GoodsVO;

public class Main {

	public static void main(String[] args) {
		
		GoodsVO goodsVO = new GoodsVO();
		goodsVO.goodsName = "����";
		
//		goodsVO.goodsCount;
//		goodsVO.goodsUnitName;
		
		System.out.println("��ǰ ����: " + goodsVO.getGoodsPrice());
		goodsVO.setGoodsPrice(1000);
		System.out.println("����� ��ǰ ����: " + goodsVO.getGoodsPrice());
	}

}

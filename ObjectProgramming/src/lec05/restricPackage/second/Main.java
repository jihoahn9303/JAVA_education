package lec05.restricPackage.second;

import lec05.restricPackage.first.GoodsVO;

public class Main {

	public static void main(String[] args) {
		
		GoodsVO goodsVO = new GoodsVO();
		goodsVO.goodsName = "나물";
		
//		goodsVO.goodsCount;
//		goodsVO.goodsUnitName;
		
		System.out.println("상품 가격: " + goodsVO.getGoodsPrice());
		goodsVO.setGoodsPrice(1000);
		System.out.println("변경된 상품 가격: " + goodsVO.getGoodsPrice());
	}

}

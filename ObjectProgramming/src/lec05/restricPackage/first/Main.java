package lec05.restricPackage.first;

public class Main {

	public static void main(String[] args) {
		
		GoodsVO goodsVO = new GoodsVO();
		goodsVO.goodsName = "��ġ";
		goodsVO.goodsCount = 2;
		goodsVO.goodsUnitName = "����";
		
		int goodsPrice = goodsVO.getGoodsPrice();
		System.out.println("��ǰ ����: " + goodsPrice);
		
		goodsVO.setGoodsPrice(10000);
		int gp = goodsVO.getGoodsPrice();
		System.out.println("��ǰ ����: " + gp);
		
	}

}

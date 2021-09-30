package dfdf;

public class ShopEx {

	public static void main(String[] args) {
		MyShop shop = new MyShop();
		
		//상점 이름
		shop.setTitle("e마트");
		//고객 생성
		shop.genUser();
		
		//제품 생성
		shop.genProduct();
		
		//상점 시작
		shop.start();
		
		
		
		
	}

}

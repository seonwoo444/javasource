package dfdf;

import java.util.Scanner;

public class MyShop implements Shop {
	private String title;
	private String user;
	private Scanner sc = new Scanner(System.in);
	// 장바구니 역활
	private Product[] carts = new Product[10];

	// 회원 정보를 갖고 있는 배열 - 회원이름, 결제타입 정보
	private User users[] = new User[2];
	char [] arr = {'a', 'b', 'c'};

	// 상품정보 배열 - 상품이름, 가격, 상세정보
	private Product[] products = new Product[5];

	public MyShop() {

	}

	@Override
	public void setTitle(String name) {
		this.title = name;

	}

	@Override
	public void genUser() {
		// 고객 2명 생성
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);
		String st = new String(arr);

	}

	@Override
	public void genProduct() {
		// 상품 5개 생성
		// SmartTv 2, CellPhone3
		// product[0] =new Product 추상 클래스는 자식 클래스에 객체 생성
		products[0] = new CellPhone("z플립", 1500000, "SKT");
		products[1] = new CellPhone("아이폰15", 2000000, "LG");
		products[2] = new CellPhone("v50", 1550000, "KT");
		products[3] = new SmartTv("LG 스마트 Tv", 3000000, "4k");
		products[4] = new SmartTv("삼성 울트라 Tv", 3200000, "Full HD");
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인 화면 - 계정선택");
		System.out.println("=============================");
		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}
		System.out.println("[x] 종료");
		System.out.print("선택 : ");
		String input = sc.next();
		System.out.println("### " + input + "선택 ###");

		// 사용자가 0, 1를 선택한 경우
		// x를 입력한 경우 => 종료
		switch (input) {
		case "x": {
			System.exit(0);
			break;
		}
		default:// "0", "1"의 문자열을 입력 시
			user = input;
			productList();
			break;
		}
	}

	public void productList() {
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("=============================");
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]", i);
			products[i].printDetail();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.println("선택 : ");

		// 사용자의 입력 => 상품선택 0~4(장바구니에 현재 선택한 제품 담기), h(메인화면), c
		String input = sc.next();

		switch (input) {
		case "h": {
			start();
			break;
		}
		case "c": {
			checkOut();
			break;
		}
		default:
			// 사용자가 선택한 상품을 carts에 담기
			for (int i = 0; i < carts.length; i++) {
				if (carts[i] == null) {
					carts[i] = products[Integer.parseInt(input)];
					break;
				}
			}
			// 상품 목록을 보여주기
			productList();
			break;
		}

	}

	public void checkOut() {
		System.out.println("## c선택 ##");
		System.out.println(title + " : 체크아웃");
		System.out.println("=============================");
		int total = 0;
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.printf("[%d] %s (%d)\n",i,carts[i].getPname(),carts[i].getPrice());
				total+=carts[i].getPrice();//결제 금액
			}
		}
		System.out.println("=============================");
		System.out.println("결재방법 : "+users[Integer.parseInt(user)].getPayType());
		System.out.println("합계 : "+total);
		System.out.println("[p] 이전, [q] 결제 완료");
		System.out.println("선택 : ");
		
		String input = sc.next();
		
		//p , q
		switch (input) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println("결제가 완료되었습니다. 종료합니다.");
			break;

		default:
			break;
		}
	}

}

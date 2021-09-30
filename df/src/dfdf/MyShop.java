package dfdf;

import java.util.Scanner;

public class MyShop implements Shop {
	private String title;
	private String user;
	private Scanner sc = new Scanner(System.in);
	// ��ٱ��� ��Ȱ
	private Product[] carts = new Product[10];

	// ȸ�� ������ ���� �ִ� �迭 - ȸ���̸�, ����Ÿ�� ����
	private User users[] = new User[2];
	char [] arr = {'a', 'b', 'c'};

	// ��ǰ���� �迭 - ��ǰ�̸�, ����, ������
	private Product[] products = new Product[5];

	public MyShop() {

	}

	@Override
	public void setTitle(String name) {
		this.title = name;

	}

	@Override
	public void genUser() {
		// �� 2�� ����
		users[0] = new User("ȫ�浿", PayType.CARD);
		users[1] = new User("������", PayType.CASH);
		String st = new String(arr);

	}

	@Override
	public void genProduct() {
		// ��ǰ 5�� ����
		// SmartTv 2, CellPhone3
		// product[0] =new Product �߻� Ŭ������ �ڽ� Ŭ������ ��ü ����
		products[0] = new CellPhone("z�ø�", 1500000, "SKT");
		products[1] = new CellPhone("������15", 2000000, "LG");
		products[2] = new CellPhone("v50", 1550000, "KT");
		products[3] = new SmartTv("LG ����Ʈ Tv", 3000000, "4k");
		products[4] = new SmartTv("�Ｚ ��Ʈ�� Tv", 3200000, "Full HD");
	}

	@Override
	public void start() {
		System.out.println(title + " : ���� ȭ�� - ��������");
		System.out.println("=============================");
		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}
		System.out.println("[x] ����");
		System.out.print("���� : ");
		String input = sc.next();
		System.out.println("### " + input + "���� ###");

		// ����ڰ� 0, 1�� ������ ���
		// x�� �Է��� ��� => ����
		switch (input) {
		case "x": {
			System.exit(0);
			break;
		}
		default:// "0", "1"�� ���ڿ��� �Է� ��
			user = input;
			productList();
			break;
		}
	}

	public void productList() {
		System.out.println(title + " : ��ǰ ��� - ��ǰ ����");
		System.out.println("=============================");
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]", i);
			products[i].printDetail();
		}
		System.out.println("[h] ����ȭ��");
		System.out.println("[c] üũ�ƿ�");
		System.out.println("���� : ");

		// ������� �Է� => ��ǰ���� 0~4(��ٱ��Ͽ� ���� ������ ��ǰ ���), h(����ȭ��), c
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
			// ����ڰ� ������ ��ǰ�� carts�� ���
			for (int i = 0; i < carts.length; i++) {
				if (carts[i] == null) {
					carts[i] = products[Integer.parseInt(input)];
					break;
				}
			}
			// ��ǰ ����� �����ֱ�
			productList();
			break;
		}

	}

	public void checkOut() {
		System.out.println("## c���� ##");
		System.out.println(title + " : üũ�ƿ�");
		System.out.println("=============================");
		int total = 0;
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.printf("[%d] %s (%d)\n",i,carts[i].getPname(),carts[i].getPrice());
				total+=carts[i].getPrice();//���� �ݾ�
			}
		}
		System.out.println("=============================");
		System.out.println("������ : "+users[Integer.parseInt(user)].getPayType());
		System.out.println("�հ� : "+total);
		System.out.println("[p] ����, [q] ���� �Ϸ�");
		System.out.println("���� : ");
		
		String input = sc.next();
		
		//p , q
		switch (input) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println("������ �Ϸ�Ǿ����ϴ�. �����մϴ�.");
			break;

		default:
			break;
		}
	}

}

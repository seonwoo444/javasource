
public class TvEx3 {

	public static void main(String[] args) {
		// Tv3 ��ü�� 3�� �����ϰ� �ʹ�

//		Tv3 tv1 = new Tv3();
//		Tv3 tv2 = new Tv3();
//		Tv3 tv3 = new Tv3();

		// => �ѹ��� �迭�� ó�� �� �� �ִ�

		Tv3 tvArr[] = new Tv3[3];

		tvArr[0] = new Tv3("����", true, 5);
		tvArr[1] = new Tv3("����", false, 6);
		tvArr[2] = new Tv3("���", true, 7);
		printArr(tvArr);
	}

	static void printArr(Tv3 tvArr[]) {
		// tvArr�� ����ִ� ��ü�� ������ ���
		for (int i = 0; i < tvArr.length; i++) {
			System.out.println("Tv ���� " + tvArr[i].getColor());
			System.out.println("Tv ���� " + tvArr[i].getPower());
			System.out.println("Tv ä�� " + tvArr[i].getChennel());
			System.out.println();
		}

	}

}


public class TvEx3 {

	public static void main(String[] args) {
		// Tv3 객체를 3개 생성하고 싶다

//		Tv3 tv1 = new Tv3();
//		Tv3 tv2 = new Tv3();
//		Tv3 tv3 = new Tv3();

		// => 한번에 배열로 처리 할 수 있다

		Tv3 tvArr[] = new Tv3[3];

		tvArr[0] = new Tv3("빨강", true, 5);
		tvArr[1] = new Tv3("검정", false, 6);
		tvArr[2] = new Tv3("흰색", true, 7);
		printArr(tvArr);
	}

	static void printArr(Tv3 tvArr[]) {
		// tvArr에 들어있는 객체의 내용을 출력
		for (int i = 0; i < tvArr.length; i++) {
			System.out.println("Tv 색상 " + tvArr[i].getColor());
			System.out.println("Tv 전원 " + tvArr[i].getPower());
			System.out.println("Tv 채넗 " + tvArr[i].getChennel());
			System.out.println();
		}

	}

}

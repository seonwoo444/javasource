
public class TriangleMain2Ex3 {
	public static void main(String[] args) {
		//길이가 서로 다른 삼각형 5개를 생성
		//넓이 구하기
		
		TriangleMain3 triArr[] = new TriangleMain3(5);
		triArr[0] = new TriangleMain3(10, 15);
		triArr[1] = new TriangleMain3(5, 10);
		triArr[2] = new TriangleMain3(12, 20);
		triArr[3] = new TriangleMain3(8, 15);
		triArr[4] = new TriangleMain3(7, 17);
		
		triArr(triArr);
	
	}
	
	static void triArr() {
		//면적 구하기
		for (int i = 0; i < triArr.length; i++) {
			System.out.println("면적 "+triArr[i].getArea());
		}
	}
	
	
	
	
}

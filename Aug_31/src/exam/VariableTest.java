package exam;

// 변수의 유효범위
//1. 선언된 블록 안에서만 사용가능
//2. 로컬(지역) 변수

public class VariableTest {
	
	//변수
	private int num1;
	
	//메소드
	public static void main(String[] args) {
		int num2 = 0;// 로컬 변수 =(초기화 시켰다는 의미)
		if(num2 < 10) {
			System.out.println(num2);
			
			int num3 = 3;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i+"");
		}
		System.out.println(i);
	}
	public void print() {
		System.out.println(num1);
	}
}

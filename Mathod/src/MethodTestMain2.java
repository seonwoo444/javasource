
public class MethodTestMain2 {
	public static void main(String[] args) {
		MathodTestMain1 obj = new MathodTestMain1();
		obj.print99dan();
		
		//덧셈 기능
		//메소드를 호출하는 쪽에서 입력값을 넣어주기
		obj.sum(4, 34);
//		obj.sum(10.5, 32.4); - 정수값으로만 보내야 한다 정수로만 받겠다고 선언했으니
//		obj.sum(4, 34);
		
		//자동형변환으로 byte에서 int로 넘어가는건 문제가 없다.
		byte b1 = 3;
		byte b2 = 5;
		
		obj.sum(b1, b2);
	}
}

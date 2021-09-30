package Exception;

public class ThrowsEx {
//main에서 throws ClassNotFoundException : jvm한테 던져지는 의미 => 화면 출력
	public static void main(String[] args)/*throws ClassNotFoundException*/ {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}
	
	//throws :  여기서 발생한 예외를 이 메소드를 호출하는 곳으로 던지겠음
	public static void findClass() throws ClassNotFoundException {
		Class.forName("");
	}

}

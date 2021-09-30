package Exception;

//Exception(예외사항)
//CheckedException : comile 시 나타나는 예외
//UnCheckedException : run 타임 시 나타나는 예외

public class CheckedException {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

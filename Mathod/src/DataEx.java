
public class DataEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
//		System.out.println("data : "+data);
		// x값을 10으로 지정
//		data.x = 10;
//		change(data.x);
		
		System.out.println();
		
		change(data);
		System.out.println("after change () x = "+data.x);
	}
	static void change(int x) {
		x = 10000;
		System.out.println("change () x = "+x);
	}
	static void change(Data d) {
		// d => Data@156643d4
		System.out.println(d);
		d.x = 10000;
	}
}

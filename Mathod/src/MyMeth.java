
public class MyMeth {
		//멤버변수 long 변수 2개
		
		//메소드 : add, subtract, multiply, divide
		//     : 입력값 업음, 반환값은 연산결과
	
	long x, y;
	
	long add(){
		return x+y;
		
	}
	long subtract(){
		return x-y;
		
	}
	long multiply(){
		return x*y;
		
	}
	double divide(){
		return x/y;
		
	}
	//----------------
	
	static long add(long x, long y){
		return x+y;
		
	}
	static long subtract(long x, long y){
		return x-y;
		
	}
	static long multiply(long x, long y){
		return x*y;
		
	}
	static double divide(double x, double y){
		return x/y;
		
	}
	
		
}

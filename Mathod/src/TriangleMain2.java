
public class TriangleMain2 {
	//삼각형의 넓이
	//밑변 * 높이 / 2
	
	//속성 : 밑변, 높이
	//기능(메소드) : 밑변 * 높이 / 2 결과 리턴
	
	private int x;
	private int y;
	//생성자는 기본 생성자
	TriangleMain2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
//	TriangleMain(){ 기본 생성자는 안만들어도 자동으로 생성 = 안해도 되고 해도 되고
		
//	}
	
	int area() {
	return	x * y /2;
	}
}

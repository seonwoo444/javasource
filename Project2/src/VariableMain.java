
// 변수(Variable)
// 프로그램 진행 중에 만들어진 데이터
// - 데이터를 담는 그릇
// 		프로그램 진행 중에 만들어진 데이터를 임시로 저장할 때
// 문법
//		그릇종류		그릇이름
//		어떤데이터저장	이름
//		자료형		변수명 -> 변수 문법
// 자료형
// 		기본형
//	`		정수 - byte(), short, int(주력으로 씀), long -> 그릇의 크기 차이
//	실수 - float(나머지 언어에서 주력), double(주력 자바한정) -> 그릇의 크기 차이
//			글자 - char
//			논리 - boolean
//		참조형
//			문자열(여러문자) - String
//			기타등등......

// 변수명 불문율
// 숫자로 시작불가
// 특수문자 불가(_,$는 괜찮음)
// 자바문법 불가
// 소문자로 시작
// 영어+숫자 조합으로(한국어등등 불가)
// 뜻은 알아볼수 있게
// 띄어쓰기 불가 -> 국어점수 - korScore(o), kor score(x) : 낙타체
//	kor_score : 뱀체
// = : 오른쪽에 있는거 왼쪽에 넣어라(같다x)
// Refactor -> Rename(Alt shift r) : 변수명 바꾸기(관련된 모든 변수명)
public class VariableMain {

	public static void main(String[] args) {
		// 국어점수 80점을 임시 저장
		int kor; // 변수를 만듬 
		kor = 80; // 변수에 값 저장

		System.out.println("kor_score"); // kor_score라는 이름을 출력
		System.out.println(kor); // kor_score변수에 들어있는 값 출력

		// 기온이 24.38도인것을 임시로 저장할 수 있게
		// 변수 만들기
		// 변수에 값 저장

		// 그 변수에 들어있는 값 출력

		float temp;
		temp = (float) 24.38;// 형변환(casting) - (자료형) 값

		// double temp;
		// temp = 24.38;

		System.out.println(temp);
		// 기본자료형 - 아무 처리도 안하고 값만 있으면 무엇으로 인식할 것 인지
		// 123 - int
		// 23114.3214 - double -> java만 double로 인식

		// ㅋ라는 글자를 임시로 저장할 수 있게
		char lau;
		lau = 'ㅋ';
		System.out.println(lau);

		// ㅋㅋ라는 글자를 임시로 저장할 수 있게
		String laugh;
		laugh = "ㅋㅋ";
		System.out.println(laugh);
		// 참조형 사이즈는 컴퓨터 32/64 bit
		// 저장소 heap부분에 번지수 가지정되고 저장해놓는다
		// 저장소 stack에 지정된 번지수로 저장

		// 다 쓴 공간 반납하려면
		// static -
		// stack - 프로그램 종료시 자동 반납 -> 수동 반납 불가능
		// heap - 자동 반납되지 않음 -> 개발자가 수동으로 반납 처리
		// 대신 java는 Garbagecollection기능이 heap영역 자동정리 시스템이 존재
		boolean isHun;
		isHun = false;
		System.out.println(isHun);

		// java 한에서
		// 지역변수를 만들고 값을 안넣으면 사용이 불가능
		int age;
		age = 26;
		System.out.println(age);

	}
}

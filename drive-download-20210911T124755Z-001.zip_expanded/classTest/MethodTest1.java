package classTest;

/*
 * ����Ÿ�� �޼ҵ��(.....){
 * 
 * 		����Ÿ���� void �� ���� �����Ѵٸ�
 * 	    ������ return Ű���尡 ���;� ��
 * 
 * }
 * 
 * 
 */
public class MethodTest1 {
	// ���ϰ��� true/false �޼ҵ� ���� => boolean
	boolean isRedirect() {
		return false;		
	}	
	
	// ���ϰ��� int Ÿ���� �޼ҵ�
	int sum() {
		return 3;
	}	
	
	// ���ϰ��� int, �� ���� ��������(int)�� �ޱ�
	int multiply(int num1,int num2) {
		return num1*num2;
	}	
	
	// ���ϰ�: long, �� ���� ��������(int)�� �ޱ�
	long add(long num1,long num2) {
		return num1+num2;
	}	
	
	// ���ϰ�: char �޼ҵ�
	char method() {
		return 'c';
	}
	
	void method1() { //�ѱ�� �� ����
		
	}
	
	//����Ÿ�� : int�� 1���� �迭
	//�������� : int�� 1���� �迭
	int[] print(int arr[]) {
		return arr;
	}
	
	
	//����Ÿ�� : double, �Ű����� : �ΰ��� double
	//�ؾ��� �� : ���� �ΰ��� �Ű������� �������� ��� ����
	double divide(double a,double b) {
		return a/b;
	}
	
}





















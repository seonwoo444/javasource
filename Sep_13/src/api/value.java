package api;

public class value {

	int value;

	public value(int value) {
		super();
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {// Object obj = value2
		
		
		value v = (value)obj;
		
		if(this.value == v.value) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return value+"";//int���� ���ڿ��� �����ϴ� �� : int+"", String.valueOf(int)
		
	}
}

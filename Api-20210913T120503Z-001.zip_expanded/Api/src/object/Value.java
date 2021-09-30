package object;

public class Value {
	int value;

	public Value(int value) {
		super();
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) { 
		// value1.equals(value2)
		
		// Object obj = value2; obj.value(X) => �ڽ� ��ü�� ����ȯ		
		Value v = (Value)obj;		
		
		if(this.value == v.value) {
			return true;
		}
		
		return false;
	}
	
	// int ���� ���ڿ��� ���� : int+"", String.valueOf(int)
	@Override
	public String toString() {		
		return value+"";
	}
	
}

















package abstractTest;

public class Marine extends Unit {
	
	void stimPack() {}

	@Override
	void move(int x, int y) {
		System.out.printf("%d, %d �������� �̵�",x,y);
	}

}

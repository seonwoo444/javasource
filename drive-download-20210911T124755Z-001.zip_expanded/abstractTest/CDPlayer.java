package abstractTest;

public class CDPlayer extends Player {

	@Override
	void play(int pos) {		
		System.out.println(pos+" �κп��� ���");
	}

	@Override
	void stop() {		
		System.out.println("��� ����");
	}

}

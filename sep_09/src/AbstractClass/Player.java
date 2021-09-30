package AbstractClass;

public abstract class Player {
	boolean pause;
	int currentPos;
	
	public Player() {
		this.pause = false;
		currentPos = 0;
	}
	
	abstract void play(int pos);
	abstract void stop();
	
	void playI() {
		play(currentPos);
	}
	
	void pause() {
		if(pause) {
			pause = false;
			play(currentPos);
		}else {
			pause = true;
			stop();
		}
	}
	
	
}

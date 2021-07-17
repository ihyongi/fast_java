package ch16.gamelevel;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//Player가 play() 중에 레벨에 있는 go(int count) 라는 메서드를 호출하면 run() 하고
	//count 횟수 만큼 jump() 하고 turn() 합니다.
	final public void go(int count) {
		run();
		for(int i=0;i<count;i++) {
			jump();
		}
		turn();
	}

}

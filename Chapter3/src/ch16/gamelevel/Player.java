package ch16.gamelevel;

public class Player {
	private PlayerLevel level;
	
	//생성초기값 초급자레벨
	public Player() {
		level=new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void setLevel(PlayerLevel level) {
		this.level=level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level=level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}

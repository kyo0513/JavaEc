
public class Hero {
	private int hp;
	private String name;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	@Override
	public String toString() {
		return "名前:" + this.name + "/HP:" + this.hp;
	}
}

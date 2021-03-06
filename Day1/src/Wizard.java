
public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h) {
		int basePoint =10;
		int recovPoint =
				(int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp()+recovPoint);
		System.out.println(h.getName()+"のHPを"+ recovPoint + "回復した");
	}

	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp=hp;
	}
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		if(mp<0) {
			throw new IllegalArgumentException("MPの設定値が異常です");
		}
		this.mp=mp;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		if(name==null ||name.length()<3) {
			throw new IllegalArgumentException("Wizの名前の設定が異常です");
		}
		return this.name;
	}
	public Wand getWand() {
		if(wand==null) {
			throw new IllegalArgumentException("杖の設定が異常です");
		}
		return this.wand;
	}
	public void setWand(Wand wand) {
		this.wand=wand;
	}
}

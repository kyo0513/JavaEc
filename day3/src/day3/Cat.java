package day3;

public class Cat extends Animal{

	Cat(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	void makeNoise() {
		System.out.println("にゃー");
		// TODO 自動生成されたメソッド・スタブ
	}
	public void sleep() {
		System.out.println("すやすや");
	}

}

package day3;

public class Pigeon extends Animal implements Flyable{

	Pigeon(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}


	@Override
	void makeNoise() {
		System.out.println("ぽぽぽ");
		// TODO 自動生成されたメソッド・スタブ

	}


	@Override
	public void Fly() {
		System.out.println("ぱたぱた");
		// TODO 自動生成されたメソッド・スタブ

	}
}

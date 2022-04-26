
public class HeroApp {
	public static void main(String[] args) {
		Hero h = new Hero();         //Heroの設定
		h.setName("テスト");
		h.setHp(100);
		System.out.println(h);
		Wand wand=new Wand();        //Wandの設定
		wand.setName("なんかの杖");
		wand.setPower(10);
		Wizard wiz = new Wizard();   //Wizの設定
		wiz.setHp(100);
		wiz.setMp(100);
		wiz.setName("WIZ");
		wiz.setWand(wand);
		wiz.heal(h);                 //ヒールアクション
	}
}


public class Wand {
	private String name;
	private double power;

	public void setName(String name) {
		if(name== null ||name.length()<3) {
			throw new IllegalArgumentException("杖の設定値が異常です");
		}
		this.name=name;
	}
	public void setPower(double power) {
		if(power < 0.5 || power>100.0) {
			throw new IllegalArgumentException("増幅値の設定値が異常です");
		}
		this.power=power;
	}
	public String getName() {
		return this.name;
	}
	public double getPower() {
		return this.power;
	}
}

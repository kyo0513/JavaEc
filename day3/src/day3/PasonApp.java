package day3;
import java.util.Scanner;
public class PasonApp {
	public static void main(String[] args) {
		Person a = new Person();
		try {
			a.setAge(-5);
		} catch (Exception e) {
			//e.getMessage();
			System.out.println(e.getMessage());
		}
		
		System.out.print("ファイル名>>");
		String file = new Scanner(System.in).next();
		try {
			checkFormat(file);
			System.out.println("OK");
		} catch (UnsupporteMusicFileException e) {
			System.out.println(e.getMessage());
		}
	}

static void checkFormat(String fileName) throws UnsupporteMusicFileException {
	String[] params=fileName.split("\\.");
	String ext=params[params.length-1];
	if(!ext.equals("mp3")) {
		throw new UnsupporteMusicFileException("mp3以外");
	}
}
}
class Person {
	int age;
	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("年齢は正の値でないといけません");
		}
		this.age = age;
	}
}

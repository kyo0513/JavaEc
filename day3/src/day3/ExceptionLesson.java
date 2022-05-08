package day3;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionLesson {
	public static void main(String[] args) {
		//FileWriter fw = new FileWriter("data.txt");
		System.out.println("プログラムが起動しました");


		FileWriter fw=null;
		try {
			fw=new FileWriter("data.txt");
			fw.write("hello");
		}catch(Exception e){
			System.out.println("なんらかの例外が発生しました");
		} finally {
			if (fw != null) {
				try{
					fw.close();
				}catch (IOException e) {
					;
				}
			}
		}
		try(FileWriter fw2=new FileWriter("data.txt");){
			fw2.write("Hello2");
		}catch(Exception e) {
			System.out.println("何らかの例外が発生");
		}
		//Thread.sleep(3000);
	String s;
	try {
		s = null;
	    System.out.println(s.length());
	} catch (NullPointerException e) {
		System.out.println("null~");
		System.out.println("スタック開始");
		e.printStackTrace();
		System.out.println("スタック終わり");
	}

	try {
		int i=Integer.parseInt("三");
	} catch (NumberFormatException e) {
		//e.printStackTrace();
		System.out.println("エラー");
	}


	}
	static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}

}

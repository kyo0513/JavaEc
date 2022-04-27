import java.io.*;
import java.util.*;

public class Pointgame {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("point.csv");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		String[] params=line.split(",");
		HighScore scores = new HighScore(Integer.parseInt(params[0]),params[1]);
		br.close();
		//FileOpen();
		Random rmd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("****乱数ゲーム****");                      //ゲーム開始
		while(true) {
			System.out.println("HighScore "+ scores.point);
			System.out.println("やりますか yes…y no…n>");
			String act = sc.next();
			if(act.equals("n")) {
				System.out.println("アプリケーションを終了します");
				return;
			}
			if(act.equals("y")) {
				int num = rmd.nextInt(100000)+1;
				System.out.println(num);
				if(num>scores.point) {
					scores.point = num;
					System.out.println("new Record!");
					//FileWrite(scores);    //上書きになってしまうのあとで修正
				}
			}
		}
	}
	public static void FileOpen() throws Exception {
		FileInputStream fis = new FileInputStream("point.csv");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		br.close();
	}

	public static void FileWrite(HighScore csv) throws Exception {
		FileOutputStream fos = new FileOutputStream("point.csv");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		BufferedWriter bw = new BufferedWriter(osw);
		//bw.write(csv);
		bw.close();
	}
}
class HighScore{
	int point;
	String day;
	HighScore(int point,String day){
		this.point=point;
		this.day=day;
		this.day=day;
	}
}

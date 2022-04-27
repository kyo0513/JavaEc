import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Pointgame {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("point.csv");        //スコア読み込み
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		String[] params=line.split(",");
		HighScore scores = new HighScore(Integer.parseInt(params[0]),params[1]);
		br.close();
		Random rmd = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("****乱数ゲーム****");                      //ゲーム開始
		System.out.printf("HighScore %d %s%n",scores.point,scores.day);
		while(true) {
			System.out.println("やりますか yes…y no…n 初期化…d >");
			String act = sc.next();
			if(act.equals("n")) {
				System.out.println("アプリケーションを終了します");
				return;
			}
			if(act.equals("d")) {
				System.out.println("スコアを初期化します");           //おまけスコア初期化
				scores.point = 0;
				scores.day  = " ";
				FileWrite(scores);
			}
			if(act.equals("y")) {
				int num = rmd.nextInt(100000)+1;
				System.out.println(num);
				if(num>scores.point) {                                 //スコア更新時処理
					scores.point = num;
					scores.day =Dateget();
					System.out.println("new Record!");
					FileWrite(scores);
				}
			}
		}
	}
	static class HighScore {
		int point;
		String day;
		HighScore(int point, String day) {
			this.point = point;
			this.day = day;
		}
	}
	public static void FileWrite(HighScore scores) throws Exception {
		FileOutputStream fos = new FileOutputStream("point.csv");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		BufferedWriter bw = new BufferedWriter(osw);
		bw.append((Integer.toString(scores.point)) + "," + scores.day);
		bw.close();
	}
	public static String Dateget() {
		Date today=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		String date=sdf.format(today);
        return date;
	}
}

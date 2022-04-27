import java.util.Calendar;
import java.util.Date;

public class TimeLesson {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String str ="java";
		for(int i=0;i<10000;i++) {
			str+="java";
		}
		long end=System.currentTimeMillis();
		System.out.println("time "+(end-start));


		start = System.currentTimeMillis();
		System.out.println(start);
		StringBuilder sb = new StringBuilder();
	 	for(int i=0;i<10000;i++) {
	 		sb.append("java");
		}
		end = System.currentTimeMillis();
		System.out.println("time2 "+(end-start));

		//Date now = new Date();
		//System.out.println(now);
		//System.out.println(now.getTime());

		Calendar c = Calendar.getInstance();
		c.set(2019,8,22,1,23,45);   // 月は0-11らしい
		c.set(Calendar.MONTH,9);   // インスタンスの情報を変更
		Date d = c.getTime();
		System.out.println(d);

		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は"+y+"年です");
		System.out.println("Hello");

	}

}
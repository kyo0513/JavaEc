
public class StringBuilderLesson {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<8000;i++) {
			sb.append("java");
		}
		String s= sb.toString();
		System.out.println(s);
	}
}

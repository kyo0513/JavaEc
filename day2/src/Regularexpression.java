public class Regularexpression {
	public static void main(String[] args) {
		String s = "java";
		if(s.matches("java")) {
			System.out.println("Match1");
		}
		if(s.matches("javajava")) {
			System.out.println("Match2");
		}
		if(s.matches("j.va")) {
			System.out.println("Match3");
		}
		if("jaaaaaaava".matches("ja*va")) {
			System.out.println("Match4");
		}
		if("あいうxx019".matches(".*")) {
			System.out.println("Match5");
		}
		if("url".matches("[a-z]{3}")) {
			System.out.println("Match6");
		}
		s="abc,def:ghi";
		String[] words = s.split("[,:]");
		for(String w: words) {
			System.out.println(w + "->");
		}
		String w = s.replaceAll("[beh]","x");
		System.out.println(w);
		
		Method(3,5,7,9);
		Method();
		
		int sum=sumOf(1,2,3);
		System.out.println(sum);
		sum=sumOf(0,1,3,4);
		
	}
	public static void Method(int...args) {       //可変長引数
		for(int i:args) {
			System.out.println(i);
		}
	}
	public static int sumOf(int n,int...nums) {   //直に配列は使えない形
		int sum=n;
		for(int i:nums) {
			sum+=i;
		}
		return sum;
	}
	
}
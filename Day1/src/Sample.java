import java.util.LinkedHashMap;
import java.util.Map;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("world");

		//Map<String, Integer> prefs = new HashMap<String, Integer>();
		//Map<String, Integer> prefs = new TreeMap<String,Integer>();
		Map<String, Integer> prefs = new LinkedHashMap<String,Integer>();
		prefs.put("と_東京",1000);
		prefs.put("し_島根",900);
		prefs.put("ひ_広島",200);
		System.out.println(prefs);

	}
}
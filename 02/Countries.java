import java.util.HashMap;
import java.util.Map;

public class Countries {
	
	private static final String KEY_DE = "Germany";
	private static final String KEY_BG = "Bulgaria";
	private static final String KEY_RU = "RUSSIA";
	private static final String KEY_CN = "CHINA";
	private static final String KEY_NZ = "NEW ZEALAND";

	private static void fillMap(){
		final Map<String, Integer> m = new HashMap<String, Integer>();
		m.put(KEY_BG,7000000);
		m.put(KEY_DE,80000000);
		m.put(KEY_RU,143000000);
		m.put(KEY_CN,1357000000);
		m.put(KEY_NZ,4500000);

		for (int next : m.values()) {
			if(next>10000000){
				System.out.println(next);
			}
		}
	}
	
	public static void main(String[] args){
		fillMap();
	}
	
	
}

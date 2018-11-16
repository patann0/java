import java.util.HashMap;
import java.util.Map;

public class AAZA {
	public static void main(String[] args) {



		Map<String,String> map = new HashMap<>();

		map.put("a","apple");
		map.put("b","bike");

		System.out.println(map);

		System.out.println(map.get("a"));
		System.out.println(map.get("b"));

		System.out.println(map.size());
	}
}

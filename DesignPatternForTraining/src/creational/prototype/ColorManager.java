package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorManager {
	Map<String, Color> basicColors= new HashMap<String, Color>();
	
	public Color getColor(String key){
		return basicColors.get(key);
	}

	public void add(String key, Color value ){
		basicColors.put(key, value);
	}
}

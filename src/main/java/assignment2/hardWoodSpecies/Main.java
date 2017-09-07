package assignment2.hardWoodSpecies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	private static DecimalFormat df4 = new DecimalFormat(".####");
	
	public static void main(String[] args) throws IOException {
		Map<String, Integer> res = new HashMap<String, Integer>();
		int count = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while(!(line = reader.readLine().trim()).isEmpty()) {
			count ++;
			
			if(res.containsKey(line)) {
				res.put(line, res.get(line) + 1);
			} else {
				res.put(line, 1);
			}
		}
		
		Map<String, Integer> sorted = new TreeMap<String, Integer>(res);
		
		Iterator<?> it = sorted.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>)it.next();
	        Integer num = pair.getValue();
	        double popu = num.doubleValue() / count * 1.0;
	        System.out.println(pair.getKey() + " " + df4.format(100 * popu));
	    }
	}
}

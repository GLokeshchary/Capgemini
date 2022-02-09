import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Assignment10Q7 {
	public static void main(String[] args) {
		Map<String ,String> map=new TreeMap<>();
		map.put(" Gattoji", "Lokesh");
		map.put("Kumar", "chary");
		StringBuilder sb = new StringBuilder();
		//Set<Entry<String,String>> entry=map.entrySet();
		
		map.entrySet().forEach(entry->{sb.append(entry.getKey());
	    sb.append('=');
	    sb.append(entry.getValue());
	    sb.append('&');});
		sb.deleteCharAt(sb.length() - 1);
		String result = sb.toString();
		System.out.println(result);
	}

}

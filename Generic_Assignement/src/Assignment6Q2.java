import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.lang.Math;

public class Assignment6Q2<K,V> {
	private K key;
	private V value;
	public Assignment6Q2(K key,V value) 
	{
		this.key=key;
		this.value=value;
	
	}
	
	public void Setkeyandavalues()
	{
		HashMap<Integer,Double> map=new HashMap<>();
		//map.put(key, value);
		map.put(1, 1.0);
		map.put(2, 2.0);
		map.put(3, 3.0);
		map.put(4, 1.0);
		map.put(5, 1.0);
		map.put(6, 1.0);
		map.put(7, 1.0);
		map.put(8, 1.0);
		map.put(9, 1.0);
		map.put(10, 1.0);
		
		Set<Integer> keySet = map.keySet();
        List<Integer> keyList = new ArrayList<>(keySet);

        int size = keyList.size();
        int randIdx = new Random().nextInt(size);

        Integer randomKey = keyList.get(randIdx);
        Double randomValue = map.get(randomKey);
        System.out.println("key: " + randomKey + ", value: " + randomValue);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=(int) Math.random();
		double d=(double) Math.random();
		Assignment6Q2<Integer,Double> geet =new Assignment6Q2<Integer, Double>(j,d);
		
		geet.Setkeyandavalues();
		geet.Setkeyandavalues();
		geet.Setkeyandavalues();
		geet.Setkeyandavalues();
		geet.Setkeyandavalues();
		geet.Setkeyandavalues();
		geet.Setkeyandavalues();
		geet.Setkeyandavalues();
		geet.Setkeyandavalues();
		geet.Setkeyandavalues();
		

	}

}

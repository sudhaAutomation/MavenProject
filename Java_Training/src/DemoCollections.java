import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoCollections {

	public static void main(String[] args) {

		int i;
		String ar[] = new String[10];

		ArrayList<Integer> araylist = new ArrayList<>();
		araylist.add(100);
		araylist.add(200);
		araylist.add(100);
		araylist.add(300);
		araylist.add(200);
		araylist.add(500);
		System.out.println(araylist);
		araylist.remove(3);
		System.out.println(araylist);
		LinkedList<Integer> list = new LinkedList<>();
		list.add(90);
		list.add(90);
		list.add(20);
		list.add(50);
		System.out.println(araylist.addAll(list));
		System.out.println(araylist);
		System.out.println(araylist.contains(50));

		HashSet<String> set = new HashSet<>();
		set.add("Ramu");
		set.add("somu");
		set.add("raju");
		set.add("Ramu");
		set.add("Raju");
		System.out.println(set);
		HashMap<String, Object> map = new HashMap<>();
		map.put("Swhizz", 123456);
		map.put("Software", "Testing");
		map.put("Swhizz1", 123456);
		map.put("Swhizz", 123456);
		map.put("sudha", "admin@admin");
		map.put("Rani", 123456);
		map.put("Rani", 1234567);
		System.out.println(map);
		System.out.println(map.get("Rani"));
		System.out.println(map.get(123456));
		System.out.println(map.get("sudha"));
		// map.get(key)
		Iterator<String> it = set.iterator();
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println();
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println();
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println();
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println();
		System.out.println(it.hasNext());
		// System.out.println(it.next());

	}

}

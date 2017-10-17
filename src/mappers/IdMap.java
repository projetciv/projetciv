package mappers;

import java.lang.ref.WeakReference;
import java.util.HashMap;

public class IdMap<T> {
	
	HashMap<Integer, WeakReference<T>> map;
	
	public void put(int id, T obj) {
		WeakReference<T> wr = new WeakReference<T>(obj);
		map.put(id, wr);
	}
	
	public T get(int id) {
		return map.get(id).get();		
	}

	public void del(int id) {
		map.remove(id);
	}
	
	public int getNb() {
		return map.size();
	}
}

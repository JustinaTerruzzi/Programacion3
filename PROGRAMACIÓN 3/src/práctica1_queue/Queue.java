package práctica1_queue;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> extends Sequence {
	List<T> data;
	
	public Queue() {
		data = new ArrayList<>();
	}
	
	public void enqueue(T dato) {
		data.add(dato);
	}
	
	public T dequeue() {
		try {
			T pri = this.data.remove(0);
			return pri;
		} catch(Exception e) {
			throw new RuntimeException("Rompimos todo", e);
			// RETORNAR NULL NO ES RETORNAR UN ERROR, Mauri 2024
		}
	}
	
	public T head() {
		try {
			T pri = this.data.get(0);
			return pri;
		} catch(Exception e) {
			throw new RuntimeException("La lista está vacía", e);
			// RETORNAR NULL NO ES RETORNAR UN ERROR, Mauri 2024
		}
	}
	public String toString() {
		String str = "[";
		for(T d: data) {
			str = str + d.toString() +", ";		
		}
        str = str.substring(0, str.length()-2)+"]"; //con el menos 2 le saco la coma y el espacio
        return str;
	}
	
	@Override
	public int size() {
		return data!=null?data.size():0;
	}

	@Override
	public boolean isEmpty() {
		return !(data!=null && data.size()>0);
	}
	
}

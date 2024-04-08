package práctica1_queue;

public class CircularQueue<T> extends Queue<T> {
	/*
	 * shift(): T Permite rotar los elementos, haciéndolo circular. Retorna el
	 * elemento encolado.
	 */

	public T shift() {
		T elemento = null;
		if (!isEmpty()) {
			elemento = dequeue();
			enqueue(elemento);
		}
		return elemento;
	}

}

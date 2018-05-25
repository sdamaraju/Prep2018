package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public interface IObservable<E> {
	List<IObserver> observers = new ArrayList<IObserver>();

	public void add(IObserver obs);
	
	public void remove(IObserver obs);
	
	public void notify(E data);
}

package observer;

import java.util.Vector;

public class Database {
	private String operation;
	private String record;
	private Vector<Observer> observers;

	public Database() {
		observers = new Vector<Observer>();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void editRecord(String operation, String record) {
		this.operation = operation;
		this.record = record;
		notifyObservers();
	}

	public void notifyObservers() {
		for (int loopIndex = 0; loopIndex < observers.size(); loopIndex++) {
			Observer observer = (Observer) observers.get(loopIndex);
			observer.update(operation, record);
		}
	}
}

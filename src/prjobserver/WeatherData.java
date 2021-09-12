package prjobserver;

import java.util.ArrayList;

public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData()
	{
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void addObserver(Observer o)
	{
		observers.add(o);
	}
	
	@Override
	public void removeObserver(Observer o)
	{
		int observerIdx = observers.indexOf(o);
		
		if (observerIdx >= 0)
		{
			observers.remove(observerIdx);
		}
	}
	
	@Override
	public void notifyObservers()
	{
		for (Observer observer : observers)
		{
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanges() 
	{
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		notifyObservers();
	}
}

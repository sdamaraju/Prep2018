package designPatterns.observer;

import designPatterns.observer.WeatherStation.Temperature;

public class LaptopObserver<E> implements IObserver<E> {

	@Override
	public void update(E data) {
		if (data instanceof Temperature){
			System.out.println("Laptop output  : Temperature is --> " + ((Temperature)data).getTemp() + " degrees celsius!");
			System.out.println("Laptop output  : Humidity is --> " + ((Temperature)data).getHumidity() + " %");
		}		
	}

}
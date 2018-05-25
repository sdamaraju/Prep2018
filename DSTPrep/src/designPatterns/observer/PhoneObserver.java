package designPatterns.observer;

import designPatterns.observer.WeatherStation.Temperature;

public class PhoneObserver<E> implements IObserver<E> {

	@Override
	public void update(E data) {
		if (data instanceof Temperature){
			System.out.println("Phone output  : Temperature is --> " + ((Temperature)data).getTemp() + " degrees celsius!");
			System.out.println("Phone output  : Humidity is --> " + ((Temperature)data).getHumidity() + " %");
		}		
	}

}

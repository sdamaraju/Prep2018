package designPatterns.observer;

import java.io.IOException;

import designPatterns.observer.WeatherStation.Temperature;

public class ObserverPatternImpl {

	public static void main(String[] args) throws IOException, InterruptedException {
		WeatherStation<Temperature> station = new WeatherStation<Temperature>();
		
		PhoneObserver<Temperature> phone = new PhoneObserver<>();
		LaptopObserver<Temperature> laptop = new LaptopObserver<>();
		station.add(phone);station.add(laptop);
		while(true){			
			station.temp.readTempAndHumidityFromExternalService();
			station.notify(station.temp);
			Thread.currentThread().sleep(3000);
		}
	}

}

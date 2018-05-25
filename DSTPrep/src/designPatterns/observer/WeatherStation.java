package designPatterns.observer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class WeatherStation<E> implements IObservable<E> {

	Temperature temp = new Temperature();
	@Override
	public void add(IObserver obs) {
		observers.add(obs);		
	}

	@Override
	public void remove(IObserver obs) {
		observers.remove(obs);
	}

	@Override
	public void notify(E data) {
		if(temp.changed){
			for(IObserver obs : observers){
				obs.update(temp);
			}
		}
		temp.changed= false;
		
	}

	public class Temperature {
		private int temp;
		private int humidity;
		boolean changed = false;
		
		public String[] readTempAndHumidityFromExternalService() throws IOException{
			//read from external service\
			File file = new File("C:\\Users\\damas\\Prep2018\\DSTPrep\\temperatures\\temperature.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String values[] = line.split(",");
			if(Integer.parseInt(values[0]) != temp){
				temp = Integer.parseInt(values[0]);
				changed = true;
			}
			if(Integer.parseInt(values[1]) != humidity){
				humidity = Integer.parseInt(values[1]);
				changed = true;
			}
			br.close();
			fr.close();
			return values;
		}
		
		public int getTemp(){
			return this.temp;
		}
		
		public int getHumidity(){
			return this.humidity;
		}
	}
	
}

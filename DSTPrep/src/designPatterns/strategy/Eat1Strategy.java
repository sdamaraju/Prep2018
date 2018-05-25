package designPatterns.strategy;

public class Eat1Strategy implements IEatStrategy {

	@Override
	public void eat() {
		System.out.println("Eating strategy 1");
		
	}

}

package designPatterns.strategy;

public class BDuck implements IDuck{
	IFlyStrategy flyer;
	IEatStrategy eater;
	
	BDuck(IFlyStrategy flyer,IEatStrategy eater){
		this.flyer = flyer;
		this.eater = eater;
	}
	@Override
	public void fly() {
		this.flyer.fly();
		
	}

	@Override
	public void eat() {
		this.eater.eat();
		
	}

}

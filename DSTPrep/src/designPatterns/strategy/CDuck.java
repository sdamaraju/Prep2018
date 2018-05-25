package designPatterns.strategy;

public class CDuck implements IDuck{

	IFlyStrategy flyer;
	IEatStrategy eater;
	
	CDuck(IFlyStrategy flyer,IEatStrategy eater){
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

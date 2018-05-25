package designPatterns.strategy;

public class StrategyPatternImpl {

	public static void main(String[] args) {
		IFlyStrategy strat1 = new Fly1Strategy();
		IFlyStrategy strat2 = new Fly2Strategy();
		IEatStrategy strat3 = new Eat1Strategy();
		IEatStrategy strat4 = new Eat2Strategey();
		IDuck aduck = new ADuck(strat1,strat3);
		IDuck bduck = new BDuck(strat2,strat4);
		IDuck cduck = new BDuck(strat1,strat4);
		IDuck dduck = new BDuck(strat2,strat3);
		aduck.fly();aduck.eat();
		bduck.fly();bduck.eat();
		cduck.fly();cduck.eat();
		dduck.fly();dduck.eat();
	}

}

public class Whip extends condimentDecorator {
Beverage beverage;
	
	public Whip (Beverage beverage) {
		this.beverage =  beverage;
		
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Whip";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}

}

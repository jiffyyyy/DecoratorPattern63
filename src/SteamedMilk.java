
public class SteamedMilk extends condimentDecorator {
	Beverage beverage;
	
	public SteamedMilk (Beverage beverage) {
		this.beverage =  beverage;
		
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", SteamedMilk";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}

}

public class Soy extends condimentDecorator {
	Beverage beverage;
	
	public Soy (Beverage beverage) {
		this.beverage =  beverage;
		
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return .15 + beverage.cost();
	}

}

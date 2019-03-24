package design.patterns.structural.bridge;

public class StockExchange extends Program{

	protected StockExchange(Developer developer) {
		super(developer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void developProgram() {
		System.out.println("Stock exchange development in progress...");
		developer.writeCode();
		
	}

}

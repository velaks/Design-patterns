package design.patterns.structural.bridge;

public class BankSystem extends Program {

	protected BankSystem(Developer developer) {
		super(developer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void developProgram() {
		System.out.println("Bank system development in progress...");
		developer.writeCode();
		
	}

}

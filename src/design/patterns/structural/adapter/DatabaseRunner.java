package design.patterns.structural.adapter;

public class DatabaseRunner {
	public static void main(String[] args) {
		Database database = new Adapter();
		database.insert();
		database.update();
		database.select();
		database.remove();
	}

}

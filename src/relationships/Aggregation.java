package relationships;

class Engine {
	// variables and methods
}

class Vehicle {
	Engine engine;

	public Vehicle(Engine e) {
		engine = e;
	}
}

class Driver {
	public static void main(String [] args){
		Engine e = new Engine();
		Vehicle v = new Vehicle(e);
	}
}
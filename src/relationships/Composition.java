package relationships;

class Border {
	// variables and methods
}

class Country {
	
	public Country() {
		// within the constructor we create part classes here
		Border border = new Border();
	}
}

class Driver {
	public static void main(String [] args){
		Country v = new Country();
	}
}
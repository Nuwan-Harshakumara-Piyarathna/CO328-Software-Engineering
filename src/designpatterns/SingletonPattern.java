package designpatterns;

class Singleton {
	private static Singleton s = new Singleton();

	private Singleton() {

	}

	public static Singleton createInstance() {
		return s;
	}
}

class Driver {
	public static void main(String [] args){
		Singleton s = Singleton.createInstance();
	}
}
package designpatterns;

import java.util.*;

abstract class Student {
	// attributes+methods
}

class UG extends Student {
	// attributes+methods
}

class PG extends Student {
	// attributes+methods
}

class Factory {
	// attributes+methods

	public Student fm(String type) {
		if(type.equals("UG")){
			return new UG();
		}
		else {
			return new PG();
		}
	}
}

class Driver {

	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		String type = in.nextLine();

		Factory f = new Factory();
		// dynamic binding
		Student s = f.fm(type);
	}
}
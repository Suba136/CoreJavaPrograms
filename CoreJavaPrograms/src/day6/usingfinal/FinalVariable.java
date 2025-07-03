package day6.usingfinal;

public class FinalVariable {
	// final int x; // final instance variable must be initialized

		final int x = 100;

		// Declare a static blank final variable.
		final static int y=50;

		// Declare & intialize static final variable.
		final static int Z = 10;

		// instatnce method
		//void change() {
			//x = 30; // final variables can't be reassigned
			//y = 200; // final static variables can't be reassigned
		//}

		@Override
		public String toString() {
			return "FinalVariable [x=" + x + ", Y" + y + "]";
		}

		// Declare a static block to initialize the final static variable.
		//static {
			//y = 20;
			//Z = 100; // Once intialized can't be reassigned
			//System.out.println("Value of Y: " + y);
		}

	



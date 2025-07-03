package day7.overriding.covariant;

public class CovariantOverriding {
	// method getcolor returns an object of type color
		protected CovariantOverriding getColor() {
			CovariantOverriding s = new CovariantOverriding();
			return s;
		}
	}

	//this class will inherit from the class color and will override the getcolor() method returning the object of the type red class
	class Red extends CovariantOverriding {
		@Override
		public Red getColor() {
			Red s = new Red();
			return s;
		}

}

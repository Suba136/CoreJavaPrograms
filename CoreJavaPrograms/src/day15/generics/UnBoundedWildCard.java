package day15.generics;
import java.util.List;

public class UnBoundedWildCard {
	//Parameter List(<?>) is List of unknown type
		public static void display(List<?> ll) {
			for (Object o : ll) {
				System.out.println(o);
			}
		}

}

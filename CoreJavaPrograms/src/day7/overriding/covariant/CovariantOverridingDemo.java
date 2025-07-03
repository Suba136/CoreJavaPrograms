package day7.overriding.covariant;

public class CovariantOverridingDemo {

	public static void main(String[] args) throws CloneNotSupportedException
		{
			// new student object created
			Students student1 = new Students(1, "MCA", "Kapil");
			student1.printData();

			// Student object created using clone method
			// assuming type casting is required
			//	Student student2 = (Student) student1.clone();
			//student2.printData();
		
		 //using covariant return type no need to type cast 
		  Students student2 =student1.clone(); 
		  student2.setName("Sachin"); 
		  student2.setRollNo(2);
		  student2.printData();
		 		
		}

	}



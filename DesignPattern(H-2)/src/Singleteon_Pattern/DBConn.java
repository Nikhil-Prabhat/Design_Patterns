package Singleteon_Pattern;

public class DBConn {

	// Creating instance of the class and storing it in private as well as static
	// variable
	private static DBConn instance = new DBConn();

	// Creating private Constructor
	private DBConn() {

	}

	// Creating static method to get the instance
	public static DBConn getInstance() {
		System.out.println("The DBConn Object is Created");
		return instance;
	}

}

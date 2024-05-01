package ptbeWeek5JavaCodingProject;

public class App {

	public static void main(String[] args) {
		
		String str = "Goodbye!";
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log(str);
		System.out.println("\n");
		
		asteriskLogger.error(str);
		System.out.println("\n");
		
		System.out.println("-----------------------------------");
		
		System.out.println("\n");
		spacedLogger.log(str);
		
		System.out.println("\n");
		spacedLogger.error(str);

	}

}

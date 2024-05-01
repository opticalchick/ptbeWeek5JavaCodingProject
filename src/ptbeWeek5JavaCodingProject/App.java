package ptbeWeek5JavaCodingProject;

public class App {

	public static void main(String[] args) {
		
		String str = "Hello";
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log(str);
		System.out.println("\n");
		asteriskLogger.error(str);
		System.out.println("\n");
		System.out.println("-----------------------------------");
		System.out.println("\n");
		spacedLogger.log("Spaced out.");
		System.out.println("\n");
		spacedLogger.error("Spaced out error.");

	}

}

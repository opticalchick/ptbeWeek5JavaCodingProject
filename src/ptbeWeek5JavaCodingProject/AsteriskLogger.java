package ptbeWeek5JavaCodingProject;

public class AsteriskLogger implements Logger{
	
	@Override
	public void log(String str) {
		System.out.println("***" + str + "***");
			
	}

	@Override
	public void error(String str) {
		String error = "Error: " + str;
		int length = error.length() + 6;
		StringBuilder errorLine = new StringBuilder();
		
		for (int i = 1; i <= length; i++) {
			errorLine.append("*");
		}
		
		System.out.println(errorLine.toString());
		log(error); System.out.println(errorLine.toString());
		
	}

}

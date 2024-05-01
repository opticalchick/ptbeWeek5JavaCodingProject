package ptbeWeek5JavaCodingProject;

public class SpacedLogger implements Logger{

	@Override
	public void log(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <str.length(); i++) {
			sb.append(str.charAt(i) + " ");
		}
		System.out.println(sb);
	}

	@Override
	public void error(String str) {
		
		System.out.print("Error: ");
		log(str);
		
		
	}

}

package week5;

public class SpacedLogger implements Logger {
	
	
	@Override
	public void log(String note) {	
		//add spaces between each character of the String
		
		System.out.println(formatLogger(note));
		}
	String formatLogger(String note) {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < note.length(); i++) {
			builder.append(note.charAt(i)).append(" ");
		}
		return builder.toString();
	}
	

	@Override
	public void error(String note) {
		//spaced out 
		System.err.println("ERROR: " +formatLogger(note));
		
	}

}


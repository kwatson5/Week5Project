package week5;

public class AsteriskLogger implements Logger {
	

	@Override
	public void log(String note) {
		//print asterisks on either side of String
		System.out.println(formatLogger(note));	
	}

	private String formatLogger(String note) {
		return "***" + note +"***";
	}
	
	@Override
	public void error(String note) {
		//print String inside box of asterisks 
		String formatted = formatLogger(note);
		
		String title= "ERROR :";
		String asterisk = "";
		
		for (int i = 0; i < formatted.length() + (title.length()); i++){
			asterisk += "*";
		}
			
		System.err.println(asterisk);
		System.err.println(title +formatted);
		System.err.println(asterisk);	
	}	
	
}

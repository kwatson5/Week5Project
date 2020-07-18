package week5;

public class App {

	public static void main(String[] args) {
		
		//AsteriskLogger  logger1 = new AsteriskLogger();
		
		AsteriskLogger asterisk = new AsteriskLogger();
		asterisk.log("Log note: ");
		asterisk.error("Oops");
		
		
		//new AsteriskLogger().run();
		
		//new SpacedLogger().run();
		
		SpacedLogger spaced = new SpacedLogger();
		spaced.log("Stretch out!");
		spaced.error("Too close");
		
	}	
	
}

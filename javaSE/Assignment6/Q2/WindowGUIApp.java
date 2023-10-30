package devPack;

public class WindowGUIApp implements WindowHandler,MouseHandler {

	@Override
	public void mouseClicked() {
		System.out.println("Mouse clicked");
		
	}

	@Override
	public void mousePressed() {
		System.out.println("Mouse Pressed");
		
	}

	@Override
	public void mouseReleased() {
		System.out.println("Mouse Released");
		
	}

	@Override
	public void windowClosing() {
		System.out.println("window is Closing");
		
	}

	@Override
	public void windowClosed() {
		System.out.println("window is Closed");
		
	}
	
}



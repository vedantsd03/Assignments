
/*
public interface MouseHandler
{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
}
public interface WindowHandler
{
	void windowClosing();
	void windowClosed();
}

public class WindowGUIApp implements MouseHandler,WindowHandler
{
}
public class GUIDemo
{
	main()
	{
		create the object of WindowGUIApp and invoke all the methods
	}
}

*/
//Client Side : 
package clientPack;

import devPack.*;

public class GUIDemo {

	public static void main(String[] args) {
		WindowHandler wh = new WindowGUIApp();
		wh.windowClosed();
		wh.windowClosing();
		MouseHandler mh = new WindowGUIApp();
		mh.mouseClicked();
		mh.mousePressed();
		mh.mouseReleased();
	}

}

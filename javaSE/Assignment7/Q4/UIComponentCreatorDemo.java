/*4)
public class UIComponent
{
}
public class Button extends UIComponent
{
}
public class TextField extends UIComponent
{
}
public class CheckBox extends UIComponent
{
}
public abstract class UIComponentCreator
{
	public void show(String type)
	{
		UIComponent comp=createUIComponent(type);
		add(comp);
	}
	public void add(UIComponent component)
	{
		System.out.prinlnt("Added the component\t"+component);
	}
	public abstract UIComponent createUIComponent(String type);
}

create 3 child classes of "UIComponentCreator"
	WindowsUIComponentCreator, LinuxUIComponentCreator and MacUIComponentCreator
 in all these classes "createUIComponent()" method must be defined in such a way that whatever type is passed as per this it must return a specific UIComponent.
e.g. if "button" is passed , it should return "Button" class object   or if "textfield" is passed , it should return "TextField" class object.

create a class UIComponentCreatorDemo with main function
inside main function
	create objects of WindowsUIComponentCreator, LinuxUIComponentCreator and MacUIComponentCreator classes and invoke "createUIComponent()" ,"add()" and "show()" methods.
*/


public class UIComponentCreatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UIComponentCreator ui[] = new UIComponentCreator[3];
		
		ui[0] = new WindowsUIComponentCreator();
		ui[1] = new LinuxUIComponentCreator();
		ui[2] = new MacUIComponentCreator();
		
		String components[] = {"button", "TextField", "CheckBox"};
		
		for(int i=0; i<ui.length; i++) {
			ui[i].show(components[i]);
			System.out.println();
		}
	}

}

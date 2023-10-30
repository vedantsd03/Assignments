
/*
3) Code this:
on Developer side create the following interface create necessary jar and docs

public interface PersistenceMechanism
{
	void writeData(String ref);
	String readData();
}

create following classes on client side

class FileSystem implements PersistenceMechanism
{
	public void writeData(String ref)
	{
		// how to write data inside FileSystem
	}
	public String readData()
	{
		// how to read data from FileSystem
	}
}

class DatabaseSystem implements PersistenceMechanism
{
	public void writeData(String ref)
	{
		// how to write data inside DatabaseSystem
	}
	public String readData()
	{
		// how to read data from DatabaseSystem
	}
}

class BigdataSystem implements PersistenceMechanism
{
	public void writeData(String ref)
	{
		// how to write data inside BigdataSystem
	}
	public String readData()
	{
		// how to read data from BigdataSystem
	}
}

create one more class "Demo" and in its main function create array of "PersistenceMechanism" interface, store all the child class objects, traverse the array and invoke only "BigdataSystem" class "writeData" and "readData" methods.
*/

package clientpack;

import devpack.*;

public class Demo {

	public static void main(String[] args) {
		PersistenceMechanism ps[] = new PersistenceMechanism[3];

		ps[0] = new BigdataSystem ();
		ps[1] = new DatabaseSystem ();
		ps[2] = new FileSystem ();
		
		for(int i=0; i<ps.length; i++) {
			if(ps[i] instanceof BigdataSystem) {
				ps[i].writeData("big data system");
				System.out.println(ps[i].readData());
			}
		}
	}
}

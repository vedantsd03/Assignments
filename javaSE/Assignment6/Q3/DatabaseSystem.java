/**
 * 
 */
package clientpack;

import devpack.PersistenceMechanism;

/**
 * @author Vedant
 *
 */
public class DatabaseSystem implements PersistenceMechanism
{
	private String dString;
	public void writeData(String ref)
	{
		dString = ref;
	}
	public String readData()
	{
		return dString;
	}
}




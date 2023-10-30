/**
 * 
 */
package clientpack;

import devpack.PersistenceMechanism;

/**
 * @author Vedant
 *
 */
public class BigdataSystem implements PersistenceMechanism
{
	private String bdString;
	public void writeData(String ref)
	{
		bdString = ref;
	}
	public String readData()
	{
		return bdString;
	}
}



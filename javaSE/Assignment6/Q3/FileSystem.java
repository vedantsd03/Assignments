package clientpack;

import devpack.PersistenceMechanism;

/**
 * @author Vedant
 *
 */
public class FileSystem implements PersistenceMechanism
{
	private String fString;
	public void writeData(String ref)
	{
		fString = ref;
	}
	public String readData()
	{
		return fString;
	}
}


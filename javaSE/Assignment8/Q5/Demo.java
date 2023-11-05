/*
5) on the developer side 
create checked exception "ResourceNotAllocatedException"

create a class:

public class MyResource implements AutoCloseable
{
	public MyResource(int capacity) throws ResourceNotAllocatedException
	{
		if(capacity>100)
		{
			throw new ResourceNotAllocatedException("not sufficient space");
		}
	}
    void disp()
    {
    	System.out.println("successful");
    }
	@Override
	public void close()  {
		System.out.println("resource is closed");
		
	}
}

create necessary jar file and documentation

on the client side
public class Demo with main function

	inside main function, create object of "MyResource" and invoke "disp()" method.
*/



package clientpack;

import devpack.MyResource;
import devpack.ResourceNotAllocatedException;

public class Demo {
	public static void main(String[] args) {
		try (MyResource myresource = new MyResource(10))
		{
		myresource.disp();
		}
		catch(ResourceNotAllocatedException ref) {
			ref.printStackTrace();
		}
	}
}

package GroupMethod;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups = {"Apple"})

	public void Apple1()

	{

	System.out.println("Test Apple Device");
	}

	@Test(groups = {"MI"})

	public void mi1()

	{

	System.out.println("Test MI Device");
	}


	@Test(groups = {"Moto"})

	public void moto1()

	{

	System.out.println("Test Moto Device");


	}

	@Test(groups = {"Lenova"})

	public void lenova1()

	{


	System.out.println("Test Lenovo Device");


	}


	
}

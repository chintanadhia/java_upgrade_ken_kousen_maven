package interfaces;

public class MyCompany implements Company
{

	public static void main(String[] args)
	{
		MyCompany co = new MyCompany();
		System.out.println(co.getName());
	}

	@Override
	public String getName()
	{
		return "Yoyodyne Propulsion Systems";
	}
}

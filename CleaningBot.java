public  class CleaningBot extends Robot
{
	public String type = null;
	
	public CleaningBot(int power, boolean charge,String type)
	{
		super(power,charge);
		this.type =type;
	}
	public void clean()
	{
		if (power != 0)
		{
			power = power- 10;
			System.out.println("Cleaning" + "\n" + "Draining power by 10");
		}
		else 
		{
			System.out.println("Not enough power");
		}
	}
	public String getType()
	{
		return type;
	}
	
	
}
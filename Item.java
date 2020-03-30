class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	char taxType;
	//TODO constructor
	public Item(){}
	public Item (int id, String name, double price, char taxType)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.taxType = taxType;
	}
	//TODO setters and getters
	public void setId (int id)
	{
		this.id = id;
	}
	public void setName (String name)
	{
		this.name = name;
	}
	public void setPrice (double price)
	{
		this.price = price;
	}
	public void setTaxType (char taxType)
	{
		this.taxType = taxType;
	}
	public int getId ()
	{
		return this.id;
	}
	public String getName ()
	{
		return this.name;
	}
	public double getPrice ()
	{
		return this.price;
	}
	public char getTaxType ()
	{
		return this.taxType;
	}
	double taxReturn () {
		//TODO
		if (taxType == 'A')
		{
			return price*0.18*0.15;
		}
		else if (taxType == 'B')
		{
			return price*0.05*0.15;
		}
		else
		{
			return 0;
		}
	}
}

import java.util.List;

class Receipt {
	List<Item> products;

	public Receipt()
	{
		products = new List<>();
	}
	public boolean addItem( Item i )
	{
		return products.add(i);
	}
	public Item removeItem (int i)
	{
		return products.remove(i);
	}
	public double priceTotal ()
	{
		double total = 0;
		for (int i=0; i<products.size(); i++)
		{
			Item temp = products.get(i);
			total += temp.getPrice();
		}
		return total;
	}
	public double taxReturnTotal ()
	{
		double total = 0;
		for (int i=0; i<products.size(); i++)
		{
			Item temp = products.get(i);
			total += temp.taxReturn();
		}
		return total;
	}
}

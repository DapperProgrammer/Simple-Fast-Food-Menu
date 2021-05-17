package fastFoodMenu;

public class Food
{
	private String choice;
	private String food;
	private double price;
	private double total;
	
	public Food()
	{
		choice = "";
		food = "";
		price = 0;
		total = 0;
	}
	
    public Food(String choice, String food, double price, double total) 
    {
        this.choice = choice;
        this.food = food;
        this.price = price;
        this.total = total;
    }
    
    public void setChoice(String choice) 
    {
        this.choice = choice;
    }

    public String getCode() 
    {
        return choice;
    }
    
    public void setFood(String food)
    {
    	this.food = food;
    }
    
    public String getFood()
    {
    	return food;
    }
    
    public void setPrice(double price)
    {
    	
    	this.price = price;
    }
    
    public double getPrice()
    {
    	return price;
    }
    
    public void setTotal(double total)
    {
    	this.total = total;
    }
    
    public double getTotal()
    {
    	return total;
    }

}


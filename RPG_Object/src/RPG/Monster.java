package RPG;


public class Monster extends MOVE
{
	public Monster(int x, int y, int distance)
	{
		super(x,y,distance);
	}
	public char getShape()
	{
		return '@';
	}
	
	@Override
	public void move() 
	{
		int n = (int)(Math.random()*5);
		if(n==0)
		{
			x = x + moving;
		}
		else if(n==1)
		{
			x = x - moving;
		}
		
		
		n = (int)(Math.random()*5);
		if(n==0)
		{
			y = y + moving;
		}
		else if(n==1)
		{
			y = y - moving;
		}
		if(y<0)
		{
			y=0;
		}
		
	}
}

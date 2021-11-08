package Final;

public abstract class Move implements NPC{
	int x;
	int y;
	int moving;
	public Move(int x, int y, int moving) 
	{
		this.moving=moving;
		this.x=x;
		this.y=y;
	}
	
	public int getX() {return x;}
	public int getY() {return y;}
	public boolean collide(Move p)
	{
		if(this.x==p.getX() && this.y==p.getY())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public abstract void getMove();
	public abstract char getShape();
}


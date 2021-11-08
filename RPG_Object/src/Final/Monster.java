package Final;

public class Monster extends Move{
	public Monster(int x, int y, int moving) {super(x, y, moving);}

	public void getMove() 
	{
		int n = (int)(Math.random()*5);
		if(n==0) 
		{
			x = x + moving;
		}
		else if (n==1)
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
		System.out.println("몹이 움직입니다. W는 피해야합니다.");
	}

	public char getShape() {
		
		return '@';
	}

}

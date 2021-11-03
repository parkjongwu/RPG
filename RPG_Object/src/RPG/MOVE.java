package RPG;
import java.util.Scanner;
public abstract class MOVE
{
	public int moving , x , y;
	
	public MOVE(int moving , int x , int y)
	{
		this.moving = moving;
		this.x = x;
		this.y = y;
	}
	
	public int getX(){return x;}
	public int getY(){return y;}
	
	public boolean collide(MOVE p) { // �� ��ü�� ��ü p�� �浹������ true ����
		if(this.x == p.getX() && this.y == p.getY())
			return true;
		else 
			return false;
	}
	
	public abstract void move();
	public abstract char getShape();
	
}

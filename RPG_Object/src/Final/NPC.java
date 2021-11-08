package Final;

public interface NPC 
{
	public final int MAX_MOVING = 3;
	public final int MIN_MOVING = 0;
	public char getShape();
	public void getMove(); //움직임은 모두 공통
}

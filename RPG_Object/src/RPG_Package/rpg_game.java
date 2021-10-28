package RPG_Package;
public class rpg_game 
{
	rpg_object Sord , Wand , Money;
	void run()
	{
		System.out.println("rpg 게임");
		System.out.println("각 직업 당 스탯 설정");
		Sord.view(); Wand.view(); Money.view(); // 스탯 확인
	}
	public static void main(String[] args) 
	{
		rpg_game g = new rpg_game();
		g.run();

	}

}
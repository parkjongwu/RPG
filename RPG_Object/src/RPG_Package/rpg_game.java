package RPG_Package;
public class rpg_game 
{
	rpg_object Sord , Wand , Money;
	void run()
	{
		System.out.println("rpg ����");
		System.out.println("�� ���� �� ���� ����");
		Sord.view(); Wand.view(); Money.view(); // ���� Ȯ��
	}
	public static void main(String[] args) 
	{
		rpg_game g = new rpg_game();
		g.run();

	}

}
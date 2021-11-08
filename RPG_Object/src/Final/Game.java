package Final; 
import java.util.Scanner;
public class Game
{
	char [][] map = new char [Y][X];
	static int Y , X;
	Move [] who = new Move[4];
	public Game()
	{
		for(int i=0; i<Y; i++)
		{
			for(int j=0; j<X; j++)
			{
				map[i][j] = '-';
			}
		}
		who[0] = new Monster(15,5,1);
		who[1] = new Weak(15,4,1);
		who[2] = new Warrior(0,0,1);
		who[3] = new Magician(20,0,1);
	}
	public void update()
	{
		for(int i=0; i<=who.length; i++)
		{
			map[who[i].getY()][who[i].getX()] = who[i].getShape();
		}
	}
	public void draw()
	{
		for(int i=0; i<Y; i++)
		{
			for(int j=0; j<X; j++)
			{
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	public void clear()
	{
		for(int i=0; i<who.length; i++)
		{
			map[who[i].getY()][who[i].getX()] = '-';
		}
	}
	public void shape()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ���� (��õ�� : 10)");
		Y = sc.nextInt();
		System.out.println("���� ���� ���� (��õ�� : 20)");
		X = sc.nextInt();
	}
	public void run()
	{
		System.out.println("RPG ������ �����մϴ�.");
		System.out.println("��Ģ 1 : ������ �����κ��� ���������մϴ�.");
		System.out.println("��Ģ 2 : ������ ����� ���簡 �Բ� �־�� ��� �� �ֽ��ϴ�.");
		System.out.println("��Ģ 3 : �����̴� ������ ( ���� > ���� > ���� > ���� )"); 
		System.out.println("�� ũ�⸦ �����Ͻÿ�.");
		shape();
		update();
		draw();
		while(true)
		{
			if(who[1].collide(who[0]))
			{
				System.out.println("�ΰ��� �й�");
				break;
			}
			if(who[2].collide(who[3]))
			{
				if(who[2].collide(who[0]) || who[3].collide(who[0]))
				{
					System.out.println("�ΰ��� �¸�");
					break;
				}
			}
		}
		clear();
		for(int i=0; i<who.length; i++)
		{
			who[i].getMove();
		}
		update();
		draw();
		
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		Game g = new Game();
		g.run();
	}
}

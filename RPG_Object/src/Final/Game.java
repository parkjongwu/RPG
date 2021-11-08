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
		System.out.println("세로 길이 설정 (추천값 : 10)");
		Y = sc.nextInt();
		System.out.println("가로 길이 설정 (추천값 : 20)");
		X = sc.nextInt();
	}
	public void run()
	{
		System.out.println("RPG 게임을 시작합니다.");
		System.out.println("규칙 1 : 상인은 괴물로부터 도망가야합니다.");
		System.out.println("규칙 2 : 괴물은 법사와 전사가 함께 있어야 무찌를 수 있습니다.");
		System.out.println("규칙 3 : 움직이는 순서는 ( 괴물 > 약자 > 전사 > 법사 )"); 
		System.out.println("땅 크기를 설정하시오.");
		shape();
		update();
		draw();
		while(true)
		{
			if(who[1].collide(who[0]))
			{
				System.out.println("인간팀 패배");
				break;
			}
			if(who[2].collide(who[3]))
			{
				if(who[2].collide(who[0]) || who[3].collide(who[0]))
				{
					System.out.println("인간팀 승리");
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

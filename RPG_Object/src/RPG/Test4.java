package RPG;
import java.util.Scanner;


public class Test4  extends Administration
{
	public static Administration [] array;
	Test4(int attack , int defense , int moving){this.attack = attack;this.defense = defense;this.moving = moving;}
	static void run(){
		Scanner sc = new Scanner(System.in); 
		array = new Administration[3];
		while(true) {
			System.out.println("<<메뉴>>");
	        System.out.print("원하는 것(확인: 1, 종료:2, 전사 입력:3 법사 입력: 4 상인 입력: 5 게임 시작: 6) ");
	        int menu = sc.nextInt();
	        
	        switch(menu)
	        {
	        case 1: 
	        	System.out.println("-----전사 스텟 열람-----");
	        	System.out.println("공격: " + array[0].attack + "수비: " + array[0].defense + "이동속도: " + array[0].moving);
	        	System.out.println("전사의 고유스킬은 "); //파워가드
	        	System.out.println("-----------------");
	        	System.out.println("-----법사 스텟 열람-----");
	        	System.out.println("공격: " + array[1].attack + "수비: " + array[1].defense + "이동속도: " + array[1].moving);
	        	System.out.println("마법사의 고유스킬은 " ); //텔레포트
	        	System.out.println("-----------------");
	        	System.out.println("-----상인 스텟 열람-----");
	        	System.out.println("공격: " + array[2].attack + "수비: " + array[2].defense + "이동속도: " + array[2].moving);
	        	System.out.println("상인의 고유스킬은 "); //싸게구입
	        	System.out.println("-----------------");
	        	break;
	        case 2: System.out.print("프로그램 종료"); return;
	        case 3: 
	        	while(true)
	        	{
	        		System.out.print("공격력 >>> ");
		        	attack = sc.nextInt();
		        	System.out.print("방어력 >>> ");
		        	defense = sc.nextInt();
		        	System.out.print("이동속도 >>> ");
		        	moving = sc.nextInt();
		        	if(moving<=0 || moving>=5){
		        		System.out.println("이동속도는 1에서 5 사이의 값만 입력이 가능합니다.");}
		        	else{array[0] = new Test4(attack, defense, moving);break;}
	        	}
	        	break;
	        case 4: 
	        	while(true)
	        	{
	        		System.out.print("공격력 >>> ");
		        	attack = sc.nextInt();
		        	System.out.print("방어력 >>> ");
		        	defense = sc.nextInt();
		        	System.out.print("이동속도 >>> ");
		        	moving = sc.nextInt();
		        	if(moving<=0 && moving>=5)
		        	{
		        		System.out.println("이동속도는 1에서 5 사이의 값만 입력이 가능합니다.");
		        	}
		        	else
		        	{
		        		array[1] = new Test4(attack, defense, moving);
		        		break;
		        	}
	        	}
	        	break;
	        case 5: 
	        	while(true)
	        	{
	        		System.out.print("공격력 >>> ");
		        	attack = sc.nextInt();
		        	System.out.print("방어력 >>> ");
		        	defense = sc.nextInt();
		        	System.out.print("이동속도 >>> ");
		        	moving = sc.nextInt();
		        	if(moving<=0 || moving>=5)
		        	{
		        		System.out.println("이동속도는 1에서 5 사이의 값만 입력이 가능합니다.");
		        	}
		        	else
		        	{
		        		array[2] = new Test4(attack, defense, moving);
		        		break;
		        	}
	        	}
	        	break;
	        case 6: move(); }}}
	
	static void move()
	{
		Scanner sc = new Scanner(System.in); 
		while(true)
		{
		System.out.println("게임을 시작합니다 >> ");
		System.out.print("원하는 것(전사: 1, 마법사:2, 상인:3, 멈춤:아무키)");
		int answer = sc.nextInt();
		if (answer == 1)
		{
			System.out.print("1:전사 이동하기 / 2:전사 현재위치");
			int x=0;
			int menu2 = sc.nextInt();
			if(menu2==1)
			{
				System.out.println(array[0].moving + "만큼 이동했습니다");
				x = x + array[0].moving;
			}
			if(menu2==2)
			{
				if(x<10 && x>0)
				{
					System.out.println("현재 위치는 " + x + "이고, 현재 위치는 초보자마을입니다.");
				}
				if(x<30 && x>20)
				{
					System.out.println("현재 위치는 " + x + "이고 현재 위치는 던전앞입니다.");
				}
				if(x<50 && x>40)
				{
					System.out.println("현재 위치는 " + x + "이고 현재 위치는 상급자쉼터입니다.");
				}
			}
			else
			{
				System.out.println("다시 입력하시오.");
			}
		}
		
		if (answer ==2)
		{
			System.out.print("1:마법사 이동하기 / 2:마법사 현재위치 / 3:마법사 스킬사용!!!");
			int y=0;
			int menu3 = sc.nextInt();
			if(menu3==1)
			{
				System.out.println(array[1].moving + "만큼 이동했습니다");
				y = y + array[1].moving;
			}
			if(menu3==2)
			{
				if(y<10 && y>0)
				{
					System.out.println("현재 위치는 " + y + "이고, 현재 위치는 초보자마을입니다.");
				}
				if(y<30 && y>20)
				{
					System.out.println("현재 위치는 " + y + "이고 현재 위치는 던전앞입니다.");
				}
				if(y<50 && y>40)
				{
					System.out.println("현재 위치는 " + y + "이고 현재 위치는 상급자쉼터입니다.");
				}
			}
			if(menu3==3)
			{
				System.out.println("텔레포트!!!!!");
				System.out.println("현재 저장된 칸에서 순식간에 2칸 더 움직입니다.");
				y = y + 2;
			}
			else
			{
				System.out.println("다시 입력하시오.");
			}
		}
		if(answer==3)
		{
			System.out.print("1:상인 이동하기 / 2:상인 현재위치");
			int z=0;
			int menu4 = sc.nextInt();
			if(menu4==1)
			{
				System.out.println(array[2].moving + "만큼 이동했습니다");
				z = z + array[2].moving;
			}
			if(menu4==2)
			{
				if(z<10 && z>0)
				{
					System.out.println("현재 위치는 " + z + "이고, 현재 위치는 초보자마을입니다.");
				}
				if(z<30 && z>20)
				{
					System.out.println("현재 위치는 " + z + "이고 현재 위치는 던전앞입니다.");
				}
				if(z<50 && z>40)
				{
					System.out.println("현재 위치는 " + z + "이고 현재 위치는 상급자쉼터입니다.");
				}
			}
		}
		else
		{
			break;
		}
		}
		
	}		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Administration a = new Administration();
		run();}

}

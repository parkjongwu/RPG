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
			System.out.println("<<�޴�>>");
	        System.out.print("���ϴ� ��(Ȯ��: 1, ����:2, ���� �Է�:3 ���� �Է�: 4 ���� �Է�: 5 ���� ����: 6) ");
	        int menu = sc.nextInt();
	        
	        switch(menu)
	        {
	        case 1: 
	        	System.out.println("-----���� ���� ����-----");
	        	System.out.println("����: " + array[0].attack + "����: " + array[0].defense + "�̵��ӵ�: " + array[0].moving);
	        	System.out.println("������ ������ų�� "); //�Ŀ�����
	        	System.out.println("-----------------");
	        	System.out.println("-----���� ���� ����-----");
	        	System.out.println("����: " + array[1].attack + "����: " + array[1].defense + "�̵��ӵ�: " + array[1].moving);
	        	System.out.println("�������� ������ų�� " ); //�ڷ���Ʈ
	        	System.out.println("-----------------");
	        	System.out.println("-----���� ���� ����-----");
	        	System.out.println("����: " + array[2].attack + "����: " + array[2].defense + "�̵��ӵ�: " + array[2].moving);
	        	System.out.println("������ ������ų�� "); //�ΰԱ���
	        	System.out.println("-----------------");
	        	break;
	        case 2: System.out.print("���α׷� ����"); return;
	        case 3: 
	        	while(true)
	        	{
	        		System.out.print("���ݷ� >>> ");
		        	attack = sc.nextInt();
		        	System.out.print("���� >>> ");
		        	defense = sc.nextInt();
		        	System.out.print("�̵��ӵ� >>> ");
		        	moving = sc.nextInt();
		        	if(moving<=0 || moving>=5){
		        		System.out.println("�̵��ӵ��� 1���� 5 ������ ���� �Է��� �����մϴ�.");}
		        	else{array[0] = new Test4(attack, defense, moving);break;}
	        	}
	        	break;
	        case 4: 
	        	while(true)
	        	{
	        		System.out.print("���ݷ� >>> ");
		        	attack = sc.nextInt();
		        	System.out.print("���� >>> ");
		        	defense = sc.nextInt();
		        	System.out.print("�̵��ӵ� >>> ");
		        	moving = sc.nextInt();
		        	if(moving<=0 && moving>=5)
		        	{
		        		System.out.println("�̵��ӵ��� 1���� 5 ������ ���� �Է��� �����մϴ�.");
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
	        		System.out.print("���ݷ� >>> ");
		        	attack = sc.nextInt();
		        	System.out.print("���� >>> ");
		        	defense = sc.nextInt();
		        	System.out.print("�̵��ӵ� >>> ");
		        	moving = sc.nextInt();
		        	if(moving<=0 || moving>=5)
		        	{
		        		System.out.println("�̵��ӵ��� 1���� 5 ������ ���� �Է��� �����մϴ�.");
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
		System.out.println("������ �����մϴ� >> ");
		System.out.print("���ϴ� ��(����: 1, ������:2, ����:3, ����:�ƹ�Ű)");
		int answer = sc.nextInt();
		if (answer == 1)
		{
			System.out.print("1:���� �̵��ϱ� / 2:���� ������ġ");
			int x=0;
			int menu2 = sc.nextInt();
			if(menu2==1)
			{
				System.out.println(array[0].moving + "��ŭ �̵��߽��ϴ�");
				x = x + array[0].moving;
			}
			if(menu2==2)
			{
				if(x<10 && x>0)
				{
					System.out.println("���� ��ġ�� " + x + "�̰�, ���� ��ġ�� �ʺ��ڸ����Դϴ�.");
				}
				if(x<30 && x>20)
				{
					System.out.println("���� ��ġ�� " + x + "�̰� ���� ��ġ�� �������Դϴ�.");
				}
				if(x<50 && x>40)
				{
					System.out.println("���� ��ġ�� " + x + "�̰� ���� ��ġ�� ����ڽ����Դϴ�.");
				}
			}
			else
			{
				System.out.println("�ٽ� �Է��Ͻÿ�.");
			}
		}
		
		if (answer ==2)
		{
			System.out.print("1:������ �̵��ϱ� / 2:������ ������ġ / 3:������ ��ų���!!!");
			int y=0;
			int menu3 = sc.nextInt();
			if(menu3==1)
			{
				System.out.println(array[1].moving + "��ŭ �̵��߽��ϴ�");
				y = y + array[1].moving;
			}
			if(menu3==2)
			{
				if(y<10 && y>0)
				{
					System.out.println("���� ��ġ�� " + y + "�̰�, ���� ��ġ�� �ʺ��ڸ����Դϴ�.");
				}
				if(y<30 && y>20)
				{
					System.out.println("���� ��ġ�� " + y + "�̰� ���� ��ġ�� �������Դϴ�.");
				}
				if(y<50 && y>40)
				{
					System.out.println("���� ��ġ�� " + y + "�̰� ���� ��ġ�� ����ڽ����Դϴ�.");
				}
			}
			if(menu3==3)
			{
				System.out.println("�ڷ���Ʈ!!!!!");
				System.out.println("���� ����� ĭ���� ���İ��� 2ĭ �� �����Դϴ�.");
				y = y + 2;
			}
			else
			{
				System.out.println("�ٽ� �Է��Ͻÿ�.");
			}
		}
		if(answer==3)
		{
			System.out.print("1:���� �̵��ϱ� / 2:���� ������ġ");
			int z=0;
			int menu4 = sc.nextInt();
			if(menu4==1)
			{
				System.out.println(array[2].moving + "��ŭ �̵��߽��ϴ�");
				z = z + array[2].moving;
			}
			if(menu4==2)
			{
				if(z<10 && z>0)
				{
					System.out.println("���� ��ġ�� " + z + "�̰�, ���� ��ġ�� �ʺ��ڸ����Դϴ�.");
				}
				if(z<30 && z>20)
				{
					System.out.println("���� ��ġ�� " + z + "�̰� ���� ��ġ�� �������Դϴ�.");
				}
				if(z<50 && z>40)
				{
					System.out.println("���� ��ġ�� " + z + "�̰� ���� ��ġ�� ����ڽ����Դϴ�.");
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

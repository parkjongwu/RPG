package RPG_Package;

import java.util.Scanner;
public abstract class Wand extends rpg_object
{

	public Wand(int x, int moving){this.x=x; this.moving=moving;}
	public Wand(int moving, int attack, int defense){this.moving=moving;this.attack=attack;this.defense=defense;}
	public void view()
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("�������� ���� ����");
		System.out.print("���ݷ� : ");attack = sc.nextInt();
		System.out.print("���� : ");defense = sc.nextInt();
		System.out.print("�ӵ� : ");moving = sc.nextInt();
		System.out.println("_________________________");
		System.out.println("�������� ���� ����");
		System.out.println("���ݷ� : " + attack + " | ���� : " + defense + " | �̵��ӵ� " + moving);
		System.out.println("_________________________");
	}

}
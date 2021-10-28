package RPG_Package;

import java.util.Scanner;
public abstract class Wand extends rpg_object
{

	public Wand(int x, int moving){this.x=x; this.moving=moving;}
	public Wand(int moving, int attack, int defense){this.moving=moving;this.attack=attack;this.defense=defense;}
	public void view()
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("마법사의 스탯 설정");
		System.out.print("공격력 : ");attack = sc.nextInt();
		System.out.print("방어력 : ");defense = sc.nextInt();
		System.out.print("속도 : ");moving = sc.nextInt();
		System.out.println("_________________________");
		System.out.println("마법사의 현재 스탯");
		System.out.println("공격력 : " + attack + " | 방어력 : " + defense + " | 이동속도 " + moving);
		System.out.println("_________________________");
	}

}
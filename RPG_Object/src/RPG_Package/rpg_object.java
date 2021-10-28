package RPG_Package;

import java.util.Scanner;
public abstract class rpg_object {
   int moving , x , attack , defense;
   rpg_object(){}
   rpg_object(int x, int moving) { this.x=x;this.moving=moving;}
   rpg_object(int moving, int attack, int defense){this.moving=moving;this.attack=attack;this.defense=defense;}
   public abstract void view();
   public abstract void stat(int attack, int defense, int moving);
   
}

















/*
public static void main(String[] args) 
{
	

}*/
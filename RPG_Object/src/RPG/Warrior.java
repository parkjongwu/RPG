package RPG;
import java.util.Scanner;
public class Warrior extends MOVE
{
	Scanner sc = new Scanner(System.in);
	public Warrior(int moving , int x , int y)
	{
		super(moving,x,y);
	}
	public void move() {
		System.out.println("����� �Բ� ���� �����ʽÿ�.");
		System.out.println("���簡 �����Դϴ�. >>> ����(a) ������(d) �Ʒ�(s) ��(w) >>> ");
		char c = sc.next().charAt(0);
		switch(c){
		case 'a' :
			x = x - 1;
			if(x<0){x=0;}
			break;
		case 'd' :
			x = x + 1;
			if(x>20){x=20;}
			break;
		case 's' :
			y = y + 1;
			if(y>10){y=10;}
			break;
		case 'w' :
			y = y - 1;
			if(y<0){x=0;}
			break;}}
	public char getShape() {
		return 'W';}}

package Final;
import java.util.Scanner;
public class Magician extends Move{
	Scanner sc = new Scanner(System.in); 
	public Magician(int x, int y, int moving) {super(x, y, moving);}

	public void getMove() {
		System.out.println("����� �Բ� Monster�� ����ġ�ʽÿ�.");
		System.out.println("������ �����Դϴ�. >>> ����(a) ������(d) �Ʒ�(s) ��(w) >>> ");
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
			break;}
		
	}

	public char getShape() {
		// TODO Auto-generated method stub
		return 'M';
	}

}

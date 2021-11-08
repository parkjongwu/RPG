package Final;
import java.util.Scanner;
public class Magician extends Move{
	Scanner sc = new Scanner(System.in); 
	public Magician(int x, int y, int moving) {super(x, y, moving);}

	public void getMove() {
		System.out.println("전사와 함께 Monster를 물리치십시오.");
		System.out.println("상인이 움직입니다. >>> 왼쪽(a) 오른쪽(d) 아레(s) 위(w) >>> ");
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

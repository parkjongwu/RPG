package RPG;public class Game 
{
	char [][] map = new char[Y][X];
	static int Y,X = 50;
	MOVE [] who = new MOVE[4];
	public Game() {
		for(int i=0;i<Y; i++){
			for(int j=0; j<X; j++){
				map[i][j] = '-';}}
		who[0] = new Dealer(5,5,1);
		who[1] = new Warrior(20,20,1);
		who[2] = new Magician(0,0,1);
		who[3] = new Monster(4,5,2);}
	public void update() {
		for(int i=who.length-1; i>=0; i--){
			map[who[i].getY()][who[i].getX()] = who[i].getShape();}}
	public void draw() {
		for(int i=0; i<Y; i++){
			for(int j=0; j<X; j++){
				System.out.print(map[i][j]);}
			System.out.println();}}
	public void clear() {
		for(int i=0; i<who.length; i++){
			map[who[i].getY()][who[i].getX()] = '-';}}
	void run() {
		System.out.println("rpg ���� �����մϴ�.");
		System.out.println("��Ģ 1 : ������ �����κ��� ���������մϴ�.");
		System.out.println("��Ģ 2 : ������ ����� ���簡 �Բ� �־�� ��� �� �ֽ��ϴ�.");
		update(); 
		draw();
		while(true) {
			if(who[3].collide(who[0]))
			{
				System.out.println("�ΰ��� �й�");
				break;
			}
			if(who[1].collide(who[2]))
			{
				if(who[1].collide(who[3]) || who[2].collide(who[3]))
				{
					System.out.println("�ΰ��� �¸�");
					break;
				}
			}
		}
		clear();
		who[3].move();
		who[0].move();
		who[1].move();
		who[2].move();
		update();
		draw();
	}
	public static void main(String[] args) {Game s = new Game();s.run();}
}

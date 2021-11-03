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
		System.out.println("rpg 게임 시작합니다.");
		System.out.println("규칙 1 : 상인은 괴물로부터 도망가야합니다.");
		System.out.println("규칙 2 : 괴물은 법사와 전사가 함께 있어야 무찌를 수 있습니다.");
		update(); 
		draw();
		while(true) {
			if(who[3].collide(who[0]))
			{
				System.out.println("인간팀 패배");
				break;
			}
			if(who[1].collide(who[2]))
			{
				if(who[1].collide(who[3]) || who[2].collide(who[3]))
				{
					System.out.println("인간팀 승리");
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


 public class Game{
	 public static void checkCollision (Player p,Enemy e){
		 if (p.getX() < e.getX() + e.getWidth() &&
		     p.getX() + p.getWidth() > e.getX() &&
		     p.getY() < e.getY() + e.getHeight() &&
		     p.getY() + p.getHeight() > e.getY()) {
		            decreaseHealth(p,e); 
		            System.out.print("Došlo je do sudara i health Playera iznosi: " + p.getHealth());
		        } else {
		            System.out.print("Nema sudara"); }
	 }
	 public static void decreaseHealth (Player p, Enemy e) {
		int newHealth = p.getHealth() - e.getDamage();
		if (newHealth < 0) {
			newHealth = 0;}
		p.setHealth(newHealth);
	 }
 
	 public static void main (String[] args) {
	    Player player1 = new Player(10, 20, 30, 40, 102);
	    Enemy enemy1 = new Enemy(25, 35, 20, 30, 40);
	    Enemy enemy2 = new Enemy(100, 200, 50, 50, 30); 
 
	    
	    checkCollision (player1,enemy1);
}
 }
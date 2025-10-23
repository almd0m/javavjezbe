
	// daris velovic

	// ajla catovic

	// almedin mekic

	public class Player {

	     private String ime;

	     private int x;

	     private int y;

	     private int width;

	     private int height;

	     private int health;



	   public Player(String ime, int x, int y, int width, int height, int health) {

	       this.ime = ime;

	       this.x = x;

	       this.y = y;

	       this.width = width;

	       this.height = height;

	       this.health = health;

	   }



	   public String getName() {

	       return ime;

	   }



	   public void setIme(String ime) {

	       if (ime.isEmpty()) {

	           System.out.print("Ime igraca ne smije biti prazno");

	       }

	       String [] rijeci = ime.trim().split("\\s+");

	       StringBuilder formatiranoIme = new StringBuilder();

	       for (int i = 0; i < rijeci.length; i++) {

	           String rijec = rijeci[i];

	           if (!rijec.isEmpty()) {

	               formatiranoIme.append(Character.toUpperCase(rijec.charAt(0)));

	               if (rijec.length() > 1) {

	                   formatiranoIme.append(rijec.substring(1).toLowerCase());

	               }

	               if (i < rijeci.length - 1) {

	                   formatiranoIme.append(" ");

	               }

	           }

	      this.ime = formatiranoIme.toString();

	   }

	   }



	   public int getHealth() {

	       return health;

	   }

	   public void setHealth(int health) {

	       if (health < 0) {

	           this.health = 0;

	       } else this.health = Math.min(health, 100);

	   }

	   public int getX() {

	       return x;

	   }

	   public int setX(int x) {

	       this.x = x;

	       return x;

	   }

	   public int getY() {

	       return y;

	   }

	   public int setY(int y) {

	       this.y = y;

	       return y;

	   }

	   public int getWidth() {

	       return width;

	   }

	   public int setWidth(int width) {

	       this.width = width;

	       return width;

	   }

	   public int getHeight() {

	       return height;

	   }

	   public int setHeight(int height) {

	       this.height = height;

	       return height;

	   }





	@Override

	public String toString() {



	    return String.format("Igrac '%s' | Pozicija: (%d, %d) | Dimenzije: %dx%d | Health: %d/100 (%s)",

	            ime, x, y, width, height, health );

	}

	}
	
	
	

	
		



		

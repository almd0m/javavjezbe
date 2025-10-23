
public class Enemy {
	

	     private String tip;

	     private int x;

	     private int y;

	     private int width;

	     private int height;

	     private int damage;



	   public Enemy(String tip, int x, int y, int width, int height, int damage) {

	       this.tip = tip;

	       this.x = x;

	       this.y = y;

	       this.width = width;

	       this.height = height;

	       this.damage = damage;

	   }



	   public String getTip() {

	       return tip;

	   }



	   public void setTip(String tip) {

	       if (tip.isEmpty()) {

	           System.out.print("Ime igraca ne smije biti prazno");

	       }

	       String [] rijeci = tip.trim().split("\\s+");

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

	      this.tip = formatiranoIme.toString();

	   }

	   }



	   public int getDamage() {

	       return damage;

	   }

	   public void setDamage(int daamge) {

	       if (damage < 0) {

	           this.damage = 0;

	       } else this.damage = Math.min(damage, 100);

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



	    return String.format("Igrac '%s' | Pozicija: (%d, %d) | Dimenzije: %dx%d | Damage: %d/100 (%s)",

	    		tip, x, y, width, height, damage );

	}

	}
	
	
	

	
		



		



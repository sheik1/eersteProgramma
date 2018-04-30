public class Demo {
	
	public static void main(String[] args) {
		
		Ball ball = new Ball();
		
		ball.setHoogte(30);
		ball.setBreedte(30);
		ball.setKleur("rood");
		
		ball.ToonEigenschappen();
		
		Ball ball2 = new Ball();
		
		ball2.setHoogte(50);
		ball2.setBreedte(50);
		ball2.setKleur("blauw");
		
		ball2.ToonEigenschappen();
		
	}
}

class Ball{
	
	int hoogte, breedte;
	String kleur;
	
	
	public void setHoogte(int hoogte) {
		this.hoogte = hoogte;
	}
	
	public int getHoogte() {
		return this.hoogte;
	}
	
	public void setBreedte(int breedte) {
		this.breedte = breedte;
	}
	
	public int getBreedte() {
		return this.breedte;
	}
	
	public void setKleur(String kleur) {
		this.kleur = kleur;
	}
	
	public String getKleur() {
		return this.kleur;
	}
	
	
	public void ToonEigenschappen() {
		System.out.println("de hoogte van de bal is "+ getHoogte() + 
				" de breedte is "+ getBreedte() + "de kleur is " + getKleur());
	}
}

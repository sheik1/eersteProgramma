
import java.util.Arrays;
import java.util.Scanner;

public class Galgje {
	
	public static void main(String[] args) {
		
		//Scanner zorgt er onder andere voor dat gebruikersinput gelezen kan worden 
		Scanner scanner = new Scanner(System.in);
		
		// de te raden woorden
		String[] woord = {"youngcapital", "amsterdam", "dubai"};
		
		// math random zorgt ervoor dat een willekeurige woord wordt uitgekozen
		int optieWoord = (int)(Math.random()*3);
		
		//vertaal de string array naar een char array
		char[] woordArray = woord[optieWoord].toCharArray();
		
		// het aantal karakters dat het te raden woord heeft
		char[] raden = new char[woordArray.length];
		
		// zet voor de eerste keer het aantal sterren (*) bij het aantal letters
		for(int i=0; i<raden.length; i++) {
			
			raden[i] = '*';
		}
		
		// toon het te raden woord in stervorm (*)
		System.out.println(raden);
		
		// wacht op gebruikersinput
		System.out.println("typ een kleine letter");
		
		// while herhaalt zolang het woord nog niet is geraden
		// als het woord geraden is dan moet het uit de while loop
		// met behulp van break, anders blijft het voor altijd doorgaan
		while(true) {
			
			// lees het eerste karakter dat ingetypt is
			char input = scanner.next().charAt(0);
			
			// vergelijk het ingetypt karakter met het te raden woord
			for(int i=0; i< woordArray.length; i++) {
				
				if(input == woordArray[i]) {
					raden[i] = input;
				}
			}
			
			System.out.println(raden);
			
			// als alle letters geraden zijn dan wordt "geraden" getoond
			if(Arrays.equals(raden, woordArray)) {
				System.out.println("geraden");
				break;
			}
		}
		
		// vraag of de gebruiker opnieuw wilt spelen
		System.out.println("wilt u opnieuw spelen? j/n");
		
		// lees de letter van de gebruiker
		char keuze = scanner.next().charAt(0);
		
		// als het "j" is begin opnieuw, anders stoppen
		if(keuze == 'j') {
			main(args);
		}else {
			System.out.println("tot ziens");
		}
		
		scanner.close();
	}
}

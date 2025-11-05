package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 5;
		int fix = 2;
		int wartend = 2;
		boolean istVoll = false;
		
		if(max==fix) {
			istVoll = true;
		}else {
			istVoll = false;
		}
		while(!istVoll && wartend>0) {
			fix+=1;
			wartend-=1;
			if(max==fix) {
				istVoll=true;
			}
		}
		System.out.println("vergebene Fixplätze: "+fix);
		System.out.println("Anzahl auf der Warteliste: "+wartend);
		if(istVoll) {
			System.out.println("Alle Plätze vergeben");
		}else {
			System.out.println("freie Plätze: "+(max-fix));
		}

	}

}

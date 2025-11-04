package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double guthaben = -1000;
		double monEingang = 200;
		int rating = -2;
		boolean warnhinweis = false;
		boolean negativ = false;
		
		warnhinweis = false;
		if(guthaben<0) {
			negativ = true;
			if(-guthaben>monEingang) {
				if(rating<0) {
					warnhinweis = true;
				}
				rating-=1;
			}else {
				rating+=1;
			}
		}else {
			if(guthaben==0) {
				rating+=2;
			}else {
				rating+=3;
			}
		}
		System.out.println("Kontostand: "+guthaben);
		System.out.println("monatl. Einkommen: "+monEingang);
		System.out.println("Rating: "+rating);
		if(negativ) {
			System.out.println("negaitv");
		}
		if(warnhinweis) {
			System.out.println("WARNUNG");
		}
	}	
}

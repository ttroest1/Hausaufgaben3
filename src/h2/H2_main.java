package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int jahr = 2024;
	boolean schalt = true;
	
	double J100 = jahr/100;
	double J4 = jahr/4;
	
	if(4*J4==jahr) {
		if(J100*100==jahr) {
			schalt = false;
		}else {
			schalt = true;
		}
	}else {
		schalt= false;
	}
	if(schalt) {
		System.out.println("Das Jahr " +jahr+ " ist ein Schaltjahr.");
	}else {
		System.out.println("Das Jahr " +jahr+ " ist kein Schaltjahr.");

	}
	}

}

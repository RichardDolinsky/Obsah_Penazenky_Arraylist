
public class PenazenkaTester {

	public static void main(String[] args) {
		Penazenka penazenka1 = new Penazenka();
		penazenka1.pridajMincu("Centovka");
		penazenka1.pridajMincu("Eurovka");
		penazenka1.pridajMincu("50Cent");
		
		Penazenka penazenka2 = new Penazenka();
		penazenka2.pridajMincu("50Cent");
		penazenka2.pridajMincu("Centovka");
		penazenka2.pridajMincu("Eurovka");
		//penazenka2.pridajMincu("Dvojeurovka");
		
		System.out.println("Porovnanie bez Dvoj-potvrdenia: "+ penazenka1.jeObsahovoTotoznaS(penazenka2) );
		
        Penazenka a = new Penazenka();
        a.pridajMincu("Eurovka");
        a.pridajMincu("Dvojeurovka");
   
        Penazenka b = new Penazenka();
        b.pridajMincu("Dvojeurovka");
        b.pridajMincu("Eurovka");
        
        PenazenkaVyries pena = new PenazenkaVyries();
       System.out.println("Riesenie pre 1. porovnanie: " + pena.vyries(a, b)  );
       System.out.println("Ocakavana hodnota: true \n");
        

       Penazenka c = new Penazenka();
       c.pridajMincu("Centovka");
       c.pridajMincu("Dvojcentovka");
       c.pridajMincu("Centovka");

       Penazenka d = new Penazenka();
       d.pridajMincu("Centovka");
       d.pridajMincu("Dvojcentovka");
       d.pridajMincu("Patcentovka");
       
       System.out.println("Riesenie pre 2. porovnanie: " + pena.vyries(c, d));

       System.out.println("Ocakavana hodnota: false");
        

	}

}

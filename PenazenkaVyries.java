

public class PenazenkaVyries {
	// porovnava boolean vysledky a ak su zhodne pre obe pripady vrati true
	
	public boolean vyries(Penazenka vlozPenazenku1, Penazenka vlozDruhu) {
		if (vlozPenazenku1.jeObsahovoTotoznaS(vlozDruhu)== vlozDruhu.jeObsahovoTotoznaS(vlozPenazenku1)){
			return true;
			
		}
		return false;
		
		
	}

}

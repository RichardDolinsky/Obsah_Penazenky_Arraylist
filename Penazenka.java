import java.util.ArrayList;

public class Penazenka {
	
	 private ArrayList<String> mince;

	    /**
	       Vytvara prazdnu penazenku.
	    */
	    public Penazenka()
	    {
	        mince = new ArrayList<String>();
	    }
	    
	    public boolean jeObsahovoTotoznaS(Penazenka inaPenazenka)
	    { // ak velkost poctu minci nesedi s inou penazenkou automaticky nie su totozne
	        if(mince.size()!=inaPenazenka.mince.size()) return false;
	        for (String minca: mince)
	        {
	        	boolean jeMincaVInejPenazenke = false;
	        	for (String mincaVInejKolekcii: inaPenazenka.mince) {
	        		
	        		if(minca.equals(mincaVInejKolekcii) ) {
	        			
	        			jeMincaVInejPenazenke=true;
	        			break;
	        		}
	        	}
	        	if (jeMincaVInejPenazenke==false) {
	        		return false;
	        	}
	        	
	        }
	        
	        return true; 
	    }
	    
	    
	    public void pridajMincu(String nazovMince)
	    {
	        mince.add(nazovMince);
	    }
	    
}

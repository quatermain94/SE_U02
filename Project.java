package se1_02;

public class Project implements ProjectInterface {
	
	String[][] bedingungen;
	
	public Project(String[][] sequence){
		bedingungen = sequence;
	}

	@Override
	public boolean isWellSorted(String[] sequence) {
		if (sequence.length == 0){						//sequenz leer
			return false;								//... ist auch doof
		}
		boolean erfuellt = true;
		
		fehler:											//bei fehler wird die schleife mitabgebrochen
		for (int i = 0; i<bedingungen.length; i++){		//für alle Bedingungen
			int m = 0;
			while (bedingungen[i][0] != sequence[m]){	//suche den anfang der bed in der sequenz
				m++;
				if (m >= sequence.length){				//falls nicht vorhanden
					erfuellt = false;					//ist die bed nicht erfüllt
					break fehler;						//also kannste abbrechen
				}
			}
			int n = m+1;
			if (n >= sequence.length){					//sequenz zuende
				erfuellt = false;						//ist die bed nicht erfüllt
				break fehler;							//also kannste abbrechen
			}
			while (bedingungen[i][1] != sequence[n]){	//suche den 2. teil der bedingung in dert sequenz
				n++;
				if (n >= sequence.length){				//falls nicht vorhanden
					erfuellt = false;					//ist die bed nicht erfüllt
					break fehler;						//also kannste abbrechen
				}
			}
		}
		return erfuellt;
	}

}

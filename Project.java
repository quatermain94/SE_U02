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
		return true;
	}

}

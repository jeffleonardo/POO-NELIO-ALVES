package enuns;

public enum Status {

	VAZIO,
	CHEIO;
	
	Status() {
		
	}	
	
	public Status mostarStatus(int opcao) {
		if(opcao == 0) {
			return VAZIO;
		}else if(opcao == 1) {
			return CHEIO;
		}
		return null;
	}
}

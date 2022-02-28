package enuns;

public enum Status {

	VAZIO,
	CHEIO;	
	
	public Status mostarStatus(int opcao) {
		if(opcao == 0) {
			return VAZIO;
		}else if(opcao == 1) {
			return CHEIO;
		}
		return null;
	}
}

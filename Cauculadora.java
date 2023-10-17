package modelo;

public abstract class Cauculadora {
	
	protected Integer numA;
	
	protected Integer numB;
	
	public abstract Integer calcular();

	public Integer getNumA() {
		return numA;
	}

	public void setNumA(Integer numA) {
		this.numA = numA;
	}

	public Integer getNumB() {
		return numB;
	}

	public void setNumB(Integer numB) {
		this.numB = numB;
	}
	
	
}



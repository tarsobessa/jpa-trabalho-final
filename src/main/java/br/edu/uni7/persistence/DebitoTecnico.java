package br.edu.uni7.persistence;

public class DebitoTecnico extends ItemAvaliacao {
	
	private Long custo;
	
	private Impacto impacto;

	public Impacto getImpacto() {
		return impacto;
	}

	public void setImpacto(Impacto impacto) {
		this.impacto = impacto;
	}

	public Long getCusto() {
		return custo;
	}

	public void setCusto(Long custo) {
		this.custo = custo;
	}
}

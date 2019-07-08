package br.com.consultamed.modelo.endidade;

public enum Sexotype {

    M ("Mesculino"),
    F ("Feminino");
	
    private String descricao;
	private Sexotype(String descricao) {
	
		this.descricao = descricao;
		
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    

}

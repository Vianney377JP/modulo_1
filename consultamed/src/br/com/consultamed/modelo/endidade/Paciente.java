/**
 * 
 */
package br.com.consultamed.modelo.endidade;

/**
 * @author Vianney
 *
 */
public class Paciente {

	private long id;
	private String Nome;
	private String rg;
	private String cpf;
	private Sexotype sexo;

	private Endereco endereco  ;
	
	
	private Contato contato;


	public Paciente(long id, String nome, String rg, String cpf, Sexotype sexo, Endereco endereco, Contato contato) {
		super();
		this.id = id;
		Nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
		this.endereco = endereco;
		this.contato = contato;
	}


	public Paciente(long id, String nome, String rg, String cpf, Sexotype sexo) {
		super();
		this.id = id;
		Nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
	}


	public Paciente(String nome, String rg, String cpf, Sexotype sexo) {
		super();
		Nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Sexotype getSexo() {
		return sexo;
	}


	public void setSexo(Sexotype sexo) {
		this.sexo = sexo;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Contato getContato() {
		return contato;
	}


	public void setContato(Contato contato) {
		this.contato = contato;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id != other.id)
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [id=")
		.append(id).append(", Nome=").append(Nome).append(", rg=").append(rg)
				.append(", cpf=").append(cpf).append(", sexo=").append(sexo).append(", endereco=").append(endereco)
				.append(", contato=").append(contato).append("]");
		return builder.toString();
	}
	
	
	
}

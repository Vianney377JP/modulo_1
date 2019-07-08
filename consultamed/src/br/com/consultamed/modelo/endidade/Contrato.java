package br.com.consultamed.modelo.endidade;

public class Contrato {
	
	private int id;
	
	private Paciente contratante;
	
	private Medico contratato;

	public Contrato(int id, Paciente contratante, Medico contratato) {
		super();
		this.id = id;
		this.contratante = contratante;
		this.contratato = contratato;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Paciente getContratante() {
		return contratante;
	}

	public void setContratante(Paciente contratante) {
		this.contratante = contratante;
	}

	public Medico getContratato() {
		return contratato;
	}

	public void setContratato(Medico contratato) {
		this.contratato = contratato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contratante == null) ? 0 : contratante.hashCode());
		result = prime * result + ((contratato == null) ? 0 : contratato.hashCode());
		result = prime * result + id;
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
		Contrato other = (Contrato) obj;
		if (contratante == null) {
			if (other.contratante != null)
				return false;
		} else if (!contratante.equals(other.contratante))
			return false;
		if (contratato == null) {
			if (other.contratato != null)
				return false;
		} else if (!contratato.equals(other.contratato))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contrato [id=").append(id).append(", contratante=").append(contratante).append(", contratato=")
				.append(contratato).append("]");
		return builder.toString();
	}
	
		

}

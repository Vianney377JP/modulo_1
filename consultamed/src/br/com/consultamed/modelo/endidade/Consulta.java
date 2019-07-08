package br.com.consultamed.modelo.endidade;

public class Consulta<Data> {

	
	private int id;
	private Medico medico;
	private Paciente paciente;
	private Data dataCria��o;
	private double  valor;
	private Procedimento tratamento;
	
	public Consulta(int id, Medico medico, Paciente paciente, Data dataCria��o, double valor, Procedimento tratamento) {
		super();
		this.id = id;
		this.medico = medico;
		this.paciente = paciente;
		this.dataCria��o = dataCria��o;
		this.valor = valor;
		this.tratamento = tratamento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Data getDataCria��o() {
		return dataCria��o;
	}
	public void setDataCria��o(Data dataCria��o) {
		this.dataCria��o = dataCria��o;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Procedimento getTratamento() {
		return tratamento;
	}
	public void setTratamento(Procedimento tratamento) {
		this.tratamento = tratamento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataCria��o == null) ? 0 : dataCria��o.hashCode());
		result = prime * result + id;
		result = prime * result + ((tratamento == null) ? 0 : tratamento.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Consulta<?> other = (Consulta<?>) obj;
		if (dataCria��o == null) {
			if (other.dataCria��o != null)
				return false;
		} else if (!dataCria��o.equals(other.dataCria��o))
			return false;
		if (id != other.id)
			return false;
		if (tratamento == null) {
			if (other.tratamento != null)
				return false;
		} else if (!tratamento.equals(other.tratamento))
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Consulta [id=").append(id).append(", medico=").append(medico).append(", paciente=")
				.append(paciente).append(", dataCria��o=").append(dataCria��o).append(", valor=").append(valor)
				.append(", tratamento=").append(tratamento).append("]");
		return builder.toString();
	}
	
	
	
	
	
}


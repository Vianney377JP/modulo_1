package br.com.consultamed.modelo.endidade;

public class Consulta<Data> {

	
	private int id;
	private Medico medico;
	private Paciente paciente;
	private Data dataCriação;
	private double  valor;
	private Procedimento tratamento;
	
	public Consulta(int id, Medico medico, Paciente paciente, Data dataCriação, double valor, Procedimento tratamento) {
		super();
		this.id = id;
		this.medico = medico;
		this.paciente = paciente;
		this.dataCriação = dataCriação;
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
	public Data getDataCriação() {
		return dataCriação;
	}
	public void setDataCriação(Data dataCriação) {
		this.dataCriação = dataCriação;
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
		result = prime * result + ((dataCriação == null) ? 0 : dataCriação.hashCode());
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
		if (dataCriação == null) {
			if (other.dataCriação != null)
				return false;
		} else if (!dataCriação.equals(other.dataCriação))
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
				.append(paciente).append(", dataCriação=").append(dataCriação).append(", valor=").append(valor)
				.append(", tratamento=").append(tratamento).append("]");
		return builder.toString();
	}
	
	
	
	
	
}


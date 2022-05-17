package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Cliente")
public class Atendente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "funcionario_id")
	@NotNull
	private int codigo;

	@Column(name = "hora_entrada", length = 200)
	@NotNull
	private String hrEntrada;

	@Column(name = "hora_saida", length = 200)
	@NotNull
	private String hrSaida;

	@Column(name = "email", length = 200)
	@NotNull
	private String email;

	@ManyToOne(targetEntity = Atendimento.class)
	@JoinColumn(name = "atendente_funcionarioid")
	@NotNull
	private Atendimento atendimento;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getHr_entrada() {
		return hrEntrada;
	}

	public void setHr_entrada(String hr_entrada) {
		this.hrEntrada = hr_entrada;
	}

	public String getHr_saida() {
		return hrSaida;
	}

	public void setHr_saida(String hr_saida) {
		this.hrSaida = hr_saida;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Atendente [codigo=" + codigo + ", hr_entrada=" + hrEntrada + ", hr_saida=" + hrSaida + ", email="
				+ email + "]";
	}

}

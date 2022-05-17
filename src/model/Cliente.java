package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Atendimento")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cpf")
	@NotNull
	private String cpf;

	@Column(name = "nome_cliente", length = 200)
	@NotNull
	private String nomeCliente;

	@Column(name = "tel_cliente", length = 200)
	@NotNull
	private String telCliente;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getTelCliente() {
		return telCliente;
	}

	public void setTelCliente(String telCliente) {
		this.telCliente = telCliente;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nomeCliente=" + nomeCliente + ", telCliente=" + telCliente + "]";
	}

}

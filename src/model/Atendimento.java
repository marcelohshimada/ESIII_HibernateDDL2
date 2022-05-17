package model;

import java.util.Date;
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
@Table(name = "Atendimento")
public class Atendimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "atendimento_id")
	@NotNull
	private int codigo;

	@Column(name = "cpf", length = 200)
	@NotNull
	private String cpf;

	@Column(name = "data_atendimento", length = 200)
	@NotNull
	private Date dataAtendimento;

	@ManyToOne(targetEntity = Cliente.class)
	@JoinColumn(name = "atendente_funcionarioid")
	@NotNull
	private Cliente cliente;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	@Override
	public String toString() {
		return "Atendimento [codigo=" + codigo + ", dataAtendimento=" + dataAtendimento + "]";
	}

}

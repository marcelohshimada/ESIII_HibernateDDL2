package model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "funcionario")
public class Funcionario {

	@Id
	@Column(name = "id_funcionario")
	@NotNull
	private int id;

	@Column(name = "nome_funcionario", length = 200)
	@NotNull
	private String nome;

	@Column(name = "nasc_funcionario", length = 200)
	@NotNull
	private Date nasc;

	@Column(name = "salario_funcionario", length = 200)
	@NotNull
	private double salario;

	@Column(name = "telefone_funcionario", length = 200)
	@NotNull
	private int telefone;

	@OneToOne(targetEntity = Atendente.class)
	@JoinColumn(name = "atendente_id")
	@NotNull
	private Atendente atendente;

	@ManyToOne(targetEntity = Entregador.class)
	@JoinColumn(name = "entregador_id")
	@NotNull
	private Entregador entregador;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNasc() {
		return nasc;
	}

	public void setNasc(Date nasc) {
		this.nasc = nasc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}

	public Entregador getEntregador() {
		return entregador;
	}

	public void setEntregador(Entregador entregador) {
		this.entregador = entregador;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", nasc=" + nasc + ", salario=" + salario + ", telefone="
				+ telefone + ", atendente=" + atendente + ", entregador=" + entregador + "]";
	}

}

package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Entregador")
public class Entregador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "funcionario_id")
	@NotNull
	private int codigo;

	@Column(name = "num_cnh", length = 200)
	@NotNull
	private String numCNH;

	@Column(name = "tipo_cnh", length = 200)
	@NotNull
	private String tipoCNH;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNumCNH() {
		return numCNH;
	}

	public void setNumCNH(String numCNH) {
		this.numCNH = numCNH;
	}

	public String getTipoCNH() {
		return tipoCNH;
	}

	public void setTipoCNH(String tipoCNH) {
		this.tipoCNH = tipoCNH;
	}

	@Override
	public String toString() {
		return "Entregador [codigo=" + codigo + ", numCNH=" + numCNH + ", tipoCNH=" + tipoCNH + "]";
	}

}

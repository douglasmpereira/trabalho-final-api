package br.org.serratec.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idendereco;
	
	@Column(name = "cep")  
	private String cep;
	
	@NotBlank(message = "rua vazia")  
	@Size(max = 50, message = "Preencha a rua!")
	@Column(name = "rua", nullable = false)  
	private String rua;
	
	@NotBlank(message = "bairro vazio")  
	@Size(max = 50, message = "Preencha o bairro!")
	@Column(name = "bairro", nullable = false)  
	private String bairro;
	
	@NotBlank(message = "cidade vazio")  
	@Size(max = 50, message = "Preencha a cidade!")
	@Column(name = "localidade", nullable = false)  
	private String localidade;
	
	@NotBlank(message = "uf vazia")  
	@Size(max = 5, message = "Preencha a uf!")
	@Column(name = "uf", nullable = false)  
	private String uf;

	public Endereco() {
		super();
	}

	public Endereco(Long idendereco, String cep,
			@NotBlank(message = "rua vazia") @Size(max = 50, message = "Preencha a rua!") String rua,
			@NotBlank(message = "bairro vazio") @Size(max = 50, message = "Preencha o bairro!") String bairro,
			@NotBlank(message = "cidade vazio") @Size(max = 50, message = "Preencha a cidade!") String localidade,
			@NotBlank(message = "uf vazia") @Size(max = 5, message = "Preencha a uf!") String uf) {
		super();
		this.idendereco = idendereco;
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
	}

	public Long getIdendereco() {
		return idendereco;
	}

	public void setIdendereco(Long idendereco) {
		this.idendereco = idendereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
}

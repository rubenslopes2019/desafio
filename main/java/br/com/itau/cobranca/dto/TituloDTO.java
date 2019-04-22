package br.com.itau.cobranca.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;


public class TituloDTO {
	
	@JsonProperty("NumeroTitulo")
	private Long numeroTitulo;
	
	@JsonProperty("ValorTitulo")
	private BigDecimal valorTitulo;
	
	@JsonProperty("DataVencimento")
	private Date dataVencimento;
	
	@JsonProperty("ValorJuros")
	private Double valorJuros;
	
	@JsonProperty("ValorMora")
	private Double valorMora;
	
	@JsonProperty("DataProcessamento")
	private Timestamp dataProcessamento;
	
	@JsonProperty("NossoNumero")
	private Long nossoNumero;
	
	@JsonProperty("Carteira")
	private Long carteira;
	
	@JsonProperty("CpfCnpjCedente")
	private Long cpfCnpjCedente;
	
	@JsonProperty("FormaCobranca")
	private String formaCobranca;
	
	@JsonProperty("CpfCnpjSacado")
	private Long cpfCnpjSacado;
	
	@JsonProperty("NomeSacado")
	private String nomeSacado;
	
	@JsonProperty("Situacao")
	private String situacao;	
	
	public Long getNumeroTitulo() {
		return numeroTitulo;
	}

	public void setNumeroTitulo(Long numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}

	public BigDecimal getValorTitulo() {
		return valorTitulo;
	}

	public void setValorTitulo(BigDecimal valorTitulo) {
		this.valorTitulo = valorTitulo;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValorJuros() {
		return valorJuros;
	}

	public void setValorJuros(Double valorJuros) {
		this.valorJuros = valorJuros;
	}

	public Double getValorMora() {
		return valorMora;
	}

	public void setValorMora(Double valorMora) {
		this.valorMora = valorMora;
	}

	public Timestamp getDataProcessamento() {
		return dataProcessamento;
	}

	public void setDataProcessamento(Timestamp dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}

	public Long getNossoNumero() {
		return nossoNumero;
	}

	public void setNossoNumero(Long nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	public Long getCarteira() {
		return carteira;
	}

	public void setCarteira(Long carteira) {
		this.carteira = carteira;
	}

	public Long getCpfCnpjCedente() {
		return cpfCnpjCedente;
	}

	public void setCpfCnpjCedente(Long cpfCnpjCedente) {
		this.cpfCnpjCedente = cpfCnpjCedente;
	}

	public String getFormaCobranca() {
		return formaCobranca;
	}

	public void setFormaCobranca(String formaCobranca) {
		this.formaCobranca = formaCobranca;
	}

	public Long getCpfCnpjSacado() {
		return cpfCnpjSacado;
	}

	public void setCpfCnpjSacado(Long cpfCnpjSacado) {
		this.cpfCnpjSacado = cpfCnpjSacado;
	}

	public String getNomeSacado() {
		return nomeSacado;
	}

	public void setNomeSacado(String nomeSacado) {
		this.nomeSacado = nomeSacado;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}


	

}

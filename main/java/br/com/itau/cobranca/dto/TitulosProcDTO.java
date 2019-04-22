package br.com.itau.cobranca.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class TitulosProcDTO {
	
	private Long vcNumeroTitulo;
	private BigDecimal vcValorTitulo;
	private Date vcDataVencimento;
	private Double vcValoJuros;
	private Double vcValorMora;
	private Timestamp vcDataProcessamento;
	private Long vcNossoNumero;
	private Long vcCarteira;
	private Long vcCpfCnpjCedente;
	private String vcFormaCobranca;
	private Long vcCpfCnpjSacado;
	private String vcNomeSacado;
	private String vcSituacao;


	public Long getVcNumeroTitulo() {
		return vcNumeroTitulo;
	}
	public void setVcNumeroTitulo(Long vcNumeroTitulo) {
		this.vcNumeroTitulo = vcNumeroTitulo;
	}
	public BigDecimal getVcValorTitulo() {
		return vcValorTitulo;
	}
	public void setVcValorTitulo(BigDecimal vcValorTitulo) {
		this.vcValorTitulo = vcValorTitulo;
	}
	public Date getVcDataVencimento() {
		return vcDataVencimento;
	}
	public void setVcDataVencimento(Date vcDataVencimento) {
		this.vcDataVencimento = vcDataVencimento;
	}
	public Double getVcValoJuros() {
		return vcValoJuros;
	}
	public void setVcValoJuros(Double vcValoJuros) {
		this.vcValoJuros = vcValoJuros;
	}
	public Double getVcValorMora() {
		return vcValorMora;
	}
	public void setVcValorMora(Double vcValorMora) {
		this.vcValorMora = vcValorMora;
	}
	public Timestamp getVcDataProcessamento() {
		return vcDataProcessamento;
	}
	public void setVcDataProcessamento(Timestamp vcDataProcessamento) {
		this.vcDataProcessamento = vcDataProcessamento;
	}
	public Long getVcNossoNumero() {
		return vcNossoNumero;
	}
	public void setVcNossoNumero(Long vcNossoNumero) {
		this.vcNossoNumero = vcNossoNumero;
	}
	public Long getVcCarteira() {
		return vcCarteira;
	}
	public void setVcCarteira(Long vcCarteira) {
		this.vcCarteira = vcCarteira;
	}
	public Long getVcCpfCnpjCedente() {
		return vcCpfCnpjCedente;
	}
	public void setVcCpfCnpjCedente(Long vcCpfCnpjCedente) {
		this.vcCpfCnpjCedente = vcCpfCnpjCedente;
	}
	public String getVcFormaCobranca() {
		return vcFormaCobranca;
	}
	public void setVcFormaCobranca(String vcFormaCobranca) {
		this.vcFormaCobranca = vcFormaCobranca;
	}
	public Long getVcCpfCnpjSacado() {
		return vcCpfCnpjSacado;
	}
	public void setVcCpfCnpjSacado(Long vcCpfCnpjSacado) {
		this.vcCpfCnpjSacado = vcCpfCnpjSacado;
	}
	public String getVcNomeSacado() {
		return vcNomeSacado;
	}
	public void setVcNomeSacado(String vcNomeSacado) {
		this.vcNomeSacado = vcNomeSacado;
	}
	public String getVcSituacao() {
		return vcSituacao;
	}
	public void setVcSituacao(String vcSituacao) {
		this.vcSituacao = vcSituacao;
	}

}

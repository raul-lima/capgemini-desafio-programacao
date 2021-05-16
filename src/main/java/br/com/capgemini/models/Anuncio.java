package br.com.capgemini.models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe com os dados do anúncio e seu respectivo relatório
 * @author Raul Torres de Lima
 *
 */
public class Anuncio {

	private String nomeAnuncio;
	private String cliente;
	private Date dataInicio;
	private Date dataTermino;
	private Double investimentoPorDia;
	private Relatorio relatorio;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Anuncio(String nomeAnuncio, String cliente, Date dataInicio, Date dataTermino, Double investimentoPorDia,
			Relatorio relatorio) {
		this.nomeAnuncio = nomeAnuncio;
		this.cliente = cliente;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.investimentoPorDia = investimentoPorDia;
		this.relatorio = relatorio;
	}



	public String getNomeAnuncio() {
		return nomeAnuncio;
	}



	public void setNomeAnuncio(String nomeAnuncio) {
		this.nomeAnuncio = nomeAnuncio;
	}



	public String getCliente() {
		return cliente;
	}



	public void setCliente(String cliente) {
		this.cliente = cliente;
	}



	public Date getDataInicio() {
		return dataInicio;
	}



	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}



	public Date getDataTermino() {
		return dataTermino;
	}



	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}



	public Double getInvestimentoPorDia() {
		return investimentoPorDia;
	}



	public void setInvestimentoPorDia(Double investimentoPorDia) {
		this.investimentoPorDia = investimentoPorDia;
	}



	public Relatorio getRelatorio() {
		return relatorio;
	}



	public void setRelatorio(Relatorio relatorio) {
		this.relatorio = relatorio;
	}


	@Override
	public String toString() {
		return "== Anúncio " + nomeAnuncio + " ==\n Cliente: " + cliente + "\n Data de início:" + sdf.format(dataInicio)
				+ "\n Data de término: " + sdf.format(dataTermino) + "\n Investimento por dia: " + investimentoPorDia
				+ "\n" + relatorio;
	}

}


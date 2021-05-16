package br.com.capgemini.models;

import java.text.DecimalFormat;

/**
 * Classe com os dados do relatório relativo a cada anúncio 
 * @author Raul Torres de Lima
 *
 */
public class Relatorio {

	private Double valorTotalInvestido;
	private Double quantidadeMaximaVisualizacoes;
	private Double quantidadeMaximaCliques;
	private Double quantidadeMaximaCompartilhamentos;

	private DecimalFormat df = new DecimalFormat("#.00");

	public Relatorio(Double valorTotalInvestido, Double quantidadeMaximaVisualizacoes, Double quantidadeMaximaCliques,
			Double quantidadeMaximaCompartilhamentos) {
		this.valorTotalInvestido = valorTotalInvestido;
		this.quantidadeMaximaVisualizacoes = quantidadeMaximaVisualizacoes;
		this.quantidadeMaximaCliques = quantidadeMaximaCliques;
		this.quantidadeMaximaCompartilhamentos = quantidadeMaximaCompartilhamentos;
	}

	public Double getValorTotalInvestido() {
		return valorTotalInvestido;
	}

	public Double getQuantidadeMaximaVisualizacoes() {
		return quantidadeMaximaVisualizacoes;
	}

	public Double getQuantidadeMaximaCliques() {
		return quantidadeMaximaCliques;
	}

	public Double getQuantidadeMaximaCompartilhamentos() {
		return quantidadeMaximaCompartilhamentos;
	}

	@Override
	public String toString() {

		return "== Relatório == \n * valor total investido: R$ " + df.format(valorTotalInvestido)
				+ "\n * quantidade máxima de visualizações:" + df.format(quantidadeMaximaVisualizacoes)
				+ "\n * quantidade máxima de cliques:" + df.format(quantidadeMaximaCliques)
				+ "\n * quantidade máxima de compartilhamentos:" + df.format(quantidadeMaximaCompartilhamentos);
	}

}
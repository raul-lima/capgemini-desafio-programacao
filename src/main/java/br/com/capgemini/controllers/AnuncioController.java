package br.com.capgemini.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import br.com.capgemini.models.Anuncio;
import br.com.capgemini.models.Relatorio;

public class AnuncioController {

	public void cadastrarAnuncio(List<Anuncio> listaDeAnuncios, SimpleDateFormat sdf, Scanner sc)
			throws ParseException {

		int numeroDeAnuncios = sc.nextInt();

		for (int i = 1; i <= numeroDeAnuncios; i++) {
			sc.nextLine();
			System.out.println("== Anúncio de número: " + i + " ==");
			System.out.println("Por favor, forneça os seguintes dados: ");
			System.out.print("Nome do anúncio:");
			String nomeAnuncio = sc.nextLine();
			System.out.print("Cliente: ");
			String cliente = sc.nextLine();
			System.out.print("Data de início (dd/mm/aaaa): ");
			Date dataInicio = sdf.parse(sc.next());
			sc.nextLine();
			System.out.print("Data de término (dd/mm/aaaa): ");
			Date dataTermino = sdf.parse(sc.next());
			sc.nextLine();
			System.out.print("Investimento por dia: R$ ");
			Double investimentoPorDia = sc.nextDouble();

			Double valorTotalInvestido = calculaValorTotalInvestido(dataInicio, dataTermino, investimentoPorDia);

			Double quantidadeMaximaVisualizacoes = calculaQuantidadeMaximaVisualizacoes(valorTotalInvestido);

			Double quantidadeMaximaCliques = calculaQuantidadeMaximaCliques(quantidadeMaximaVisualizacoes);

			Double quantidadeMaximaCompartilhamentos = calculaQuantidadeMaximaCompartilhamentos(
					quantidadeMaximaCliques);

			Relatorio relatorio = new Relatorio(valorTotalInvestido, quantidadeMaximaVisualizacoes,
					quantidadeMaximaCliques, quantidadeMaximaCompartilhamentos);

			listaDeAnuncios
					.add(new Anuncio(nomeAnuncio, cliente, dataInicio, dataTermino, investimentoPorDia, relatorio));

			System.out.println("Anúncio " + nomeAnuncio + " cadastrado!");

		}
	}

	/**
	 * Calcula e retorna o valor total que foi investido com base no tempo do
	 * investimento e no investimento diário.
	 * 
	 * @param dataInicio         data de início do investimento
	 * @param dataTermino        data de término do investimento
	 * @param investimentoPorDia valor, em reais, do investimento diário
	 * @return valor total do investimento no período de tempo informado
	 */

	public Double calculaValorTotalInvestido(Date dataInicio, Date dataTermino, Double investimentoPorDia) {

		long totalDias = (dataTermino.getTime() - dataInicio.getTime()) / (3600 * 24 * 1000);

		Double valorTotalInvestido = investimentoPorDia * totalDias;
		return valorTotalInvestido;
	}

	/**
	 * Calcula e retorna a quantidade máxima de visualizações com base no valor
	 * total investido
	 * 
	 * @param valorTotalInvestido valor total que foi investido com base no tempo do
	 *                            investimento e no investimento diário
	 * @return quantidade máxima de visualizações
	 */

	public Double calculaQuantidadeMaximaVisualizacoes(Double valorTotalInvestido) {

		Double visualizacoesOriginais = valorTotalInvestido * 30;

		// Calcula as primeiras visualizações novas (e gera os primeiros
		// compartilhamentos: 1ª pessoa(visualizadores originais) -> compartilha -> 2ª
		// pessoa)
		Double visualizacoesNovas = calculo(visualizacoesOriginais);

		Double visualizacoesTotal = visualizacoesOriginais + visualizacoesNovas;

		// Laço for que vai gerar mais duas levas de compartilhamentos que, somados à
		// primeira, satisfazem ao enunciado do desafio --> (2ª pessoa -> compartilha -
		// >
		// 3ª pessoa -> compartilha -> 4ª pessoa)
		for (int i = 0; i < 2; i++) {

			visualizacoesNovas = calculo(visualizacoesNovas);
			visualizacoesTotal += visualizacoesNovas;
		}

		return visualizacoesTotal;

	}

	/**
	 * Calcula e retorna a quantidade máxima de cliques com base na quantidade
	 * máxima de visualizações
	 * 
	 * @param quantidadeMaximaVisualizacoes quantidade máxima de visualizações
	 * @return quantidade máxima de cliques
	 */

	public Double calculaQuantidadeMaximaCliques(Double quantidadeMaximaVisualizacoes) {

		return quantidadeMaximaVisualizacoes * 0.12;

	}

	/**
	 * Calcula e retorna a quantidade máxima de compartilhamentos com base na
	 * quantidade máxima de cliques
	 * 
	 * @param quantidadeMaximaCliques quantidade máxima de cliques
	 * @return quantidade máxima de compartilhamentos
	 */

	public Double calculaQuantidadeMaximaCompartilhamentos(Double quantidadeMaximaCliques) {

		return 3.0 / 20.0 * quantidadeMaximaCliques;
	}

	/**
	 * Calcula as visualizações novas com base nas visualizações que são passadas
	 * como parâmetro.
	 * 
	 * @param visualizacoes que servirão de base para o cálculo
	 * @return as visualizações novas depois do cálculo
	 */

	static Double calculo(Double visualizacoes) {

		Double cliques = visualizacoes * 0.12;
		Double compartilhamentos = 3.0 / 20.0 * cliques;
		Double novasVisualizacoes = compartilhamentos * 40.0;
		return novasVisualizacoes;

	}
}

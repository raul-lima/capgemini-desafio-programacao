package br.com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

import br.com.capgemini.controllers.AnuncioController;

public class AnuncioControllerTest {

	private AnuncioController anuncioController = new AnuncioController();

	private Date dataInicio = new GregorianCalendar(2000, Calendar.JANUARY, 01).getTime();
	private Date dataTermino = new GregorianCalendar(2000, Calendar.JANUARY, 10).getTime();
	private Double investimentoPorDia = 100.0;

	private Double valorTotalInvestido = (double) Math
			.round(anuncioController.calculaValorTotalInvestido(dataInicio, dataTermino, investimentoPorDia));
	private Double quantidadeMaximaVisualizacoes = (double) Math
			.round(anuncioController.calculaQuantidadeMaximaVisualizacoes(valorTotalInvestido));
	private Double quantidadeMaximaCliques = (double) Math
			.round(anuncioController.calculaQuantidadeMaximaCliques(quantidadeMaximaVisualizacoes));
	private Double quantidadeMaximaCompartilhamentos = (double) Math
			.round(anuncioController.calculaQuantidadeMaximaCompartilhamentos(quantidadeMaximaCliques));

	@Test
	void valorTotalInvestidoTest() {

		assertEquals(Double.valueOf(900), valorTotalInvestido);
	}

	@Test
	void quantidadeMaximaVisualizacoesTest() {

		assertEquals(Double.valueOf(70514.0), quantidadeMaximaVisualizacoes);
	}

	@Test
	void quantidadeMaximaCliquesTest() {

		assertEquals(Double.valueOf(8462.0), quantidadeMaximaCliques);
	}

	@Test
	void quantidadeMaximaCompartilhamentos() {
		assertEquals(Double.valueOf(1269.0), quantidadeMaximaCompartilhamentos);
	}
}

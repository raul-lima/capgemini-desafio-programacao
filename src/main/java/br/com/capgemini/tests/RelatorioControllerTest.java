package br.com.capgemini.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import br.com.capgemini.controllers.RelatorioController;
import br.com.capgemini.models.Anuncio;

public class RelatorioControllerTest {

	RelatorioController relatorioController = new RelatorioController();
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	List<Anuncio> listaDeAnuncios = new ArrayList<Anuncio>();
	
	@Test
	public void filtrarRelatorioPorTempoTest() throws ParseException {
		relatorioController.filtrarRelatorioPorTempo(listaDeAnuncios, sdf, sc);
	}
	
	@Test
	public void filtrarRelatorioPorClienteTest() {
		relatorioController.filtrarRelatorioPorCliente(listaDeAnuncios, sc);
	}
	
}

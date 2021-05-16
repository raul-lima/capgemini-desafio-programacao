package br.com.capgemini.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import br.com.capgemini.models.Anuncio;

public class RelatorioController {

	public void filtrarRelatorioPorTempo(List<Anuncio> listaDeAnuncios, SimpleDateFormat sdf, Scanner sc)
			throws ParseException {
		System.out.println("Por favor, forneça o intervalo de tempo:");
		System.out.print("Data inicial (dd/mm/aaaa): ");
		Date dataInicialFiltro = sdf.parse(sc.next());
		System.out.print("Data final (dd/mm/aaaa): ");
		Date dataFinalFiltro = sdf.parse(sc.next());

		int contadorFiltroTempo = 0;

		for (Anuncio anuncio : listaDeAnuncios) {
			if (anuncio.getDataInicio().getTime() >= dataInicialFiltro.getTime()
					&& anuncio.getDataTermino().getTime() <= dataFinalFiltro.getTime()) {
				System.out.println(anuncio);
				contadorFiltroTempo++;
			}
		}

		if (contadorFiltroTempo == 0) {
			System.out.println("Não foram encontrados relatórios nesse intervalo de tempo.");

		} else {
			System.out.println("Foram encontrados " + contadorFiltroTempo + " resultados.");
		}
	}

	public void filtrarRelatorioPorCliente(List<Anuncio> listaDeAnuncios, Scanner sc) {
		System.out.print("Digite o nome do cliente: ");
		String nomeCliente = sc.nextLine();

		int contadorFiltroCliente = 0;
		for (Anuncio anuncio : listaDeAnuncios) {
			if (anuncio.getCliente().toUpperCase().equals(nomeCliente.toUpperCase())) {
				System.out.println(anuncio);
				contadorFiltroCliente++;
			}
		}

		if (contadorFiltroCliente == 0) {
			System.out.println("Não foram encontrados relatórios com esse cliente.");

		} else {

			System.out.println("Foram encontrados " + contadorFiltroCliente + " resultados.");

		}
	}


}
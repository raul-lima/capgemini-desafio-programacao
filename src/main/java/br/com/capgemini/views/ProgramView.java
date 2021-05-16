package br.com.capgemini.views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.capgemini.controllers.AnuncioController;
import br.com.capgemini.controllers.RelatorioController;
import br.com.capgemini.models.Anuncio;

public class ProgramView {

	AnuncioController anuncioController = new AnuncioController();
	RelatorioController relatorioController = new RelatorioController();
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// Lista onde serão armazenados os objetos da classe Anuncio (que, por sua vez,
	// conterão objetos da classe Relatorio)
	List<Anuncio> listaDeAnuncios = new ArrayList<Anuncio>();

	
	int escolha = 0;

	public void showProgram() throws ParseException {
		// Laço principal: repete até o usuário digitar 3 para encerrar o programa
		while (escolha != 3) {
			System.out.println("============= Agência Divulga Tudo =============");
			System.out.println("== O que deseja fazer? ==");
			System.out.println("* Digite 1 para cadastrar anúncios");
			System.out.println("* Digite 2 para consultar relatórios dos anúncios");
			System.out.println("* Digite 3 para encerrar o programa");

			escolha = sc.nextInt();

			if (escolha == 3) {
				System.out.println("Programa encerrado!");
			}
			// Cadastro de anúncios
			if (escolha == 1) {

				System.out.println("== Sistema de cadastro de anúncios ==");
				System.out.println("Quantos anúncios deseja cadastrar?");

				anuncioController.cadastrarAnuncio(listaDeAnuncios, sdf, sc);

				// Filtro de relatórios
			} else if (escolha == 2) {

				System.out.println("== Como deseja filtrar os relatórios? ==");
				System.out.println("* Digite 1 para filtrar por intervalo de tempo");
				System.out.println("* Digite 2 para filtrar por cliente");
				int escolhaFiltro = 0;
				escolhaFiltro = sc.nextInt();
				sc.nextLine();

				// Filtro por intervalo de tempo
				if (escolhaFiltro == 1) {

					relatorioController.filtrarRelatorioPorTempo(listaDeAnuncios, sdf, sc);
					// Filtro por cliente
				} else if (escolhaFiltro == 2) {
					relatorioController.filtrarRelatorioPorCliente(listaDeAnuncios, sc);
				}

			}

		}
		
	}
}
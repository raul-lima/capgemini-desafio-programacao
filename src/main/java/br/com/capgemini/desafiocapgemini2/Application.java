package br.com.capgemini.desafiocapgemini2;

import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.capgemini.views.ProgramView;

/**
 * Programa que permite ao usuário cadastrar anúncios e consultar relatórios
 * @author Raul Torres de Lima
 *
 */

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(Application.class, args);

		ProgramView programView = new ProgramView();

		programView.showProgram();
	}

}

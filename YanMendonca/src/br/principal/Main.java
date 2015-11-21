package br.principal;

import br.services.Leitora;
import br.services.Servico;

public class Main {

	public static void main(String[] args) {
		System.out.println(Servico.isBalaceamentoParentese(Leitora.leString("Digite:", "Invalido. ")));
	}
}

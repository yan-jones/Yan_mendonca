package br.services;

public class Servico {

	public static boolean isBalaceamentoParentese(String texto) {
		return isBalaceamentoParentese(texto, 0, 0);
	}

	public static boolean isBalaceamentoParentese(String texto, int posicao, int cont) {
		boolean resultado = false;
		if (!texto.contains("("))
			return false;
		else if (cont < 0)
			return false;
		else if (texto.length() == posicao && cont != 0)
			resultado = false;
		else if (texto.length() == posicao && cont == 0)
			resultado = true;
		else if (texto.charAt(posicao) == '(')
			resultado = isBalaceamentoParentese(texto, posicao + 1, cont + 1);
		else if (texto.charAt(posicao) == ')')
			resultado = isBalaceamentoParentese(texto, posicao + 1, cont - 1);
		else
			resultado = isBalaceamentoParentese(texto, posicao + 1, cont);
		return resultado;
	}
}

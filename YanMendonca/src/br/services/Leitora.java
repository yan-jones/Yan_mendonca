package br.services;

import java.util.Scanner;

public class Leitora {

	public static String leString(String msg) {
		System.out.println(msg);
		return new Scanner(System.in).nextLine();
	}

	public static String leString(String msg, String msgErro) {
		String str;
		do {
			str = leString(msg);
			if (str.isEmpty())
				System.out.print(msgErro);
		} while (str.isEmpty());
		return str;
	}
}

package com.exemplo.saidaarq;

import java.io.*;

public class ExemploCriacaoArquivo {

	// referencia ao texto que, eventualmente,pode ser escrito no arquivo

	static String texto = new String("JAVA");

	public static void main(String[] args) {
		// bloco try/catch
		try {
			FileOutputStream arquivo = new FileOutputStream("GerarArquivo.txt");
			DataOutputStream dados = new DataOutputStream(arquivo);
			dados.writeChars(texto);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

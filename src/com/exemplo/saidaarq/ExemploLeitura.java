package com.exemplo.saidaarq;

// fazer o import necessario
import java.io.*;

public class ExemploLeitura {

	public static void main(String[] args) {
		// bloco try/catch
		try {
			FileInputStream arquivo = new FileInputStream("GerarArquivo.txt");
			DataInputStream dados = new DataInputStream(arquivo);
			// loop para leitura dos dados
			while (true) {
				char c = dados.readChar();
				System.out.println(c);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
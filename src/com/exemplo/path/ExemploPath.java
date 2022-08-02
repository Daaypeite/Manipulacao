package com.exemplo.path;

//importando os recursos necessarios
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploPath {

	public static void main(String[] args) {
		// criando um path
		Path poema = Paths.get("resources\\poema.txt");

		// exibir o caminho do path
		System.out.println(poema);

		// exibindo o path absoluto
		System.out.println(poema.toAbsolutePath());

		// exibir o nome do arquivo
		System.out.println(poema.getFileName());

		// caminho completo do diretorio pai
		System.out.println(poema.getParent().toAbsolutePath());
	}

}

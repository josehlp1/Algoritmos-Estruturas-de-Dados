package novalista;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		ListaEstatica<String> frutas = new ListaEstatica<>();
		
		frutas.inserir("abacate");
		frutas.inserir("morango");
		frutas.inserir("banana");
		
		frutas.inverter();
		frutas.exibir();
		
		
	}
}

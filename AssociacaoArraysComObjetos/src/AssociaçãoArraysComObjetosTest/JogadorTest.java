package Associa��oArraysComObjetosTest;

import Associa��oArraysComObjetosDominio.Jogador;

public class JogadorTest {
	public static void main(String[] args) {
	Jogador jogador1 = new Jogador("Pel�");
	Jogador jogador2 = new Jogador("Roberto Dinamite");
	Jogador jogador3 = new Jogador("Juninho Pernambuco");
	Jogador[] jogadores= new Jogador[] {jogador1,  jogador2, jogador3};
	
	for (Jogador jogador : jogadores) {
		jogador.imprime();
		}
	}
}

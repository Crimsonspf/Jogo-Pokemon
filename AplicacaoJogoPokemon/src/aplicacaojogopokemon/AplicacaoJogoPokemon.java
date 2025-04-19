package aplicacaojogopokemon;

import java.util.Scanner;

import cartaspokemon.CartaPokemon;
import cartaspokemon.TipoPokemon;
import itens.TipoItens;
import jogador.Jogador;

public class AplicacaoJogoPokemon {


    public static void main(String[] args) {
    	        Scanner e = new Scanner(System.in);
    	        
    	        PokemonFacade facade = PokemonFacade.acessarSingleton();
    	        
    	        System.out.print("Digite o nome do Jogador 1: ");
    	        String nomeJogador1 = e.nextLine();
    	        Jogador jogador1 = facade.criarJogador(nomeJogador1); 
    	        
    	        System.out.print("Digite o nome do Jogador 2: ");
    	        String nomeJogador2 = e.nextLine();
    	        Jogador jogador2 = facade.criarJogador(nomeJogador2);
    	        
    	        System.out.println("\nJogo iniciado!");
    	        System.out.println(jogador1);
    	        System.out.println(jogador2);
    	        
    	        jogador1.atacar(jogador2);
    	        
    }
    
}

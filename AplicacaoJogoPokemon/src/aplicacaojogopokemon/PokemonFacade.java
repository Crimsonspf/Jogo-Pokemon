package aplicacaojogopokemon;

import jogador.Jogador;

public class PokemonFacade {

    private static PokemonFacade singleton; 

    private PokemonFacade() { 
    }

    public static PokemonFacade acessarSingleton() { 
        if (singleton == null) {
        	singleton = new PokemonFacade();
        }
        return singleton;
    }

    public Jogador criarJogador(String nome) {
        return new Jogador(nome);
    }
}
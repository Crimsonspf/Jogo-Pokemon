package cartaspokemon;

public class CartaPokemonFactory implements PokemonFactory {

	@Override
	public CartaPokemon criarPokemon(TipoPokemon pkm) {
		 return new CartaPokemon(pkm);
	}


}

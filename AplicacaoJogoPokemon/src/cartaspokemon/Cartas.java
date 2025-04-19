package cartaspokemon;

public interface Cartas {
    
    public String getNome();
    public boolean adicionaCarta(CartaPokemon pkm);
    public int getHP();
    public int getATK();
    public int getDEF();
    public CartaPokemon[] getCartas();
    
    
    
}

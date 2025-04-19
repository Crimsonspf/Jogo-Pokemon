package cartaspokemon;

import java.util.ArrayList;

public class Deck implements Cartas{

    ArrayList<CartaPokemon> deck;
    
    @Override
    public boolean adicionaCarta(CartaPokemon carta){
        if (deck.size() >= 6) {return false;}    
        deck.add(carta);
        return true;
    }
    
    public boolean removeCarta(String nome){
        return true;
    }
    
    public Deck(){
        this.deck = new ArrayList<>();
    }
    
    @Override
    public CartaPokemon[] getCartas() {
        CartaPokemon[] tmp = new CartaPokemon[this.deck.size()];
        for (int i = 0; i < this.deck.size(); i++){
            tmp[i] = this.deck.get(i);
        }
        return tmp;
    }
    
    
    @Override
    public String getNome() {
        String temp = "";
        
        for (CartaPokemon c: deck){
            temp = temp + c.getNome() + "\n";
        }        
        return temp;
    }

    @Override
    public int getHP() {
        int totalHP = 0;
        for (Cartas carta : deck) {
            totalHP += carta.getHP();
        }
        return totalHP;
    }

    @Override
    public int getATK() {
        int totalATK = 0;
        for (Cartas carta : deck) {
            totalATK += carta.getATK();
        }
        return totalATK;
    }

    @Override
    public int getDEF() {
        int totalDEF = 0;
        for (Cartas carta : deck) {
            totalDEF += carta.getDEF();
        }
        return totalDEF;
    }
    
}

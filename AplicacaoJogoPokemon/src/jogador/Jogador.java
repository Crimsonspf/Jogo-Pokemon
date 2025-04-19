package jogador;

import java.util.Random;
import java.util.Scanner;

import cartaspokemon.*;
import itens.*;

public class Jogador {
    
    private Cartas carta;
    private TipoItens item;
    private int hp;
    private String nome;
    private PokemonFactory pokemonFactory;
    
    public Jogador(){
    	this.carta = new Deck();
        this.nome = "Jogador";
        this.pokemonFactory = new CartaPokemonFactory();
        CartaPokemon pokemonInicial = escolherPokemonInicial();
        this.carta.adicionaCarta(pokemonInicial);
        this.item = itemAleatorio();
        this.hp = 100;
    }
    
    public Jogador(String nome) {
        this.nome = nome;
        this.carta = new Deck();
        this.pokemonFactory = new CartaPokemonFactory();
        CartaPokemon pokemonInicial = escolherPokemonInicial();
        this.carta.adicionaCarta(pokemonInicial);
        this.item = itemAleatorio();
        this.hp = 100; 
    }
        
    public String getNomeCarta(){
        return carta.getNome();
    }
    
    public boolean adicionaCarta(CartaPokemon cpkm){
        if(carta.getClass().getSimpleName().equals("CartaPokemon")){
            Cartas tmp = this.carta;
            this.carta = new Deck();
            this.carta.adicionaCarta(tmp.getCartas()[0]); 
        }
        return this.carta.adicionaCarta(cpkm);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public TipoItens getItem() {
        return item;
    }

    public void setItem(TipoItens item) {
        this.item = item;
    }

    public Cartas getCarta() {
        return carta;
    }
    
    private CartaPokemon escolherPokemonInicial() {
        Scanner e = new Scanner(System.in);
        System.out.println("Escolha seu Pokémon inicial:");
        System.out.println("1. Charmander");
        System.out.println("2. Bulbasaur");
        System.out.println("3. Squirtle");
        
        while (true) {
            System.out.print("Digite o número da sua escolha: ");
            int escolha = e.nextInt();
            switch (escolha) {
                case 1:
                	return pokemonFactory.criarPokemon(TipoPokemon.CHARMANDER);
                case 2:
                	return pokemonFactory.criarPokemon(TipoPokemon.BULBASAUR);
                case 3:
                	 return pokemonFactory.criarPokemon(TipoPokemon.SQUIRTLE);
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
         }
    }

    public void receberDano(int dano) {
        int defesaTotal = carta.getDEF();
        
        if (item != null) {
            switch (item) {
                case POCAO:
                    defesaTotal += 1;
                    break;
                case BERRY:
                    defesaTotal += 5;
                    break;
                case BAND:
                    defesaTotal -= 1;
                    break;
            }
        }

        int danoFinal;
        if (dano > defesaTotal) {
            danoFinal = dano - defesaTotal;
        } else {
            danoFinal = 0;
        }
        
        System.out.println("Dano recebido: " + dano);
        System.out.println("Defesa total: " + defesaTotal);
        System.out.println("Dano final: " + danoFinal); 
        
        this.hp -= danoFinal;
        if (this.hp < 0) {
            this.hp = 0;
        }
        System.out.println(nome + " recebeu " + danoFinal + " de dano. HP restante: " + hp);
    }

    public void usarItem() {
        if (item != null) {
            switch (item) {
                case POCAO:
                    System.out.println(nome + " usou Poção. Ataque aumentado em 3 e Defesa em 1!");
                    break;
                case BERRY:
                    System.out.println(nome + " usou Berry. Defesa aumentada em 5!");
                    break;
                case BAND:
                    System.out.println(nome + " usou Band. Ataque aumentado em 10, mas Defesa reduzida em 1!");
                    break;
            }
        } else {
            System.out.println(nome + " não tem nenhum item para usar.");
        }
    }

    public void atacar(Jogador alvo) {
        CartaPokemon pokemonAtk = null;
        if (carta instanceof CartaPokemon) {
            pokemonAtk = (CartaPokemon) carta;
        } else if (carta instanceof Deck) {
            Deck deck = (Deck) carta;
            CartaPokemon[] cartas = deck.getCartas();
            if (cartas.length > 0) {
            	pokemonAtk = cartas[0];
            }
        }
        if (pokemonAtk == null) {
            System.out.println(nome + " não tem um Pokémon para atacar!");
            return;
        }
        int dano = pokemonAtk.getATK();
        if (item != null) {
            switch (item) {
                case POCAO:
                    dano += 3;
                    break;
                case BAND:
                    dano += 10;
                    break;
                case BERRY:
                    break;
            }
        }
        System.out.println(nome + " atacou com " + pokemonAtk.getNome() + " causando " + dano + " de dano!");
        alvo.receberDano(dano);
    }

    public void defender() {
        System.out.println(nome + " está se defendendo!");
    }

    private TipoItens itemAleatorio() {
        Random r = new Random();
        TipoItens[] itens = TipoItens.values();
        return itens[r.nextInt(itens.length)];
    }
    
    @Override
    public String toString() {
        String itemNome;
        if (item != null) {
            itemNome = item.name();
        } else {
            itemNome = "Nenhum";
        }
        return "Jogador: " + nome + ", HP: " + hp + ", Item: " + itemNome + ", Carta: " + getNomeCarta();
    }
}
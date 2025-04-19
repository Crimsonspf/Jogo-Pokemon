package itens;

public enum TipoItens {
    
    POCAO(3, 1),
    BERRY (0, 5),
    BAND (10, -1);
    
    int atk;
    int def;

    private TipoItens(int atk, int def) {
        this.atk = atk;
        this.def = def;
    }
    
    public int melhoraATK(){ return this.atk; }
    public int melhoraDEF(){ return this.def; }
    
    
    
}

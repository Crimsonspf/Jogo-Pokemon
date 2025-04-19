package cartaspokemon;

public enum TipoPokemon {
    CHARMANDER {
        @Override
        public int getHP() { return 39; }
        @Override
        public int getATK() { return 52; }
        @Override
        public int getDEF() { return 43; }
        @Override
        public String getAtaqueEspecial() { return "Brasas"; }
        @Override
        public TipoPokemon getProximaEvolucao() { return CHARMELEON; }
    },
    CHARMELEON {
        @Override
        public int getHP() { return 58; }
        @Override
        public int getATK() { return 64; }
        @Override
        public int getDEF() { return 58; }
        @Override
        public String getAtaqueEspecial() { return "Lança-Chamas"; }
        @Override
        public TipoPokemon getProximaEvolucao() { return CHARIZARD; }
    },
    CHARIZARD {
        @Override
        public int getHP() { return 78; }
        @Override
        public int getATK() { return 84; }
        @Override
        public int getDEF() { return 78; }
        @Override
        public String getAtaqueEspecial() { return "Explosão de Fogo"; }
        @Override
        public TipoPokemon getProximaEvolucao() { return null; }
    },
    BULBASAUR {
        @Override
        public int getHP() { return 45; }
        @Override
        public int getATK() { return 49; }
        @Override
        public int getDEF() { return 49; }
        @Override
        public String getAtaqueEspecial() { return "Chicote de Vinha"; }
        @Override
        public TipoPokemon getProximaEvolucao() { return IVYSAUR; }
    },
    IVYSAUR {
        @Override
        public int getHP() { return 60; }
        @Override
        public int getATK() { return 62; }
        @Override
        public int getDEF() { return 63; }
        @Override
        public String getAtaqueEspecial() { return "Folha Navalha"; }
        @Override
        public TipoPokemon getProximaEvolucao() { return VENUSAUR; }
    },
    VENUSAUR {
        @Override
        public int getHP() { return 80; }
        @Override
        public int getATK() { return 82; }
        @Override
        public int getDEF() { return 83; }
        @Override
        public String getAtaqueEspecial() { return "Raio Solar"; }
        @Override
        public TipoPokemon getProximaEvolucao() { return null; }
    },    
    SQUIRTLE {
        @Override
        public int getHP() { return 44; }
        @Override
        public int getATK() { return 48; }
        @Override
        public int getDEF() { return 65; }
        @Override
        public String getAtaqueEspecial() { return "Jato d'Água"; }
        @Override
        public TipoPokemon getProximaEvolucao() { return WARTORTLE; }
    },
    WARTORTLE {
        @Override
        public int getHP() { return 59; }
        @Override
        public int getATK() { return 63; }
        @Override
        public int getDEF() { return 80; }
        @Override
        public String getAtaqueEspecial() { return "Hidro Bomba"; }
        @Override
        public TipoPokemon getProximaEvolucao() { return BLASTOISE; }
    },
    BLASTOISE {
        @Override
        public int getHP() { return 79; }
        @Override
        public int getATK() { return 83; }
        @Override
        public int getDEF() { return 100; }
        @Override
        public String getAtaqueEspecial() { return "Canhão de Água"; }
        @Override
        public TipoPokemon getProximaEvolucao() { return null; }
    };
	

    public abstract int getHP();
    public abstract int getATK();
    public abstract int getDEF();
    public abstract String getAtaqueEspecial();
    public abstract TipoPokemon getProximaEvolucao();

    public String getNome() {
        return this.name();
    }
}
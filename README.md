#Jogo Pokémon em Java

##Sobre o Projeto

-Uma aplicação de simulação de jogo Pokémon desenvolvida em Java, que implementa conceitos de programação orientada a objetos e padrões de design. O jogo permite que dois jogadores se enfrentem com seus Pokémon iniciais, incluindo mecânicas de batalha, evolução e uso de itens.

##Tecnologias e Conceitos Aplicados

-Java
-Programação Orientada a Objetos
-Padrões de Design:
 -Singleton (PokemonFacade)
 -Factory (CartaPokemonFactory)
 -Composite (Cartas, CartaPokemon, Deck)
 -Facade (PokemonFacade)
 -Enumerações (TipoPokemon, TipoItens)
 -Interfaces e Polimorfismo

##Estrutura do Projeto

aplicacaojogopokemon/

├── AplicacaoJogoPokemon.java (Classe principal)

├── PokemonFacade.java (Implementação do Singleton e Facade)
cartaspokemon/

├── CartaPokemon.java (Implementação das cartas de Pokémon)

├── CartaPokemonFactory.java (Factory para criação de Pokémon)

├── Cartas.java (Interface para implementações de cartas)

├── Deck.java (Composite para coleção de cartas)

├── PokemonFactory.java (Interface para Factory de Pokémon)

├── TipoPokemon.java (Enum com atributos e evoluções dos Pokémon)
itens/

├── TipoItens.java (Enum com modificadores de ataque e defesa)
jogador/

├── Jogador.java (Classe que representa um jogador com Pokémon e itens)

##Funcionalidades

-Escolha de Pokémon inicial (Charmander, Bulbasaur ou Squirtle)
-Sistema de batalha com mecânicas de ataque e defesa
-Itens que modificam atributos dos Pokémon
-Evolução de Pokémon
-Gerenciamento de deck de cartas
-Cálculo de dano considerando ataque, defesa e efeitos de itens

##Como Jogar

-Execute a classe AplicacaoJogoPokemon
-Digite o nome do Jogador 1
-Escolha o Pokémon inicial do Jogador 1 (1 para Charmander, 2 para Bulbasaur, 3 para Squirtle)
-Digite o nome do Jogador 2
-Escolha o Pokémon inicial do Jogador 2
-A batalha começa automaticamente com o Jogador 1 atacando o Jogador 2

##Mecânicas do Jogo

-Atributos dos Pokémon: Cada Pokémon possui HP (pontos de vida), ATK (ataque) e DEF (defesa)
-Evolução: Pokémon podem evoluir para formas mais poderosas (ex: Charmander → Charmeleon → Charizard)

##Itens:

-POCAO: Aumenta ATK em 3 e DEF em 1
-BERRY: Aumenta DEF em 5
-BAND: Aumenta ATK em 10, mas reduz DEF em 1
-Dano: Calculado como ATK do atacante menos DEF do defensor, modificado por itens

##Extensibilidade

O projeto foi projetado com extensibilidade em mente:
-Novos tipos de Pokémon podem ser adicionados ao enum TipoPokemon
-Novos itens podem ser criados no enum TipoItens
-O padrão Composite permite que cartas sejam organizadas em estruturas complexas

##Requisitos do Sistema

-Java 8 ou superior
-Console com suporte a entrada de texto

Este projeto demonstra a aplicação de vários padrões de design e conceitos de programação orientada a objetos em um contexto de jogo Pokémon.

package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.CharacterKitFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.elf.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.human.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.orc.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.Character;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.CharacterBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.singleton.GameConfig;

import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<String, CharacterKitFactory> KITS = Map.ofEntries(
            Map.entry("humano-guerreiro", new HumanWarriorKitFactory()),
            Map.entry("humano-mago",      new HumanMageKitFactory()),
            Map.entry("humano-arqueiro",  new HumanArcherKitFactory()),
            Map.entry("elfo-guerreiro",   new ElfWarriorKitFactory()),
            Map.entry("elfo-mago",        new ElfMageKitFactory()),
            Map.entry("elfo-arqueiro",    new ElfArcherKitFactory()),
            Map.entry("orc-guerreiro",    new OrcWarriorKitFactory()),
            Map.entry("orc-mago",         new OrcMageKitFactory()),
            Map.entry("orc-arqueiro",     new OrcArcherKitFactory())
    );

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 1. Configuração global
            System.out.print("Escolha o nível de dificuldade (1‑3): ");
            int diff = Integer.parseInt(sc.nextLine());
            GameConfig.INSTANCE.setDifficultyLevel(diff);

            // 2. Coleta de dados do personagem
            System.out.print("Nome do personagem: ");
            String nome = sc.nextLine();

            System.out.print("Raça (humano/elfo/orc): ");
            String raca = sc.nextLine().toLowerCase();

            System.out.print("Classe (guerreiro/mago/arqueiro): ");
            String classe = sc.nextLine().toLowerCase();

            String chave = raca + "-" + classe;
            CharacterKitFactory kit = KITS.get(chave);
            if (kit == null) {
                System.out.println("Combinação inválida!");
                return;
            }

            // 3. Construção do personagem usando Builder + Abstract Factory
            Character personagem = new CharacterBuilder()
                    .withName(nome)
                    .withRace(capitalize(raca))
                    .withClazz(capitalize(classe))
                    .withKit(kit)
                    .build();

            // 4. Resultado
            System.out.println("Personagem criado com sucesso:");
            System.out.println(personagem);
            System.out.printf("Dificuldade atual do jogo: %d", GameConfig.INSTANCE.getDifficultyLevel());
        }
    }

    private static String capitalize(String s) {
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
}


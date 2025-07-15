package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.CharacterKitFactory;

public final class CharacterDirector {

    public Character createDefault(String name, CharacterKitFactory kit) {
        return new CharacterBuilder()
                .withName(name)
                .withRace(extractRace(kit))
                .withClazz(extractClazz(kit))
                .withKit(kit)
                .build();
    }

    private String extractClazz(CharacterKitFactory kit) {
        return kit.getClass()
                .getSimpleName().substring(0, 3)
                .replace("Elf", "Elfo")
                .replace("Hum", "Humano")
                .replace("Orc", "Orc");
    }

    private String extractRace(CharacterKitFactory kit) {
        return kit.getClass()
                .getSimpleName()
                .replaceAll(".*(Warrior|Mage|Archer)KitFactory", "$1");
    }


}

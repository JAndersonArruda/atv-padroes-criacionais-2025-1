package br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor;

public record LeatherArmor(String name, Integer defense) implements Armor {

    @Override
    public String type() {
        return "Medium";
    }
}

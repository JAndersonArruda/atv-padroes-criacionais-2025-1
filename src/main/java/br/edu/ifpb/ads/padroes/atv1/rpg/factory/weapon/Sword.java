package br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon;

public record Sword(String name, Integer damage) implements Weapon {

    @Override
    public String type() {
        return "Sword";
    }
}

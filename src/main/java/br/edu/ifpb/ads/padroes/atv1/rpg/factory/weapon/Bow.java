package br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon;

public record Bow(String name, Integer damage) implements Weapon {

    @Override
    public String type() {
        return "Bow";
    }
}

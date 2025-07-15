package br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor;

public final class ArcherArmorFactory extends ArmorFactory {

    @Override
    public Armor createArmor() {
        return new LeatherArmor("Leather Armor", 12);
    }
}

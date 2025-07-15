package br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor;

public final class MageArmorFactory extends ArmorFactory {

    @Override
    public Armor createArmor() {
        return new Robe("Mage Robe", 8);
    }
}

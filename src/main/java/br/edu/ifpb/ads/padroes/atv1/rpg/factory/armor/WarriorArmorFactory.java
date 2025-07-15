package br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor;

public final class WarriorArmorFactory extends ArmorFactory {

    @Override
    public Armor createArmor() {
        return new PlateArmor("Plate Armor", 20);
    }
}

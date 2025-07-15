package br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon;

public final class MageWeaponFactory extends WeaponFactory {

    @Override
    public Weapon createWeapon() {
        return new Staff("Arcane Staff", 15);
    }
}

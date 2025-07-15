package br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon;

public final class ArcherWeaponFactory extends WeaponFactory {

    @Override
    public Weapon createWeapon() {
        return new Bow("Long Bow", 20);
    }
}

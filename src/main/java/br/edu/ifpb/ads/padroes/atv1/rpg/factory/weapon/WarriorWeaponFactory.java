package br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon;

public final class WarriorWeaponFactory extends WeaponFactory {

    @Override
    public Weapon createWeapon() {
        return new Sword("Iron Sword", 25);
    }
}

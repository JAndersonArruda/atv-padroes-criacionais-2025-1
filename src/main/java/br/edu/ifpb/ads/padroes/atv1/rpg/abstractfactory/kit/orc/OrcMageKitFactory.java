package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.util.Attributes;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.CharacterKitFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor.MageArmorFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon.MageWeaponFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon.Weapon;
import br.edu.ifpb.ads.padroes.atv1.rpg.util.Skill;

import java.util.List;

public final class OrcMageKitFactory implements CharacterKitFactory {

    @Override
    public Attributes createAttributes() {
        return new Attributes(10, 14, 6, 100, 120);
    }

    @Override
    public Armor createArmor() {
        return new MageArmorFactory().createArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new MageWeaponFactory().createWeapon();
    }

    @Override
    public List<Skill> createSkills() {
        return List.of(
                new Skill("Magia Sombría"),
                new Skill("Invocação")
        );
    }
}

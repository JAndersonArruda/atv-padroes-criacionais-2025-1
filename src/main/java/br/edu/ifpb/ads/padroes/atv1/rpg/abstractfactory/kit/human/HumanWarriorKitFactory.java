package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.human;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.attributes.Attributes;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.CharacterKitFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor.WarriorArmorFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon.WarriorWeaponFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon.Weapon;
import br.edu.ifpb.ads.padroes.atv1.rpg.util.Skill;

import java.util.List;

public final class HumanWarriorKitFactory implements CharacterKitFactory {

    @Override
    public Attributes createAttributes() {
        return new Attributes(15, 8, 20, 120, 30);
    }

    @Override
    public Armor createArmor() {
        return new WarriorArmorFactory().createArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new WarriorWeaponFactory().createWeapon();
    }

    @Override
    public List<Skill> createSkills() {
        return List.of(
                new Skill("Investida"),
                new Skill("Bloqueio")
        );
    }
}

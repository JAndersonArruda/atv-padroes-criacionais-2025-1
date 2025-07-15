package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.attributes.Attributes;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.CharacterKitFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor.ArcherArmorFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon.ArcherWeaponFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon.Weapon;
import br.edu.ifpb.ads.padroes.atv1.rpg.util.Skill;

import java.util.List;

public final class OrcArcherKitFactory implements CharacterKitFactory {

    @Override
    public Attributes createAttributes() {
        return new Attributes(14, 8, 12, 120, 40);
    }

    @Override
    public Armor createArmor() {
        return new ArcherArmorFactory().createArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new ArcherWeaponFactory().createWeapon();
    }

    @Override
    public List<Skill> createSkills() {
        return List.of(
                new Skill("Tiro Brutal"),
                new Skill("Intimidação")
        );
    }
}

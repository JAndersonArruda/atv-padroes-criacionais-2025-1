package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.util.Attributes;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.CharacterKitFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor.WarriorArmorFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon.Sword;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon.Weapon;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon.WeaponFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.util.Skill;

import java.util.List;

public final class OrcWarriorKitFactory implements CharacterKitFactory {

    @Override
    public Attributes createAttributes() {
        return new Attributes(20, 6, 8, 150, 20);
    }

    @Override
    public Armor createArmor() {
        return new WarriorArmorFactory().createArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new WeaponFactory() {

            @Override
            public Weapon createWeapon() {
                return new Sword("War Axe", 30);
            }
        }.createWeapon();
    }

    @Override
    public List<Skill> createSkills() {
        return List.of(
                new Skill("Fúria"),
                new Skill("Pancada Devastadora")
        );
    }
}

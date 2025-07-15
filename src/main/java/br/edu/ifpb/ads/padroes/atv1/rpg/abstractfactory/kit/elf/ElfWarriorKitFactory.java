package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.elf;

import br.edu.ifpb.ads.padroes.atv1.rpg.util.Attributes;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.CharacterKitFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor.ArmorFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor.LeatherArmor;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon.WarriorWeaponFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon.Weapon;
import br.edu.ifpb.ads.padroes.atv1.rpg.util.Skill;

import java.util.List;

public final class ElfWarriorKitFactory implements CharacterKitFactory {

    @Override
    public Attributes createAttributes() {
        return new Attributes(12, 14, 16, 100, 60);
    }

    @Override
    public Armor createArmor() {
        return new ArmorFactory() {

            @Override
            public Armor createArmor() {
                return new LeatherArmor("Elf Chainmail", 15);
            }
        }.createArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new WarriorWeaponFactory().createWeapon();
    }

    @Override
    public List<Skill> createSkills() {
        return List.of(
                new Skill("Dança das Lâminas"),
                new Skill("Agilidade Élfica")
        );
    }
}

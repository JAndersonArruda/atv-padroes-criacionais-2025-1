package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.attributes.Attributes;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon.Weapon;
import br.edu.ifpb.ads.padroes.atv1.rpg.util.Skill;
import java.util.List;

public interface CharacterKitFactory {

    Attributes createAttributes();

    Armor createArmor();

    Weapon createWeapon();

    List<Skill> createSkills();
}

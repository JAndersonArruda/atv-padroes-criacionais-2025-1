package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.attributes.Attributes;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.kit.CharacterKitFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon.Weapon;
import br.edu.ifpb.ads.padroes.atv1.rpg.util.Skill;

import java.util.List;

public class CharacterBuilder {

    private String name;
    private String race;
    private String clazz;
    private Attributes attributes;
    private Armor armor;
    private Weapon weapon;
    private List<Skill> skills;

    public CharacterBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CharacterBuilder withRace(String race) {
        this.race = race;
        return this;
    }

    public CharacterBuilder withClazz(String clazz) {
        this.clazz = clazz;
        return this;
    }

    public CharacterBuilder withKit(CharacterKitFactory kit) {
        this.attributes = kit.createAttributes();
        this.armor = kit.createArmor();
        this.weapon = kit.createWeapon();
        this.skills = kit.createSkills();
        return this;
    }

    public Character build() {
        if (name==null || race==null || clazz==null || attributes==null) throw new IllegalStateException("Incomplete character");
        return new Character(name, race, clazz, attributes, armor, weapon, skills);
    }
}

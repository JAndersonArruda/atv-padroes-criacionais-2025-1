package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.attributes.Attributes;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.armor.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.weapon.Weapon;
import br.edu.ifpb.ads.padroes.atv1.rpg.util.Skill;

import java.util.List;

public final class Character {

    private final String name;
    private final String race;
    private final String clazz;
    private final Attributes attributes;
    private final Armor armor;
    private final Weapon weapon;
    private final List<Skill> skills;

    public Character(String name, String race, String clazz, Attributes attributes, Armor armor, Weapon weapon, List<Skill> skills) {
        this.name = name;
        this.race = race;
        this.clazz = clazz;
        this.attributes = attributes;
        this.armor = armor;
        this.weapon = weapon;
        this.skills = List.copyOf(skills);
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getClazz() {
        return clazz;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", clazz='" + clazz + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}

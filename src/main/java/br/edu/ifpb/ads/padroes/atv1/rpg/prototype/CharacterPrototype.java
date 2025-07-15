package br.edu.ifpb.ads.padroes.atv1.rpg.prototype;

import br.edu.ifpb.ads.padroes.atv1.rpg.builder.Character;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.CharacterBuilder;

public final class CharacterPrototype implements Cloneable {

    private final Character template;

    public CharacterPrototype(Character template) {
        this.template = template;
    }

    @Override
    public Character clone() {
        return new CharacterBuilder()
                .withName(template.toString())
                .withRace("copy")
                .build();
    }
}

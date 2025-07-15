package br.edu.ifpb.ads.padroes.atv1.rpg.prototype;

import br.edu.ifpb.ads.padroes.atv1.rpg.builder.Character;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    private final Map<String, CharacterPrototype> cache = new HashMap<>();

    public void register(String key, CharacterPrototype proto) {
        cache.put(key, proto);
    }

    public Character createCopy(String key){
        return cache.get(key).clone();
    }
}

package br.edu.ifpb.ads.padroes.atv1.rpg.singleton;

import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.PrototypeRegistry;

public enum GameConfig {
    INSTANCE;

    private final PrototypeRegistry registry = new PrototypeRegistry();

    private Integer difficultyLevel = 1;

    public PrototypeRegistry registry() {
        return registry;
    }

    public Integer getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(Integer lvl) {
        this.difficultyLevel = lvl;
    }
}

package com.design.pattern.creation.builder.game;

import static java.lang.System.out;

public class HeroBuilder extends ActorBuilder {
    @Override
    void buildSex() {
        actor.setCostume("男");
    }

    @Override
    void buildType() {
        actor.setType("英雄");
    }

    @Override
    void buildCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    void buildHairstyle() {
        actor.setHairstyle("飘逸");
    }

    @Override
    void buildFace() {
        actor.setFace("英俊");
    }
}

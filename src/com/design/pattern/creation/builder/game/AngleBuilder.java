package com.design.pattern.creation.builder.game;

public class AngleBuilder extends ActorBuilder {
    @Override
    void buildSex() {
        actor.setCostume("女");
    }

    @Override
    void buildType() {
        actor.setType("天使");
    }

    @Override
    void buildCostume() {
        actor.setCostume("大棉袄");
    }

    @Override
    void buildHairstyle() {
        actor.setHairstyle("清爽");
    }

    @Override
    void buildFace() {
        actor.setFace("冷库");
    }
}

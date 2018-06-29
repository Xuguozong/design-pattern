package com.design.pattern.creation.builder.game;

public class DevilBuilder extends ActorBuilder {
    @Override
    void buildSex() {
        actor.setCostume("男");
    }

    @Override
    void buildType() {
        actor.setType("恶棍");
    }

    @Override
    void buildCostume() {
        actor.setCostume("背心");
    }

    @Override
    void buildHairstyle() {
        actor.setHairstyle("中分");
    }

    @Override
    void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    public boolean isBarehead() {
        return true;
    }
}

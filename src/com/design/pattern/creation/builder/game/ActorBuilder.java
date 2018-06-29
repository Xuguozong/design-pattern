package com.design.pattern.creation.builder.game;

public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    abstract void buildSex();
    abstract void buildType();
    abstract void buildCostume();
    abstract void buildHairstyle();
    abstract void buildFace();

    // 钩子方法
    public boolean isBarehead(){
        return false;
    }

    public Actor getActor() {
        return actor;
    }
}

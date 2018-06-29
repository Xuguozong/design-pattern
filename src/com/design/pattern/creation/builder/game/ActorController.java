package com.design.pattern.creation.builder.game;

public class ActorController {

    public Actor build(ActorBuilder builder){
        builder.buildCostume();
        builder.buildFace();
        // 根据钩子方法确定是否要构造发型
        if (!builder.isBarehead()){
            builder.buildHairstyle();
        }
        builder.buildSex();
        builder.buildType();
        return builder.getActor();
    }

}

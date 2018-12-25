package com.chk.designpattern.structuralPattern.Decorator;

/**
 * @author changhongkai
 * @date 2018/12/25 下午6:12
 */
public class AbstractHumanDecorator implements Human {
    private Human human;

    public AbstractHumanDecorator(Human human) {
        this.human = human;
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
    }

    @Override
    public void walkToWhere() {
        human.walkToWhere();
    }
}

package com.chk.designpattern.structuralPattern.Decorator;

/**
 * @author changhongkai
 * @date 2018/12/25 下午6:14
 */
public class HumanDecorator extends AbstractHumanDecorator {
    public HumanDecorator(Human human) {
        super(human);
    }

    public void goHome() {
        System.out.println("进房子。。");
    }

    public void findMap() {
        System.out.println("书房找找Map。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goHome();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findMap();
    }

}

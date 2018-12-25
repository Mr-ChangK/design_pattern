package com.chk.designpattern.structuralPattern.Decorator;

/**
 * @author changhongkai
 * @date 2018/12/25 下午6:15
 */
public class BlackHuman implements Human {
    @Override
    public void wearClothes() {
        System.out.println("BlackHuman invoke wearClothes");
    }

    @Override
    public void walkToWhere() {
        System.out.println("BlackHuman invoke walkToWhere");
    }
}

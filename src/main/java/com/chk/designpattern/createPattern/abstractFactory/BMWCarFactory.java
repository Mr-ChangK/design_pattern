package com.chk.designpattern.createPattern.abstractFactory;

/**
 * @author changhongkai
 * @date 2018/12/14 下午2:38
 */
public class BMWCarFactory extends CarFactoryAbstract {

    @Override
    protected void decideCarColor() {
        new RedColor().getColor();
    }

    @Override
    protected void decideCarType() {
        new SedanCar().getType();
    }

    @Override
    public void build() {
        decideCarColor();
        decideCarType();
    }
}
